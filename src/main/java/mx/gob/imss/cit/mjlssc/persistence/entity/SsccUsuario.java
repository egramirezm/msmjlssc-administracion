package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.util.Date;

@Entity
@Table(name = "SSCC_USUARIO", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_USUARIO", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "CVE_PERSONA", nullable = false)
    private Integer cvePersona;

    @NotNull
    @Column(name = "CVE_PERFIL", nullable = false)
    private Integer cvePerfil;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_DELEGACION", nullable = false)
    private SsccDelegacion cveDelegacion;

    @NotNull
    @Column(name = "CVE_CARGO", nullable = false)
    private Integer cveCargo;

    @NotNull
    @Column(name = "IND_ACTIVO", nullable = false)
    private Boolean indActivo = false;

    @Size(max = 60)
    @Column(name = "REF_USUARIO", length = 60)
    private String refUsuario;

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

    public Integer getCvePersona() {
        return cvePersona;
    }

    public void setCvePersona(Integer cvePersona) {
        this.cvePersona = cvePersona;
    }

    public Integer getCvePerfil() {
        return cvePerfil;
    }

    public void setCvePerfil(Integer cvePerfil) {
        this.cvePerfil = cvePerfil;
    }

    public SsccDelegacion getCveDelegacion() {
        return cveDelegacion;
    }

    public void setCveDelegacion(SsccDelegacion cveDelegacion) {
        this.cveDelegacion = cveDelegacion;
    }

    public Integer getCveCargo() {
        return cveCargo;
    }

    public void setCveCargo(Integer cveCargo) {
        this.cveCargo = cveCargo;
    }

    public Boolean getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(Boolean indActivo) {
        this.indActivo = indActivo;
    }

    public String getRefUsuario() {
        return refUsuario;
    }

    public void setRefUsuario(String refUsuario) {
        this.refUsuario = refUsuario;
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