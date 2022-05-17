package dvf.hernandvf.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class IniciarSesion {

	private JFrame frame;
	
	SQL sqlConexi�n = new SQL();
	ControlAcceso login = new ControlAcceso();
	private JTextField textUsuario;
	private JPasswordField textContrase�a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion window = new IniciarSesion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IniciarSesion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 631, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Bot�n de conectar;
		JButton btnConectar = new JButton("Conectar");
		btnConectar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnConectar.setBounds(106, 250, 193, 48);
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Usuario=textUsuario.getText();
				//sacar contrase�a encriptada
				String Contrase�a= new String(textContrase�a.getPassword());
					//login.Comprobar(Usuario, Contrase�a);
					frame.setVisible(login.Comprobar(Usuario, Contrase�a));
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnConectar);
		
		textUsuario = new JTextField();
		textUsuario.setBackground(Color.LIGHT_GRAY);
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textUsuario.setBounds(138, 137, 188, 33);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(20, 136, 99, 32);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrase�a = new JLabel("Contrase\u00F1a:");
		lblContrase�a.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrase�a.setBounds(20, 179, 99, 33);
		frame.getContentPane().add(lblContrase�a);
		
		textContrase�a = new JPasswordField();
		textContrase�a.setBackground(Color.LIGHT_GRAY);
		textContrase�a.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textContrase�a.setBounds(138, 180, 188, 33);
		frame.getContentPane().add(textContrase�a);
		
		JLabel lblTitulo = new JLabel("Acceso a Gesti\u00F3n");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblTitulo.setBounds(88, 11, 414, 42);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Herna\\eclipse-workspace1\\GestionesHernanDVF\\src\\dvf\\hernandvf\\img\\icon-inicioGesti\u00F3n-Candado_peque\u00F1o.jpg"));
		lblNewLabel.setBounds(378, 136, 227, 240);
		frame.getContentPane().add(lblNewLabel);
	}
}
