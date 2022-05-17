package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ControlModificarCliente {
	

	SQL cs = new SQL();
	Connection conexión = cs.getConexion();
	
	public void ActualizarCliente(String iD, String nombre, String apellidos, String email, String teléfono, String dirección, String notas) {
		try {
			Statement  sentencia=conexión.createStatement();
	        String consulta="UPDATE clientes SET  Nombre= '"+ nombre +"' AND Appelidos = '"+ apellidos +"' AND Email = '"+ email +"'AND Teléfono = '"+ teléfono +"'AND Dirección = '"+ dirección +"'AND Notas = '"+ notas +"' where id = '"+ iD +"'";
	        //String consulta="UPDATE clientes SET nombre='"+nombre+"',SET apellidos='"+apellidos+"',SET email='"+email+"',SET teléfono='"+teléfono+"',SET dirección='"+dirección+"',SET notas='"+notas+"'  WHERE idcliente = '"+iD+"' ";
	       sentencia.executeQuery(consulta);
	       sentencia.executeUpdate(consulta);
		}catch(Exception e) {
			
		}

	}
}
