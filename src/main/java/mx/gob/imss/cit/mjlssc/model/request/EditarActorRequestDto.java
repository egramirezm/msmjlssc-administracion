package mx.gob.imss.cit.mjlssc.model.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.model.entity.MjltAsuntoDto;
import mx.gob.imss.cit.mjlssc.model.entity.SsccSexoDto;
import mx.gob.imss.cit.mjlssc.model.entity.SsccUmfDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;

	/**
	 * A DTO for the {@link MjltAsuntoActor} entity
	 */
	@Data
	public class EditarActorRequestDto implements Serializable {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 4588858515387702055L;
	    
		private Integer id;
		private MjltAsuntoDto cveAsunto;
	    private String refNombre;
	    private String refPaterno;
	    private String refMaterno;
	    private String refCurp;
	    private String refRfc;
	    private SsccSexoDto cveSexo;
	    private SsccUmfDto cveUmf;
	    private Integer cveUsuarioModifica;
	    
   
}