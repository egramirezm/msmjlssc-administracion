package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccClaseActorAccionReclam;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccClaseActorAccionReclam} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SsccClaseActorAccionReclamDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -265855838995777881L;
	private Integer id;
    @NotNull
    private Integer cveClaseActor;
    @NotNull
    private Integer cveAccionReclamada;
    @NotNull
    private Date fecAlta;
    private Date fecBaja;
    private Date fecModifica;
    @Size(max = 60)
    @NotNull
    private String cveUsuarioAlta;
    @Size(max = 60)
    private String cveUsuarioBaja;
    @Size(max = 60)
    private String cveUsuarioModifica;
}