package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3 frame = new ventana3();
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
	public ventana3() {
		setTitle("Buscar funcionario\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qué desea buscar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(101, 37, 142, 14);
		contentPane.add(lblNewLabel);
		
		JLabel titulo = new JLabel("Escoger una opción");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(67, 11, 176, 22);
		contentPane.add(titulo);
		
		JButton btnOpcin_3 = new JButton("Opcion 1 : Buscar por nombre y ministerio");
		btnOpcin_3.setBounds(10, 110, 280, 23);
		contentPane.add(btnOpcin_3);
		
		JButton btnOpcin_3_1 = new JButton("Opcion 2 : Buscar por rut y ministerio");
		btnOpcin_3_1.setBounds(10, 146, 280, 23);
		contentPane.add(btnOpcin_3_1);
		
		JButton btnOpcin_3_1_1 = new JButton("Salir");
		btnOpcin_3_1_1.setBounds(10, 185, 84, 23);
		contentPane.add(btnOpcin_3_1_1);
	}

}
