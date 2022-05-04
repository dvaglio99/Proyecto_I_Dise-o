package logicadenegocios;

import java.util.Date;

public abstract class Persona {
  private String nombreCompleto;
  private String identificacion;
  private Date fechaNacimiento;
  private double numTelefonico;
  private String correoElectronico;

  public Persona(String pNombreCompleto, String pIdentificacion, Date pFechaNacimiento, double pNumTelefonico,
		String pCorreoElectronico) {
	  
    setNombreCompleto(pNombreCompleto);
    setIdentificacion(pIdentificacion);
    setFechaNacimiento(pFechaNacimiento);
    setNumTelefonico(pNumTelefonico);
    setCorreoElectronico(pCorreoElectronico);
  }

  public abstract void registrarCuenta();
  
  
  
  public String getNombreCompleto() {
    return nombreCompleto;
  }
	
  public String getIdentificacion() {
    return identificacion;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public double getNumTelefonico() {
    return numTelefonico;
  }
	
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setNombreCompleto(String pNombreCompleto) {
    this.nombreCompleto = pNombreCompleto;
  }
	
  public void setIdentificacion(String pIdentificacion) {
    this.identificacion = pIdentificacion;
  }

  public void setFechaNacimiento(Date pFechaNacimiento) {
    this.fechaNacimiento = pFechaNacimiento;
  }

  public void setNumTelefonico(double pNumTelefonico) {
    this.numTelefonico = pNumTelefonico;
  }

  public void setCorreoElectronico(String pCorreoElectronico) {
    this.correoElectronico = pCorreoElectronico;
  }

}
