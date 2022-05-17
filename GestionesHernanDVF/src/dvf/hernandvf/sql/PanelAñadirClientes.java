package dvf.hernandvf.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class PanelAñadirClientes {
	PanelClientes panelClientes;
	ControlAñadirCliente añadirCliente = new ControlAñadirCliente();
	PanelMenú panelMenú = new PanelMenú();
	private JFrame frame;
	private JTextField textField_Nombre;
	private JTextField textField_Apellidos;
	private JTextField textField_Email;
	private JTextField textField_Teléfono;
	private JTextField textField_Dirección;
	private JTextField textField_Notas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelAñadirClientes window = new PanelAñadirClientes();
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
	public PanelAñadirClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon imagenReducida = new ImageIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\Herna\\\\\\\\eclipse-workspace1\\\\\\\\GestionesHernanDVF\\\\\\\\src\\\\\\\\dvf\\\\\\\\hernandvf\\\\\\\\img\\\\\\\\icon-panelClientes-Añadir.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 599, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("A\u00F1adir Clientes");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTitulo.setBounds(43, 32, 494, 76);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblTextoNombre = new JLabel("Nombre:");
		lblTextoNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoNombre.setBounds(43, 136, 135, 36);
		frame.getContentPane().add(lblTextoNombre);
		
		JLabel lblTextoApellidos = new JLabel("Apellidos:");
		lblTextoApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoApellidos.setBounds(43, 183, 135, 36);
		frame.getContentPane().add(lblTextoApellidos);
		
		JLabel lblTextoEmail = new JLabel("Email:");
		lblTextoEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoEmail.setBounds(43, 229, 135, 36);
		frame.getContentPane().add(lblTextoEmail);
		
		JLabel lblTextoTeléfono = new JLabel("Tel\u00E9fono:");
		lblTextoTeléfono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoTeléfono.setBounds(43, 277, 135, 36);
		frame.getContentPane().add(lblTextoTeléfono);
		
		JLabel lblTextoDirección = new JLabel("Direcci\u00F3n:");
		lblTextoDirección.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoDirección.setBounds(43, 324, 135, 36);
		frame.getContentPane().add(lblTextoDirección);
		
		JLabel lblTextoNotas = new JLabel("Notas:");
		lblTextoNotas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoNotas.setBounds(43, 371, 135, 36);
		frame.getContentPane().add(lblTextoNotas);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBackground(Color.LIGHT_GRAY);
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Nombre.setBounds(150, 136, 307, 36);
		frame.getContentPane().add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		textField_Apellidos = new JTextField();
		textField_Apellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Apellidos.setColumns(10);
		textField_Apellidos.setBackground(Color.LIGHT_GRAY);
		textField_Apellidos.setBounds(150, 183, 307, 36);
		frame.getContentPane().add(textField_Apellidos);
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Email.setColumns(10);
		textField_Email.setBackground(Color.LIGHT_GRAY);
		textField_Email.setBounds(150, 230, 307, 36);
		frame.getContentPane().add(textField_Email);
		
		textField_Teléfono = new JTextField();
		textField_Teléfono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Teléfono.setColumns(10);
		textField_Teléfono.setBackground(Color.LIGHT_GRAY);
		textField_Teléfono.setBounds(150, 277, 307, 36);
		frame.getContentPane().add(textField_Teléfono);
		
		textField_Dirección = new JTextField();
		textField_Dirección.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Dirección.setColumns(10);
		textField_Dirección.setBackground(Color.LIGHT_GRAY);
		textField_Dirección.setBounds(150, 324, 307, 36);
		frame.getContentPane().add(textField_Dirección);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBackground(Color.YELLOW);
		btnAñadir.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAñadir.setBounds(43, 448, 414, 42);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=new String(textField_Nombre.getText());
				String apellidos=new String(textField_Apellidos.getText());
				String email=new String(textField_Email.getText());
				String teléfono=new String(textField_Teléfono.getText());
				String dirección=new String(textField_Dirección.getText());
				String notas=new String(textField_Notas.getText());
				System.out.printf(nombre,apellidos,email,teléfono,dirección,notas);

				añadirCliente.AñadirClientesSQL(nombre, apellidos, email, teléfono, dirección, notas);
				textField_Nombre.setText("");
				textField_Apellidos.setText("");
				textField_Email.setText("");
				textField_Teléfono.setText("");
				textField_Dirección.setText("");
				textField_Notas.setText("");

			}
		});
		frame.getContentPane().add(btnAñadir);
		
		JLabel lblFotoAñadir = new JLabel("");
		lblFotoAñadir.setIcon(imagenReducida);
		lblFotoAñadir.setBounds(10, 11, 119, 114);
		frame.getContentPane().add(lblFotoAñadir);
		
		JButton btnVolverClientes = new JButton("Volver a Clientes");
		btnVolverClientes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolverClientes.setBackground(Color.GREEN);
		btnVolverClientes.setBounds(10, 548, 168, 36);
		btnVolverClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				panelClientes.main(null);
			}
		});
		frame.getContentPane().add(btnVolverClientes);
		
		JButton btnVolverMenu = new JButton("Volver al Men\u00FA");
		btnVolverMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolverMenu.setBackground(Color.RED);
		btnVolverMenu.setBounds(10, 501, 168, 36);
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				panelMenú.main(null);
			}
		});
		frame.getContentPane().add(btnVolverMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 371, 307, 66);
		frame.getContentPane().add(scrollPane);
		
		textField_Notas = new JTextField();
		scrollPane.setViewportView(textField_Notas);
		textField_Notas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Notas.setColumns(10);
		textField_Notas.setBackground(Color.LIGHT_GRAY);
	}
}
