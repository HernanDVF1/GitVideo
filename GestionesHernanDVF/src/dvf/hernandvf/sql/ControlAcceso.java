package dvf.hernandvf.sql;

import javax.swing.JOptionPane;

public class ControlAcceso {
	private String Usuario="Hernan";
	private String Contraseña="1234";
	PanelMenú panelMenú = new PanelMenú();
	public boolean Comprobar(String Usuario, String Contraseña) {
		boolean cortaFuegos;
		if (Usuario.equals(this.Usuario) && Contraseña.equals(this.Contraseña)) {
			cortaFuegos=false;
			panelMenú.main(null);
			JOptionPane.showMessageDialog(null, "Se ha Conectado con exito!");
		}else{
			cortaFuegos=true;
			if(Usuario.equals(this.Usuario)) {
				JOptionPane.showMessageDialog(null, "Contraseña erronea!");
			}else {
				JOptionPane.showMessageDialog(null, "Usuario o contraseña erroneos!");
			}
					}
		
		return cortaFuegos;
	}
}
