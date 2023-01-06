/**
 * 
 */
package mx.gob.imss.cit.mjlssc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.model.entity.MjltAsuntoActorDto;
import mx.gob.imss.cit.mjlssc.model.entity.ResponseDataDTO;
import mx.gob.imss.cit.mjlssc.model.request.AsignarActorRequestDto;
import mx.gob.imss.cit.mjlssc.model.request.EditarActorRequestDto;
import mx.gob.imss.cit.mjlssc.service.ActoresService;
import mx.gob.imss.cit.mjlssc.utils.Constantes;

/***
 * 
 * @author
 *
 */
@Log4j2
@RestController
@RequestMapping("/actores")
public class ActorController {

	@Autowired
	private ActoresService actoresService;

	
	/**
	 * Consulta todos los actores secundarios
	 * @return
	 */
	@GetMapping("/secundarios")
	public ResponseEntity<ResponseDataDTO<List<MjltAsuntoActorDto>>> get() {
		try {
			List<MjltAsuntoActorDto> resultList = actoresService.getActoresSecundarios();
			if(!resultList.isEmpty()) {
				ResponseDataDTO<List<MjltAsuntoActorDto>> response = new ResponseDataDTO<>(Constantes.STATUS_200, Constantes.OK, resultList);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}else {
				ResponseDataDTO<List<MjltAsuntoActorDto>> response = new ResponseDataDTO<>(Constantes.STATUS_204, Constantes.NO_CONTENT, resultList);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		} catch (Exception e) {
			ResponseDataDTO<List<MjltAsuntoActorDto>> response = new ResponseDataDTO<>(Constantes.STATUS_500, Constantes.INTERNAL_SERVER_ERROR.concat(e.toString()), null);
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
//Se incorpora guardado de actores a un asunto exitente.
	
	@PostMapping
	public ResponseEntity<?> asignar(@RequestBody AsignarActorRequestDto request) {
		try {
			return actoresService.addActoresToAsunto(request.getActores());
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
	/**
	 * Consulta los actores por asunto y estatus (secundarios, encontrados y pendientes)
	 * @param estatus
	 * @param cveAsunto
	 * @return
	 */
	@GetMapping("/byAsunto")
	public ResponseEntity<ResponseDataDTO<List<MjltAsuntoActorDto>>> getActoresByAsunto(@RequestParam Integer estatus, @RequestParam Integer cveAsunto) {
		try {
			List<MjltAsuntoActorDto> resultList = actoresService.getActoresByAsunto(estatus, cveAsunto);
			if(!resultList.isEmpty()) {
				ResponseDataDTO<List<MjltAsuntoActorDto>> response = new ResponseDataDTO<>(Constantes.STATUS_200, Constantes.OK, resultList);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}else {
				ResponseDataDTO<List<MjltAsuntoActorDto>> response = new ResponseDataDTO<>(Constantes.STATUS_204, Constantes.NO_CONTENT, resultList);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		} catch (Exception e) {
			ResponseDataDTO<List<MjltAsuntoActorDto>> response = new ResponseDataDTO<>(Constantes.STATUS_500, Constantes.INTERNAL_SERVER_ERROR.concat(e.toString()), null);
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Consulta los actores por asunto y estatus (secundarios, encontrados y pendientes)
	 * @param estatus
	 * @param cveAsunto
	 * @return
	 */
	@PutMapping("/delete")
	public void deleteActor(@RequestParam Integer idAsuntoActor, @RequestParam String cveUsuario) {
		try {
			actoresService.deleteActor(idAsuntoActor, cveUsuario);
		} catch (Exception e) {
			log.info(e.getMessage());
		}
	}
	
	@PostMapping("/update")
	public ResponseEntity<ResponseDataDTO<EditarActorRequestDto>> editar(
			@RequestBody EditarActorRequestDto editarActorRequestDto) {

		try {
			EditarActorRequestDto result = actoresService.updateActor(editarActorRequestDto);
			if (result instanceof EditarActorRequestDto) {
				ResponseDataDTO<EditarActorRequestDto> response = new ResponseDataDTO<>(Constantes.STATUS_200,Constantes.OK, result);
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				ResponseDataDTO<EditarActorRequestDto> response = new ResponseDataDTO<>(Constantes.STATUS_500, Constantes.INTERNAL_SERVER_ERROR, result);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		} catch (Exception e) {
			ResponseDataDTO<EditarActorRequestDto> response = new ResponseDataDTO<>(Constantes.STATUS_500,Constantes.INTERNAL_SERVER_ERROR.concat(e.toString()), null);
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}