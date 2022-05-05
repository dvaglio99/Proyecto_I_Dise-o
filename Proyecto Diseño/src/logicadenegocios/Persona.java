package logicadenegocios;

import java.util.Date;

public abstract class Persona {
  private String primerApellido;
  private String segundoApellido;
  private String nombre;
  private String identificacion;
  private Date fechaNacimiento;
  private double numTelefonico;
  private String correoElectronico;

  public Persona(String pPrimerApellido, String pSegundoApellido, String pNombre, String pIdentificacion, Date pFechaNacimiento, double pNumTelefonico,
		String pCorreoElectronico) {
	setPrimerApellido(pPrimerApellido);
	setSegundoApellido(pSegundoApellido);
    setNombre(pNombre);
    setIdentificacion(pIdentificacion);
    setFechaNacimiento(pFechaNacimiento);
    setNumTelefonico(pNumTelefonico);
    setCorreoElectronico(pCorreoElectronico);
  }

  public abstract void registrarCuenta();
  
  public void consultarTipoCambio() {
	  
  }
  
  public String getPrimerApellido() {
	return primerApellido;
  }
  
  public String getSegundoApellido() {
	return segundoApellido;
  }
  
  public String getNombre() {
    return nombre;
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

  public void setPrimerApellido(String pPrimerApellido) {
	this.nombre = pPrimerApellido;
  }
  
  public void setSegundoApellido(String pSegundoApellido) {
	this.nombre = pSegundoApellido;
  }
	  
    public void setNombre(String pNombre) {
    this.nombre = pNombre;
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
