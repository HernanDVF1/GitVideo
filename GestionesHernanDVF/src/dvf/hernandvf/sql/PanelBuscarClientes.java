package dvf.hernandvf.sql;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DropMode;
import java.awt.TextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PanelBuscarClientes {
	PanelMenú panelMenú = new PanelMenú();
	PanelClientes panelClientes = new PanelClientes();
	ControlBuscarCliente controlBuscarCliente = new ControlBuscarCliente();
	private JTextField textField_Nombre;
	private JTextField textField_Apellidos;
	private JTextField textField_Email;
	private JTextField textField_Teléfono;
	private JTextField textField_Dirección;
	private JFrame frame;
	private JTextField textIDaBuscar;
	private JTextField textNombreaBuscar;
	private JTextField textDield_IDCliente;
	private JTextField txtSiDesconocesEl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelBuscarClientes window = new PanelBuscarClientes();
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
	public PanelBuscarClientes() {
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
		
		JLabel lblTitulo = new JLabel("Buscar Clientes");
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
		textField_Nombre.setEditable(false);
		textField_Nombre.setBackground(Color.LIGHT_GRAY);
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Nombre.setBounds(150, 136, 307, 36);
		frame.getContentPane().add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		textField_Apellidos = new JTextField();
		textField_Apellidos.setEditable(false);
		textField_Apellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Apellidos.setColumns(10);
		textField_Apellidos.setBackground(Color.LIGHT_GRAY);
		textField_Apellidos.setBounds(150, 183, 307, 36);
		frame.getContentPane().add(textField_Apellidos);
		
		textField_Email = new JTextField();
		textField_Email.setEditable(false);
		textField_Email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Email.setColumns(10);
		textField_Email.setBackground(Color.LIGHT_GRAY);
		textField_Email.setBounds(150, 230, 307, 36);
		frame.getContentPane().add(textField_Email);
		
		textField_Teléfono = new JTextField();
		textField_Teléfono.setEditable(false);
		textField_Teléfono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Teléfono.setColumns(10);
		textField_Teléfono.setBackground(Color.LIGHT_GRAY);
		textField_Teléfono.setBounds(150, 277, 307, 36);
		frame.getContentPane().add(textField_Teléfono);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 374, 307, 72);
		frame.getContentPane().add(scrollPane);
		JTextPane textPanel_Notas = new JTextPane();
		scrollPane.setViewportView(textPanel_Notas);
		textPanel_Notas.setEditable(false);
		textPanel_Notas.setBackground(Color.LIGHT_GRAY);
		textPanel_Notas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_Dirección = new JTextField();
		textField_Dirección.setEditable(false);
		textField_Dirección.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Dirección.setColumns(10);
		textField_Dirección.setBackground(Color.LIGHT_GRAY);
		textField_Dirección.setBounds(150, 324, 307, 36);
		frame.getContentPane().add(textField_Dirección);
		
		JButton btnBuscarPorNombre = new JButton("Buscar");
		btnBuscarPorNombre.setBackground(Color.YELLOW);
		btnBuscarPorNombre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnBuscarPorNombre.setBounds(585, 212, 150, 42);
		btnBuscarPorNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Nombre.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"Nombre"));
				textField_Apellidos.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"Apellidos"));
				textField_Email.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"Email"));
				textField_Teléfono.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"Teléfono"));
				textField_Dirección.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"Dirección"));
				textPanel_Notas.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"Notas"));
				textDield_IDCliente.setText(controlBuscarCliente.BuscarPorNombreYCampo(textNombreaBuscar.getText(),"IDCliente"));
				textNombreaBuscar.setText("");
				txtSiDesconocesEl.setText("[Cliente buscado por Nombre]");
			}
		});
		frame.getContentPane().add(btnBuscarPorNombre);
		
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
		
		textIDaBuscar = new JTextField();
		textIDaBuscar.setBackground(Color.PINK);
		textIDaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textIDaBuscar.setBounds(664, 368, 119, 44);
		frame.getContentPane().add(textIDaBuscar);
		textIDaBuscar.setColumns(10);
		
		textNombreaBuscar = new JTextField();
		textNombreaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNombreaBuscar.setColumns(10);
		textNombreaBuscar.setBackground(Color.PINK);
		textNombreaBuscar.setBounds(664, 133, 119, 44);
		frame.getContentPane().add(textNombreaBuscar);
		
		JLabel lblTextoNombreaBuscar = new JLabel("Nombre a buscar:");
		lblTextoNombreaBuscar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTextoNombreaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoNombreaBuscar.setBounds(471, 136, 183, 36);
		frame.getContentPane().add(lblTextoNombreaBuscar);
		
		JLabel lblTextoIDaBuscar = new JLabel("ID a buscar:");
		lblTextoIDaBuscar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTextoIDaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoIDaBuscar.setBounds(510, 371, 135, 36);
		frame.getContentPane().add(lblTextoIDaBuscar);
		
		JButton btnBuscarPorID = new JButton("Buscar");
		btnBuscarPorID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnBuscarPorID.setBackground(Color.YELLOW);
		btnBuscarPorID.setBounds(585, 446, 150, 42);
		frame.getContentPane().add(btnBuscarPorID);
		
		JLabel lblTextoID = new JLabel("ID:");
		lblTextoID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoID.setBounds(43, 454, 135, 36);
		frame.getContentPane().add(lblTextoID);
		
		textDield_IDCliente = new JTextField();
		textDield_IDCliente.setEditable(false);
		textDield_IDCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDield_IDCliente.setColumns(10);
		textDield_IDCliente.setBackground(Color.GRAY);
		textDield_IDCliente.setBounds(150, 454, 307, 36);
		frame.getContentPane().add(textDield_IDCliente);
		
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
		
		TextArea textArea_ClientesBuscados = new TextArea();
		textArea_ClientesBuscados.setFont(new Font("Cooper Black", Font.PLAIN, 16));
		textArea_ClientesBuscados.setBackground(Color.LIGHT_GRAY);
		textArea_ClientesBuscados.setEditable(false);
		textArea_ClientesBuscados.setBounds(823, 72, 577, 416);
		frame.getContentPane().add(textArea_ClientesBuscados);
		
		JButton btnBuscarTodosClientes = new JButton("Buscar Todos");
		btnBuscarTodosClientes.setBackground(Color.CYAN);
		btnBuscarTodosClientes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBuscarTodosClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_ClientesBuscados.setText(controlBuscarCliente.BuscarTODOS());
			}
		});
		btnBuscarTodosClientes.setBounds(1022, 525, 185, 52);
		frame.getContentPane().add(btnBuscarTodosClientes);
		
		btnBuscarPorID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Nombre.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"Nombre"));
				textField_Apellidos.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"Apellidos"));
				textField_Email.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"Email"));
				textField_Teléfono.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"Teléfono"));
				textField_Dirección.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"Dirección"));
				textPanel_Notas.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"Notas"));
				textDield_IDCliente.setText(controlBuscarCliente.BuscarPorIDYCampo(textIDaBuscar.getText(),"IDCliente"));
				textIDaBuscar.setText("");
				txtSiDesconocesEl.setText("[Cliente buscado por ID]");
				

			}
		});

	}
	}


