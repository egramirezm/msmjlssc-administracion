package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccColoniaCp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccColoniaCp} entity
 */
@Data
public class SsccColoniaCpDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1282627518206002142L;
	private  Integer id;
    @NotNull
    private  SsccMunicipioAlcaldiaDto cveMunicipioAlcaldia;
    @Size(max = 70)
    private  String refNomColoniaCp;
    @Size(max = 5)
    private  String refCp;
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