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

@SuppressWarnings("serial")
public class Gestion extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton boton1;
	private JTextField Campo1;
	private final JLabel titulo = new JLabel("Escoger una opción");
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1;

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
		setBounds(100, 100, 330, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("Gestión Ministerial");
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		titulo.setBounds(65, 10, 176, 22);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titulo);
		
		Campo1 = new JTextField();
		Campo1.setBounds(30, 37, 246, 20);
		contentPane.add(Campo1);
		Campo1.setColumns(30);
		
		JLabel lblNewLabel = new JLabel("Escoger opción");
		lblNewLabel.setBounds(61, 66, 84, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(150, 62, 91, 23);
		contentPane.add(boton1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Opcion 2 : Listar");
		lblNewLabel_1_1.setBounds(10, 137, 171, 49);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("Opcion 3 : Buscar Funcionario");
		lblNewLabel_1_2.setBounds(10, 176, 171, 49);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_1_3 = new JLabel("Opcion 4 : Listar Funcionarios en un rango de sueldo");
		lblNewLabel_1_3.setBounds(10, 215, 324, 49);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1_3);
		
		lblNewLabel_1_4 = new JLabel("Opcion 0: Salir\r\n");
		lblNewLabel_1_4.setBounds(10, 253, 324, 49);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1_4);
		
		lblNewLabel_1 = new JLabel("Opcion 1 : Agregar Funcionario");
		lblNewLabel_1.setBounds(10, 101, 171, 49);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		boton1.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(boton1 == e.getSource()) {
			
			int num1 = (Integer.parseInt(Campo1.getText()));
			this.setVisible(false);
		}
		
	}
	
}
