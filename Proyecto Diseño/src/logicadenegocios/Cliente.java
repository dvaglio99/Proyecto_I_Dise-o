package logicadenegocios;

import java.util.List;

public class Cliente extends Persona implements Comparable<Cliente>{
  private String codigoCliente;
  private List<Cuenta> misCuentas;
  
  public Cliente() {
	  super();
  }
  
  public Cliente(String pPrimerApellido, String pSegundoApellido, String pNombre, String pIdentificacion,
			String pFechaNacimiento, String pNumTelefonico, String pCorreoElectronico, String pCodigoCliente){
    super(pPrimerApellido, pSegundoApellido, pNombre, pIdentificacion, pFechaNacimiento, pNumTelefonico,
				pCorreoElectronico);    
    setCodigoCliente(pCodigoCliente);
    
  }

  public void registrarCuenta() {
    		
  }
  
  
  void agregarCuenta(Cuenta pCuenta) {
	  misCuentas.add(pCuenta);
  }
	
  public String getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(String pCodigoCliente) {
	this.codigoCliente = pCodigoCliente;
  }
  
  public String toString() {
    String mensaje = "";
    mensaje += super.toString();
    mensaje +=" \nCodigo Cliente: " + getCodigoCliente();
    return mensaje;
  }

public int compareTo(Cliente o) {
	return this.getPrimerApellido().compareTo(o.getPrimerApellido());
}




}
