package dvf.hernandvf.sql;

import javax.swing.JOptionPane;

public class ControlAcceso {
	private String Usuario="Hernan";
	private String Contrase�a="1234";
	PanelMen� panelMen� = new PanelMen�();
	public boolean Comprobar(String Usuario, String Contrase�a) {
		boolean cortaFuegos;
		if (Usuario.equals(this.Usuario) && Contrase�a.equals(this.Contrase�a)) {
			cortaFuegos=false;
			panelMen�.main(null);
			JOptionPane.showMessageDialog(null, "Se ha Conectado con exito!");
		}else{
			cortaFuegos=true;
			if(Usuario.equals(this.Usuario)) {
				JOptionPane.showMessageDialog(null, "Contrase�a erronea!");
			}else {
				JOptionPane.showMessageDialog(null, "Usuario o contrase�a erroneos!");
			}
					}
		
		return cortaFuegos;
	}
}
