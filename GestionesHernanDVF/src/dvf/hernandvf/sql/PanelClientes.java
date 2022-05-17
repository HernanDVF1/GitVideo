package dvf.hernandvf.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class PanelClientes {

	private JFrame frame;
	PanelMenú panelMenú = new PanelMenú();
	PanelAñadirClientes panelAñadirClientes = new PanelAñadirClientes();
	PanelBuscarClientes panelBuscarClientes;
	PanelEliminarCliente panelEliminarCliente;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelClientes window = new PanelClientes();
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
	public PanelClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon imagenReducida = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Herna\\\\eclipse-workspace1\\\\GestionesHernanDVF\\\\src\\\\dvf\\\\hernandvf\\\\img\\\\Clientes.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon imagenReducida1 = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Herna\\\\eclipse-workspace1\\\\GestionesHernanDVF\\\\src\\\\dvf\\\\hernandvf\\\\img\\\\icon-panelClientes-eliminar.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon imagenReducida2 = new ImageIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\Herna\\\\\\\\eclipse-workspace1\\\\\\\\GestionesHernanDVF\\\\\\\\src\\\\\\\\dvf\\\\\\\\hernandvf\\\\\\\\img\\\\\\\\icon-panelClientes-Consultar.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon imagenReducida3 = new ImageIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\Herna\\\\\\\\eclipse-workspace1\\\\\\\\GestionesHernanDVF\\\\\\\\src\\\\\\\\dvf\\\\\\\\hernandvf\\\\\\\\img\\\\\\\\icon-panelClientes-Añadir.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 776, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTituloClientes = new JLabel("Clientes");
		lblTituloClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloClientes.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblTituloClientes.setBounds(34, 0, 704, 73);
		frame.getContentPane().add(lblTituloClientes);
		
		JButton btnNuevoCliente = new JButton("A\u00F1adir Cliente");
		btnNuevoCliente.setBackground(Color.GREEN);
		btnNuevoCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNuevoCliente.setBounds(34, 283, 201, 56);
		btnNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				panelAñadirClientes.main(null);
			}
		});
		frame.getContentPane().add(btnNuevoCliente);
		
		JButton btnConsultarClientes = new JButton("Consultar Cliente");
		btnConsultarClientes.setBackground(Color.ORANGE);
		btnConsultarClientes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConsultarClientes.setBounds(278, 283, 201, 56);
		frame.getContentPane().add(btnConsultarClientes);
		btnConsultarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					frame.setVisible(false);
					panelBuscarClientes.main(null);
			}
		});
		
		JButton btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.setBackground(Color.MAGENTA);
		btnEliminarCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEliminarCliente.setBounds(518, 283, 201, 56);
		frame.getContentPane().add(btnEliminarCliente);
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					frame.setVisible(false);
					panelEliminarCliente.main(null);
			}
		});
		JButton btnVolverMenu = new JButton("Volver al Men\u00FA");
		btnVolverMenu.setBackground(Color.RED);
		btnVolverMenu.setBounds(10, 403, 181, 29);
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					frame.setVisible(false);
					panelMenú.main(null);
			}
		});
		frame.getContentPane().add(btnVolverMenu);
		
		JLabel lblFotoClientes = new JLabel("");
		lblFotoClientes.setIcon(imagenReducida);
		lblFotoClientes.setBounds(10, 0, 168, 140);
		frame.getContentPane().add(lblFotoClientes);
		
		JLabel lblFotoEliminar = new JLabel("");
		lblFotoEliminar.setIcon(imagenReducida1);
		lblFotoEliminar.setBounds(559, 168, 123, 110);
		frame.getContentPane().add(lblFotoEliminar);
		
		JLabel lblFotoConsultar = new JLabel("");
		lblFotoConsultar.setIcon(imagenReducida2);
		lblFotoConsultar.setBounds(328, 162, 123, 110);
		frame.getContentPane().add(lblFotoConsultar);
		
		JLabel lblFotoAñadir = new JLabel("");
		lblFotoAñadir.setIcon(imagenReducida3);
		lblFotoAñadir.setBounds(68, 162, 123, 110);
		frame.getContentPane().add(lblFotoAñadir);
	}
}
