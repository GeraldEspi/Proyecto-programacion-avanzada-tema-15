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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(146, 11, 176, 22);
		contentPane.add(titulo);
		
		 Op1 = new JButton("Opcion 1 : Listar con rango de numeros ingresados");
		Op1.setBounds(65, 71, 325, 23);
		contentPane.add(Op1);
		
		 Op2 = new JButton("Opcion 2 : Listar con rango de 0 al que ingrese");
		Op2.setBounds(65, 106, 325, 23);
		contentPane.add(Op2);
		
		 btnSalir = new JButton("Salir");
		btnSalir.setBounds(120, 172, 202, 23);
		contentPane.add(btnSalir);
		
		Op1.addActionListener(this);
		Op2.addActionListener(this);
		btnSalir.addActionListener(this);
		
		coord = new Coordinador();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(Op1 == e.getSource())
		{
			ventana4_1 v = new ventana4_1();
			this.setVisible(false);
			v.setVisible(true);
			
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
			System.exit(0);
		}
		
		
	}
}
