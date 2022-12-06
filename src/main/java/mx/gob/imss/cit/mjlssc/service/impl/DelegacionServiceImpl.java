/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.model.assembler.DelegacionMapper;
import mx.gob.imss.cit.mjlssc.model.entity.SsccDelegacionDto;
import mx.gob.imss.cit.mjlssc.model.projection.SsccDelegacionView;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccDelegacion;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccDelegacionRepository;
import mx.gob.imss.cit.mjlssc.service.DelegacionService;

/**
 * @author
 *
 */
@Log4j2
@Service
public class DelegacionServiceImpl implements DelegacionService {

	@Autowired
	private DelegacionMapper delegacionMapper;

	@Autowired
	private SsccDelegacionRepository ssccDelegacionRepository;

	/*
	 * solo prueba revisar y definir uso de mappers y demas
	 */
	@Override
	public ResponseEntity<?> getDelegaciones() {
		log.info("Inicio DelegacionService getDelegaciones");
		List<SsccDelegacionDto> delegacionDtos = new ArrayList<>();
		try {
			// ejemplo projection
			//SsccDelegacionView delegacionProjection = ssccDelegacionRepository.findByRefAbreviacion("DFS",SsccDelegacionView.class);
			List<SsccDelegacion> delegaciones = ssccDelegacionRepository.findAll();
			// delegacionDtos = ObjectMapperUtils.mapAll(delegaciones,SsccDelegacionDto.class);
			delegacionDtos = delegacionMapper.toLstDto(delegaciones);
		} catch (Exception e) {
			log.error("Exception DelegacionService getDelegaciones", e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(delegacionDtos, HttpStatus.OK);
	}

}
