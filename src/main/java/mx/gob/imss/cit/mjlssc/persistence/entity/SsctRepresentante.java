package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.util.Date;

@Entity
@Table(name = "SSCT_REPRESENTANTE", catalog = DataBaseShemaConf.SCHEMANML)
public class SsctRepresentante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_REPRESENTANTE", nullable = false)
    private Integer id;

    @Size(max = 80)
    @Column(name = "REF_NOMBRE_REPRESENTANTE", length = 80)
    private String refNombreRepresentante;

    @Size(max = 60)
    @Column(name = "REF_PATERNO_REPRESENTANTE", length = 60)
    private String refPaternoRepresentante;

    @Size(max = 60)
    @Column(name = "REF_MATERNO_REPRESENTANTE", length = 60)
    private String refMaternoRepresentante;

    @Size(max = 80)
    @Column(name = "REF_EMAIL", length = 80)
    private String refEmail;

    @Size(max = 15)
    @Column(name = "REF_TELEFONO", length = 15)
    private String refTelefono;

    @Size(max = 120)
    @Column(name = "REF_DESPACHO", length = 120)
    private String refDespacho;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_COLONIA_CP")
    private SsccColoniaCp cveColoniaCp;

    @Size(max = 100)
    @Column(name = "REF_DIR_CALLE", length = 100)
    private String refDirCalle;

    @Size(max = 20)
    @Column(name = "REF_DIR_NUM_EXT", length = 20)
    private String refDirNumExt;

    @Size(max = 20)
    @Column(name = "REF_DIR_NUM_INT", length = 20)
    private String refDirNumInt;

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

    public String getRefNombreRepresentante() {
        return refNombreRepresentante;
    }

    public void setRefNombreRepresentante(String refNombreRepresentante) {
        this.refNombreRepresentante = refNombreRepresentante;
    }

    public String getRefPaternoRepresentante() {
        return refPaternoRepresentante;
    }

    public void setRefPaternoRepresentante(String refPaternoRepresentante) {
        this.refPaternoRepresentante = refPaternoRepresentante;
    }

    public String getRefMaternoRepresentante() {
        return refMaternoRepresentante;
    }

    public void setRefMaternoRepresentante(String refMaternoRepresentante) {
        this.refMaternoRepresentante = refMaternoRepresentante;
    }

    public String getRefEmail() {
        return refEmail;
    }

    public void setRefEmail(String refEmail) {
        this.refEmail = refEmail;
    }

    public String getRefTelefono() {
        return refTelefono;
    }

    public void setRefTelefono(String refTelefono) {
        this.refTelefono = refTelefono;
    }

    public String getRefDespacho() {
        return refDespacho;
    }

    public void setRefDespacho(String refDespacho) {
        this.refDespacho = refDespacho;
    }

    public SsccColoniaCp getCveColoniaCp() {
        return cveColoniaCp;
    }

    public void setCveColoniaCp(SsccColoniaCp cveColoniaCp) {
        this.cveColoniaCp = cveColoniaCp;
    }

    public String getRefDirCalle() {
        return refDirCalle;
    }

    public void setRefDirCalle(String refDirCalle) {
        this.refDirCalle = refDirCalle;
    }

    public String getRefDirNumExt() {
        return refDirNumExt;
    }

    public void setRefDirNumExt(String refDirNumExt) {
        this.refDirNumExt = refDirNumExt;
    }

    public String getRefDirNumInt() {
        return refDirNumInt;
    }

    public void setRefDirNumInt(String refDirNumInt) {
        this.refDirNumInt = refDirNumInt;
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