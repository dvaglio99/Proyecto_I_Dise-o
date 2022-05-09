package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MenuOpciones extends JFrame {

	private JPanel contentPane;
	public JButton btnRegistrarCliente;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOpciones frame = new MenuOpciones();
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
	public MenuOpciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Menu de Opciones");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(144, 11, 146, 22);
		contentPane.add(lblTitulo);
		
		btnRegistrarCliente = new JButton("Registrar Cliente");
		btnRegistrarCliente.setBounds(10, 66, 146, 23);
		contentPane.add(btnRegistrarCliente);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 227, 103, 23);
		contentPane.add(btnSalir);
	}
	public JButton getBtnRegistrarCliente() {
		return btnRegistrarCliente;
	}
}
