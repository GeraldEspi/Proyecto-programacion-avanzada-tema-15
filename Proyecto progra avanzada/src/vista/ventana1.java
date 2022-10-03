package vista;

import java.io.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ventana1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private JPanel contentPane; JButton aceptar;
	private JTextField textField;
	private Coordinador coord;
	private JButton salir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		setTitle("Agregar funcionario\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(90, 69, 91, 23);
		
		contentPane.add(aceptar);
		
		
		textField = new JTextField();
		textField.setColumns(30);
		textField.setBounds(90, 38, 246, 20);
		contentPane.add(textField);
		
		JLabel lblAgregeUnFuncionario = new JLabel("Ingrese el funcionario\r\n a agregar");
		lblAgregeUnFuncionario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAgregeUnFuncionario.setBounds(67, 5, 346, 22);
		contentPane.add(lblAgregeUnFuncionario);
		
		JLabel lblIngreseLosDatos = new JLabel("Ingrese los datos del funcionario con el formato");
		lblIngreseLosDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseLosDatos.setBounds(78, 117, 368, 14);
		contentPane.add(lblIngreseLosDatos);
		
		JLabel lblClavefuncionarionombremailministerioprofesionrutsueldoEnUtm = new JLabel("  (  Nombre,mail,ministerio,profesion,rut,sueldo en utm  )");
		lblClavefuncionarionombremailministerioprofesionrutsueldoEnUtm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClavefuncionarionombremailministerioprofesionrutsueldoEnUtm.setBounds(24, 142, 400, 14);
		contentPane.add(lblClavefuncionarionombremailministerioprofesionrutsueldoEnUtm);
		
		salir = new JButton("Salir\r\n");
		salir.setBounds(245, 69, 91, 23);
		contentPane.add(salir);
		
		
		aceptar.addActionListener(this);
		salir.addActionListener(this);
		
	}
	
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(aceptar == e.getSource()) {
			String funcionario = textField.getText();
		
			try 
			{
				coord.agregarFuncio(funcionario);
				JOptionPane.showMessageDialog(null, "Agregado");
			}
			catch(Exception j)
			{
				JOptionPane.showMessageDialog(null, "No se a podido agregar el funcionario");
			}
			finally 
			{
				this.setVisible(false);
				coord.back();
			}
			
			
		}
		
		if(salir == e.getSource())
		{
			this.setVisible(false);
			coord.back();
		}
	}
	
	
}
