package dvf.hernandvf.sql;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class PanelEliminarCliente {
	PanelMenú panelMenú = new PanelMenú();
	PanelClientes panelClientes = new PanelClientes();
	ControlEliminarCliente controlEliminarCliente = new ControlEliminarCliente();
	private JTextField textField_ID;
	private JTextField txtSiDesconocesEl;
	private JFrame frame;
	private JTextField textField_Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelEliminarCliente window = new PanelEliminarCliente();
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
	public PanelEliminarCliente() {
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
		frame.setBounds(100, 100, 499, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Eliminar Clientes");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTitulo.setBounds(43, 32, 494, 76);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblTextoID = new JLabel("ID:");
		lblTextoID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoID.setBounds(43, 136, 135, 36);
		frame.getContentPane().add(lblTextoID);
		
		textField_ID = new JTextField();
		textField_ID.setBackground(Color.LIGHT_GRAY);
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_ID.setBounds(150, 136, 307, 36);
		frame.getContentPane().add(textField_ID);
		textField_ID.setColumns(10);
		


		
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
		
		JButton btnEliminarPorNombre = new JButton("Eliminar");
		btnEliminarPorNombre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnEliminarPorNombre.setBackground(Color.YELLOW);
		btnEliminarPorNombre.setBounds(150, 354, 150, 42);
		frame.getContentPane().add(btnEliminarPorNombre);
		
		txtSiDesconocesEl = new JTextField();
		txtSiDesconocesEl.setEditable(false);
		txtSiDesconocesEl.setText("[Mejor eliminar por ID] Busca antes en el buscador de Clientes");
		txtSiDesconocesEl.setHorizontalAlignment(SwingConstants.CENTER);
		txtSiDesconocesEl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSiDesconocesEl.setForeground(Color.WHITE);
		txtSiDesconocesEl.setBackground(Color.BLACK);
		txtSiDesconocesEl.setBounds(10, 439, 456, 64);
		frame.getContentPane().add(txtSiDesconocesEl);
		txtSiDesconocesEl.setColumns(10);
		
		JLabel lblTextoNombre = new JLabel("Nombre:");
		lblTextoNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTextoNombre.setBounds(43, 307, 135, 36);
		frame.getContentPane().add(lblTextoNombre);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_Nombre.setColumns(10);
		textField_Nombre.setBackground(Color.LIGHT_GRAY);
		textField_Nombre.setBounds(150, 308, 307, 36);
		frame.getContentPane().add(textField_Nombre);


		btnEliminarPorNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlEliminarCliente.EliminarPorNombreYCampo(textField_Nombre.getText());
				txtSiDesconocesEl.setText("[Cliente Eliminado]");
			}
		});
		JButton btnEliminarPorID = new JButton("Eliminar");
		btnEliminarPorID.setBackground(Color.YELLOW);
		btnEliminarPorID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnEliminarPorID.setBounds(150, 183, 150, 42);
		btnEliminarPorID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlEliminarCliente.EliminarPorIDYCampo(textField_ID.getText());
				txtSiDesconocesEl.setText("[Cliente Eliminado]");
			}
		});
		frame.getContentPane().add(btnEliminarPorID);
	}
	}


