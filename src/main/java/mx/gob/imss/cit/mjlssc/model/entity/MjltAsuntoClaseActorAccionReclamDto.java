package mx.gob.imss.cit.mjlssc.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoClaseActorAccionReclam;

/**
 * A DTO for the {@link MjltAsuntoClaseActorAccionReclam} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoClaseActorAccionReclamDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1326814930879674306L;
	private Integer id;
    @NotNull
    private MjltAsuntoDto cveAsunto;
    @NotNull
    private SsccClaseActorAccionReclamDto cveClaseActorAccionReclam;
    private Boolean indPrincipal;
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