package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class ventana4_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Coordinador coord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana4_2 frame = new ventana4_2();
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
	public ventana4_2() {
		setTitle("Opcion 2 : Listar con rango de 0 al que ingrese");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el numero ");
		lblNewLabel_1.setBounds(62, 11, 274, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(62, 30, 246, 20);
		textField.setColumns(30);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(48, 61, 282, 289);
		contentPane.add(panel);
		
		coord = new Coordinador();
	}

}
