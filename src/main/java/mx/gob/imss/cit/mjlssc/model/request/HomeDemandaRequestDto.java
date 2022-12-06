package mx.gob.imss.cit.mjlssc.model.request;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.nmlssc.support.model.IdentityBaseModel;

@Getter
@Setter
public class HomeDemandaRequestDto extends IdentityBaseModel<Long> implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -854797975920272969L;
	
	private Integer cveDelegacion;
	private String idExpediente;
	private Integer cveCentroConciliacion;
	private Integer cveTribunalLaboral;
	private List<Integer> cveEstadoProcesalSiguiente;
	private String nombreActor;
	private Integer cveUsuario;
	private Integer tipoReporte;
	private Integer cveTipoAsunto;
	private Long cveUsuarioAbogadoResponsable;
	private Integer cveFlujoAmparoIndirecto;
	private String rolUsr;
	private Integer numFolio;
	private Integer numAnio;
	private String esquemaNml;
    private Integer cveJuzgadoDistrito;

}