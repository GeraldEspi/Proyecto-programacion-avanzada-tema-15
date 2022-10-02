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

public class ventana3_encontradamodificar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	JButton boton1;
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
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(171, 66, 91, 23);
		contentPane.add(boton1);
		
		boton1.addActionListener(this);
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		if(boton1 == e.getSource())
		{
			Funcionario f = coord.getFuncioBusq();
			String modificacion = textField.getText();
			int opcion = coord.getModificado();
			
			switch(opcion) 
			{
				case 1 ->
				{
					f.setNombre(modificacion);
					break;
				}
				case 2 ->
				{
					f.setMail(modificacion);
					break;
				}
				case 3 ->
				{
					f.setMinisterio(modificacion);
					break;
				}
				case 4 ->
				{
					f.setProfesion(modificacion);
					break;
				}
				case 5 ->
				{
					f.setRut(modificacion);
					break;
				}
				case 6 ->
				{
					f.setSueldo(modificacion);
					break;
				}
			}
			
			coord.setFuncioBusq(f);
			ventana3_personaencontrada v3_p = coord.getV3_P();
			v3_p.mostrarFuncioBusq();
			this.setVisible(false);
			coord.visible3_p();
		}
			
	}
}


