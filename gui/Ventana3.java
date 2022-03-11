package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JDialog implements ActionListener{
	
	private JButton btnSalirDefinitivo;

	public Ventana3(Ventana2 ventana2, boolean b, int aciertos, String pNombre) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Omori game");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel.setBounds(336, 11, 88, 20);
		getContentPane().add(lblNewLabel);
		
		btnSalirDefinitivo = new JButton("Salir");
		btnSalirDefinitivo.setBounds(166, 216, 89, 23);
		getContentPane().add(btnSalirDefinitivo);
		btnSalirDefinitivo.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("Has obtenido " + aciertos + " acierto/s.");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(140, 81, 183, 40);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(pNombre);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 11, 151, 14);
		getContentPane().add(lblNewLabel_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSalirDefinitivo)) {
			this.dispose();
		}
		
	}
}
