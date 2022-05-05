package validaciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;
import java.util.*;

public class Validaciones {

  public static boolean obtenerFechaFormateada(String fecha) {
	  if (fecha == null || !fecha.matches("\\d{4}-[01]\\d-[0-3]\\d"))
	        return false;
	    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	    df.setLenient(false);
	    try {
	        df.parse(fecha);
	        return true;
	    } catch (ParseException ex) {
	        return false;
	    }
  }
  
  public static boolean validarCorreoElectronico(String pCorreo) {
	// Patrón para validar el email
      Pattern pattern = Pattern
              .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                      + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

      // El email a validar
      Matcher mather = pattern.matcher(pCorreo);

      if (mather.find() == true) {
        return true;
      } else {
        return false;
      }
  }
}
