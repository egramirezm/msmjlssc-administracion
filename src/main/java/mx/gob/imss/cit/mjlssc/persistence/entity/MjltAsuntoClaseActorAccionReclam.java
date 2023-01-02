package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "MJLT_ASUNTO_CLASE_ACTOR_ACCION_RECLAM")
public class MjltAsuntoClaseActorAccionReclam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO_CLASE_ACTOR_ACCION_RECLAM", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ASUNTO", nullable = false)
    private MjltAsunto cveAsunto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_CLASE_ACTOR_ACCION_RECLAM", nullable = false, referencedColumnName = "CVE_CLASE_ACTOR_ACCION_RECLAM")
    private SsccClaseActorAccionReclam cveClaseActorAccionReclam;

    @Column(name = "IND_PRINCIPAL")
    private Boolean indPrincipal;

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

    public MjltAsunto getCveAsunto() {
        return cveAsunto;
    }

    public void setCveAsunto(MjltAsunto cveAsunto) {
        this.cveAsunto = cveAsunto;
    }

    public SsccClaseActorAccionReclam getCveClaseActorAccionReclam() {
        return cveClaseActorAccionReclam;
    }

    public void setCveClaseActorAccionReclam(SsccClaseActorAccionReclam cveClaseActorAccionReclam) {
        this.cveClaseActorAccionReclam = cveClaseActorAccionReclam;
    }

    public Boolean getIndPrincipal() {
        return indPrincipal;
    }

    public void setIndPrincipal(Boolean indPrincipal) {
        this.indPrincipal = indPrincipal;
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