package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SSCC_COLONIA_CP", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccColoniaCp implements Serializable {
    private static final long serialVersionUID = 6126789196049793095L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_COLONIA_CP", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_MUNICIPIO_ALCALDIA", nullable = false)
    private SsccMunicipioAlcaldia cveMunicipioAlcaldia;

    @Size(max = 70)
    @Column(name = "REF_NOM_COLONIA_CP", length = 70)
    private String refNomColoniaCp;

    @Size(max = 5)
    @Column(name = "REF_CP", length = 5)
    private String refCp;

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

    public SsccMunicipioAlcaldia getCveMunicipioAlcaldia() {
        return cveMunicipioAlcaldia;
    }

    public void setCveMunicipioAlcaldia(SsccMunicipioAlcaldia cveMunicipioAlcaldia) {
        this.cveMunicipioAlcaldia = cveMunicipioAlcaldia;
    }

    public String getRefNomColoniaCp() {
        return refNomColoniaCp;
    }

    public void setRefNomColoniaCp(String refNomColoniaCp) {
        this.refNomColoniaCp = refNomColoniaCp;
    }

    public String getRefCp() {
        return refCp;
    }

    public void setRefCp(String refCp) {
        this.refCp = refCp;
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