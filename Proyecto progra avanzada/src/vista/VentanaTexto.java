package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;
import clases.Gobierno;
import clases.Ministerio;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class VentanaTexto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private Coordinador coord;
	

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
		setBounds(100, 100, 450, 334);
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
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setBounds(10, 11, 176, 22);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titulo);
		
		coord = new Coordinador();
	}
	
	public void setGobierno(Gobierno gobiernoAct) {
		
	}

	public void MostrarListaEnArea() {
		ArrayList<Ministerio> ListaMin = miGobierno.getMinisterios();
		Ministerio minis = new Ministerio();
		String cadena = "Info\n";
		
		
		for(int j = 0; j < ListaMin.size() ; j++) 
		{
			minis = ListaMin.get(j);
			cadena += "\n---Ministerio de "+minis.getNombreMinisterio()+"---\n";
			cadena += "*Ministro: "+ minis.getMinistro()+"\n";
			cadena += "*Limite de Funcionarios: "+ minis.getLimFuncionarios()+"\n" ;
			cadena += "*Cantidad de Funcionarios: "+ minis.getFuncionariosActivos()+"\n";
			cadena += "--------------------------\n";
		}
		
		textArea.setText(cadena);
		
	}
}
