package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsctRepresentante;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsctRepresentante} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SsctRepresentanteDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6081651499258656794L;
	private Integer id;
    @Size(max = 80)
    private String refNombreRepresentante;
    @Size(max = 60)
    private String refPaternoRepresentante;
    @Size(max = 60)
    private String refMaternoRepresentante;
    @Size(max = 80)
    private String refEmail;
    @Size(max = 15)
    private String refTelefono;
    @Size(max = 120)
    private String refDespacho;
    private SsccColoniaCpDto cveColoniaCp;
    @Size(max = 100)
    private String refDirCalle;
    @Size(max = 20)
    private String refDirNumExt;
    @Size(max = 20)
    private String refDirNumInt;
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