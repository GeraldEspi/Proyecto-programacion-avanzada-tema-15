package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Gobierno;
import clases.Ministerio;
import clases.Coordinador;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ventana2 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnOp1, btnOp2,btnOp3,Salir;
	private Coordinador coord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 frame = new ventana2();
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
	public ventana2() {
		setTitle("Listar Ministerios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(10, 42, 176, 22);
		contentPane.add(titulo);
		
		 btnOp1 = new JButton("Opcion 1 : Listar Ministerios Disponibles");
		btnOp1.setBounds(10, 125, 280, 23);
		contentPane.add(btnOp1); btnOp1.addActionListener(this);
		
		 btnOp2 = new JButton("Opcion 2 : Listar Todos Funcionarios");
		btnOp2.setBounds(10, 161, 280, 23);
		contentPane.add(btnOp2); btnOp2.addActionListener(this);
		
		 btnOp3 = new JButton("Opcion 3 : Listar Funcionarios de un ministerio");
		btnOp3.setBounds(10, 200, 280, 23);
		contentPane.add(btnOp3);btnOp3.addActionListener(this);
		
		 Salir = new JButton("Salir");
		Salir.setBounds(10, 277, 84, 23);
		contentPane.add(Salir); Salir.addActionListener(this);
		
		JLabel lblQuDeseaListar = new JLabel("Qué desea listar");
		lblQuDeseaListar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuDeseaListar.setBounds(10, 64, 176, 22);
		contentPane.add(lblQuDeseaListar);
		
		
		btnOp1.addActionListener(this);
		btnOp2.addActionListener(this);
		btnOp3.addActionListener(this);
		Salir.addActionListener(this);
	}
	
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(btnOp1 == e.getSource())
		{
			VentanaTexto vt = coord.getVT();
			vt.MostrarListaMinisterios();
			vt.setVisible(true);

		}
		if(btnOp2 == e.getSource())
		{
			VentanaTexto vt = coord.getVT();
			vt.MostrarListaTodosFuncio();
			vt.setVisible(true);
		}
		if(btnOp3 == e.getSource())
		{
			//leer mini desde la ventana
		}
		if(Salir == e.getSource())
		{
			this.setVisible(false);
			coord.back();
		}	
	}
}
