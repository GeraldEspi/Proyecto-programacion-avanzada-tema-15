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
	private JTextField textField;

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

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(131, 11, 176, 22);
		contentPane.add(titulo);
		
		JLabel lblNewLabel = new JLabel("Escoger opción");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(127, 67, 84, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(30);
		textField.setBounds(96, 38, 246, 20);
		contentPane.add(textField);
		
		JButton boton1 = new JButton("Aceptar");
		boton1.setBounds(216, 63, 91, 23);
		contentPane.add(boton1);
		
		JLabel lblNewLabel_1 = new JLabel("Opcion 1 : Listar con rango entre dos numero que ingrese");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(63, 104, 349, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Opcion 2 : Listar con rango de 0 al que ingrese");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(63, 140, 327, 49);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Opcion 0 : Para salir");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(63, 179, 171, 49);
		contentPane.add(lblNewLabel_1_2);
	}

}
