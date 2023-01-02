package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltDocumentoDigitalizado;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link MjltDocumentoDigitalizado} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltDocumentoDigitalizadoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5207187919315865668L;
	private Integer id;
    private MjlcTipoDocumentoDto cveTipoDocumento;
    @Size(max = 200)
    private String refNombreArchivoUsr;
    @Size(max = 200)
    private String refNombreArchivoFs;
    @Size(max = 3)
    private String refTipo;
    @Size(max = 60)
    private String refHash;
    private Boolean indSolicitudExcepcion;
    private MjlcTipoFlujoExcepcionDto cveTipoFlujoExcepcion;
    private SsccCentroConciliacionDto cveJuntaConciliacion;
    private Integer numFolio;
    private Integer numAnio;
    private Boolean indAceptado;
    private Boolean indRechazo;
    private Boolean indAtendido;
    private String refComentarioRechazo;
    private SsccTipoAsuntoEtapaConfigDto cveTipoAsuntoEtapaConfig;
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