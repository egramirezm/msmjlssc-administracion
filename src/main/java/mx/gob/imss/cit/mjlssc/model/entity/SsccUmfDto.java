
package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccUmf} entity
 */
@Data
public class SsccUmfDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8474062930320167040L;
	private  Integer id;
    @Size(max = 200)
    private  String desUmf;
    @Size(max = 20)
    private  String refClues;
    @Size(max = 13)
    private  String refRegion;
    @Size(max = 15)
    private  String refClavePersonal;
    @Size(max = 11)
    private  String refUnidadDeInformacionPrei;
    @Size(max = 11)
    private  String refClaveUbicacionAdmin;
    @Size(max = 13)
    private  String refClavePresupuestal;
    @Size(max = 2)
    private  String refClaveDelegacionOUmae;
    @Size(max = 29)
    private  String refNombreDelegacionOUmae;
    @Size(max = 19)
    private  String refRelacionDelegacionUmae;
    @Size(max = 4)
    private  String refUnidadPresupuestal;
    @Size(max = 13)
    private  String refNivelDeAtencion;
    @Size(max = 2)
    private  String refTipoDeServicio;
    @Size(max = 8)
    private  String refDescripcionTipoServicio;
    @Size(max = 3)
    private  String refNumeroDeUnidad;
    @Size(max = 49)
    private  String refNombreUnidad;
    @Size(max = 26)
    private  String refUbicacionODenominacion;
    @Size(max = 25)
    private  String refTipoDeVialidad;
    @Size(max = 92)
    private  String refNombreDeVialidad;
    @Size(max = 12)
    private  String refNumeroExterior;
    @Size(max = 21)
    private  String refTipoDeAsentamiento;
    @Size(max = 47)
    private  String refNombreDelAsentamiento;
    @Size(max = 5)
    private  String refCodigoPostal;
    @Size(max = 3)
    private  String refClaveMunicipioDelegacion;
    @Size(max = 49)
    private  String refMunicipioDelegacion;
    @Size(max = 4)
    private  String refClaveLocalidad;
    @Size(max = 45)
    private  String refLocalidad;
    @Size(max = 2)
    private  String refClaveEntidadFederativa;
    @Size(max = 32)
    private  String refEntidadFederativa;
    @Size(max = 2)
    private  String refClaveJurisdiccionSanitar;
    @Size(max = 27)
    private  String refJurisdiccionSanitaria;
    @Size(max = 13)
    private  String refLatitud;
    @Size(max = 14)
    private  String refLongitud;
    @Size(max = 26)
    private  String refInicioDeProductividad;
    @NotNull
    private  Date fecAlta;
    private  Date fecBaja;
    private  Date fecModifica;
    @Size(max = 60)
    @NotNull
    private  String cveUsuarioAlta;
    @Size(max = 60)
    private  String cveUsuarioBaja;
    @Size(max = 60)
    private  String cveUsuarioModifica;
}