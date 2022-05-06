package logicadenegocios;

import java.util.Date;

public abstract class Persona {
  private String primerApellido;
  private String segundoApellido;
  private String nombre;
  private String identificacion;
  private String fechaNacimiento;
  private String numTelefonico;
  private String correoElectronico;

  public Persona(String pPrimerApellido, String pSegundoApellido, String pNombre, String pIdentificacion, String pFechaNacimiento, String pNumTelefonico,
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

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getNumTelefonico() {
    return numTelefonico;
  }
	
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setPrimerApellido(String pPrimerApellido) {
	this.primerApellido = pPrimerApellido;
  }
  
  public void setSegundoApellido(String pSegundoApellido) {
	this.segundoApellido = pSegundoApellido;
  }
	  
    public void setNombre(String pNombre) {
    this.nombre = pNombre;
  }
	
  public void setIdentificacion(String pIdentificacion) {
    this.identificacion = pIdentificacion;
  }

  public void setFechaNacimiento(String pFechaNacimiento) {
    this.fechaNacimiento = pFechaNacimiento;
  }

  public void setNumTelefonico(String pNumTelefonico) {
    this.numTelefonico = pNumTelefonico;
  }

  public void setCorreoElectronico(String pCorreoElectronico) {
    this.correoElectronico = pCorreoElectronico;
  }

  public String toString() {
    String mensaje = "";
	mensaje += "\nPrimer apellido: " + getPrimerApellido();
	mensaje +="\nSegundo apellido: " + getSegundoApellido();
	mensaje +="\nNombre: " +getNombre();
	mensaje +="\nIdentificacion: " +getIdentificacion();
	mensaje +="\nFecha de nacimiento: " +getFechaNacimiento();
	mensaje +="\nNumero Telefonico: " +getNumTelefonico();
	mensaje +="\nCorreo Electronico: " +getCorreoElectronico();
	return mensaje;
  }
}
