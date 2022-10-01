package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3 frame = new ventana3();
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
	public ventana3() {
		setTitle("Buscar funcionario\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(30);
		textField.setBounds(36, 38, 246, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Escoger opción");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(67, 67, 84, 14);
		contentPane.add(lblNewLabel);
		
		JButton boton1 = new JButton("Aceptar");
		boton1.setBounds(156, 63, 91, 23);
		contentPane.add(boton1);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(71, 11, 176, 22);
		contentPane.add(titulo);
		
		JLabel lblNewLabel_1 = new JLabel("Opcion 1 : Buscar por nombre y ministerio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 97, 246, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Opcion 2 : Buscar por rut y ministerio");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 133, 261, 49);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Opcion 0 : Para salir de este menu");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 172, 293, 49);
		contentPane.add(lblNewLabel_1_2);
	}

}
