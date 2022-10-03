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
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class ventana4_2 extends JFrame implements ActionListener{
	
	// Globales---------------------------------------------------

	private JPanel contentPane;
	private JTextField textField;
	private Coordinador coord;
	private JButton Aceptar, 		Salir;

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
	// Constructuor----------------------------------------------
	public ventana4_2() {
		setTitle("Opcion 2 : Listar con rango de 0 al que ingrese");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 138);
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
		
		Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(62, 61, 91, 23);
		contentPane.add(Aceptar);
		
		Salir = new JButton("Salir");
		Salir.setBounds(217, 61, 91, 23);
		contentPane.add(Salir);
		
		Salir.addActionListener(this);
		Aceptar.addActionListener(this);
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}
	
	// Acciones Botones---------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		if(Salir == e.getSource())
		{
			this.setVisible(false);
			coord.visible4();
		}
		
		if(Aceptar == e.getSource())
		{
			int num_men = Integer.parseInt(textField.getText());
			
			VentanaTexto vt = coord.getVT();
			
			
			vt.MostrarRango2(num_men);
			this.setVisible(false);
			vt.setVisible(true);
		}
		
	}
}
