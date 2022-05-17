package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControlEliminarCliente {
	String noEncontrado="-> Usuario no encontrado";
	SQL cs = new SQL();
	Connection conexión = cs.getConexion();
	PreparedStatement stmt;
	public void EliminarPorNombreYCampo(String nombre) {
		try {
	        java.sql.Statement sentencia=conexión.createStatement();
	        String consulta="DELETE FROM Clientes WHERE nombre="+nombre+"";
	        sentencia.executeQuery(consulta);
	        conexión.close();
		}catch(Exception e) {
			
		}
	}
	public void EliminarPorIDYCampo(String id) {
		try {
			 stmt = conexión.prepareStatement("DELETE FROM Clientes WHERE idcliente=?");
		        stmt.setString(1,id);
		        stmt.executeUpdate();
	        conexión.close();
		}catch(Exception e) {
		}
	}
}
