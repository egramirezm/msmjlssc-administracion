package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsunto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link MjltAsunto} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5840370712763250150L;
	private Integer id;
    private SsccTipoAsuntoDto cveTipoAsunto;
    private SsccDelegacionDto cveDelegacion;
    @NotNull
    private SsccUsuarioDto cveUsuario;
    private SsccTipoAsuntoEtapaConfigDto cveTipoAsuntoEtapaConfig;
    @NotNull
    private SsccCentroConciliacionDto cveJuntaConciliacion;
    private Integer numExpediente;
    private Integer numAnioExpediente;
    private Boolean indProcedeIncompetencia;
    private Integer numExpDemandaRelac;
    private Integer numAnioExpDemandaRelac;
    @NotNull
    private SsccCentroConciliacionDto cveJuntaConcDemandaRelac;
    private Boolean indReponeProcedimiento;
    private SsccClaseActorAccionReclamDto cveClaseActorAccionReclam;
    private Boolean indCiss;
    @Size(max = 200)
    private String refCissUltimoPatron;
    @Size(max = 100)
    private String refCissDirCalle;
    @Size(max = 20)
    private String refCissDirNumExt;
    @Size(max = 20)
    private String refCissDirNumInt;
    private SsccColoniaCpDto refCissDirCp;
    private Date fecCissNacimiento;
    private MjltDocumentoDigitalizadoDto cveCissDocumentoPrueba;
    private Boolean indCissPericialMedica;
    private SsctRepresentanteDto cveRepresentante;
    private Date fecPresentacion;
    private Date fecNotificacion;
    @Size(max = 100)
    private String refCodemandado;
    private SsccTrascendenciaDto cveTrascendencia;
    private Date stpAudienciaInicial;
    private SsccUsuarioDto cveUsuarioAbogadoResponsable;
    private Date fecAsignacion;
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