package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ventana_leer_ministerio extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	JButton btnAceptar, btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_leer_ministerio frame = new Ventana_leer_ministerio();
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
	public Ventana_leer_ministerio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 129);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setBounds(10, 35, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese el ministerio que desea listar");
		lblNewLabel.setBounds(10, 10, 228, 14);
		contentPane.add(lblNewLabel);
		
		 btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(20, 66, 89, 23);
		contentPane.add(btnAceptar);
		
		 btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 66, 89, 23);
		contentPane.add(btnSalir);
		
		btnSalir.addActionListener(this);
		btnAceptar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnSalir == e.getSource())
		{
			this.setVisible(false);
		}
		
		if(btnAceptar == e.getSource())
		{
			String ministerio = textField.getText();		
		}
		
	}

}
