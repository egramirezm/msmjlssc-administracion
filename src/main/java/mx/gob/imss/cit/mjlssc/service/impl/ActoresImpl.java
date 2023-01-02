/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.model.entity.MjltAsuntoActorDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;
import mx.gob.imss.cit.mjlssc.persistence.repository.MjltAsuntoActorRepository;
import mx.gob.imss.cit.mjlssc.service.ActoresService;
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
			List<MjltAsuntoActor> dboList = mjltAsuntoActorRepository.findByIndActorPrincipal(false);
			if(!dboList.isEmpty()) {
				return ObjectMapperUtils.mapAll(dboList, MjltAsuntoActorDto.class);
			}
			return Collections.emptyList();
	}


}
