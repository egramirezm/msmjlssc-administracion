package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "MJLC_TIPO_DOCUMENTO")
public class MjlcTipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_TIPO_DOCUMENTO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_TIPO_ASUNTO_ETAPA_CONFIG", referencedColumnName = "CVE_TIPO_ASUNTO_ETAPA_CONFIG")
    private SsccTipoAsuntoEtapaConfig cveTipoAsuntoEtapaConfig;

    @Size(max = 200)
    @NotNull
    @Column(name = "DES_TIPO_DOCUMENTO", nullable = false, length = 200)
    private String desTipoDocumento;

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

    public SsccTipoAsuntoEtapaConfig getCveTipoAsuntoEtapaConfig() {
        return cveTipoAsuntoEtapaConfig;
    }

    public void setCveTipoAsuntoEtapaConfig(SsccTipoAsuntoEtapaConfig cveTipoAsuntoEtapaConfig) {
        this.cveTipoAsuntoEtapaConfig = cveTipoAsuntoEtapaConfig;
    }

    public String getDesTipoDocumento() {
        return desTipoDocumento;
    }

    public void setDesTipoDocumento(String desTipoDocumento) {
        this.desTipoDocumento = desTipoDocumento;
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