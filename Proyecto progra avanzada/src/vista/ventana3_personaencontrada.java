package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ventana3_personaencontrada extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3_personaencontrada frame = new ventana3_personaencontrada();
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
	public ventana3_personaencontrada() {
		setTitle("Modificar datos de funcionario encontrado\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Opcion 1 : Modificar el nombre");
		lblNewLabel_1.setBounds(106, 10, 221, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Opcion 2 : Modificar el mail");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(106, 37, 221, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Escoger opción");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(112, 273, 84, 14);
		contentPane.add(lblNewLabel);
		
		JButton boton1 = new JButton("Aceptar");
		boton1.setBounds(201, 269, 91, 23);
		contentPane.add(boton1);
		
		textField = new JTextField();
		textField.setColumns(30);
		textField.setBounds(81, 244, 246, 20);
		contentPane.add(textField);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(116, 217, 176, 22);
		contentPane.add(titulo);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Opcion 3 : Modificar el ministerio");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(106, 62, 221, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Opcion 4 : Modificar la profesion");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(106, 92, 221, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Opcion 5 : Modificar el rut");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_1.setBounds(106, 117, 221, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Opcion 6 : Modificar el sueldo ");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_1_1.setBounds(106, 142, 221, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Opcion 0 : Para salir al menu principal");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_1_1_1.setBounds(106, 173, 221, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1_1);
	}

}
