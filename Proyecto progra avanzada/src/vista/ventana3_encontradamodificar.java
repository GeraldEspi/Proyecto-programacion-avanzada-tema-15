package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ventana3_encontradamodificar extends JFrame {

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
					ventana3_encontradamodificar frame = new ventana3_encontradamodificar();
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
	public ventana3_encontradamodificar() {
		setTitle("Modificar datos de funcionario\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(104, 11, 246, 20);
		textField.setColumns(30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese la respectiva modificación\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(119, 41, 221, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton boton1 = new JButton("Aceptar");
		boton1.setBounds(171, 66, 91, 23);
		contentPane.add(boton1);
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}

}
