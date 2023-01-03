package mx.gob.imss.cit.mjlssc.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import mx.gob.imss.cit.mjlssc.model.entity.SsccUmfDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccDelegacion;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;

@Mapper(componentModel = "spring")
public interface UmfMapper {
	
	UmfMapper INSTANCE = Mappers.getMapper(UmfMapper.class);

	SsccUmf toEntity(SsccUmfDto dto);

	SsccUmfDto toDto(SsccUmf entity);

	List<SsccUmfDto> toLstDto(List<SsccUmf> entity);

	List<SsccUmf> toLstEntity(List<SsccUmfDto> dto);
}
