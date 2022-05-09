package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class RegistrarCliente extends JFrame {

	private JPanel contentPane;
	public JButton btnRegistrarCliente;
	public JButton btnVolver;
	public JButton btnLimpiar;
	public JTextField txtPrimerApellido;
	public JTextField txtSegundoApellido;
	public JTextField txtNombre;
	public JTextField txtIdentificacion;
	public JTextField txtFechaNacimiento;
	public JTextField txtNumeroTelefonico;
	public JTextField txtCorreoElectronico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarCliente frame = new RegistrarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 11, 514, 333);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnRegistrarCliente = new JButton("Registrar Cliente");
		btnRegistrarCliente.setBounds(29, 288, 146, 23);
		panel.add(btnRegistrarCliente);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(0, 11, 105, 23);
		panel.add(btnVolver);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(358, 288, 146, 23);
		panel.add(btnLimpiar);
		
		txtPrimerApellido = new JTextField();
		txtPrimerApellido.setBounds(220, 36, 146, 23);
		panel.add(txtPrimerApellido);
		txtPrimerApellido.setColumns(10);
		
		txtSegundoApellido = new JTextField();
		txtSegundoApellido.setColumns(10);
		txtSegundoApellido.setBounds(220, 70, 146, 23);
		panel.add(txtSegundoApellido);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(220, 108, 146, 23);
		panel.add(txtNombre);
		
		txtIdentificacion = new JTextField();
		txtIdentificacion.setColumns(10);
		txtIdentificacion.setBounds(220, 142, 146, 23);
		panel.add(txtIdentificacion);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(220, 182, 146, 23);
		panel.add(txtFechaNacimiento);
		
		txtNumeroTelefonico = new JTextField();
		txtNumeroTelefonico.setColumns(10);
		txtNumeroTelefonico.setBounds(220, 216, 146, 23);
		panel.add(txtNumeroTelefonico);
		
		txtCorreoElectronico = new JTextField();
		txtCorreoElectronico.setColumns(10);
		txtCorreoElectronico.setBounds(220, 254, 146, 23);
		panel.add(txtCorreoElectronico);
	}
	public JButton getBtnRegistrarCliente() {
		return btnRegistrarCliente;
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
	public JTextField getTxtPrimerApellido() {
		return txtPrimerApellido;
	}
}
