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
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextArea;

public class ventana3_personaencontrada extends JFrame implements ActionListener {

	private JPanel contentPane; 
	JButton btnOpcion, btnOpcion2, btnOpcion3, btnOpcion4, btnOpcion5, btnOpcion6, Salir;
	private Coordinador coord;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnOpcion7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3_personaencontrada frame = new ventana3_personaencontrada();
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
	public ventana3_personaencontrada() {
		setTitle("Modificar datos de funcionario encontrado\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Salir = new JButton("Salir\r\n");
		Salir.setBounds(128, 443, 91, 23);
		contentPane.add(Salir);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(95, 410, 176, 22);
		contentPane.add(titulo);
		
		 btnOpcion = new JButton("Opcion 1 : Modificar el nombre");
		btnOpcion.setBounds(68, 137, 222, 23);
		contentPane.add(btnOpcion);
		
		 btnOpcion2 = new JButton("Opcion 2 : Modificar el mail");
		btnOpcion2.setBounds(68, 171, 222, 23);
		contentPane.add(btnOpcion2);
		
		 btnOpcion3 = new JButton("Opcion 3 : Modificar el ministerio");
		btnOpcion3.setBounds(68, 201, 222, 23);
		contentPane.add(btnOpcion3);
		
		 btnOpcion4 = new JButton("Opcion 4 : Modificar la profesion");
		btnOpcion4.setBounds(68, 235, 222, 23);
		contentPane.add(btnOpcion4);
		
		 btnOpcion5 = new JButton("Opcion 5 : Modificar el rut");
		btnOpcion5.setBounds(68, 267, 222, 23);
		contentPane.add(btnOpcion5);
		
		 btnOpcion6 = new JButton("Opcion 6 : Modificar el sueldo ");
		btnOpcion6.setBounds(68, 301, 222, 23);
		contentPane.add(btnOpcion6);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 11, 224, 115);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(192, 192, 192));
		scrollPane.setViewportView(textArea);
		
		btnOpcion7 = new JButton("Opcion 7: Eliminar funcionario");
		btnOpcion7.setBounds(68, 335, 222, 23);
		contentPane.add(btnOpcion7);
		
		
		btnOpcion.addActionListener(this);
		btnOpcion2.addActionListener(this);
		btnOpcion3.addActionListener(this);
		btnOpcion4.addActionListener(this);
		btnOpcion5.addActionListener(this);
		btnOpcion6.addActionListener(this);
		btnOpcion7.addActionListener(this);
		Salir.addActionListener(this);
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}
	public void mostrarFuncioBusq( )
	{
		Funcionario f = coord.getFuncioBusq();
		String cadena = "Info\n";
		cadena += f.imprimirDatos();
		textArea.setText(cadena);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(btnOpcion == e.getSource())
		{
			this.setVisible(false);
			coord.visible3_e(1);
		}
		if(btnOpcion2 == e.getSource())
		{
			this.setVisible(false);
			coord.visible3_e(2);
		}
		if(btnOpcion3 == e.getSource())
		{
			this.setVisible(false);
			coord.visible3_e(3);
		}
		if(btnOpcion4 == e.getSource())
		{
			this.setVisible(false);
			coord.visible3_e(4);
		}
		if(btnOpcion5 == e.getSource())
		{
			this.setVisible(false);
			coord.visible3_e(5);
		}
		if(btnOpcion6 == e.getSource())
		{
			this.setVisible(false);
			coord.visible3_e(6);
		}
		if(btnOpcion7 == e.getSource())
		{
			this.setVisible(false);
			coord.eliminarFuncio();
			JOptionPane.showMessageDialog(null, "El funcionario ha sido eliminado");
			coord.visible3();
		}
		if(Salir == e.getSource())
		{	
			this.setVisible(false);
			coord.back();
		}
		
	}
}