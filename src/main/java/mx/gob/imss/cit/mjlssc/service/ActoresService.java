/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import mx.gob.imss.cit.mjlssc.model.entity.MjltAsuntoActorDto;

/**
 * @author
 *
 */
public interface ActoresService {

	List<MjltAsuntoActorDto> getActoresSecundarios();

	/**
	 * agregar actores a un asunto , se borran los actores existentes de ese asunto
	 * y carga la lista final recibida
	 * 
	 * @param actores
	 * 
	 * @return
	 */
	ResponseEntity<?> addActoresToAsunto(List<MjltAsuntoActorDto> actores);

	List<MjltAsuntoActorDto> getActoresByAsunto(Integer estatus, Integer cvAsunto);

	ResponseEntity<?> deleteActor(Integer idAsuntoActor, String cveUsuario);

	MjltAsuntoActorDto updateActor(MjltAsuntoActorDto mjltAsuntoActorDto);
	
	ResponseEntity<?> changePrincipal(Integer idAsunto, Integer idAsuntoActor, String cveUsuarioMod);

	ResponseEntity<?> getDetalleActor(Integer cveAsuntoActor);

}
