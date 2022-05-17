package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SQL {
	static String usuario="root";
	static String contraseña="";
	static String nombreSQL="gestionesdvf";
	
	private static Connection conec;
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String usuarioSQL=usuario;
	private static final String contraseñaSQL=contraseña;
	private static final String url="jdbc:mysql://localhost:3307/" + nombreSQL;
	/**
	 * Constructor de clase 
	 */
	public SQL() {
		conec = null;
		try {
			Class.forName(driver);
			conec= DriverManager.getConnection(url, usuarioSQL, contraseñaSQL);
			if (conec != null) {
			}
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error de conexión con la BD " + e);
		}
	}
	/**
	 * Metodo para conectarse a la base de datos
	 * @return Estado de la conexion
	 */
	public Connection getConexion() {
		return conec;
	}
	/**
	 * Metodo para desconectar de la BD
	 */
	public void desconectar() {
		conec=null;
		if(conec==null) {
			JOptionPane.showMessageDialog(null, "Se ha desconectado con exito!");
		}
	}
}



