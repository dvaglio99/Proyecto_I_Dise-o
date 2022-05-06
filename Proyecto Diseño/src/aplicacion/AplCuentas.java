package aplicacion;

import logicadenegocios.Persona;
import logicadenegocios.Cuenta; 
import logicadenegocios.Cliente;
import validaciones.Validaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.FormatterClosedException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.io.IOException;

public class AplCuentas {
  
  static BufferedReader in;
  static int indice = 0;
  private static ArrayList<Cliente> clientes;
  private static ArrayList<Cuenta> cuentas;
  /**
   * Metodo Main
 * @throws IOException 
 * @throws NumberFormatException 
   */
  public static void main(String[] args) throws NumberFormatException, IOException {
	clientes = new ArrayList<Cliente>();
	cuentas  = new ArrayList<Cuenta>();
	
    in=new BufferedReader(new InputStreamReader(System.in));
    
    boolean noSalir = true;
    int opcion;
    
    do {
        
      mostrarMenu();
      opcion = leerOpcion();
      noSalir = ejecutarAccion(opcion); 
      
    } while (noSalir);
    
  }

  /**
   * Metodo mostrarMenu() muestra las diferentes opciones que ofrece el sistema
   */
  static void mostrarMenu() {
      
    System.out.println("1. Registrar un Cliente");
    System.out.println("2. Consultar Clientes");
    /**
    System.out.println("3. Consultar Senderistas Mayores a n Edad ");
    System.out.println("4. Registrar un lugar");
    System.out.println("5. Registrar una ruta a un lugar");
    System.out.println("6. Asignar la direccion a un lugar");
    System.out.println("7. Consultar lugares por provincia");
    System.out.println("8. Consultar lugares por Tipo de Lugar");
    System.out.println("9. Consultar rutas de un lugar");
    System.out.println("10. Consultar Distancia Total En Rutas De Un Lugar");
    System.out.println("11. Registrar una Caminata");
    System.out.println("12. Asignar un Senderista a una Caminata");
    System.out.println("13. Consultar Participantes de una Caminata en una Fecha Especifica");
    System.out.println("14. Consultar caminatas realizadas por rango de Fechas");
    System.out.println("15. Cosultar caminatas con duracion mayor a n horas"); */
    System.out.println("16. Salir");
    
  }
  
  /**
   * Metodo leerOpcion() lee la opcion que es insertada por teclado
   * @return el numero con la opcion elegida
 * @throws IOException 
 * @throws NumberFormatException 
   */
  static int leerOpcion() throws NumberFormatException, IOException {
    int opcion;
    System.out.print("Seleccione una Opcion: ");
    opcion = Integer.parseInt(in.readLine());
    System.out.println();
    
    return opcion;
    
  }
  
  /**
   * Metodo ejecutarAccion() realiza la opcion elegida por el usuario
   * @param opcion la opcion que es leida segun el numero que indique el usuario
 * @throws IOException 
   */
  static boolean ejecutarAccion(int opcion) throws IOException  {
      
    boolean noSalir = true;
    int opc = 0;
    
    switch (opcion) {
      
      case 1: registrarCliente();
        break;
        /**case 2:  consultarClientes();
        break;
      case 3: consultarSenderistasMayoresDeNEdad();
        break;
      case 4: registrarLugar();
        break;
      case 5: registrarRutaALugar();
        break;
      case 6: asignarDireccionAUnLugar();
        break;
      case 7: consultarLugaresPorProvincia();
        break;
      case 8: consultarLugaresPorTipoLugar();
        break;
      case 9: consultarRutasDeUnLugar();
        break;
      case 10: consultarDistanciaTotalEnRutasDeUnLugar();
        break;
      case 11: registrarCaminata();
        break;
      case 12: asignarSenderistaACaminata();
        break;
      case 13: consultarParticipantesEnCaminataConFecha();
        break;
      case 14: consultarCaminatasEnRangoFechas();
        break;
      case 15: consultarCaminatasConDuracionMayorAXHoras();
        break; */
      case 16: noSalir = false;
        break;
    }
    
    System.out.println();
    return noSalir;
    
  }
	
  static void registrarCliente() throws IOException {
    String primerApellido = "";
	String segundoApellido = "";
    String nombre = "";
    String identificacion = "";
	String fechaNacimiento = "";
	double numeroTelefonico;
	String correoElectronico = null;
	String codigoCliente;
	    
	System.out.print("\nIngrese el primer apellido del cliente: ");
	primerApellido = in.readLine();
	System.out.print("\nIngrese el segundo apellido del cliente: ");
	segundoApellido = in.readLine();
	System.out.print("Ingrese el nombre del cliente: ");
	nombre = in.readLine();
	System.out.print("\nIngrese la identificacion del cliente: ");
    identificacion = in.readLine();
    System.out.print("\nIngrese la fecha de nacimiento del cliente (formato DD/MM/AAAA): ");
    fechaNacimiento = in.readLine();
    if (Validaciones.obtenerFechaFormateada(fechaNacimiento) != true) {
  	  System.out.println("Formato de fecha incorrecta. Intente de nuevo.");
    }
    System.out.print("\nIngrese el numero telefonico del cliente: ");
    numeroTelefonico = Double.parseDouble(in.readLine());
    System.out.print("\nIngrese el correo electronico del cliente: ");
    correoElectronico = in.readLine();
    if (Validaciones.validarCorreoElectronico(correoElectronico) != true) {
  	  System.out.println("Formato de correo incorrecto. Intente de nuevo.");
    }
    codigoCliente = "CIF-"+(indice+1);
    
    Cliente cliente = new Cliente(primerApellido, segundoApellido, nombre, identificacion, fechaNacimiento, 
		  numeroTelefonico, correoElectronico, codigoCliente);
    clientes.add(cliente);

    System.out.println("Se ha creado un nuevo cliente en el sistema, los datos que fueron almacenados son: "
    		+"\n Codigo: "+ codigoCliente + "\n Nombre: "+ primerApellido+ " " + segundoApellido + " " +
    		nombre + "\n Identificacion:" + identificacion + "\n Fecha Nacimiento: "+ 
    		fechaNacimiento + "\n Numero Telefonico: " +numeroTelefonico +
    		"\n Correo Electronico: " + correoElectronico);
  }
  
/**  static void consultarClientes() throws IOException {
	    
	    for (Cliente buscar: clientes) {
	      System.out.println(buscar);
	    }

	  }
*/
}
