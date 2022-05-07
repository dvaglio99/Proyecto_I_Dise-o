package dao;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import conexion.Conexion;
import validaciones.Validaciones;

public class PersonaDAO {
  
	Conexion conexion;
	 public String registrarPersona(String primerApellido, String segundoApellido, String nombre,
			 String identificacion, String fechaNacimiento, String numeroTelefonico,String correoElectronico,
			 String codigoCliente) throws IOException {
		 
		 	String resultado = null;
		    if (Validaciones.validarFormatoCorreoElectronico(correoElectronico) == true && 
		    		Validaciones.obtenerFechaFormateada(fechaNacimiento) == true &&
		    		Validaciones.validarFormatoNumeroTelefonico(numeroTelefonico)) {
		    	try {
		    	 Connection conect = conexion.Conexion();    
		         CallableStatement cstmt = conect.prepareCall("{call dbo.registrarPersona(?,?,?,?,?,?,?)}");
		         cstmt.setString(1, primerApellido);
		         cstmt.setString(2, segundoApellido);
		         cstmt.setString(3, nombre);
		         cstmt.setString(4, identificacion);
		         cstmt.setString(5, fechaNacimiento);
		         cstmt.setString(6, numeroTelefonico);
		         cstmt.setString(7, correoElectronico);
		         int respuesta = cstmt.executeUpdate();
		         
		         if (respuesta > 0 ) {
		        	
		           resultado = ("Se ha creado un nuevo cliente en el sistema, los datos que fueron almacenados son: "
				      		+"\n Codigo: "+ codigoCliente + "\n Nombre: "+ primerApellido+ " " + segundoApellido + " " +
				      		nombre + "\n Identificacion:" + identificacion + "\n Fecha Nacimiento: "+ 
				      		fechaNacimiento + "\n Numero Telefonico: " +numeroTelefonico +
				      		"\n Correo Electronico: " + correoElectronico);
		         }
		       } catch (SQLException e) {
		    	   resultado = ("Error: Revise que los datos que esta ingresando coincidan con los formatos pedidos"
			    	  		+ " y vuelva a intentarlo.");
		       }
		      
		     }
		     return resultado;
		  }
}
