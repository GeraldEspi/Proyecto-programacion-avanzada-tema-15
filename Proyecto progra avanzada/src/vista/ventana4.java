package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ventana4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana4 frame = new ventana4();
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
	public ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(146, 11, 176, 22);
		contentPane.add(titulo);
		
		JButton boton1 = new JButton("Opcion 1 : Listar con rango entre dos numero que ingrese");
		boton1.setBounds(65, 71, 325, 23);
		contentPane.add(boton1);
		
		JButton btnOpcion = new JButton("Opcion 2 : Listar con rango de 0 al que ingrese");
		btnOpcion.setBounds(65, 106, 325, 23);
		contentPane.add(btnOpcion);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(120, 172, 202, 23);
		contentPane.add(btnSalir);
	}
}
