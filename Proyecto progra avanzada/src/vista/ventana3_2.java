package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;
import clases.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ventana3_2 extends JFrame implements ActionListener{
	
	// Globales---------------------------------------------------
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton aceptar;
	private Coordinador coord;
	private JButton salir;

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
	
	// Constructuor----------------------------------------------
	public ventana3_2() {
		setTitle("Buscar por rut y ministerio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 98, 345, 20);
		textField.setColumns(30);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Ingrese el rut del funcionario");
		lblNewLabel.setBounds(10, 59, 316, 49);
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
		
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(10, 160, 91, 23);
		contentPane.add(aceptar);
		
		salir = new JButton("Salir");
		salir.setBounds(264, 160, 91, 23);
		contentPane.add(salir);
		
		aceptar.addActionListener(this);
		salir.addActionListener(this);
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}
	
	// Acciones Botones---------------------------------------
	public void actionPerformed(ActionEvent e) 
	{
		if(aceptar == e.getSource())
		{
			String rut = textField.getText();
			String ministerio = textField_1.getText();
			int rut1 = Integer.parseInt(rut);
			Funcionario funcio = coord.buscarNombre(ministerio, rut1);
			if(funcio == null) 
			{
				JOptionPane.showMessageDialog(null, "Funcionario ingresado no se encuentra");
				this.setVisible(false);
				coord.visible3();
			}
			else 
			{
				coord.setFuncioBusq(funcio);
				ventana3_personaencontrada v3_p = coord.getV3_P();
				v3_p.mostrarFuncioBusq();
				this.setVisible(false);
				coord.visible3_p();
			}
		}
		
		if(salir == e.getSource())
		{
			this.setVisible(false);
			coord.visible3();
		}
	}

}
