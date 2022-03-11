package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class Ventana1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnSiguiente;
	private JButton btnSalir;

	
	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario:");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 13));
		lblNewLabel.setBounds(53, 69, 168, 63);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		textField.setBounds(193, 87, 175, 20);
		contentPane.add(textField);
		textField.setColumns(10); 
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(96, 178, 89, 23); 
		contentPane.add(btnSiguiente);
		btnSiguiente.addActionListener(this);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(244, 178, 89, 23);
		contentPane.add(btnSalir);
		btnSalir.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Omori game");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(338, 11, 86, 20);
		contentPane.add(lblNewLabel_1);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnSiguiente)) {
			Ventana2 v2 = new Ventana2(this,true, textField.getText());
			v2.setVisible(true);
			this.dispose();
		}
		if(e.getSource().equals(btnSalir)) {
			this.dispose();
		}
		
	}

}
