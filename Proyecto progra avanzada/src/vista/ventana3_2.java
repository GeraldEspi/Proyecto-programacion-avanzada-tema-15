package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ventana3_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton boton1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3_2 frame = new ventana3_2();
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
	public ventana3_2() {
		setTitle("Buscar por rut y ministerio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 119, 345, 20);
		textField.setColumns(30);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Ingrese el rut del funcionario");
		lblNewLabel.setBounds(10, 83, 316, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 47, 345, 20);
		textField_1.setColumns(30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el ministerio al que pertenece la persona");
		lblNewLabel_1.setBounds(10, 11, 316, 49);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(150, 160, 91, 23);
		contentPane.add(boton1);
	}

}