package mx.gob.imss.cit.mjlssc.model.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase Response para la respuesta de los Controllers
 * 
 * @author prisciliano.cayetano
 *
 * @param <T> parametro de tipo generico
 */
@Setter
@Getter
public class ResponseDataDTO <T> implements Serializable {


	/**
	 * Serializacion de clase
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Variable code
	 */
    private String code;
    
    /**
	 * Variable message
	 */
    private String message;
    
    /**
	 * Clase generica
	 */
	private transient T data;
	
	/**
	 * Constructor publico de Clase ResponseData
	 * 
	 */
	public ResponseDataDTO() {
		super();
	}
	
	/**
	 * Constructor de la clase ResponseData
	 * @param code codigo de la respuesta
	 * @param message mensaje de la respuesta
	 * @param response response de la respuesta
	 */
	public ResponseDataDTO(String code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	
}
