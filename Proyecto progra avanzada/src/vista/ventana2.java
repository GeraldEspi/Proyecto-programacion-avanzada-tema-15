package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class ventana2 extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 629, 389);
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(313, 11, 280, 328);
		contentPane.add(panel);
		
		JButton btnOpcin_3 = new JButton("Opcion 1 : Listar Ministerios Disponibles");
		btnOpcin_3.setBounds(10, 125, 280, 23);
		contentPane.add(btnOpcin_3);
		
		JButton btnOpcin_3_1 = new JButton("Opcion 2 : Listar Todos Funcionarios");
		btnOpcin_3_1.setBounds(10, 161, 280, 23);
		contentPane.add(btnOpcin_3_1);
		
		JButton btnOpcin_3_1_1 = new JButton("Opcion 3 : Listar Funcionarios de un ministerio");
		btnOpcin_3_1_1.setBounds(10, 200, 280, 23);
		contentPane.add(btnOpcin_3_1_1);
		
		JButton btnOpcin_3_1_1_1 = new JButton("Opcion 4 : Listar Funcionarios en un rango de sueldo");
		btnOpcin_3_1_1_1.setBounds(10, 239, 280, 23);
		contentPane.add(btnOpcin_3_1_1_1);
		
		JButton btnOpcin_3_1_1_1_1 = new JButton("Salir");
		btnOpcin_3_1_1_1_1.setBounds(10, 277, 84, 23);
		contentPane.add(btnOpcin_3_1_1_1_1);
		
		JLabel lblQuDeseaListar = new JLabel("Qué desea listar");
		lblQuDeseaListar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuDeseaListar.setBounds(10, 64, 176, 22);
		contentPane.add(lblQuDeseaListar);
	}

}
