package mx.gob.imss.cit.mjlssc.model.assembler;

import org.springframework.stereotype.Component;

import mx.gob.imss.cit.mjlssc.model.entity.SsccUmfDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;
import mx.gob.imss.cit.nmlssc.support.assembler.BaseAssembler;

@Component
public class UmfAssembler extends BaseAssembler<SsccUmf, SsccUmfDto> {

	public SsccUmfDto assemble(SsccUmf source) {
		SsccUmfDto model = new SsccUmfDto();
		if (source != null) {
			model = UmfMapper.INSTANCE.toDto(source);
		}

		return model;
	}

	public SsccUmf assembleEntity(SsccUmfDto model) {
		SsccUmf source = new SsccUmf();
		if (source != null) {
			source = UmfMapper.INSTANCE.toEntity(model);
		}

		return source;
	}

}
