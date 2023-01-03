package mx.gob.imss.cit.mjlssc.model.assembler;

import org.springframework.stereotype.Component;

import mx.gob.imss.cit.mjlssc.model.entity.SsccSexoDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccSexo;
import mx.gob.imss.cit.nmlssc.support.assembler.BaseAssembler;

@Component
public class SexoAssembler extends BaseAssembler<SsccSexo, SsccSexoDto>{

	public SsccSexoDto assemble(SsccSexo source) {
		SsccSexoDto model = new SsccSexoDto();
		if (source != null) {
			model = SexoMapper.INSTANCE.toDto(source);
		}

		return model;
	}
	
	

	public SsccSexo assembleEntity(SsccSexoDto model) {
		SsccSexo source = new SsccSexo();
		if (source != null) {
			source = SexoMapper.INSTANCE.toEntity(model);
		}

		return source;
	}


	

}
