package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccClaseActor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccClaseActor} entity
 */
@Data
public class SsccClaseActorDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3787355793180530202L;
	private  Integer id;
    @Size(max = 40)
    private  String desClaseActor;
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