package dvf.hernandvf.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelMenú {

	private JFrame frame;
	PanelClientes panelClientes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelMenú window = new PanelMenú();
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
	public PanelMenú() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon imagenReducida = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Herna\\\\eclipse-workspace1\\\\GestionesHernanDVF\\\\src\\\\dvf\\\\hernandvf\\\\img\\\\Clientes.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon imagenReducida1 = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Herna\\\\eclipse-workspace1\\\\GestionesHernanDVF\\\\src\\\\dvf\\\\hernandvf\\\\img\\\\icon-panelMenu-Productos.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon imagenReducida2 = new ImageIcon(new ImageIcon("C:\\\\Users\\\\Herna\\\\eclipse-workspace1\\\\GestionesHernanDVF\\\\src\\\\dvf\\\\hernandvf\\\\img\\\\icon-panelMenu-Citas.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 541, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 447, 137, 37);
		btnSalir.setBackground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		
		JLabel lblTitulo = new JLabel("Gesti\u00F3n HernanDVF");
		lblTitulo.setBounds(21, 11, 457, 61);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(605, 247, 0, 0);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnSalir);
		frame.getContentPane().add(lblTitulo);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(186, 181, 158, 183);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblFotoProductos = new JLabel("");
		GridBagConstraints gbc_lblFotoProductos = new GridBagConstraints();
		gbc_lblFotoProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoProductos.gridx = 1;
		gbc_lblFotoProductos.gridy = 0;
		panel.add(lblFotoProductos, gbc_lblFotoProductos);
		lblFotoProductos.setIcon(imagenReducida1);
		
		JLabel lblProductos = new JLabel("Productos");
		GridBagConstraints gbc_lblProductos = new GridBagConstraints();
		gbc_lblProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lblProductos.gridx = 1;
		gbc_lblProductos.gridy = 1;
		panel.add(lblProductos, gbc_lblProductos);
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnProductos = new JButton("Acceder");
		GridBagConstraints gbc_btnProductos = new GridBagConstraints();
		gbc_btnProductos.insets = new Insets(0, 0, 0, 5);
		gbc_btnProductos.gridx = 1;
		gbc_btnProductos.gridy = 2;
		panel.add(btnProductos, gbc_btnProductos);
		btnProductos.setBackground(Color.YELLOW);
		btnProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(21, 181, 165, 183);
		frame.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblFotoCliente = new JLabel("");
		GridBagConstraints gbc_lblFotoCliente = new GridBagConstraints();
		gbc_lblFotoCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCliente.gridx = 1;
		gbc_lblFotoCliente.gridy = 0;
		panel_1.add(lblFotoCliente, gbc_lblFotoCliente);
		lblFotoCliente.setIcon(imagenReducida);
		
		JLabel lblClientes = new JLabel("Clientes");
		GridBagConstraints gbc_lblClientes = new GridBagConstraints();
		gbc_lblClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientes.gridx = 1;
		gbc_lblClientes.gridy = 1;
		panel_1.add(lblClientes, gbc_lblClientes);
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnClientes = new JButton("Acceder");
		GridBagConstraints gbc_btnClientes = new GridBagConstraints();
		gbc_btnClientes.insets = new Insets(0, 0, 0, 5);
		gbc_btnClientes.gridx = 1;
		gbc_btnClientes.gridy = 2;
		panel_1.add(btnClientes, gbc_btnClientes);
		btnClientes.setBackground(Color.PINK);
		btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(344, 181, 165, 183);
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblFotoCliente_2 = new JLabel("");
		GridBagConstraints gbc_lblFotoCliente_2 = new GridBagConstraints();
		gbc_lblFotoCliente_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCliente_2.gridx = 1;
		gbc_lblFotoCliente_2.gridy = 0;
		panel_2.add(lblFotoCliente_2, gbc_lblFotoCliente_2);
		lblFotoCliente_2.setIcon(imagenReducida2);
		
		JLabel lblCalendarioCitas = new JLabel("Calendario Citas");
		GridBagConstraints gbc_lblCalendarioCitas = new GridBagConstraints();
		gbc_lblCalendarioCitas.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalendarioCitas.gridx = 1;
		gbc_lblCalendarioCitas.gridy = 1;
		panel_2.add(lblCalendarioCitas, gbc_lblCalendarioCitas);
		lblCalendarioCitas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalendarioCitas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnCitas = new JButton("Acceder");
		GridBagConstraints gbc_btnCitas = new GridBagConstraints();
		gbc_btnCitas.insets = new Insets(0, 0, 5, 5);
		gbc_btnCitas.gridx = 1;
		gbc_btnCitas.gridy = 2;
		panel_2.add(btnCitas, gbc_btnCitas);
		btnCitas.setBackground(Color.MAGENTA);
		btnCitas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				panelClientes.main(null);
			}
		});
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
