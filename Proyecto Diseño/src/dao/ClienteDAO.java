package dao;

import java.io.IOException;

import logicadenegocios.Cliente;
import validaciones.Validaciones;
import conexion.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ClienteDAO {

	Conexion conexion;
	 public String registrarCliente(String primerApellido, String segundoApellido, String nombre,
			 String identificacion, String fechaNacimiento, String numeroTelefonico,String correoElectronico) throws IOException {
		 
		 	String resultado = null;
		   
		    	try {
		    	 Connection conect = conexion.Conexion();    
		         CallableStatement cstmt = conect.prepareCall("{call dbo.registrarCliente(?,?,?,?,?,?,?)}");
		         cstmt.setString(1, primerApellido);
		         cstmt.setString(2, segundoApellido);
		         cstmt.setString(3, nombre);
		         cstmt.setString(4, identificacion);
		         cstmt.setString(5, fechaNacimiento);
		         cstmt.setString(6, numeroTelefonico);
		         cstmt.setString(7, correoElectronico);
		         int respuesta = cstmt.executeUpdate();
		         
		         if (respuesta > 0 ) {
		        	
		           resultado = "Registro exitoso";
		         }
		       } catch (SQLException e) {
		    	   resultado = ("Error: Revise que los datos que esta ingresando coincidan con los formatos pedidos"
			    	  		+ " y vuelva a intentarlo.");
		       }
		      
		     return resultado;
		  }
}
