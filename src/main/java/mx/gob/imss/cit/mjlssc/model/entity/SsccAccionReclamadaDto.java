package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccAccionReclamada;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A DTO for the {@link SsccAccionReclamada} entity
 */
@Data
public class SsccAccionReclamadaDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3393495948850794366L;
	private  Integer id;
    @Size(max = 120)
    private  String desAccionReclamada;
    private  BigDecimal impEstimado;
    @NotNull
    private  Integer cveClasAccionReclamada;
    private  BigDecimal numFactorCalculo;
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