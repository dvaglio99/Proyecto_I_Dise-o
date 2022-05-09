package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.ClienteDAO;
import logicadenegocios.Cliente;
import validaciones.Validaciones;
import vista.RegistrarCliente;

public class ControladorCliente implements ActionListener{
  public RegistrarCliente vistaRegistrarCliente;
  public Cliente cliente;
  public ClienteDAO clienteDao;
  
  public ControladorCliente(RegistrarCliente pVistaRegistroCliente, Cliente pCliente) {
	    vistaRegistrarCliente = pVistaRegistroCliente;
	    cliente = pCliente;
	    clienteDao = new ClienteDAO();
	        
	    this.vistaRegistrarCliente.btnRegistrarCliente.addActionListener(this);
	    this.vistaRegistrarCliente.btnVolver.addActionListener(this);
	    this.vistaRegistrarCliente.btnLimpiar.addActionListener(this);
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaRegistrarCliente.btnRegistrarCliente) {
	        registrarCliente();
	    }
	}
	
 public void registrarCliente() {
	    try{
	      String primerApellido = vistaRegistrarCliente.txtPrimerApellido.getText();
	      String segundoApellido =  vistaRegistrarCliente.txtSegundoApellido.getText();
	      String nombre = vistaRegistrarCliente.txtNombre.getText();
	      String identificacion = vistaRegistrarCliente.txtIdentificacion.getText();
	      String fechaNacimiento = vistaRegistrarCliente.txtFechaNacimiento.getText();
	      String numeroTelefonico = vistaRegistrarCliente.txtNumeroTelefonico.getText();
	      String correoElectronico = vistaRegistrarCliente.txtCorreoElectronico.getText();
	      if (Validaciones.validarFormatoCorreoElectronico(correoElectronico) == true && 
		    		Validaciones.obtenerFechaFormateada(fechaNacimiento) == true &&
		    		Validaciones.validarFormatoNumeroTelefonico(numeroTelefonico)) {
	        clienteDao.registrarCliente(primerApellido, segundoApellido, nombre, identificacion, fechaNacimiento, numeroTelefonico, correoElectronico);
	      }
	     
	       
	    } catch (HeadlessException | IOException ex) {
	      Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
	    }
	  }

}
