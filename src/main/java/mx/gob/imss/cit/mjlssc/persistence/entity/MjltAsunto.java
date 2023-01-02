package mx.gob.imss.cit.mjlssc.persistence.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "MJLT_ASUNTO")
public class MjltAsunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TIPO_ASUNTO", referencedColumnName = "CVE_TIPO_ASUNTO")
    private SsccTipoAsunto cveTipoAsunto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_DELEGACION", referencedColumnName = "CVE_DELEGACION")
    private SsccDelegacion cveDelegacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_USUARIO", nullable = false, referencedColumnName = "CVE_USUARIO")
    private SsccUsuario cveUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TIPO_ASUNTO_ETAPA_CONFIG", referencedColumnName = "CVE_TIPO_ASUNTO_ETAPA_CONFIG")
    private SsccTipoAsuntoEtapaConfig cveTipoAsuntoEtapaConfig;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_JUNTA_CONCILIACION", nullable = false, referencedColumnName = "CVE_CENTRO_CONCILIACION")
    private SsccCentroConciliacion cveJuntaConciliacion;

    @Column(name = "NUM_EXPEDIENTE")
    private Integer numExpediente;

    @Column(name = "NUM_ANIO_EXPEDIENTE")
    private Integer numAnioExpediente;

    @Column(name = "IND_PROCEDE_INCOMPETENCIA")
    private Boolean indProcedeIncompetencia;

    @Column(name = "NUM_EXP_DEMANDA_RELAC")
    private Integer numExpDemandaRelac;

    @Column(name = "NUM_ANIO_EXP_DEMANDA_RELAC")
    private Integer numAnioExpDemandaRelac;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_JUNTA_CONC_DEMANDA_RELAC", nullable = false, referencedColumnName = "CVE_CENTRO_CONCILIACION")
    private SsccCentroConciliacion cveJuntaConcDemandaRelac;

    @Column(name = "IND_REPONE_PROCEDIMIENTO")
    private Boolean indReponeProcedimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_CLASE_ACTOR_ACCION_RECLAM", referencedColumnName = "CVE_CLASE_ACTOR_ACCION_RECLAM")
    private SsccClaseActorAccionReclam cveClaseActorAccionReclam;

    @Column(name = "IND_CISS")
    private Boolean indCiss;

    @Size(max = 200)
    @Column(name = "REF_CISS_ULTIMO_PATRON", length = 200)
    private String refCissUltimoPatron;

    @Size(max = 100)
    @Column(name = "REF_CISS_DIR_CALLE", length = 100)
    private String refCissDirCalle;

    @Size(max = 20)
    @Column(name = "REF_CISS_DIR_NUM_EXT", length = 20)
    private String refCissDirNumExt;

    @Size(max = 20)
    @Column(name = "REF_CISS_DIR_NUM_INT", length = 20)
    private String refCissDirNumInt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REF_CISS_DIR_CP", referencedColumnName = "CVE_COLONIA_CP")
    private SsccColoniaCp refCissDirCp;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_CISS_NACIMIENTO")
    private Date fecCissNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_CISS_DOCUMENTO_PRUEBA")
    private MjltDocumentoDigitalizado cveCissDocumentoPrueba;

    @Column(name = "IND_CISS_PERICIAL_MEDICA")
    private Boolean indCissPericialMedica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_REPRESENTANTE", referencedColumnName = "CVE_REPRESENTANTE")
    private SsctRepresentante cveRepresentante;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_PRESENTACION")
    private Date fecPresentacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_NOTIFICACION")
    private Date fecNotificacion;

    @Size(max = 100)
    @Column(name = "REF_CODEMANDADO", length = 100)
    private String refCodemandado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TRASCENDENCIA", referencedColumnName = "CVE_TRASCENDENCIA")
    private SsccTrascendencia cveTrascendencia;

    @Column(name = "STP_AUDIENCIA_INICIAL")
    private Date stpAudienciaInicial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_USUARIO_ABOGADO_RESPONSABLE", referencedColumnName = "CVE_USUARIO")
    private SsccUsuario cveUsuarioAbogadoResponsable;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_ASIGNACION")
    private Date fecAsignacion;

    @CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_ALTA", nullable = false)
    private Date fecAlta;

    @Column(name = "FEC_BAJA")
    private Date fecBaja;

    @UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_MODIFICA")
    private Date fecModifica;

    @Size(max = 60)
    @NotNull
    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Size(max = 60)
    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Size(max = 60)
    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SsccTipoAsunto getCveTipoAsunto() {
        return cveTipoAsunto;
    }

    public void setCveTipoAsunto(SsccTipoAsunto cveTipoAsunto) {
        this.cveTipoAsunto = cveTipoAsunto;
    }

    public SsccDelegacion getCveDelegacion() {
        return cveDelegacion;
    }

    public void setCveDelegacion(SsccDelegacion cveDelegacion) {
        this.cveDelegacion = cveDelegacion;
    }

    public SsccUsuario getCveUsuario() {
        return cveUsuario;
    }

    public void setCveUsuario(SsccUsuario cveUsuario) {
        this.cveUsuario = cveUsuario;
    }

    public SsccTipoAsuntoEtapaConfig getCveTipoAsuntoEtapaConfig() {
        return cveTipoAsuntoEtapaConfig;
    }

    public void setCveTipoAsuntoEtapaConfig(SsccTipoAsuntoEtapaConfig cveTipoAsuntoEtapaConfig) {
        this.cveTipoAsuntoEtapaConfig = cveTipoAsuntoEtapaConfig;
    }

    public SsccCentroConciliacion getCveJuntaConciliacion() {
        return cveJuntaConciliacion;
    }

    public void setCveJuntaConciliacion(SsccCentroConciliacion cveJuntaConciliacion) {
        this.cveJuntaConciliacion = cveJuntaConciliacion;
    }

    public Integer getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(Integer numExpediente) {
        this.numExpediente = numExpediente;
    }

    public Integer getNumAnioExpediente() {
        return numAnioExpediente;
    }

    public void setNumAnioExpediente(Integer numAnioExpediente) {
        this.numAnioExpediente = numAnioExpediente;
    }

    public Boolean getIndProcedeIncompetencia() {
        return indProcedeIncompetencia;
    }

    public void setIndProcedeIncompetencia(Boolean indProcedeIncompetencia) {
        this.indProcedeIncompetencia = indProcedeIncompetencia;
    }

    public Integer getNumExpDemandaRelac() {
        return numExpDemandaRelac;
    }

    public void setNumExpDemandaRelac(Integer numExpDemandaRelac) {
        this.numExpDemandaRelac = numExpDemandaRelac;
    }

    public Integer getNumAnioExpDemandaRelac() {
        return numAnioExpDemandaRelac;
    }

    public void setNumAnioExpDemandaRelac(Integer numAnioExpDemandaRelac) {
        this.numAnioExpDemandaRelac = numAnioExpDemandaRelac;
    }

    public SsccCentroConciliacion getCveJuntaConcDemandaRelac() {
        return cveJuntaConcDemandaRelac;
    }

    public void setCveJuntaConcDemandaRelac(SsccCentroConciliacion cveJuntaConcDemandaRelac) {
        this.cveJuntaConcDemandaRelac = cveJuntaConcDemandaRelac;
    }

    public Boolean getIndReponeProcedimiento() {
        return indReponeProcedimiento;
    }

    public void setIndReponeProcedimiento(Boolean indReponeProcedimiento) {
        this.indReponeProcedimiento = indReponeProcedimiento;
    }

    public SsccClaseActorAccionReclam getCveClaseActorAccionReclam() {
        return cveClaseActorAccionReclam;
    }

    public void setCveClaseActorAccionReclam(SsccClaseActorAccionReclam cveClaseActorAccionReclam) {
        this.cveClaseActorAccionReclam = cveClaseActorAccionReclam;
    }

    public Boolean getIndCiss() {
        return indCiss;
    }

    public void setIndCiss(Boolean indCiss) {
        this.indCiss = indCiss;
    }

    public String getRefCissUltimoPatron() {
        return refCissUltimoPatron;
    }

    public void setRefCissUltimoPatron(String refCissUltimoPatron) {
        this.refCissUltimoPatron = refCissUltimoPatron;
    }

    public String getRefCissDirCalle() {
        return refCissDirCalle;
    }

    public void setRefCissDirCalle(String refCissDirCalle) {
        this.refCissDirCalle = refCissDirCalle;
    }

    public String getRefCissDirNumExt() {
        return refCissDirNumExt;
    }

    public void setRefCissDirNumExt(String refCissDirNumExt) {
        this.refCissDirNumExt = refCissDirNumExt;
    }

    public String getRefCissDirNumInt() {
        return refCissDirNumInt;
    }

    public void setRefCissDirNumInt(String refCissDirNumInt) {
        this.refCissDirNumInt = refCissDirNumInt;
    }

    public SsccColoniaCp getRefCissDirCp() {
        return refCissDirCp;
    }

    public void setRefCissDirCp(SsccColoniaCp refCissDirCp) {
        this.refCissDirCp = refCissDirCp;
    }

    public Date getFecCissNacimiento() {
        return fecCissNacimiento;
    }

    public void setFecCissNacimiento(Date fecCissNacimiento) {
        this.fecCissNacimiento = fecCissNacimiento;
    }

    public MjltDocumentoDigitalizado getCveCissDocumentoPrueba() {
        return cveCissDocumentoPrueba;
    }

    public void setCveCissDocumentoPrueba(MjltDocumentoDigitalizado cveCissDocumentoPrueba) {
        this.cveCissDocumentoPrueba = cveCissDocumentoPrueba;
    }

    public Boolean getIndCissPericialMedica() {
        return indCissPericialMedica;
    }

    public void setIndCissPericialMedica(Boolean indCissPericialMedica) {
        this.indCissPericialMedica = indCissPericialMedica;
    }

    public SsctRepresentante getCveRepresentante() {
        return cveRepresentante;
    }

    public void setCveRepresentante(SsctRepresentante cveRepresentante) {
        this.cveRepresentante = cveRepresentante;
    }

    public Date getFecPresentacion() {
        return fecPresentacion;
    }

    public void setFecPresentacion(Date fecPresentacion) {
        this.fecPresentacion = fecPresentacion;
    }

    public Date getFecNotificacion() {
        return fecNotificacion;
    }

    public void setFecNotificacion(Date fecNotificacion) {
        this.fecNotificacion = fecNotificacion;
    }

    public String getRefCodemandado() {
        return refCodemandado;
    }

    public void setRefCodemandado(String refCodemandado) {
        this.refCodemandado = refCodemandado;
    }

    public SsccTrascendencia getCveTrascendencia() {
        return cveTrascendencia;
    }

    public void setCveTrascendencia(SsccTrascendencia cveTrascendencia) {
        this.cveTrascendencia = cveTrascendencia;
    }

    public Date getStpAudienciaInicial() {
        return stpAudienciaInicial;
    }

    public void setStpAudienciaInicial(Date stpAudienciaInicial) {
        this.stpAudienciaInicial = stpAudienciaInicial;
    }

    public SsccUsuario getCveUsuarioAbogadoResponsable() {
        return cveUsuarioAbogadoResponsable;
    }

    public void setCveUsuarioAbogadoResponsable(SsccUsuario cveUsuarioAbogadoResponsable) {
        this.cveUsuarioAbogadoResponsable = cveUsuarioAbogadoResponsable;
    }

    public Date getFecAsignacion() {
        return fecAsignacion;
    }

    public void setFecAsignacion(Date fecAsignacion) {
        this.fecAsignacion = fecAsignacion;
    }

    public Date getFecAlta() {
        return fecAlta;
    }

    public void setFecAlta(Date fecAlta) {
        this.fecAlta = fecAlta;
    }

    public Date getFecBaja() {
        return fecBaja;
    }

    public void setFecBaja(Date fecBaja) {
        this.fecBaja = fecBaja;
    }

    public Date getFecModifica() {
        return fecModifica;
    }

    public void setFecModifica(Date fecModifica) {
        this.fecModifica = fecModifica;
    }

    public String getCveUsuarioAlta() {
        return cveUsuarioAlta;
    }

    public void setCveUsuarioAlta(String cveUsuarioAlta) {
        this.cveUsuarioAlta = cveUsuarioAlta;
    }

    public String getCveUsuarioBaja() {
        return cveUsuarioBaja;
    }

    public void setCveUsuarioBaja(String cveUsuarioBaja) {
        this.cveUsuarioBaja = cveUsuarioBaja;
    }

    public String getCveUsuarioModifica() {
        return cveUsuarioModifica;
    }

    public void setCveUsuarioModifica(String cveUsuarioModifica) {
        this.cveUsuarioModifica = cveUsuarioModifica;
    }

}