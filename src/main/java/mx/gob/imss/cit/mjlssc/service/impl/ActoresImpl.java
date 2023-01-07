/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.CollectionUtils;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.model.entity.MjltAsuntoActorDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;
import mx.gob.imss.cit.mjlssc.persistence.repository.MjltAsuntoActorRepository;
import mx.gob.imss.cit.mjlssc.service.ActoresService;
import mx.gob.imss.cit.mjlssc.utils.Constantes;
import mx.gob.imss.cit.mjlssc.utils.ObjectMapperUtils;

/**
 * @author
 *
 */
@Log4j2
@Service
public class ActoresImpl implements ActoresService {

	@Autowired
	private MjltAsuntoActorRepository mjltAsuntoActorRepository;

	/*
	 * solo prueba revisar y definir uso de mappers y demas
	 */
	@Override
	public List<MjltAsuntoActorDto> getActoresSecundarios() {
		log.info("Inicio getActoresSecundarios");
			List<MjltAsuntoActor> dboList = mjltAsuntoActorRepository.findAll();
			if(!dboList.isEmpty()) {
				return ObjectMapperUtils.mapAll(dboList, MjltAsuntoActorDto.class);
			}
			return Collections.emptyList();
	}
	@Transactional
	@Override
	public ResponseEntity<?> addActoresToAsunto(List<MjltAsuntoActorDto> actores) {
		// TODO Auto-generated method stub
		log.info("Inicio addActoresToAsunto");
	
		try {
			if(actores.size()>0) {
				
				if( actores.get(0).getCveAsunto()!=null) {
					log.info("Se iniciar el borrado de actores asignados al asunto"+ actores.get(0).getCveAsunto().getId());
				Integer cveAsunto=actores.get(0).getCveAsunto().getId();
					mjltAsuntoActorRepository.deleteAllActoresByIdAsunto(cveAsunto);
					log.info("Actores borrados");
				}
				
				log.info("Se inicia la asignacion  de actores asignados al asunto");
				for (Iterator<MjltAsuntoActorDto> iterator = actores.iterator(); iterator.hasNext();) {
					MjltAsuntoActorDto mjltAsuntoActorDto = (MjltAsuntoActorDto) iterator.next();
					MjltAsuntoActor entity=new MjltAsuntoActor();
					ObjectMapperUtils.map(mjltAsuntoActorDto, entity);
					mjltAsuntoActorRepository.save(entity);
				}
				log.info("Actores asignados");
				
				return new ResponseEntity<>(true, HttpStatus.OK);
				
			}else {
				log.info("Lista de actores vacia");
				return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		
			
			log.error("Exception addActoresToAsunto ", e);
			return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	@Override
	public List<MjltAsuntoActorDto> getActoresByAsunto(Integer estatus, Integer cveAsunto) {
		log.info("Inicio getActoresByEstatus");
		//TODO: falta logica para filtrar por el estatus y regresar tambien los actores Encontrados y Pendientes
		List<MjltAsuntoActor> dboList = mjltAsuntoActorRepository.findByIndActorPrincipalAndCveAsuntoId(false, cveAsunto);
		if(!dboList.isEmpty()) {
			return ObjectMapperUtils.mapAll(dboList, MjltAsuntoActorDto.class);
		}
		return Collections.emptyList();
	}
	@Override
	public ResponseEntity<?> deleteActor(Integer idAsuntoActor, String cveUsuario) {
		log.info("Inicio deleteActor:{}", idAsuntoActor);
		int result = 0;
		try {
			result = mjltAsuntoActorRepository.deleteActor(idAsuntoActor, cveUsuario, new Date());
			log.info("deleteActor.registro eliminado:{}", result);
			return new ResponseEntity<>("Registros eliminados:" + result, HttpStatus.OK);
		} catch (Exception e) {
			log.error("Error al eliminar el actor principal ", e);
			return new ResponseEntity<>("Registros eliminados" + result, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Transactional
	@Override
	public MjltAsuntoActorDto updateActor(MjltAsuntoActorDto mjltAsuntoActorDto) {
		log.info("Inicio addActoresToAsunto");

		try {
			MjltAsuntoActor entity = new MjltAsuntoActor();
			MjltAsuntoActor response = mjltAsuntoActorRepository.save(ObjectMapperUtils.map(mjltAsuntoActorDto, entity));
			return ObjectMapperUtils.map(response, MjltAsuntoActorDto.class);
		} catch (Exception e) {
			log.error("Error al actualizar el actor ", e);
			return null;
		}

	}

	@Override
	public ResponseEntity<?> changePrincipal(Integer cveAsunto, Integer cveAsuntoActor, String cveUsuarioMod) {
		int result = 0;
		try {
			List<MjltAsuntoActor> principalOld = mjltAsuntoActorRepository
					.findByIndActorPrincipalAndCveAsuntoId(Boolean.TRUE, cveAsunto);
			if (!CollectionUtils.isEmpty(principalOld)) {
				mjltAsuntoActorRepository.updatePrincipal(principalOld.get(0).getId(),
						principalOld.get(0).getCveAsunto().getId(), Boolean.FALSE, cveUsuarioMod);
				result = mjltAsuntoActorRepository.updatePrincipal(cveAsuntoActor, cveAsunto, Boolean.TRUE,
						cveUsuarioMod);
				log.info("registro actualizado:{}|cveAsuntoActor:{}", result, cveAsuntoActor);
				return new ResponseEntity<>(Constantes.REGISTROS_ACTUALIZADOS + result, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(Constantes.REGISTROS_ACTUALIZADOS + result, HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error("Error al cambiar el actor principal ", e);
			return new ResponseEntity<>(Constantes.REGISTROS_ACTUALIZADOS, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
