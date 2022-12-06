/**
 * 
 */
package mx.gob.imss.cit.mjlssc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.service.DelegacionService;

/***
 * 
 * @author
 *
 */
@Log4j2
@RestController
@RequestMapping("/prueba")
public class TestController {

	@Autowired
	private DelegacionService delegacionService;

	@GetMapping("/hola")
	public ResponseEntity<?> prueba() {
		log.info("Inicio prueba Modulo Juicio Laboral");
		return delegacionService.getDelegaciones();
	}

}
