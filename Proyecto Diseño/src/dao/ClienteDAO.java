package dao;

import java.io.IOException;

import logicadenegocios.Cliente;
import validaciones.Validaciones;
import conexion.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ClienteDAO {
	Conexion conexion;
	
	public ClienteDAO() {
	    conexion = new Conexion();
	  }

	
	 public void registrarCliente(String primerApellido, String segundoApellido, String nombre,
			 String identificacion, String fechaNacimiento, String numeroTelefonico,String correoElectronico) throws IOException {
		 	PreparedStatement ps;
	    	Connection conect = conexion.Conexion();    

		 	//String resultado = "insert into Cliente values (?,?,?,?,?,?,?)";
		   
		    	try {
		    		CallableStatement cstmt2 = conect.prepareCall("{call dbo.registrarPersona(?,?,?,?,?,?,?)}");
			         cstmt2.setString(1, primerApellido);
			         cstmt2.setString(2, segundoApellido);
			         cstmt2.setString(3, nombre);
			         cstmt2.setString(4, identificacion);
			         cstmt2.setString(5, fechaNacimiento);
			         cstmt2.setString(6, numeroTelefonico);
			         cstmt2.setString(7, correoElectronico);
			         cstmt2.executeUpdate();
		    	// Connection conect = conexion.Conexion();    
		         CallableStatement cstmt = conect.prepareCall("{call dbo.registrarCliente(?,?,?,?,?,?,?)}");
		         cstmt.setString(1, primerApellido);
		         cstmt.setString(2, segundoApellido);
		         cstmt.setString(3, nombre);
		         cstmt.setString(4, identificacion);
		         cstmt.setString(5, fechaNacimiento);
		         cstmt.setString(6, numeroTelefonico);
		         cstmt.setString(7, correoElectronico);
		         cstmt.executeUpdate();
		         
		         //int respuesta = cstmt.executeUpdate();
		    	 /*ps = conect.prepareStatement(resultado);
		            ps.setString(1,primerApellido);
		            ps.setString(2,segundoApellido);
		            ps.setString(3,nombre);
		            ps.setString(4,identificacion);
		            ps.setString(5,fechaNacimiento);
		            ps.setString(6,numeroTelefonico);
		            ps.setString(7,correoElectronico);
		            ps.executeUpdate();
		            ps.close();*/
		         
		    	} catch (SQLException e) {
		            System.err.println(e);
		            //return false;
		        }
		        finally{
		            try{
		                conect.close();
		            } catch(SQLException e){
		                System.err.println(e);
		            }
		        }
		  }
	 
	 public void consultarClientesOrdenados() {
		  try {
			  Connection conect = conexion.Conexion();    
		      CallableStatement cstmt =conexion.Conexion().prepareCall("{CALL [dbo].[ordenarClientesAscendentemente]}");
		      cstmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }
}
