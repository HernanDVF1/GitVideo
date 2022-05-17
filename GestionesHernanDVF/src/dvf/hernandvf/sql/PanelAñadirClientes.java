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

public class PanelA�adirClientes {
	PanelClientes panelClientes;
	ControlA�adirCliente a�adirCliente = new ControlA�adirCliente();
	PanelMen� panelMen� = new PanelMen�();
	private JFrame frame;
	private JTextField textField_Nombre;
	private JTextField textField_Apellidos;
	private JTextField textField_Email;
	private JTextField textField_Tel�fono;
	private JTextField textField_Direcci�n;
	private JTextField textField_Notas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelA�adirClientes window = new PanelA�adirClientes();
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
	public PanelA�adirClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon imagenReducida = new ImageIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\Herna\\\\\\\\eclipse-workspace1\\\\\\\\GestionesHernanDVF\\\\\\\\src\\\\\\\\dvf\\\\\\\\hernandvf\\\\\\\\img\\\\\\\\icon-panelClientes-A�adir.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
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
		
		JLabel lblTextoTel�fono = new JLabel("Tel\u00E9fono:");
		lblTextoTel�fono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoTel�fono.setBounds(43, 277, 135, 36);
		frame.getContentPane().add(lblTextoTel�fono);
		
		JLabel lblTextoDirecci�n = new JLabel("Direcci\u00F3n:");
		lblTextoDirecci�n.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoDirecci�n.setBounds(43, 324, 135, 36);
		frame.getContentPane().add(lblTextoDirecci�n);
		
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
		
		textField_Tel�fono = new JTextField();
		textField_Tel�fono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Tel�fono.setColumns(10);
		textField_Tel�fono.setBackground(Color.LIGHT_GRAY);
		textField_Tel�fono.setBounds(150, 277, 307, 36);
		frame.getContentPane().add(textField_Tel�fono);
		
		textField_Direcci�n = new JTextField();
		textField_Direcci�n.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Direcci�n.setColumns(10);
		textField_Direcci�n.setBackground(Color.LIGHT_GRAY);
		textField_Direcci�n.setBounds(150, 324, 307, 36);
		frame.getContentPane().add(textField_Direcci�n);
		
		JButton btnA�adir = new JButton("A\u00F1adir");
		btnA�adir.setBackground(Color.YELLOW);
		btnA�adir.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnA�adir.setBounds(43, 448, 414, 42);
		btnA�adir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=new String(textField_Nombre.getText());
				String apellidos=new String(textField_Apellidos.getText());
				String email=new String(textField_Email.getText());
				String tel�fono=new String(textField_Tel�fono.getText());
				String direcci�n=new String(textField_Direcci�n.getText());
				String notas=new String(textField_Notas.getText());
				System.out.printf(nombre,apellidos,email,tel�fono,direcci�n,notas);

				a�adirCliente.A�adirClientesSQL(nombre, apellidos, email, tel�fono, direcci�n, notas);
				textField_Nombre.setText("");
				textField_Apellidos.setText("");
				textField_Email.setText("");
				textField_Tel�fono.setText("");
				textField_Direcci�n.setText("");
				textField_Notas.setText("");

			}
		});
		frame.getContentPane().add(btnA�adir);
		
		JLabel lblFotoA�adir = new JLabel("");
		lblFotoA�adir.setIcon(imagenReducida);
		lblFotoA�adir.setBounds(10, 11, 119, 114);
		frame.getContentPane().add(lblFotoA�adir);
		
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
				panelMen�.main(null);
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
