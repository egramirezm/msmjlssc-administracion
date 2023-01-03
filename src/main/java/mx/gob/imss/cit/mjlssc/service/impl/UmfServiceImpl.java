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
import mx.gob.imss.cit.mjlssc.model.assembler.UmfAssembler;
import mx.gob.imss.cit.mjlssc.model.entity.SsccSexoDto;
import mx.gob.imss.cit.mjlssc.model.entity.SsccUmfDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccSexo;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccSexoRepository;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccUmfRepository;
import mx.gob.imss.cit.mjlssc.service.SexoService;
import mx.gob.imss.cit.mjlssc.service.UmfService;

/**
 * @author
 *
 */
@Log4j2
@Service
public class UmfServiceImpl implements UmfService {

	@Autowired
	private SsccUmfRepository umSsccUmfRepository;

	@Autowired
	private UmfAssembler umfAssembler;

	@Override
	public List<SsccUmfDto> getSUmfList() {

		log.info("Inicio UmfServiceImpl getSUmfList");
		List<SsccUmfDto> umfDtos = new ArrayList<>();

		List<SsccUmf> umfList = umSsccUmfRepository.findAll();
		if (!CollectionUtils.isEmpty(umfList)) {
			umfDtos = umfAssembler.assembleList(umfList);
		}

		return umfDtos;
	}

}
