package mx.gob.imss.cit.mjlssc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FechaUtils {

	public static String convertirFechaCadena(Date fecha, String formato) {
		String salida = "";
		if (fecha == null || StringUtils.isEmpty(formato)) {
			salida = "";
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			salida = sdf.format(fecha);
		}
		return salida;
	}

	public static Calendar convertirCalendarCadena(String fecha, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Date date = null;
		try {
			date = sdf.parse(fecha);
		} catch (ParseException e) {
			log.error("convertirCalendarCadena ", e);
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

}
