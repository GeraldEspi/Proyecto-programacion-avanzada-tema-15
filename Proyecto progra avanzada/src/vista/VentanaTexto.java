package vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;
import clases.Gobierno;
import clases.ListaFuncionarios;
import clases.Ministerio;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaTexto extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private Coordinador coord;
	JButton Salir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTexto frame = new VentanaTexto();
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
	public VentanaTexto() {
		setTitle("Mostrar Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 239);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(192, 192, 192));
		scrollPane.setViewportView(textArea);
		
		JLabel titulo = new JLabel("Lista de datos");
		titulo.setBounds(10, 11, 176, 22);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titulo);
		
		Salir = new JButton("Salir");
		Salir.setBounds(164, 296, 89, 23);
		contentPane.add(Salir);
		
		Salir.addActionListener(this);
	
	}
	
	public void setCoord(Coordinador c)
	{
		this.coord = c;
	}

	public void MostrarListaMinisterios() {
		Gobierno gober = coord.getGober();
		Ministerio minis = new Ministerio();
		String cadena = "Info\n";
		
		for(int j = 0; j < gober.getsSize() ; j++) 
		{
			minis = gober.getsMinisterio(j);
			cadena += minis.mostrarDatos();
		}
		textArea.setText(cadena);
		
	}
	
	public void MostrarListaTodosFuncio() {
		Gobierno gober = coord.getGober();
		Ministerio minis = new Ministerio();
		String cadena = "Info\n";
		
		
		for(int j = 0; j < gober.getsSize() ; j++) 
		{
			minis = gober.getsMinisterio(j);
			cadena += minis.mostrarFuncionariosMinisterio();
		}
		textArea.setText(cadena);
		
	}
	
	public void MostrarListaMiniFuncio(String ministe) 
	{
		Gobierno gober = coord.getGober();
		Ministerio minis = new Ministerio();
		String cadena = "Info\n";
		
		minis = gober.getsMinisterio(ministe);
		cadena += minis.mostrarFuncionariosMinisterio();
		textArea.setText(cadena);
		
	}
	
	
	public void MostrarRango1(int num1, int num2)
	{
		Gobierno gober = coord.getGober();
		ListaFuncionarios lista = new ListaFuncionarios();
		String cadena = "info\n";
		
		lista = gober.listaRango(num1, num2);
		cadena += lista.mostrarFuncionarios();
		textArea.setText(cadena);
		
		
		
	}
	
	public void MostrarRango2(int num1)
	{
		
		Gobierno gober = coord.getGober();
		ListaFuncionarios lista = new ListaFuncionarios();
		String cadena = "info\n";
		
		lista = gober.listaRango(num1);
		cadena += lista.mostrarFuncionarios();
		textArea.setText(cadena);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(Salir == e.getSource())
		{
			this.setVisible(false);
			coord.back();
		}
	}
}