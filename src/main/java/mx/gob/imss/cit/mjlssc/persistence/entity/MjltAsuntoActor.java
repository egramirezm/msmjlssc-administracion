package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MJLT_ASUNTO_ACTOR")
public class MjltAsuntoActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO_ACTOR", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ASUNTO", nullable = false)
    private MjltAsunto cveAsunto;

    @Size(max = 200)
    @Column(name = "REF_NOMBRE", length = 200)
    private String refNombre;

    @Size(max = 200)
    @Column(name = "REF_PATERNO", length = 200)
    private String refPaterno;

    @Size(max = 200)
    @Column(name = "REF_MATERNO", length = 200)
    private String refMaterno;

    @Size(max = 20)
    @Column(name = "REF_MATRICULA", length = 20)
    private String refMatricula;

    @Size(max = 20)
    @Column(name = "REF_NSS", length = 20)
    private String refNss;

    @Size(max = 20)
    @Column(name = "REF_CURP", length = 20)
    private String refCurp;

    @Size(max = 20)
    @Column(name = "REF_RFC", length = 20)
    private String refRfc;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_SEXO", nullable = false, referencedColumnName = "CVE_SEXO")
    private SsccSexo cveSexo;

    @Column(name = "CAN_SALARIO_BASE", precision = 16, scale = 2)
    private BigDecimal canSalarioBase;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_UMF", nullable = false, referencedColumnName = "CVE_UMF")
    private SsccUmf cveUmf;

    @Column(name = "IND_ACTOR_PRINCIPAL")
    private Boolean indActorPrincipal;

    @Column(name = "IND_FINADO")
    private Boolean indFinado;

    @Column(name = "IND_CONSUMO_INTERFASES")
    private Boolean indConsumoInterfases;

    @Column(name = "IND_CONVENIO")
    private Boolean indConvenio;

    @Lob
    @Column(name = "REF_CONVENIO_MOTIVONOACUERDO")
    private String refConvenioMotivonoacuerdo;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_CONVENIO")
    private Date fecConvenio;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_RATIFICACION_CONV")
    private Date fecRatificacionConv;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_SANCION_CONV")
    private Date fecSancionConv;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_CUMPLIMIENTO_CONV")
    private Date fecCumplimientoConv;

    @Lob
    @Column(name = "REF_COMENTARIO_CONV")
    private String refComentarioConv;

    @Column(name = "IND_DESISTIMIENTO")
    private Boolean indDesistimiento;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_DESISTIMIENTO")
    private Date fecDesistimiento;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_RATIFICACION_DES")
    private Date fecRatificacionDes;

    @Lob
    @Column(name = "REF_COMENTARIO_DES")
    private String refComentarioDes;

    @Size(max = 200)
    @Column(name = "REF_WSE_CLAVE_DEPTO", length = 200)
    private String refWseClaveDepto;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_DEPTO", length = 200)
    private String refWseDesDepto;

    @Size(max = 200)
    @Column(name = "REF_WSE_CLAVE_PUESTO", length = 200)
    private String refWseClavePuesto;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_PUESTO", length = 200)
    private String refWseDesPuesto;

    @Size(max = 200)
    @Column(name = "REF_WSE_CLAVE_AREA", length = 200)
    private String refWseClaveArea;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_AREA", length = 200)
    private String refWseDesArea;

    @Size(max = 200)
    @Column(name = "REF_WSE_CUANTIA_BASICA", length = 200)
    private String refWseCuantiaBasica;

    @Size(max = 200)
    @Column(name = "REF_WSE_ESTATUS", length = 200)
    private String refWseEstatus;

    @Size(max = 200)
    @Column(name = "REF_WSE_TC", length = 200)
    private String refWseTc;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_TC", length = 200)
    private String refWseDesTc;

    @Size(max = 200)
    @Column(name = "REF_WSE_TIPO_EMPLEADO", length = 200)
    private String refWseTipoEmpleado;

    @Size(max = 200)
    @Column(name = "REF_WSE_DELEGACION", length = 200)
    private String refWseDelegacion;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_DELEGACION", length = 200)
    private String refWseDesDelegacion;

    @Size(max = 200)
    @Column(name = "REF_WSE_LOCALIDAD", length = 200)
    private String refWseLocalidad;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_LOCALIDAD", length = 200)
    private String refWseDesLocalidad;

    @Size(max = 200)
    @Column(name = "REF_WSE_QUINCENA_MES", length = 200)
    private String refWseQuincenaMes;

    @Size(max = 200)
    @Column(name = "REF_WSE_FECHA_JUB_PEN", length = 200)
    private String refWseFechaJubPen;

    @Size(max = 200)
    @Column(name = "REF_WSE_TIPO_JUBILACION", length = 200)
    private String refWseTipoJubilacion;

    @Size(max = 200)
    @Column(name = "REF_WSE_PORCENTAJE_PENSION", length = 200)
    private String refWsePorcentajePension;

    @Size(max = 200)
    @Column(name = "REF_WSE_FECHA_INGRESO", length = 200)
    private String refWseFechaIngreso;

    @Size(max = 200)
    @Column(name = "REF_WSE_FECHA_BAJA", length = 200)
    private String refWseFechaBaja;

    @Size(max = 200)
    @Column(name = "REF_WSE_ANT_ANIOS", length = 200)
    private String refWseAntAnios;

    @Size(max = 200)
    @Column(name = "REF_WSE_ANT_QNAS", length = 200)
    private String refWseAntQnas;

    @Size(max = 200)
    @Column(name = "REF_WSE_ANT_DIAS", length = 200)
    private String refWseAntDias;

    @Size(max = 200)
    @Column(name = "REF_WSE_CLAVE_BAJA", length = 200)
    private String refWseClaveBaja;

    @Size(max = 200)
    @Column(name = "REF_WSE_DES_BAJA", length = 200)
    private String refWseDesBaja;

    @Size(max = 200)
    @Column(name = "REF_WSE_FECHA_MODIFICACION", length = 200)
    private String refWseFechaModificacion;

    @Size(max = 200)
    @Column(name = "REF_WSE_FMODORDEN", length = 200)
    private String refWseFmodorden;

    @Size(max = 10)
    @Column(name = "REF_SDA_ID_SEXO", length = 10)
    private String refSdaIdSexo;

    @Size(max = 10)
    @Column(name = "REF_SDA_MES_NACIMIENTO", length = 10)
    private String refSdaMesNacimiento;

    @Size(max = 10)
    @Column(name = "REF_SDA_CVE_ENTIDAD_NACIMIENTO", length = 10)
    private String refSdaCveEntidadNacimiento;

    @Size(max = 100)
    @Column(name = "REF_SDA_DSC_SEXO", length = 100)
    private String refSdaDscSexo;

    @Size(max = 100)
    @Column(name = "REF_SDA_DSC_NACIMIENTO", length = 100)
    private String refSdaDscNacimiento;

    @Size(max = 300)
    @Column(name = "REF_SDA_DSC_ENTIDAD_NACIMIENTO", length = 300)
    private String refSdaDscEntidadNacimiento;

    @Size(max = 20)
    @Column(name = "REF_SDA_CVE_TIPO_PENSION", length = 20)
    private String refSdaCveTipoPension;

    @Size(max = 20)
    @Column(name = "REF_WSP_CVE_DELEGACION", length = 20)
    private String refWspCveDelegacion;

    @Size(max = 20)
    @Column(name = "REF_WSP_CVE_SUB_DELEGACION", length = 20)
    private String refWspCveSubDelegacion;

    @Size(max = 400)
    @Column(name = "REF_WSP_DES_DELEGACION", length = 400)
    private String refWspDesDelegacion;

    @Size(max = 400)
    @Column(name = "REF_WSP_DES_SUB_DELEGACION", length = 400)
    private String refWspDesSubDelegacion;

    @CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_ALTA", nullable = false)
    private Date fecAlta;

    @Column(name = "FEC_BAJA")
    private Date fecBaja;

    @UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
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

    public String getRefNombre() {
        return refNombre;
    }

    public void setRefNombre(String refNombre) {
        this.refNombre = refNombre;
    }

    public String getRefPaterno() {
        return refPaterno;
    }

    public void setRefPaterno(String refPaterno) {
        this.refPaterno = refPaterno;
    }

    public String getRefMaterno() {
        return refMaterno;
    }

    public void setRefMaterno(String refMaterno) {
        this.refMaterno = refMaterno;
    }

    public String getRefMatricula() {
        return refMatricula;
    }

    public void setRefMatricula(String refMatricula) {
        this.refMatricula = refMatricula;
    }

    public String getRefNss() {
        return refNss;
    }

    public void setRefNss(String refNss) {
        this.refNss = refNss;
    }

    public String getRefCurp() {
        return refCurp;
    }

    public void setRefCurp(String refCurp) {
        this.refCurp = refCurp;
    }

    public String getRefRfc() {
        return refRfc;
    }

    public void setRefRfc(String refRfc) {
        this.refRfc = refRfc;
    }

    public SsccSexo getCveSexo() {
        return cveSexo;
    }

    public void setCveSexo(SsccSexo cveSexo) {
        this.cveSexo = cveSexo;
    }

    public BigDecimal getCanSalarioBase() {
        return canSalarioBase;
    }

    public void setCanSalarioBase(BigDecimal canSalarioBase) {
        this.canSalarioBase = canSalarioBase;
    }

    public SsccUmf getCveUmf() {
        return cveUmf;
    }

    public void setCveUmf(SsccUmf cveUmf) {
        this.cveUmf = cveUmf;
    }

    public Boolean getIndActorPrincipal() {
        return indActorPrincipal;
    }

    public void setIndActorPrincipal(Boolean indActorPrincipal) {
        this.indActorPrincipal = indActorPrincipal;
    }

    public Boolean getIndFinado() {
        return indFinado;
    }

    public void setIndFinado(Boolean indFinado) {
        this.indFinado = indFinado;
    }

    public Boolean getIndConsumoInterfases() {
        return indConsumoInterfases;
    }

    public void setIndConsumoInterfases(Boolean indConsumoInterfases) {
        this.indConsumoInterfases = indConsumoInterfases;
    }

    public Boolean getIndConvenio() {
        return indConvenio;
    }

    public void setIndConvenio(Boolean indConvenio) {
        this.indConvenio = indConvenio;
    }

    public String getRefConvenioMotivonoacuerdo() {
        return refConvenioMotivonoacuerdo;
    }

    public void setRefConvenioMotivonoacuerdo(String refConvenioMotivonoacuerdo) {
        this.refConvenioMotivonoacuerdo = refConvenioMotivonoacuerdo;
    }

    public Date getFecConvenio() {
        return fecConvenio;
    }

    public void setFecConvenio(Date fecConvenio) {
        this.fecConvenio = fecConvenio;
    }

    public Date getFecRatificacionConv() {
        return fecRatificacionConv;
    }

    public void setFecRatificacionConv(Date fecRatificacionConv) {
        this.fecRatificacionConv = fecRatificacionConv;
    }

    public Date getFecSancionConv() {
        return fecSancionConv;
    }

    public void setFecSancionConv(Date fecSancionConv) {
        this.fecSancionConv = fecSancionConv;
    }

    public Date getFecCumplimientoConv() {
        return fecCumplimientoConv;
    }

    public void setFecCumplimientoConv(Date fecCumplimientoConv) {
        this.fecCumplimientoConv = fecCumplimientoConv;
    }

    public String getRefComentarioConv() {
        return refComentarioConv;
    }

    public void setRefComentarioConv(String refComentarioConv) {
        this.refComentarioConv = refComentarioConv;
    }

    public Boolean getIndDesistimiento() {
        return indDesistimiento;
    }

    public void setIndDesistimiento(Boolean indDesistimiento) {
        this.indDesistimiento = indDesistimiento;
    }

    public Date getFecDesistimiento() {
        return fecDesistimiento;
    }

    public void setFecDesistimiento(Date fecDesistimiento) {
        this.fecDesistimiento = fecDesistimiento;
    }

    public Date getFecRatificacionDes() {
        return fecRatificacionDes;
    }

    public void setFecRatificacionDes(Date fecRatificacionDes) {
        this.fecRatificacionDes = fecRatificacionDes;
    }

    public String getRefComentarioDes() {
        return refComentarioDes;
    }

    public void setRefComentarioDes(String refComentarioDes) {
        this.refComentarioDes = refComentarioDes;
    }

    public String getRefWseClaveDepto() {
        return refWseClaveDepto;
    }

    public void setRefWseClaveDepto(String refWseClaveDepto) {
        this.refWseClaveDepto = refWseClaveDepto;
    }

    public String getRefWseDesDepto() {
        return refWseDesDepto;
    }

    public void setRefWseDesDepto(String refWseDesDepto) {
        this.refWseDesDepto = refWseDesDepto;
    }

    public String getRefWseClavePuesto() {
        return refWseClavePuesto;
    }

    public void setRefWseClavePuesto(String refWseClavePuesto) {
        this.refWseClavePuesto = refWseClavePuesto;
    }

    public String getRefWseDesPuesto() {
        return refWseDesPuesto;
    }

    public void setRefWseDesPuesto(String refWseDesPuesto) {
        this.refWseDesPuesto = refWseDesPuesto;
    }

    public String getRefWseClaveArea() {
        return refWseClaveArea;
    }

    public void setRefWseClaveArea(String refWseClaveArea) {
        this.refWseClaveArea = refWseClaveArea;
    }

    public String getRefWseDesArea() {
        return refWseDesArea;
    }

    public void setRefWseDesArea(String refWseDesArea) {
        this.refWseDesArea = refWseDesArea;
    }

    public String getRefWseCuantiaBasica() {
        return refWseCuantiaBasica;
    }

    public void setRefWseCuantiaBasica(String refWseCuantiaBasica) {
        this.refWseCuantiaBasica = refWseCuantiaBasica;
    }

    public String getRefWseEstatus() {
        return refWseEstatus;
    }

    public void setRefWseEstatus(String refWseEstatus) {
        this.refWseEstatus = refWseEstatus;
    }

    public String getRefWseTc() {
        return refWseTc;
    }

    public void setRefWseTc(String refWseTc) {
        this.refWseTc = refWseTc;
    }

    public String getRefWseDesTc() {
        return refWseDesTc;
    }

    public void setRefWseDesTc(String refWseDesTc) {
        this.refWseDesTc = refWseDesTc;
    }

    public String getRefWseTipoEmpleado() {
        return refWseTipoEmpleado;
    }

    public void setRefWseTipoEmpleado(String refWseTipoEmpleado) {
        this.refWseTipoEmpleado = refWseTipoEmpleado;
    }

    public String getRefWseDelegacion() {
        return refWseDelegacion;
    }

    public void setRefWseDelegacion(String refWseDelegacion) {
        this.refWseDelegacion = refWseDelegacion;
    }

    public String getRefWseDesDelegacion() {
        return refWseDesDelegacion;
    }

    public void setRefWseDesDelegacion(String refWseDesDelegacion) {
        this.refWseDesDelegacion = refWseDesDelegacion;
    }

    public String getRefWseLocalidad() {
        return refWseLocalidad;
    }

    public void setRefWseLocalidad(String refWseLocalidad) {
        this.refWseLocalidad = refWseLocalidad;
    }

    public String getRefWseDesLocalidad() {
        return refWseDesLocalidad;
    }

    public void setRefWseDesLocalidad(String refWseDesLocalidad) {
        this.refWseDesLocalidad = refWseDesLocalidad;
    }

    public String getRefWseQuincenaMes() {
        return refWseQuincenaMes;
    }

    public void setRefWseQuincenaMes(String refWseQuincenaMes) {
        this.refWseQuincenaMes = refWseQuincenaMes;
    }

    public String getRefWseFechaJubPen() {
        return refWseFechaJubPen;
    }

    public void setRefWseFechaJubPen(String refWseFechaJubPen) {
        this.refWseFechaJubPen = refWseFechaJubPen;
    }

    public String getRefWseTipoJubilacion() {
        return refWseTipoJubilacion;
    }

    public void setRefWseTipoJubilacion(String refWseTipoJubilacion) {
        this.refWseTipoJubilacion = refWseTipoJubilacion;
    }

    public String getRefWsePorcentajePension() {
        return refWsePorcentajePension;
    }

    public void setRefWsePorcentajePension(String refWsePorcentajePension) {
        this.refWsePorcentajePension = refWsePorcentajePension;
    }

    public String getRefWseFechaIngreso() {
        return refWseFechaIngreso;
    }

    public void setRefWseFechaIngreso(String refWseFechaIngreso) {
        this.refWseFechaIngreso = refWseFechaIngreso;
    }

    public String getRefWseFechaBaja() {
        return refWseFechaBaja;
    }

    public void setRefWseFechaBaja(String refWseFechaBaja) {
        this.refWseFechaBaja = refWseFechaBaja;
    }

    public String getRefWseAntAnios() {
        return refWseAntAnios;
    }

    public void setRefWseAntAnios(String refWseAntAnios) {
        this.refWseAntAnios = refWseAntAnios;
    }

    public String getRefWseAntQnas() {
        return refWseAntQnas;
    }

    public void setRefWseAntQnas(String refWseAntQnas) {
        this.refWseAntQnas = refWseAntQnas;
    }

    public String getRefWseAntDias() {
        return refWseAntDias;
    }

    public void setRefWseAntDias(String refWseAntDias) {
        this.refWseAntDias = refWseAntDias;
    }

    public String getRefWseClaveBaja() {
        return refWseClaveBaja;
    }

    public void setRefWseClaveBaja(String refWseClaveBaja) {
        this.refWseClaveBaja = refWseClaveBaja;
    }

    public String getRefWseDesBaja() {
        return refWseDesBaja;
    }

    public void setRefWseDesBaja(String refWseDesBaja) {
        this.refWseDesBaja = refWseDesBaja;
    }

    public String getRefWseFechaModificacion() {
        return refWseFechaModificacion;
    }

    public void setRefWseFechaModificacion(String refWseFechaModificacion) {
        this.refWseFechaModificacion = refWseFechaModificacion;
    }

    public String getRefWseFmodorden() {
        return refWseFmodorden;
    }

    public void setRefWseFmodorden(String refWseFmodorden) {
        this.refWseFmodorden = refWseFmodorden;
    }

    public String getRefSdaIdSexo() {
        return refSdaIdSexo;
    }

    public void setRefSdaIdSexo(String refSdaIdSexo) {
        this.refSdaIdSexo = refSdaIdSexo;
    }

    public String getRefSdaMesNacimiento() {
        return refSdaMesNacimiento;
    }

    public void setRefSdaMesNacimiento(String refSdaMesNacimiento) {
        this.refSdaMesNacimiento = refSdaMesNacimiento;
    }

    public String getRefSdaCveEntidadNacimiento() {
        return refSdaCveEntidadNacimiento;
    }

    public void setRefSdaCveEntidadNacimiento(String refSdaCveEntidadNacimiento) {
        this.refSdaCveEntidadNacimiento = refSdaCveEntidadNacimiento;
    }

    public String getRefSdaDscSexo() {
        return refSdaDscSexo;
    }

    public void setRefSdaDscSexo(String refSdaDscSexo) {
        this.refSdaDscSexo = refSdaDscSexo;
    }

    public String getRefSdaDscNacimiento() {
        return refSdaDscNacimiento;
    }

    public void setRefSdaDscNacimiento(String refSdaDscNacimiento) {
        this.refSdaDscNacimiento = refSdaDscNacimiento;
    }

    public String getRefSdaDscEntidadNacimiento() {
        return refSdaDscEntidadNacimiento;
    }

    public void setRefSdaDscEntidadNacimiento(String refSdaDscEntidadNacimiento) {
        this.refSdaDscEntidadNacimiento = refSdaDscEntidadNacimiento;
    }

    public String getRefSdaCveTipoPension() {
        return refSdaCveTipoPension;
    }

    public void setRefSdaCveTipoPension(String refSdaCveTipoPension) {
        this.refSdaCveTipoPension = refSdaCveTipoPension;
    }

    public String getRefWspCveDelegacion() {
        return refWspCveDelegacion;
    }

    public void setRefWspCveDelegacion(String refWspCveDelegacion) {
        this.refWspCveDelegacion = refWspCveDelegacion;
    }

    public String getRefWspCveSubDelegacion() {
        return refWspCveSubDelegacion;
    }

    public void setRefWspCveSubDelegacion(String refWspCveSubDelegacion) {
        this.refWspCveSubDelegacion = refWspCveSubDelegacion;
    }

    public String getRefWspDesDelegacion() {
        return refWspDesDelegacion;
    }

    public void setRefWspDesDelegacion(String refWspDesDelegacion) {
        this.refWspDesDelegacion = refWspDesDelegacion;
    }

    public String getRefWspDesSubDelegacion() {
        return refWspDesSubDelegacion;
    }

    public void setRefWspDesSubDelegacion(String refWspDesSubDelegacion) {
        this.refWspDesSubDelegacion = refWspDesSubDelegacion;
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