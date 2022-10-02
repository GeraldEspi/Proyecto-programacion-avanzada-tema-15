package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana3_personaencontrada extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 371, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("Salir\r\n");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton1.setBounds(130, 271, 91, 23);
		contentPane.add(boton1);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(100, 238, 176, 22);
		contentPane.add(titulo);
		
		JButton btnOpcion = new JButton("Opcion 1 : Modificar el nombre");
		btnOpcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOpcion.setBounds(70, 41, 222, 23);
		contentPane.add(btnOpcion);
		
		JButton btnOpcion_2 = new JButton("Opcion 2 : Modificar el mail");
		btnOpcion_2.setBounds(70, 75, 222, 23);
		contentPane.add(btnOpcion_2);
		
		JButton btnOpcion_2_1 = new JButton("Opcion 3 : Modificar el ministerio");
		btnOpcion_2_1.setBounds(70, 105, 222, 23);
		contentPane.add(btnOpcion_2_1);
		
		JButton btnOpcion_2_1_1 = new JButton("Opcion 4 : Modificar la profesion");
		btnOpcion_2_1_1.setBounds(70, 139, 222, 23);
		contentPane.add(btnOpcion_2_1_1);
		
		JButton btnOpcion_2_1_1_1 = new JButton("Opcion 5 : Modificar el rut");
		btnOpcion_2_1_1_1.setBounds(70, 171, 222, 23);
		contentPane.add(btnOpcion_2_1_1_1);
		
		JButton btnOpcion_2_1_1_1_1 = new JButton("Opcion 6 : Modificar el sueldo ");
		btnOpcion_2_1_1_1_1.setBounds(70, 205, 222, 23);
		contentPane.add(btnOpcion_2_1_1_1_1);
	}

}
