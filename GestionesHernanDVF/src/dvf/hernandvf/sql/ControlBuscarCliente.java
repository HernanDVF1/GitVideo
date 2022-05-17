package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class ControlBuscarCliente extends SQL{
	String noEncontrado="-> Usuario no encontrado";
	SQL cs = new SQL();
	Connection conexión = cs.getConexion();
	
	public String BuscarPorNombreYCampo(String nombre, String campo) {
		String nombreBuscado = null;
		try {
	        java.sql.Statement sentencia=conexión.createStatement();
	        String consulta="select "+campo+" from Clientes where nombre='"+nombre+"'";
	        ResultSet rs= sentencia.executeQuery(consulta);
	        rs.next();
	        nombreBuscado = rs.getString(1);
		}catch(Exception e) {
			return noEncontrado;
		}
		return nombreBuscado;
	}
	public String BuscarPorIDYCampo(String id, String campo) {
		String nombreBuscado = null;
		try {
	        java.sql.Statement sentencia=conexión.createStatement();
	        String consulta="select "+campo+" from Clientes where idcliente='"+id+"'";
	        ResultSet rs= sentencia.executeQuery(consulta);
	        rs.next();
	        nombreBuscado = rs.getString(1);
		}catch(Exception e) {
			return noEncontrado;
		}
		return nombreBuscado;
	}
	public String BuscarTODOS() {
		String clientes = "Lista de Clientes:";
		String todos="Lista de Clientes:";
		String todosResultado = null;
		try {
	        java.sql.Statement sentencia=conexión.createStatement();
	        String consulta="select * from Clientes";
	        ResultSet rs= sentencia.executeQuery(consulta);
	       while( rs.next()) {
	    	   todos = todos+"\n"+" ID: "+rs.getString(1).toUpperCase() + " Nombre: " + rs.getString(2).toUpperCase() + " Apellidos: " + rs.getString(3).toUpperCase() + " Email: " + rs.getString(4).toUpperCase() +" Teléfono: "+rs.getString(5).toUpperCase()+ " Dirección "+rs.getString(6).toUpperCase()+" Notas: "+rs.getString(7).toUpperCase()+"\n" ;
	       }
	}catch(Exception e) {
	}
		return todos;
	}
}
