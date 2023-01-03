/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.model.assembler.SexoAssembler;
import mx.gob.imss.cit.mjlssc.model.entity.SsccSexoDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccSexo;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccSexoRepository;
import mx.gob.imss.cit.mjlssc.service.SexoService;

/**
 * @author
 *
 */
@Log4j2
@Service
public class SexoServiceImpl implements SexoService {

	@Autowired
	private SsccSexoRepository sexoRepository;

	@Autowired
	private SexoAssembler sexoAssambler;

	@Override
	public List<SsccSexoDto> getSexoList() {

		log.info("Inicio SexoServiceImpl getSexoList");
		List<SsccSexoDto> sexoDtos = new ArrayList<>();

		// ejemplo projection
		List<SsccSexo> sexoList = sexoRepository.findAll();
		if (!CollectionUtils.isEmpty(sexoList)) {
			sexoDtos = sexoAssambler.assembleList(sexoList);
		}

		return sexoDtos;
	}

}
