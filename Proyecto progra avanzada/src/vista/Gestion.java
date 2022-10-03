package vista;

import java.awt.EventQueue;


// Ventana principal.

// Estrictura GENERAL de todas las ventanas .

// Primero las variables globales.
// Constructor de la ventana.
// Declaracion de coordinador para establecer que se usarán el mismo Gobierno y por ende mismas variables.
// La implementación de ActionListener que ejecuta las acciones de los botones.


// Dicha estructura se comparte en todas las ventanas.

// Solo se exime de esta regla la ventana VentanaTexto que contiene una sección donde almacena varios métodos que le permiten funcionar correctamente.

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import clases.Coordinador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class Gestion extends JFrame implements ActionListener 
{
	
	// Globales---------------------------------------------------
	private JPanel contentPane;
	private final JLabel titulo = new JLabel("Escoger una opción");
	private JPanel panel;
	private JButton btnOpcion_3;
	private JButton btnOpcion_4;
	private JButton btnOpcion_Salir;
	private JButton btnOpcion_2;
	private JButton btnOpcion_1;
	private Coordinador coord;
	// ---------------------------------------------------
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion frame = new Gestion();
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
	
	// Constructuor---------------------------------------------------
	public Gestion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("Gestión Ministerial");
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		titulo.setBounds(130, 30, 176, 22);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titulo);
		
		panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(32, 63, 368, 183);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnOpcion_1 = new JButton("Opcion 1 : Agregar Funcionario");
		btnOpcion_1.setBounds(10, 11, 348, 23);
		panel.add(btnOpcion_1);
		btnOpcion_1.addActionListener(this);
		
		btnOpcion_2 = new JButton("Opcion 2 : Listar\r\n");
		btnOpcion_2.setBounds(10, 45, 348, 23);
		panel.add(btnOpcion_2);
		btnOpcion_2.addActionListener(this);
		
		btnOpcion_3 = new JButton("Opcion 3 : Buscar Funcionario\r\n");
		btnOpcion_3.setBounds(10, 78, 348, 23);
		panel.add(btnOpcion_3);
		btnOpcion_3.addActionListener(this);
		
		btnOpcion_4 = new JButton("Opcion 4 : Listar Funcionarios en un rango de sueldo");
		btnOpcion_4.setBounds(10, 112, 348, 23);
		panel.add(btnOpcion_4);
		btnOpcion_4.addActionListener(this);
		
		btnOpcion_Salir = new JButton("Salir\r\n");
		btnOpcion_Salir.setBounds(83, 146, 210, 23);
		panel.add(btnOpcion_Salir);
		btnOpcion_Salir.addActionListener(this);
	}
	//---------------------------------------------------

	public void setCoord(Coordinador coord) 
	{
		this.coord = coord;
	}
	//---------------------------------------------------
	
	// Acciones Botones----------------------------------
	public void actionPerformed(ActionEvent e)
	{
		
		if(btnOpcion_1 == e.getSource()) 
		{
			this.setVisible(false);  
			coord.visible1();

		}
		if(btnOpcion_2 == e.getSource()) 
		{;
			this.setVisible(false);
			coord.visible2();
		}
		if(btnOpcion_3 == e.getSource()) 
		{
			this.setVisible(false);
			coord.visible3();
		}
		if(btnOpcion_4 == e.getSource()) 
		{
			
			this.setVisible(false);
			coord.visible4();
		}
		if(btnOpcion_Salir == e.getSource()) 
		{
			this.setVisible(false);
			try 
			{
				coord.guardarDatos();
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}
	
	//---------------------------------------------------
	
}

