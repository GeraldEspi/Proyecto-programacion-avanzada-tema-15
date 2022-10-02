package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;

public class ventana4_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Coordinador coord;
	
	JButton Salir, Aceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana4_1 frame = new ventana4_1();
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
	public ventana4_1() {
		setTitle("Opcion 1 : Listar con rango entre dos numero que ingrese");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el numero mas pequenño del parametro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(37, 25, 315, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese el numero mas grande del parametro");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(37, 106, 275, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(30);
		textField.setBounds(37, 38, 246, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(30);
		textField_1.setBounds(37, 120, 246, 20);
		contentPane.add(textField_1);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(37, 167, 91, 23);
		contentPane.add(Aceptar);
		
		JButton Salir = new JButton("Salir\r\n");
		Salir.setBounds(192, 167, 91, 23);
		contentPane.add(Salir);
		
		
		Salir.addActionListener(this);
		Aceptar.addActionListener(this);
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(Salir == e.getSource()) 
		{
			this.setVisible(false);
		}
		
		if(Aceptar == e.getSource()) 
		{
			
		}
		
		
	}
	
	
	

}
