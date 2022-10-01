package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ventana3_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JButton boton1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3_1 frame = new ventana3_1();
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
	public ventana3_1() {
		setTitle("Buscar funcionario por nombre y ministerio\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 47, 345, 20);
		textField.setColumns(30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el ministerio al que pertenece la persona");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 11, 316, 49);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(30);
		textField_1.setBounds(20, 119, 345, 20);
		contentPane.add(textField_1);
		
		lblNewLabel = new JLabel("Ingrese el nombre del funcionario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(20, 83, 316, 49);
		contentPane.add(lblNewLabel);
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(101, 159, 91, 23);
		contentPane.add(boton1);
	}

}
