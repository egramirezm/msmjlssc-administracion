package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccMotivoDiferimiento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccMotivoDiferimiento} entity
 */
@Data
public class SsccMotivoDiferimientoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 672820881872321688L;
	private  Integer id;
    @Size(max = 30)
    private  String refMotivoDiferimiento;
    private  Integer cveTipoAsunto;
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