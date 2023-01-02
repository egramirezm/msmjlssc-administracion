package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SSCC_CENTRO_CONCILIACION",catalog = DataBaseShemaConf.SCHEMANML)
public class SsccCentroConciliacion implements Serializable {
    private static final long serialVersionUID = 2450557910380588119L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_CENTRO_CONCILIACION", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "DES_CENTRO_CONCILIACION", length = 100)
    private String desCentroConciliacion;

    @Column(name = "CVE_ALCANCE")
    private Integer cveAlcance;

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

    @Column(name = "CVE_CENTRO_CONCILIACION_ANTERIOR")
    private Integer cveCentroConciliacionAnterior;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesCentroConciliacion() {
        return desCentroConciliacion;
    }

    public void setDesCentroConciliacion(String desCentroConciliacion) {
        this.desCentroConciliacion = desCentroConciliacion;
    }

    public Integer getCveAlcance() {
        return cveAlcance;
    }

    public void setCveAlcance(Integer cveAlcance) {
        this.cveAlcance = cveAlcance;
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

    public Integer getCveCentroConciliacionAnterior() {
        return cveCentroConciliacionAnterior;
    }

    public void setCveCentroConciliacionAnterior(Integer cveCentroConciliacionAnterior) {
        this.cveCentroConciliacionAnterior = cveCentroConciliacionAnterior;
    }

}