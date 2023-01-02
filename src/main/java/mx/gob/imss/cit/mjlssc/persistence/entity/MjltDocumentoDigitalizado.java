package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "MJLT_DOCUMENTO_DIGITALIZADO")
public class MjltDocumentoDigitalizado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_DOCUMENTO_DIGITALIZADO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TIPO_DOCUMENTO")
    private MjlcTipoDocumento cveTipoDocumento;

    @Size(max = 200)
    @Column(name = "REF_NOMBRE_ARCHIVO_USR", length = 200)
    private String refNombreArchivoUsr;

    @Size(max = 200)
    @Column(name = "REF_NOMBRE_ARCHIVO_FS", length = 200)
    private String refNombreArchivoFs;

    @Size(max = 3)
    @Column(name = "REF_TIPO", length = 3)
    private String refTipo;

    @Size(max = 60)
    @Column(name = "REF_HASH", length = 60)
    private String refHash;

    @Column(name = "IND_SOLICITUD_EXCEPCION")
    private Boolean indSolicitudExcepcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TIPO_FLUJO_EXCEPCION")
    private MjlcTipoFlujoExcepcion cveTipoFlujoExcepcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_JUNTA_CONCILIACION", referencedColumnName = "CVE_CENTRO_CONCILIACION")
    private SsccCentroConciliacion cveJuntaConciliacion;

    @Column(name = "NUM_FOLIO")
    private Integer numFolio;

    @Column(name = "NUM_ANIO")
    private Integer numAnio;

    @Column(name = "IND_ACEPTADO")
    private Boolean indAceptado;

    @Column(name = "IND_RECHAZO")
    private Boolean indRechazo;

    @Column(name = "IND_ATENDIDO")
    private Boolean indAtendido;

    @Lob
    @Column(name = "REF_COMENTARIO_RECHAZO")
    private String refComentarioRechazo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TIPO_ASUNTO_ETAPA_CONFIG", referencedColumnName = "CVE_TIPO_ASUNTO_ETAPA_CONFIG")
    private SsccTipoAsuntoEtapaConfig cveTipoAsuntoEtapaConfig;

    @NotNull
    @Column(name = "FEC_ALTA", nullable = false)
    private Date fecAlta;

    @Column(name = "FEC_BAJA")
    private Date fecBaja;

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

    public MjlcTipoDocumento getCveTipoDocumento() {
        return cveTipoDocumento;
    }

    public void setCveTipoDocumento(MjlcTipoDocumento cveTipoDocumento) {
        this.cveTipoDocumento = cveTipoDocumento;
    }

    public String getRefNombreArchivoUsr() {
        return refNombreArchivoUsr;
    }

    public void setRefNombreArchivoUsr(String refNombreArchivoUsr) {
        this.refNombreArchivoUsr = refNombreArchivoUsr;
    }

    public String getRefNombreArchivoFs() {
        return refNombreArchivoFs;
    }

    public void setRefNombreArchivoFs(String refNombreArchivoFs) {
        this.refNombreArchivoFs = refNombreArchivoFs;
    }

    public String getRefTipo() {
        return refTipo;
    }

    public void setRefTipo(String refTipo) {
        this.refTipo = refTipo;
    }

    public String getRefHash() {
        return refHash;
    }

    public void setRefHash(String refHash) {
        this.refHash = refHash;
    }

    public Boolean getIndSolicitudExcepcion() {
        return indSolicitudExcepcion;
    }

    public void setIndSolicitudExcepcion(Boolean indSolicitudExcepcion) {
        this.indSolicitudExcepcion = indSolicitudExcepcion;
    }

    public MjlcTipoFlujoExcepcion getCveTipoFlujoExcepcion() {
        return cveTipoFlujoExcepcion;
    }

    public void setCveTipoFlujoExcepcion(MjlcTipoFlujoExcepcion cveTipoFlujoExcepcion) {
        this.cveTipoFlujoExcepcion = cveTipoFlujoExcepcion;
    }

    public SsccCentroConciliacion getCveJuntaConciliacion() {
        return cveJuntaConciliacion;
    }

    public void setCveJuntaConciliacion(SsccCentroConciliacion cveJuntaConciliacion) {
        this.cveJuntaConciliacion = cveJuntaConciliacion;
    }

    public Integer getNumFolio() {
        return numFolio;
    }

    public void setNumFolio(Integer numFolio) {
        this.numFolio = numFolio;
    }

    public Integer getNumAnio() {
        return numAnio;
    }

    public void setNumAnio(Integer numAnio) {
        this.numAnio = numAnio;
    }

    public Boolean getIndAceptado() {
        return indAceptado;
    }

    public void setIndAceptado(Boolean indAceptado) {
        this.indAceptado = indAceptado;
    }

    public Boolean getIndRechazo() {
        return indRechazo;
    }

    public void setIndRechazo(Boolean indRechazo) {
        this.indRechazo = indRechazo;
    }

    public Boolean getIndAtendido() {
        return indAtendido;
    }

    public void setIndAtendido(Boolean indAtendido) {
        this.indAtendido = indAtendido;
    }

    public String getRefComentarioRechazo() {
        return refComentarioRechazo;
    }

    public void setRefComentarioRechazo(String refComentarioRechazo) {
        this.refComentarioRechazo = refComentarioRechazo;
    }

    public SsccTipoAsuntoEtapaConfig getCveTipoAsuntoEtapaConfig() {
        return cveTipoAsuntoEtapaConfig;
    }

    public void setCveTipoAsuntoEtapaConfig(SsccTipoAsuntoEtapaConfig cveTipoAsuntoEtapaConfig) {
        this.cveTipoAsuntoEtapaConfig = cveTipoAsuntoEtapaConfig;
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