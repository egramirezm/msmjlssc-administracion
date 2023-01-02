package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "SSCC_ACCION_RECLAMADA" , catalog = DataBaseShemaConf.SCHEMANML)
public class SsccAccionReclamada implements Serializable {
    private static final long serialVersionUID = -5508761907012459859L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ACCION_RECLAMADA", nullable = false)
    private Integer id;

    @Size(max = 120)
    @Column(name = "DES_ACCION_RECLAMADA", length = 120)
    private String desAccionReclamada;

    @Column(name = "IMP_ESTIMADO", precision = 12, scale = 2)
    private BigDecimal impEstimado;

    @NotNull
    @Column(name = "CVE_CLAS_ACCION_RECLAMADA", nullable = false)
    private Integer cveClasAccionReclamada;

    @Column(name = "NUM_FACTOR_CALCULO", precision = 9, scale = 2)
    private BigDecimal numFactorCalculo;

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

    public String getDesAccionReclamada() {
        return desAccionReclamada;
    }

    public void setDesAccionReclamada(String desAccionReclamada) {
        this.desAccionReclamada = desAccionReclamada;
    }

    public BigDecimal getImpEstimado() {
        return impEstimado;
    }

    public void setImpEstimado(BigDecimal impEstimado) {
        this.impEstimado = impEstimado;
    }

    public Integer getCveClasAccionReclamada() {
        return cveClasAccionReclamada;
    }

    public void setCveClasAccionReclamada(Integer cveClasAccionReclamada) {
        this.cveClasAccionReclamada = cveClasAccionReclamada;
    }

    public BigDecimal getNumFactorCalculo() {
        return numFactorCalculo;
    }

    public void setNumFactorCalculo(BigDecimal numFactorCalculo) {
        this.numFactorCalculo = numFactorCalculo;
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