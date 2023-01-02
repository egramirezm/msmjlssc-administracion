package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SSCC_DELEGACION", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccDelegacion implements Serializable {
	private static final long serialVersionUID = -4038651447035555974L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_DELEGACION", nullable = false)
	private Integer id;

	@Size(max = 30)
	@Column(name = "DES_DELEGACION", length = 30)
	private String desDelegacion;

	@Size(max = 3)
	@Column(name = "REF_ABREVIACION", length = 3)
	private String refAbreviacion;

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

	public String getDesDelegacion() {
		return desDelegacion;
	}

	public void setDesDelegacion(String desDelegacion) {
		this.desDelegacion = desDelegacion;
	}

	public String getRefAbreviacion() {
		return refAbreviacion;
	}

	public void setRefAbreviacion(String refAbreviacion) {
		this.refAbreviacion = refAbreviacion;
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