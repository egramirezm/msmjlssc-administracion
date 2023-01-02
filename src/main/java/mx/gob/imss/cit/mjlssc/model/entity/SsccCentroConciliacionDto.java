package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccCentroConciliacion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccCentroConciliacion} entity
 */
@Data
public class SsccCentroConciliacionDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5697374761605667670L;
	private  Integer id;
    @Size(max = 100)
    private  String desCentroConciliacion;
    private  Integer cveAlcance;
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
    private  Integer cveCentroConciliacionAnterior;
}