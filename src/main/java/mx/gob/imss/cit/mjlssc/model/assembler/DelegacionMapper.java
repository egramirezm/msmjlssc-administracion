package mx.gob.imss.cit.mjlssc.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import mx.gob.imss.cit.mjlssc.model.entity.SsccDelegacionDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccDelegacion;

@Mapper(componentModel = "spring")
public interface DelegacionMapper {
	
	DelegacionMapper INSTANCE = Mappers.getMapper(DelegacionMapper.class);

	SsccDelegacion toEntity(SsccDelegacionDto dto);

	SsccDelegacionDto toDto(SsccDelegacion entity);

	List<SsccDelegacionDto> toLstDto(List<SsccDelegacion> entity);

	List<SsccDelegacion> toLstEntity(List<SsccDelegacionDto> dto);
}
