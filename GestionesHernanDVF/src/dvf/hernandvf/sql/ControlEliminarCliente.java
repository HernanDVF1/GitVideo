package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControlEliminarCliente {
	String noEncontrado="-> Usuario no encontrado";
	SQL cs = new SQL();
	Connection conexi�n = cs.getConexion();
	PreparedStatement stmt;
	public void EliminarPorNombreYCampo(String nombre) {
		try {
	        java.sql.Statement sentencia=conexi�n.createStatement();
	        String consulta="DELETE FROM Clientes WHERE nombre="+nombre+"";
	        sentencia.executeQuery(consulta);
	        conexi�n.close();
		}catch(Exception e) {
			
		}
	}
	public void EliminarPorIDYCampo(String id) {
		try {
			 stmt = conexi�n.prepareStatement("DELETE FROM Clientes WHERE idcliente=?");
		        stmt.setString(1,id);
		        stmt.executeUpdate();
	        conexi�n.close();
		}catch(Exception e) {
		}
	}
}
