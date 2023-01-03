package mx.gob.imss.cit.mjlssc.component;

import org.springframework.stereotype.Component;

@Component
public class DataBaseShemaConf {

	/**
	 * Nota esta varibale debe cambiar segun en ambiente donde se realiza el
	 * despliegue QA, UAT ,ETC
	 */
	public static final String SCHEMANML = "nmldb";

//	@Value("${nml.schema}")
//	private String esquemaNml;

}
