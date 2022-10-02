package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class Gestion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final JLabel titulo = new JLabel("Escoger una opción");
	private JPanel panel;
	private JButton btnOpcin_3;
	private JButton btnOpcin;
	private JButton btnOpcion;
	private JButton btnOpcion_2;
	private JButton btnOpcion_1;

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
		
		btnOpcin_3 = new JButton("Opcion 1 : Agregar Funcionario");
		btnOpcin_3.setBounds(10, 11, 348, 23);
		panel.add(btnOpcin_3);
		
		btnOpcin = new JButton("Opcion 2 : Listar\r\n");
		btnOpcin.setBounds(10, 45, 348, 23);
		panel.add(btnOpcin);
		
		btnOpcion = new JButton("Opcion 3 : Buscar Funcionario\r\n");
		btnOpcion.setBounds(10, 78, 348, 23);
		panel.add(btnOpcion);
		
		btnOpcion_2 = new JButton("Opcion 4 : Listar Funcionarios en un rango de sueldo");
		btnOpcion_2.setBounds(10, 112, 348, 23);
		panel.add(btnOpcion_2);
		
		btnOpcion_1 = new JButton("Salir\r\n");
		btnOpcion_1.setBounds(83, 146, 210, 23);
		panel.add(btnOpcion_1);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(boton1 == e.getSource()) {
			
			int num1 = (Integer.parseInt(Campo1.getText()));
			
			ventana1 opc1 = new ventana1();
			ventana2 opc2 = new ventana2();
			
			this.setVisible(false);
			opc1.setVisible(true);
			opc2.setVisible(true);
		
	}
	
}
}
