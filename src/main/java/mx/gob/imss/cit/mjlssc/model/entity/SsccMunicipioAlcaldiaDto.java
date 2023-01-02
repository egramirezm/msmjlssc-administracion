package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccMunicipioAlcaldia;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccMunicipioAlcaldia} entity
 */
@Data
public class SsccMunicipioAlcaldiaDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3001598257688472213L;
	private  Integer id;
    @NotNull
    private  SsccEstadoDto cveEstado;
    @Size(max = 55)
    private  String refNomMunicipioAlcaldia;
    private  Boolean indEstatus;
    @NotNull
    private  Date fecAlta;
    private  Date fecBaja;
    private  Date fecModifica;
    @Size(max = 60)
    @NotNull
    private  String cveUsuarioAlta;
    @Size(max = 60)
    private  String cveUsuarioBaja;
    @Size(max = 60)
    private  String cveUsuarioModifica;
}