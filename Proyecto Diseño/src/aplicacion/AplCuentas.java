package aplicacion;

import logicadenegocios.Persona;
import logicadenegocios.Cuenta; 
import logicadenegocios.Cliente;
import validaciones.Validaciones;
import dao.ClienteDAO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.StyledEditorKit.ForegroundAction;


import java.io.IOException;

public class AplCuentas {
  public static ClienteDAO clienteDao;
  static BufferedReader in;
  static int indice = 0;
  private static List<Cliente> clientes = new ArrayList<Cliente>();
  //private static Cliente clientes[];
  private static ArrayList<Cuenta> misCuentas = new ArrayList<Cuenta>();
  /**
   * Metodo Main
 * @throws IOException 
 * @throws NumberFormatException 
   */
  public static void main(String[] args) throws NumberFormatException, IOException {
	//clientes = new ArrayList<Cliente>();
	//misCuentas  = new ArrayList<Cuenta>();
	
    in=new BufferedReader(new InputStreamReader(System.in));
    
    boolean noSalir = true;
    int opcion;
    String PIN = "#D4nie";
    System.out.print(Validaciones.validarPIN(PIN));
    String date = "25-05-1997";
    System.out.println(Validaciones.obtenerFechaFormateada(date));
    final String PHONE_REGEX = "^[5-9]\\d{3}-?\\d{4}$";
	  final Pattern pattern = Pattern.compile(PHONE_REGEX);
	  String phone = "6342-0702";      
	  phone=phone.replaceAll("[\\-\\+]", "");
	  System.out.println(phone);
	  final Matcher matcher = pattern.matcher(phone);
	  System.out.println(matcher.matches());
	  String correo = "vaglio99gmail.com";
	  System.out.println(Validaciones.validarFormatoCorreoElectronico(correo));
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
    System.out.println("2. Registrar una Cuenta a un Cliente");
    System.out.println("3. Consultar Clientes ordenados ");
    /**System.out.println("4. Registrar un lugar");
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
        case 2:  registrarCuenta();
        break;
      case 3: consultarClientesOrdenados();
        break;
     /** case 4: registrarLugar();
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
	
}
/*	 String primerApellido;
	 String segundoApellido;
	 String nombre;
	 String identificacion;
	 String fechaNacimiento;
	 String numeroTelefonico;
	 String correoElectronico;
	 
	 System.out.print("\nIngrese el primer apellido del cliente: ");
		primerApellido = in.readLine();
		System.out.print("\nIngrese el segundo apellido del cliente: ");
		segundoApellido = in.readLine();
		System.out.print("Ingrese el nombre del cliente: ");
		nombre = in.readLine();
		System.out.print("\nIngrese la identificacion del cliente: ");
	    identificacion = in.readLine();
	    System.out.print("\nIngrese la fecha de nacimiento del cliente (formato dd-MM-AAAA): ");
	    fechaNacimiento = in.readLine();
	    System.out.print("\nIngrese el numero telefonico del cliente (formato ####-####): ");
	    numeroTelefonico = in.readLine();
	    System.out.print("\nIngrese el correo electronico del cliente: ");
	    correoElectronico = in.readLine();
	    if (Validaciones.validarFormatoCorreoElectronico(correoElectronico) == true && 
	    		Validaciones.obtenerFechaFormateada(fechaNacimiento) == true &&
	    		Validaciones.validarFormatoNumeroTelefonico(numeroTelefonico)) {
	    	String resultado = clienteDao.registrarCliente(primerApellido, segundoApellido, nombre, identificacion, fechaNacimiento, numeroTelefonico, correoElectronico);
	    	if (resultado != null) {
	    	System.out.println("Se ha creado un nuevo cliente en el sistema, los datos que fueron almacenados son: "
		      		+ "\n Nombre: "+ primerApellido+ " " + segundoApellido + " " +
		      		nombre + "\n Identificacion:" + identificacion + "\n Fecha Nacimiento: "+ 
		      		fechaNacimiento + "\n Numero Telefonico: " +numeroTelefonico +
		      		"\n Correo Electronico: " + correoElectronico);
	    } else {
	          System.out.print("Registro exitoso");
	        }
	    }
	    
 } */
  
  static void registrarCuenta() throws IOException {
	  DecimalFormat formatoDecimal = new DecimalFormat("#.00");
	    double saldo = 0;
	    String estadoDeLaCuenta = "Activa";
	    String fechaCreacion = null;
	    int numeroCuenta = 0;
	    String PIN = null;

	    System.out.print("\nIngrese la identificación del cliente al cual quiere asignar la cuenta: ");
	    String identificacionCuenta = in.readLine();
	    for (Cliente buscarCliente: clientes) {

	      if (buscarCliente.getIdentificacion().equals(identificacionCuenta)) {

	          System.out.print("\nIngrese el número de cuenta: ");
	          numeroCuenta = Integer.parseInt(in.readLine());
	          System.out.print("\nIngrese el PIN a usar (6 Digitos): ");
	          System.out.print("\nNOTA: El PIN a ingresar debe contener al menos: "
	          		+ "\n.	un numero."
	          		+ "\n.	una Mayuscula."
	          		+ "\n.	un Caracter especial.\n ");
	          PIN = in.readLine();
	          System.out.print("\nIngrese la fecha a ingresar: ");
	          fechaCreacion = in.readLine();
	          System.out.print("\nIngrese el monto a ingresar: ");
	          saldo = Double.parseDouble(in.readLine());
	          if (Validaciones.obtenerFechaFormateada(fechaCreacion) == true && 
	        		  Validaciones.validarPIN(PIN) == true) {
		          Cuenta cuenta = new Cuenta(numeroCuenta, PIN, fechaCreacion, saldo, estadoDeLaCuenta, buscarCliente);
		          misCuentas.add(cuenta);
		          
		          System.out.println("Se ha creado una cuenta con los siguientes datos:" + "\nNumeroCuenta: " + numeroCuenta +
			              "\nPIN: " + PIN + "\nfechaCreacion: " + fechaCreacion + "\nSaldo: " + formatoDecimal.format(saldo) + "\nEstado de la Cuenta: " +
			              estadoDeLaCuenta + "\nCliente: " +buscarCliente.getPrimerApellido()
			              +" "+ buscarCliente.getSegundoApellido()+" " + buscarCliente.getNombre());
	           } else {
	        	   System.out.println("Error: Revise que los datos que esta ingresando coincidan con los formatos pedidos"
	   	    	  		+ " y vuelva a intentarlo.");
	   	          break;
	           }


	      } else {
	    	  System.out.println("Error: La identificacion no existe en la base de datos.");
	          break;
	      }

	     

	    }
  }
  
  static void consultarClientesOrdenados() {
	  }
	 /* List<Cliente> clientesOrdenados = new ArrayList<Cliente>();

	  for (Cliente cliente: clientes ) {
		 cliente.compareTo(cliente); 
		 clientesOrdenados.add(cliente);
		  //System.out.println(cliente.toString());
	  }
	  System.out.println(clientesOrdenados);
	  
	  /*Ordenacion.ordenar(clientes);
	  System.out.println("Clientes ordenados");
	  for (int i = 0; i < clientes.length; i++) {
	    System.out.println(clientes[i].toString());
	  } */
	  //List<Cliente> clientes = new ArrayList<Cliente>();
	  //clientes.add(null);
   
}
