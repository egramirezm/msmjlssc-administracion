package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUsuario;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccUsuario} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SsccUsuarioDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5643625351641283137L;
	private Integer id;
    @NotNull
    private Integer cvePersona;
    @NotNull
    private Integer cvePerfil;
    @NotNull
    private SsccDelegacionDto cveDelegacion;
    @NotNull
    private Integer cveCargo;
    @NotNull
    private Boolean indActivo = false;
    @Size(max = 60)
    private String refUsuario;
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