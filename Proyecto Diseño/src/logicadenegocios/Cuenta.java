package logicadenegocios;

import java.util.ArrayList;
import java.util.Date;

public class Cuenta {
  private double numeroCuenta;
  private String PIN;
  private Date fechaCreacion;
  private double saldo;
  private String estado;
  private Cliente duenio;
  private ArrayList<Operacion> operaciones;
  
  
  public Cuenta(double pNumeroCuenta, String pPIN, Date pFechaCreacion, double pSaldo, String pEstado) {
    setNumeroCuenta(pNumeroCuenta);
    setPIN(pPIN);
    setFechaCreacion(pFechaCreacion);
    setSaldo(pSaldo);
    setEstado(pEstado);
    operaciones = new ArrayList<Operacion>();
  }
  
  public String calcularTotalComisionDepositoRetiro() {
	return "";
  }
  
  public String calcularTotalComisionDeposito() {
	return "";
  }
  
  public String calcularTotalComisionRetiro() {
    return "";
  }
  
  public void modificarPIN() {
	  
  }
  
  public void agregarOperacion(Date pFecha, String pTipoOperacion, boolean pCargoOperacion, double pMonto) {
    Operacion op = new Operacion(pFecha, pTipoOperacion, pCargoOperacion, pMonto);
    operaciones.add(op);
  }
  
  public double getNumeroCuenta() {
	return numeroCuenta;
  }
  
  public String getPIN() {
    return PIN;
  }
  
  public Date getFechaCreacion() {
	return fechaCreacion;
  }
  
  public double getSaldo() {
	return saldo;
  }
  
  public String getEstado() {
    return estado;
  }
  
  public Cliente getCliente() {
	return duenio;
  }
  public void setNumeroCuenta(double pNumeroCuenta) {
    this.numeroCuenta = pNumeroCuenta;
  }
  
  public void setPIN(String pPIN) {
	PIN = pPIN;
  }
  
  public void setFechaCreacion(Date pFechaCreacion) {
	this.fechaCreacion = pFechaCreacion;
  }
  
  public void setSaldo(double pSaldo) {
	this.saldo = pSaldo;
  }
  
  public void setEstado(String pEstado) {
	this.estado = pEstado;
  }
  
  public void setCliente(Cliente pDuenio) {
	  this.duenio = pDuenio;
  }
}
