package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ControlModificarCliente {
	

	SQL cs = new SQL();
	Connection conexi�n = cs.getConexion();
	
	public void ActualizarCliente(String iD, String nombre, String apellidos, String email, String tel�fono, String direcci�n, String notas) {
		try {
			Statement  sentencia=conexi�n.createStatement();
	        String consulta="UPDATE clientes SET  Nombre= '"+ nombre +"' AND Appelidos = '"+ apellidos +"' AND Email = '"+ email +"'AND Tel�fono = '"+ tel�fono +"'AND Direcci�n = '"+ direcci�n +"'AND Notas = '"+ notas +"' where id = '"+ iD +"'";
	        //String consulta="UPDATE clientes SET nombre='"+nombre+"',SET apellidos='"+apellidos+"',SET email='"+email+"',SET tel�fono='"+tel�fono+"',SET direcci�n='"+direcci�n+"',SET notas='"+notas+"'  WHERE idcliente = '"+iD+"' ";
	       sentencia.executeQuery(consulta);
	       sentencia.executeUpdate(consulta);
		}catch(Exception e) {
			
		}

	}
}
