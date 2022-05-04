package logicadenegocios;

import java.util.Date;

public class Cliente extends Persona {
  private String codigoCliente;

  public Cliente(String pNombreCompleto, String pIdentificacion, Date pFechaNacimiento, double pNumTelefonico,
			String pCorreoElectronico, String pCodigoCliente) {
    super(pNombreCompleto, pIdentificacion, pFechaNacimiento, pNumTelefonico, pCorreoElectronico);
    setCodigoCliente(pCodigoCliente);
  }

  public void registrarCuenta() {
		// TODO Auto-generated method stub
		
  }
	
  public String getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(String codigoCliente) {
	this.codigoCliente = codigoCliente;
  }

}
