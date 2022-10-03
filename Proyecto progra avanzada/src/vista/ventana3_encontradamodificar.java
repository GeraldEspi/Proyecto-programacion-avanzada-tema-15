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
import java.io.IOException;

import javax.swing.JButton;

public class ventana3_encontradamodificar extends JFrame implements ActionListener {
	
	// Globales---------------------------------------------------
	private JPanel contentPane;
	private JTextField textField;
	JButton aceptar;
	private Coordinador coord;
	private JButton salir;

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
	// Constructuor----------------------------------------------
	public ventana3_encontradamodificar() {
		setTitle("Modificar datos de funcionario\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 35, 260, 20);
		textField.setColumns(30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese la respectiva modificación\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 11, 194, 14);
		contentPane.add(lblNewLabel_1_1);
		
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(10, 66, 91, 23);
		contentPane.add(aceptar);
		
		salir = new JButton("Salir\r\n");
		salir.setBounds(179, 66, 91, 23);
		contentPane.add(salir);
		
		aceptar.addActionListener(this);salir.addActionListener(this);
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
			Funcionario f = coord.getFuncioBusq();
			String modificacion = textField.getText();
			int opcion = coord.getModificado();
			
			switch(opcion) 
			{
				case 1 ->
				{
					f.setNombre(modificacion);
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					break;
				}
				case 2 ->
				{
					f.setMail(modificacion);
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					break;
				}
				case 3 ->
				{
					f.setMinisterio(modificacion);
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					break;
				}
				case 4 ->
				{
					f.setProfesion(modificacion);
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					break;
				}
				case 5 ->
				{
					try 
					{
						f.setRut(modificacion);
						JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					}
					catch(IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "No se a podido modificar el rut");
					}
					break;
				}
				case 6 ->
				{
					try 
					{
						f.setSueldo(modificacion);
						JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					}
					catch(IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "No se a podido modificar el sueldo");
					}
					break;
				}
			}
			
			coord.setFuncioBusq(f);
			ventana3_personaencontrada v3_p = coord.getV3_P();
			v3_p.mostrarFuncioBusq();
			this.setVisible(false);
			coord.visible3_p();
		}
		
		if(salir == e.getSource())
		{
			this.setVisible(false);
		}
			
	}
}


