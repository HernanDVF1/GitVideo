package dvf.hernandvf.sql;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PanelModificarCliente {
	PanelMenú panelMenú = new PanelMenú();
	PanelClientes panelClientes = new PanelClientes();
	ControlModificarCliente controlModificarCliente = new ControlModificarCliente();
	ControlBuscarCliente controlBuscarCliente = new ControlBuscarCliente();
	private JTextField textField_Nombre;
	private JTextField textField_Apellidos;
	private JTextField textField_Email;
	private JTextField textField_Teléfono;
	private JTextField textField_Dirección;
	private JTextField textIDaModificar;
	private JTextField txtSiDesconocesEl;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelModificarCliente window = new PanelModificarCliente();
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
	public PanelModificarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon imagenReducida = new ImageIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\Herna\\\\\\\\eclipse-workspace1\\\\\\\\GestionesHernanDVF\\\\\\\\src\\\\\\\\dvf\\\\\\\\hernandvf\\\\\\\\img\\\\\\\\icon-panelClientes-Añadir.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		frame = new JFrame();
		frame.getContentPane().setPreferredSize(new Dimension(2400, 60));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1451, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Modificar Clientes");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTitulo.setBounds(43, 32, 494, 76);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblTextoNombre = new JLabel("Nombre:");
		lblTextoNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoNombre.setBounds(10, 276, 135, 36);
		frame.getContentPane().add(lblTextoNombre);
		
		JLabel lblTextoApellidos = new JLabel("Apellidos:");
		lblTextoApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoApellidos.setBounds(10, 323, 135, 36);
		frame.getContentPane().add(lblTextoApellidos);
		
		JLabel lblTextoEmail = new JLabel("Email:");
		lblTextoEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoEmail.setBounds(10, 370, 135, 36);
		frame.getContentPane().add(lblTextoEmail);
		
		JLabel lblTextoTeléfono = new JLabel("Tel\u00E9fono:");
		lblTextoTeléfono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoTeléfono.setBounds(10, 416, 135, 36);
		frame.getContentPane().add(lblTextoTeléfono);
		
		JLabel lblTextoDirección = new JLabel("Direcci\u00F3n:");
		lblTextoDirección.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoDirección.setBounds(10, 463, 135, 36);
		frame.getContentPane().add(lblTextoDirección);
		
		JLabel lblTextoNotas = new JLabel("Notas:");
		lblTextoNotas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoNotas.setBounds(319, 370, 265, 36);
		frame.getContentPane().add(lblTextoNotas);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBackground(Color.LIGHT_GRAY);
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Nombre.setBounds(95, 277, 214, 36);
		frame.getContentPane().add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		textField_Apellidos = new JTextField();
		textField_Apellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Apellidos.setColumns(10);
		textField_Apellidos.setBackground(Color.LIGHT_GRAY);
		textField_Apellidos.setBounds(95, 323, 214, 36);
		frame.getContentPane().add(textField_Apellidos);
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Email.setColumns(10);
		textField_Email.setBackground(Color.LIGHT_GRAY);
		textField_Email.setBounds(95, 370, 214, 36);
		frame.getContentPane().add(textField_Email);
		
		textField_Teléfono = new JTextField();
		textField_Teléfono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Teléfono.setColumns(10);
		textField_Teléfono.setBackground(Color.LIGHT_GRAY);
		textField_Teléfono.setBounds(95, 417, 214, 36);
		frame.getContentPane().add(textField_Teléfono);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(389, 276, 265, 223);
		frame.getContentPane().add(scrollPane);
		JTextPane textPanel_Notas = new JTextPane();
		scrollPane.setViewportView(textPanel_Notas);
		textPanel_Notas.setBackground(Color.LIGHT_GRAY);
		textPanel_Notas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_Dirección = new JTextField();
		textField_Dirección.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Dirección.setColumns(10);
		textField_Dirección.setBackground(Color.LIGHT_GRAY);
		textField_Dirección.setBounds(95, 463, 214, 36);
		frame.getContentPane().add(textField_Dirección);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(Color.RED);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnModificar.setBounds(20, 183, 161, 45);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField_Nombre.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"Nombre"));
				//textField_Apellidos.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"Apellidos"));
				//textField_Email.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"Email"));
				//textField_Teléfono.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"Teléfono"));
				//textField_Dirección.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"Dirección"));
				//textPanel_Notas.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"Notas"));
				//textDield_IDCliente.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaModificar.getText(),"IDCliente"));
				//textNombreaModificar.setText("");
				controlModificarCliente.ActualizarCliente(textIDaModificar.getText(),  textField_Nombre.getText(), textField_Apellidos.getText(), textField_Email.getText(), textField_Teléfono.getText(), textField_Dirección.getText(), textPanel_Notas.getText());
				
				txtSiDesconocesEl.setText("[¡Cliente Modificado con Exito!]");
			}
		});
		frame.getContentPane().add(btnModificar);
		
		JLabel lblFotoAñadir = new JLabel("");
		lblFotoAñadir.setIcon(imagenReducida);
		lblFotoAñadir.setBounds(10, 11, 119, 114);
		frame.getContentPane().add(lblFotoAñadir);
		
		JButton btnVolverClientes = new JButton("Volver a Clientes");
		btnVolverClientes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolverClientes.setBackground(Color.GREEN);
		btnVolverClientes.setBounds(10, 580, 168, 36);
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
		btnVolverMenu.setBounds(10, 533, 168, 36);
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				panelMenú.main(null);
			}
		});
		frame.getContentPane().add(btnVolverMenu);
		
		textIDaModificar = new JTextField();
		textIDaModificar.setBackground(Color.CYAN);
		textIDaModificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIDaModificar.setBounds(262, 133, 187, 44);
		frame.getContentPane().add(textIDaModificar);
		textIDaModificar.setColumns(10);
		
		JLabel lblTextoIDaBuscar = new JLabel("ID del Cliente a Modificar");
		lblTextoIDaBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoIDaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoIDaBuscar.setBounds(244, 98, 221, 36);
		frame.getContentPane().add(lblTextoIDaBuscar);
		
		JButton btnBuscarPorID = new JButton("Buscar");
		btnBuscarPorID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnBuscarPorID.setBackground(Color.RED);
		btnBuscarPorID.setBounds(493, 183, 161, 44);
		frame.getContentPane().add(btnBuscarPorID);
		btnBuscarPorID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Nombre.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaModificar.getText(),"Nombre"));
				textField_Apellidos.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaModificar.getText(),"Apellidos"));
				textField_Email.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaModificar.getText(),"Email"));
				textField_Teléfono.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaModificar.getText(),"Teléfono"));
				textField_Dirección.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaModificar.getText(),"Dirección"));
				textPanel_Notas.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaModificar.getText(),"Notas"));
				txtSiDesconocesEl.setText("[Cliente buscado por ID]");
				

			}
		});
		txtSiDesconocesEl = new JTextField();
		txtSiDesconocesEl.setEditable(false);
		txtSiDesconocesEl.setText("Si desconoces el ID busca por NOMBRE");
		txtSiDesconocesEl.setHorizontalAlignment(SwingConstants.CENTER);
		txtSiDesconocesEl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSiDesconocesEl.setForeground(Color.WHITE);
		txtSiDesconocesEl.setBackground(Color.BLACK);
		txtSiDesconocesEl.setBounds(279, 534, 456, 64);
		frame.getContentPane().add(txtSiDesconocesEl);
		txtSiDesconocesEl.setColumns(10);
		


	}
	}


