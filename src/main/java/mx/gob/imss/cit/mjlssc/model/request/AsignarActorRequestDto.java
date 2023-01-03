package mx.gob.imss.cit.mjlssc.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.model.entity.MjltAsuntoActorDto;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link MjltAsuntoActor} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignarActorRequestDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4588858515387702055L;
	
	
    @NotNull
    private List<MjltAsuntoActorDto> actores;
   
}