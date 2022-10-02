package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Coordinador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ventana4 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton Op1, Op2, btnSalir;
	private Coordinador coord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana4 frame = new ventana4();
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
	public ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(86, 11, 176, 22);
		contentPane.add(titulo);
		
		 Op1 = new JButton("Opcion 1 : Listar con rango de numeros ingresados");
		Op1.setBounds(16, 71, 325, 23);
		contentPane.add(Op1);
		
		 Op2 = new JButton("Opcion 2 : Listar con rango de 0 al que ingrese");
		Op2.setBounds(16, 106, 325, 23);
		contentPane.add(Op2);
		
		 btnSalir = new JButton("Salir");
		btnSalir.setBounds(73, 140, 202, 23);
		contentPane.add(btnSalir);
		
		Op1.addActionListener(this);
		Op2.addActionListener(this);
		btnSalir.addActionListener(this);
		
	
	}
	
	public void setCoord(Coordinador coord)
	{
		this.coord = coord;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(Op1 == e.getSource())
		{
			
			this.setVisible(false);
			coord.visible4_1();
			
			
		}
		
		if(Op2 == e.getSource())
		{
			ventana4_2 v = new ventana4_2();
			this.setVisible(false);
			v.setVisible(true);
		}
		
		if(btnSalir == e.getSource())
		{
			
			this.setVisible(false);
			coord.back();
		}
		
		
	}
}
