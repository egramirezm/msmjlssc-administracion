package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.util.Date;

@Entity
@Table(name = "SSCC_TIPO_ASUNTO_ETAPA_CONFIG", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccTipoAsuntoEtapaConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_TIPO_ASUNTO_ETAPA_CONFIG", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_TIPO_ASUNTO", nullable = false)
    private SsccTipoAsunto cveTipoAsunto;

    @Size(max = 100)
    @Column(name = "DES_TIPO_ASUNTO_ETAPA_CONFIG", length = 100)
    private String desTipoAsuntoEtapaConfig;

    @Column(name = "NUM_TAREA_ORIGEN")
    private Integer numTareaOrigen;

    @Column(name = "NUM_TAREA_DESTINO")
    private Integer numTareaDestino;

    @Column(name = "IND_NOTIFICACION_ACTIVA")
    private Boolean indNotificacionActiva;

    @Column(name = "IND_NOTIFICACION_CORDINADOR")
    private Boolean indNotificacionCordinador;

    @Column(name = "IND_NOTIFICACION_ABOGADO")
    private Boolean indNotificacionAbogado;

    @Column(name = "IND_NOTIFICACION_JEFE_DEPTO")
    private Boolean indNotificacionJefeDepto;

    @Column(name = "IND_NOTIFICACION_JEFE_SERV_JUR")
    private Boolean indNotificacionJefeServJur;

    @Column(name = "IND_NOTIFICACION_AREA")
    private Boolean indNotificacionArea;

    @Column(name = "IND_NOTIFICACION_JEFE_DIVISION")
    private Boolean indNotificacionJefeDivision;

    @Column(name = "NUM_DIAS_VIGENCIA")
    private Integer numDiasVigencia;

    @Column(name = "NUM_DIAS_VIGENCIA2")
    private Integer numDiasVigencia2;

    @Column(name = "IND_DIGITALIZACION_OBLIGATORIA")
    private Boolean indDigitalizacionObligatoria;

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

    public SsccTipoAsunto getCveTipoAsunto() {
        return cveTipoAsunto;
    }

    public void setCveTipoAsunto(SsccTipoAsunto cveTipoAsunto) {
        this.cveTipoAsunto = cveTipoAsunto;
    }

    public String getDesTipoAsuntoEtapaConfig() {
        return desTipoAsuntoEtapaConfig;
    }

    public void setDesTipoAsuntoEtapaConfig(String desTipoAsuntoEtapaConfig) {
        this.desTipoAsuntoEtapaConfig = desTipoAsuntoEtapaConfig;
    }

    public Integer getNumTareaOrigen() {
        return numTareaOrigen;
    }

    public void setNumTareaOrigen(Integer numTareaOrigen) {
        this.numTareaOrigen = numTareaOrigen;
    }

    public Integer getNumTareaDestino() {
        return numTareaDestino;
    }

    public void setNumTareaDestino(Integer numTareaDestino) {
        this.numTareaDestino = numTareaDestino;
    }

    public Boolean getIndNotificacionActiva() {
        return indNotificacionActiva;
    }

    public void setIndNotificacionActiva(Boolean indNotificacionActiva) {
        this.indNotificacionActiva = indNotificacionActiva;
    }

    public Boolean getIndNotificacionCordinador() {
        return indNotificacionCordinador;
    }

    public void setIndNotificacionCordinador(Boolean indNotificacionCordinador) {
        this.indNotificacionCordinador = indNotificacionCordinador;
    }

    public Boolean getIndNotificacionAbogado() {
        return indNotificacionAbogado;
    }

    public void setIndNotificacionAbogado(Boolean indNotificacionAbogado) {
        this.indNotificacionAbogado = indNotificacionAbogado;
    }

    public Boolean getIndNotificacionJefeDepto() {
        return indNotificacionJefeDepto;
    }

    public void setIndNotificacionJefeDepto(Boolean indNotificacionJefeDepto) {
        this.indNotificacionJefeDepto = indNotificacionJefeDepto;
    }

    public Boolean getIndNotificacionJefeServJur() {
        return indNotificacionJefeServJur;
    }

    public void setIndNotificacionJefeServJur(Boolean indNotificacionJefeServJur) {
        this.indNotificacionJefeServJur = indNotificacionJefeServJur;
    }

    public Boolean getIndNotificacionArea() {
        return indNotificacionArea;
    }

    public void setIndNotificacionArea(Boolean indNotificacionArea) {
        this.indNotificacionArea = indNotificacionArea;
    }

    public Boolean getIndNotificacionJefeDivision() {
        return indNotificacionJefeDivision;
    }

    public void setIndNotificacionJefeDivision(Boolean indNotificacionJefeDivision) {
        this.indNotificacionJefeDivision = indNotificacionJefeDivision;
    }

    public Integer getNumDiasVigencia() {
        return numDiasVigencia;
    }

    public void setNumDiasVigencia(Integer numDiasVigencia) {
        this.numDiasVigencia = numDiasVigencia;
    }

    public Integer getNumDiasVigencia2() {
        return numDiasVigencia2;
    }

    public void setNumDiasVigencia2(Integer numDiasVigencia2) {
        this.numDiasVigencia2 = numDiasVigencia2;
    }

    public Boolean getIndDigitalizacionObligatoria() {
        return indDigitalizacionObligatoria;
    }

    public void setIndDigitalizacionObligatoria(Boolean indDigitalizacionObligatoria) {
        this.indDigitalizacionObligatoria = indDigitalizacionObligatoria;
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