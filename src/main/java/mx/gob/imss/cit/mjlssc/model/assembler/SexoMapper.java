package mx.gob.imss.cit.mjlssc.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import mx.gob.imss.cit.mjlssc.model.entity.SsccSexoDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccSexo;

@Mapper(componentModel = "spring")
public interface SexoMapper {
	
	SexoMapper INSTANCE = Mappers.getMapper(SexoMapper.class);

	SsccSexo toEntity(SsccSexoDto dto);

	SsccSexoDto toDto(SsccSexo entity);

	List<SsccSexoDto> toLstDto(List<SsccSexo> entity);

	List<SsccSexo> toLstEntity(List<SsccSexoDto> dto);
}
