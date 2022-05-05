package logicadenegocios;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Persona {
  private String codigoCliente;
  private ArrayList<Cuenta> misCuentas;
  
  public Cliente(String pPrimerApellido, String pSegundoApellido, String pNombre, String pIdentificacion,
			String pFechaNacimiento, double pNumTelefonico, String pCorreoElectronico, String pCodigoCliente){
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

}
