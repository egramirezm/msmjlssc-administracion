package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SSCC_MUNICIPIO_ALCALDIA", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccMunicipioAlcaldia implements Serializable {
    private static final long serialVersionUID = 7980892925229594407L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_MUNICIPIO_ALCALDIA", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ESTADO", nullable = false)
    private SsccEstado cveEstado;

    @Size(max = 55)
    @Column(name = "REF_NOM_MUNICIPIO_ALCALDIA", length = 55)
    private String refNomMunicipioAlcaldia;

    @Column(name = "IND_ESTATUS")
    private Boolean indEstatus;

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

    public SsccEstado getCveEstado() {
        return cveEstado;
    }

    public void setCveEstado(SsccEstado cveEstado) {
        this.cveEstado = cveEstado;
    }

    public String getRefNomMunicipioAlcaldia() {
        return refNomMunicipioAlcaldia;
    }

    public void setRefNomMunicipioAlcaldia(String refNomMunicipioAlcaldia) {
        this.refNomMunicipioAlcaldia = refNomMunicipioAlcaldia;
    }

    public Boolean getIndEstatus() {
        return indEstatus;
    }

    public void setIndEstatus(Boolean indEstatus) {
        this.indEstatus = indEstatus;
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