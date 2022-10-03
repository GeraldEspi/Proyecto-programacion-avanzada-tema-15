package vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;
import clases.Funcionario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ventana3_1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2450402251351263908L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
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
		textField_1.setBounds(20, 98, 345, 20);
		contentPane.add(textField_1);
		
		lblNewLabel = new JLabel("Ingrese el nombre del funcionario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(20, 59, 316, 49);
		contentPane.add(lblNewLabel);
		
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(20, 159, 91, 23);
		contentPane.add(aceptar);
		
		salir = new JButton("Salir\r\n");
		salir.setBounds(274, 159, 91, 23);
		contentPane.add(salir);
		aceptar.addActionListener(this);salir.addActionListener(this);
	
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(aceptar == e.getSource())
		{
			String ministerio = textField.getText();
			String nombre = textField_1.getText();
			
			Funcionario funcio = coord.buscarNombre(ministerio, nombre);
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
