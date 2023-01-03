package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SSCC_UMF", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccUmf implements Serializable {
	private static final long serialVersionUID = 4166019549960337149L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_UMF", nullable = false)
	private Integer id;

	@Size(max = 200)
	@Column(name = "DES_UMF", length = 200)
	private String desUmf;

	@Size(max = 20)
	@Column(name = "REF_CLUES", length = 20)
	private String refClues;

	@Size(max = 13)
	@Column(name = "REF_REGION", length = 13)
	private String refRegion;

	@Size(max = 15)
	@Column(name = "REF_CLAVE_PERSONAL", length = 15)
	private String refClavePersonal;

	@Size(max = 11)
	@Column(name = "REF_UNIDAD_DE_INFORMACION_PREI", length = 11)
	private String refUnidadDeInformacionPrei;

	@Size(max = 11)
	@Column(name = "REF_CLAVE_UBICACION_ADMIN", length = 11)
	private String refClaveUbicacionAdmin;

	@Size(max = 13)
	@Column(name = "REF_CLAVE_PRESUPUESTAL", length = 13)
	private String refClavePresupuestal;

	@Size(max = 2)
	@Column(name = "REF_CLAVE_DELEGACION_O_UMAE", length = 2)
	private String refClaveDelegacionOUmae;

	@Size(max = 29)
	@Column(name = "REF_NOMBRE_DELEGACION_O_UMAE", length = 29)
	private String refNombreDelegacionOUmae;

	@Size(max = 19)
	@Column(name = "REF_RELACION_DELEGACION_UMAE", length = 19)
	private String refRelacionDelegacionUmae;

	@Size(max = 4)
	@Column(name = "REF_UNIDAD_PRESUPUESTAL", length = 4)
	private String refUnidadPresupuestal;

	@Size(max = 13)
	@Column(name = "REF_NIVEL_DE_ATENCION", length = 13)
	private String refNivelDeAtencion;

	@Size(max = 2)
	@Column(name = "REF_TIPO_DE_SERVICIO", length = 2)
	private String refTipoDeServicio;

	@Size(max = 8)
	@Column(name = "REF_DESCRIPCION_TIPO_SERVICIO", length = 8)
	private String refDescripcionTipoServicio;

	@Size(max = 3)
	@Column(name = "REF_NUMERO_DE_UNIDAD", length = 3)
	private String refNumeroDeUnidad;

	@Size(max = 49)
	@Column(name = "REF_NOMBRE_UNIDAD", length = 49)
	private String refNombreUnidad;

	@Size(max = 26)
	@Column(name = "REF_UBICACION_O_DENOMINACION", length = 26)
	private String refUbicacionODenominacion;

	@Size(max = 25)
	@Column(name = "REF_TIPO_DE_VIALIDAD", length = 25)
	private String refTipoDeVialidad;

	@Size(max = 92)
	@Column(name = "REF_NOMBRE_DE_VIALIDAD", length = 92)
	private String refNombreDeVialidad;

	@Size(max = 12)
	@Column(name = "REF_NUMERO_EXTERIOR", length = 12)
	private String refNumeroExterior;

	@Size(max = 21)
	@Column(name = "REF_TIPO_DE_ASENTAMIENTO", length = 21)
	private String refTipoDeAsentamiento;

	@Size(max = 47)
	@Column(name = "REF_NOMBRE_DEL_ASENTAMIENTO", length = 47)
	private String refNombreDelAsentamiento;

	@Size(max = 5)
	@Column(name = "REF_CODIGO_POSTAL", length = 5)
	private String refCodigoPostal;

	@Size(max = 3)
	@Column(name = "REF_CLAVE_MUNICIPIO_DELEGACION", length = 3)
	private String refClaveMunicipioDelegacion;

	@Size(max = 49)
	@Column(name = "REF_MUNICIPIO_DELEGACION", length = 49)
	private String refMunicipioDelegacion;

	@Size(max = 4)
	@Column(name = "REF_CLAVE_LOCALIDAD", length = 4)
	private String refClaveLocalidad;

	@Size(max = 45)
	@Column(name = "REF_LOCALIDAD", length = 45)
	private String refLocalidad;

	@Size(max = 2)
	@Column(name = "REF_CLAVE_ENTIDAD_FEDERATIVA", length = 2)
	private String refClaveEntidadFederativa;

	@Size(max = 32)
	@Column(name = "REF_ENTIDAD_FEDERATIVA", length = 32)
	private String refEntidadFederativa;

	@Size(max = 2)
	@Column(name = "REF_CLAVE_JURISDICCION_SANITAR", length = 2)
	private String refClaveJurisdiccionSanitar;

	@Size(max = 27)
	@Column(name = "REF_JURISDICCION_SANITARIA", length = 27)
	private String refJurisdiccionSanitaria;

	@Size(max = 13)
	@Column(name = "REF_LATITUD", length = 13)
	private String refLatitud;

	@Size(max = 14)
	@Column(name = "REF_LONGITUD", length = 14)
	private String refLongitud;

	@Size(max = 26)
	@Column(name = "REF_INICIO_DE_PRODUCTIVIDAD", length = 26)
	private String refInicioDeProductividad;

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

	public String getDesUmf() {
		return desUmf;
	}

	public void setDesUmf(String desUmf) {
		this.desUmf = desUmf;
	}

	public String getRefClues() {
		return refClues;
	}

	public void setRefClues(String refClues) {
		this.refClues = refClues;
	}

	public String getRefRegion() {
		return refRegion;
	}

	public void setRefRegion(String refRegion) {
		this.refRegion = refRegion;
	}

	public String getRefClavePersonal() {
		return refClavePersonal;
	}

	public void setRefClavePersonal(String refClavePersonal) {
		this.refClavePersonal = refClavePersonal;
	}

	public String getRefUnidadDeInformacionPrei() {
		return refUnidadDeInformacionPrei;
	}

	public void setRefUnidadDeInformacionPrei(String refUnidadDeInformacionPrei) {
		this.refUnidadDeInformacionPrei = refUnidadDeInformacionPrei;
	}

	public String getRefClaveUbicacionAdmin() {
		return refClaveUbicacionAdmin;
	}

	public void setRefClaveUbicacionAdmin(String refClaveUbicacionAdmin) {
		this.refClaveUbicacionAdmin = refClaveUbicacionAdmin;
	}

	public String getRefClavePresupuestal() {
		return refClavePresupuestal;
	}

	public void setRefClavePresupuestal(String refClavePresupuestal) {
		this.refClavePresupuestal = refClavePresupuestal;
	}

	public String getRefClaveDelegacionOUmae() {
		return refClaveDelegacionOUmae;
	}

	public void setRefClaveDelegacionOUmae(String refClaveDelegacionOUmae) {
		this.refClaveDelegacionOUmae = refClaveDelegacionOUmae;
	}

	public String getRefNombreDelegacionOUmae() {
		return refNombreDelegacionOUmae;
	}

	public void setRefNombreDelegacionOUmae(String refNombreDelegacionOUmae) {
		this.refNombreDelegacionOUmae = refNombreDelegacionOUmae;
	}

	public String getRefRelacionDelegacionUmae() {
		return refRelacionDelegacionUmae;
	}

	public void setRefRelacionDelegacionUmae(String refRelacionDelegacionUmae) {
		this.refRelacionDelegacionUmae = refRelacionDelegacionUmae;
	}

	public String getRefUnidadPresupuestal() {
		return refUnidadPresupuestal;
	}

	public void setRefUnidadPresupuestal(String refUnidadPresupuestal) {
		this.refUnidadPresupuestal = refUnidadPresupuestal;
	}

	public String getRefNivelDeAtencion() {
		return refNivelDeAtencion;
	}

	public void setRefNivelDeAtencion(String refNivelDeAtencion) {
		this.refNivelDeAtencion = refNivelDeAtencion;
	}

	public String getRefTipoDeServicio() {
		return refTipoDeServicio;
	}

	public void setRefTipoDeServicio(String refTipoDeServicio) {
		this.refTipoDeServicio = refTipoDeServicio;
	}

	public String getRefDescripcionTipoServicio() {
		return refDescripcionTipoServicio;
	}

	public void setRefDescripcionTipoServicio(String refDescripcionTipoServicio) {
		this.refDescripcionTipoServicio = refDescripcionTipoServicio;
	}

	public String getRefNumeroDeUnidad() {
		return refNumeroDeUnidad;
	}

	public void setRefNumeroDeUnidad(String refNumeroDeUnidad) {
		this.refNumeroDeUnidad = refNumeroDeUnidad;
	}

	public String getRefNombreUnidad() {
		return refNombreUnidad;
	}

	public void setRefNombreUnidad(String refNombreUnidad) {
		this.refNombreUnidad = refNombreUnidad;
	}

	public String getRefUbicacionODenominacion() {
		return refUbicacionODenominacion;
	}

	public void setRefUbicacionODenominacion(String refUbicacionODenominacion) {
		this.refUbicacionODenominacion = refUbicacionODenominacion;
	}

	public String getRefTipoDeVialidad() {
		return refTipoDeVialidad;
	}

	public void setRefTipoDeVialidad(String refTipoDeVialidad) {
		this.refTipoDeVialidad = refTipoDeVialidad;
	}

	public String getRefNombreDeVialidad() {
		return refNombreDeVialidad;
	}

	public void setRefNombreDeVialidad(String refNombreDeVialidad) {
		this.refNombreDeVialidad = refNombreDeVialidad;
	}

	public String getRefNumeroExterior() {
		return refNumeroExterior;
	}

	public void setRefNumeroExterior(String refNumeroExterior) {
		this.refNumeroExterior = refNumeroExterior;
	}

	public String getRefTipoDeAsentamiento() {
		return refTipoDeAsentamiento;
	}

	public void setRefTipoDeAsentamiento(String refTipoDeAsentamiento) {
		this.refTipoDeAsentamiento = refTipoDeAsentamiento;
	}

	public String getRefNombreDelAsentamiento() {
		return refNombreDelAsentamiento;
	}

	public void setRefNombreDelAsentamiento(String refNombreDelAsentamiento) {
		this.refNombreDelAsentamiento = refNombreDelAsentamiento;
	}

	public String getRefCodigoPostal() {
		return refCodigoPostal;
	}

	public void setRefCodigoPostal(String refCodigoPostal) {
		this.refCodigoPostal = refCodigoPostal;
	}

	public String getRefClaveMunicipioDelegacion() {
		return refClaveMunicipioDelegacion;
	}

	public void setRefClaveMunicipioDelegacion(String refClaveMunicipioDelegacion) {
		this.refClaveMunicipioDelegacion = refClaveMunicipioDelegacion;
	}

	public String getRefMunicipioDelegacion() {
		return refMunicipioDelegacion;
	}

	public void setRefMunicipioDelegacion(String refMunicipioDelegacion) {
		this.refMunicipioDelegacion = refMunicipioDelegacion;
	}

	public String getRefClaveLocalidad() {
		return refClaveLocalidad;
	}

	public void setRefClaveLocalidad(String refClaveLocalidad) {
		this.refClaveLocalidad = refClaveLocalidad;
	}

	public String getRefLocalidad() {
		return refLocalidad;
	}

	public void setRefLocalidad(String refLocalidad) {
		this.refLocalidad = refLocalidad;
	}

	public String getRefClaveEntidadFederativa() {
		return refClaveEntidadFederativa;
	}

	public void setRefClaveEntidadFederativa(String refClaveEntidadFederativa) {
		this.refClaveEntidadFederativa = refClaveEntidadFederativa;
	}

	public String getRefEntidadFederativa() {
		return refEntidadFederativa;
	}

	public void setRefEntidadFederativa(String refEntidadFederativa) {
		this.refEntidadFederativa = refEntidadFederativa;
	}

	public String getRefClaveJurisdiccionSanitar() {
		return refClaveJurisdiccionSanitar;
	}

	public void setRefClaveJurisdiccionSanitar(String refClaveJurisdiccionSanitar) {
		this.refClaveJurisdiccionSanitar = refClaveJurisdiccionSanitar;
	}

	public String getRefJurisdiccionSanitaria() {
		return refJurisdiccionSanitaria;
	}

	public void setRefJurisdiccionSanitaria(String refJurisdiccionSanitaria) {
		this.refJurisdiccionSanitaria = refJurisdiccionSanitaria;
	}

	public String getRefLatitud() {
		return refLatitud;
	}

	public void setRefLatitud(String refLatitud) {
		this.refLatitud = refLatitud;
	}

	public String getRefLongitud() {
		return refLongitud;
	}

	public void setRefLongitud(String refLongitud) {
		this.refLongitud = refLongitud;
	}

	public String getRefInicioDeProductividad() {
		return refInicioDeProductividad;
	}

	public void setRefInicioDeProductividad(String refInicioDeProductividad) {
		this.refInicioDeProductividad = refInicioDeProductividad;
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