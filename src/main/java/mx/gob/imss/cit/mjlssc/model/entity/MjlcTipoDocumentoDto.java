package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjlcTipoDocumento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link MjlcTipoDocumento} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjlcTipoDocumentoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6287346067604280408L;
	private Integer id;
    private SsccTipoAsuntoEtapaConfigDto cveTipoAsuntoEtapaConfig;
    @Size(max = 200)
    @NotNull
    private String desTipoDocumento;
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