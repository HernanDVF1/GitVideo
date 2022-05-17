package dvf.hernandvf.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControlAñadirCliente {
	public String nombre;
    public String apellidos;
    public String correoElectronico;
    public String teléfono;
    public String dirección;
    public String notas;
	public void AñadirClientesSQL(String nombre, String apellidos, String correoElectronico, String teléfono, String dirección, String notas) {
    		Connection con = null;
		     PreparedStatement stmt = null;
		     SQL cs = new SQL();
		     try{   
		        con = cs.getConexion();
		        String nombrelocal = nombre;
		        String apellidoslocal = apellidos;
		        String correolocal=correoElectronico;
		        String telefonolocal = teléfono;
		        String direcciónlocal= dirección;
		        String notaslocal=notas;

		        stmt = con.prepareStatement("insert into Clientes (IDCliente, Nombre, Apellidos, Email, Teléfono, Dirección, Notas) \r\n"
		        		+ "    VALUES (null,?,?,?,?,?,?)");
		        stmt.setString(1,nombrelocal);
		        stmt.setString(2,apellidoslocal);
		        stmt.setString(3,correolocal);
		        stmt.setString(4,telefonolocal);
		        stmt.setString(5,direcciónlocal);
		        stmt.setString(6,notaslocal);

		        int retorno = stmt.executeUpdate();
		        if (retorno>0)
		            JOptionPane.showMessageDialog(null, "Cliente creado correctamente");      

		     } catch (SQLException sqle){
		        System.out.println("SQLState: " 
		           + sqle.getSQLState());
		        System.out.println("SQLErrorCode: " 
		           + sqle.getErrorCode());
		        sqle.printStackTrace();
		        JOptionPane.showMessageDialog(null, "Error, no se creo el nuevo cliente.");

		     } catch (Exception e){
		        e.printStackTrace();
		     } finally {
		        if (con != null) {
		           try{
		              stmt.close();
		              con.close();
		           } catch(Exception e){
		              e.printStackTrace();
		           }
		        }
		     } 
	}
}
