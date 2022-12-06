package mx.gob.imss.cit.mjlssc.model.response;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.cit.nmlssc.support.model.BaseModel;

@Getter
@Setter
public class HomeDemandaResponseDto extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7636634098492637736L;

	private Integer cveAsunto;
	private String idExpediente;
	private Integer cveEstadoProcesal;
	private String nomEstadoProcesal;
	private Integer cveEstadoProcesalSiguiente;
	private String nomEstadoProcesalSiguiente;
	private Integer cveJuzgado;
	private Integer numJuicioAmparo;
	private Integer indIncidInsumArbitrajeProcedeInt;
	private Integer numAnio;
	private Integer numFolio;
	private Boolean terceroInteresado;

}