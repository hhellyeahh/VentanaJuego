package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Ventana2 extends JDialog implements ActionListener{
	private JButton btnComprobar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JRadioButton rdbtnNewRadioButton_6;
	private JRadioButton rdbtnNewRadioButton_7;
	private JRadioButton rdbtnNewRadioButton_8;
	private JRadioButton rdbtnNewRadioButton_9;
	private JRadioButton rdbtnNewRadioButton_10;
	private JRadioButton rdbtnNewRadioButton_11;
	private JRadioButton rdbtnNewRadioButton_12;
	private JRadioButton rdbtnNewRadioButton_13; 
	private JRadioButton rdbtnNewRadioButton_14;
	private JLabel lblNewLabel_6;
	private String nombre;



	public Ventana2(ActionListener actionListener, boolean b, String pNombre) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		nombre = pNombre;
		
		JLabel lblNewLabel = new JLabel("1) \u00BFC\u00F3mo se llama el gato de Sunny?");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 42, 414, 14);
		getContentPane().add(lblNewLabel);
		
		rdbtnNewRadioButton = new JRadioButton("Black");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton.setBounds(10, 57, 62, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Omocat");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_1.setBounds(93, 57, 70, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Mewo");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_2.setBounds(183, 57, 70, 23);
		getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Omori game");
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(335, 11, 89, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2) \u00BFQu\u00E9 est\u00E1 estudiando Hero?");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 85, 226, 14);
		getContentPane().add(lblNewLabel_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Cocina");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_3.setBounds(10, 106, 70, 23);
		getContentPane().add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Medicina");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_4.setBounds(93, 106, 76, 23);
		getContentPane().add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.addActionListener(this);
		
		rdbtnNewRadioButton_5 = new JRadioButton("Reposter\u00EDa");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_5.setBounds(183, 106, 89, 23);
		getContentPane().add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("3) \u00BFC\u00F3mo se siente el personaje cuando le pones tres veces triste?");
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(10, 136, 380, 14);
		getContentPane().add(lblNewLabel_3);
		
		rdbtnNewRadioButton_6 = new JRadioButton("Triste");
		buttonGroup_2.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_6.setBounds(10, 154, 62, 23);
		getContentPane().add(rdbtnNewRadioButton_6);
		
		rdbtnNewRadioButton_7 = new JRadioButton("Miserable");
		buttonGroup_2.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_7.setBounds(93, 154, 89, 23);
		getContentPane().add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.addActionListener(this);
		
		rdbtnNewRadioButton_8 = new JRadioButton("Depresivo");
		buttonGroup_2.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_8.setBounds(183, 154, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_8);
		
		JLabel lblNewLabel_4 = new JLabel("4) \u00BFQu\u00E9 animal es Humphrey?");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(10, 184, 357, 14);
		getContentPane().add(lblNewLabel_4);
		
		rdbtnNewRadioButton_9 = new JRadioButton("Ballena");
		buttonGroup_3.add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_9.setBounds(10, 200, 62, 23);
		getContentPane().add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.addActionListener(this);
		
		rdbtnNewRadioButton_10 = new JRadioButton("Delf\u00EDn");
		buttonGroup_3.add(rdbtnNewRadioButton_10);
		rdbtnNewRadioButton_10.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_10.setBounds(93, 200, 62, 23);
		getContentPane().add(rdbtnNewRadioButton_10);
		
		rdbtnNewRadioButton_11 = new JRadioButton("Tibur\u00F3n");
		buttonGroup_3.add(rdbtnNewRadioButton_11);
		rdbtnNewRadioButton_11.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_11.setBounds(183, 200, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_11);
		
		JLabel lblNewLabel_5 = new JLabel("5) \u00BFC\u00FAantas llaves tienes que conseguir?");
		lblNewLabel_5.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(10, 224, 244, 14);
		getContentPane().add(lblNewLabel_5);
		
		rdbtnNewRadioButton_12 = new JRadioButton("12");
		buttonGroup_4.add(rdbtnNewRadioButton_12);
		rdbtnNewRadioButton_12.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_12.setBounds(10, 238, 62, 23);
		getContentPane().add(rdbtnNewRadioButton_12);
		rdbtnNewRadioButton_12.addActionListener(this);
		
		rdbtnNewRadioButton_13 = new JRadioButton("13");
		buttonGroup_4.add(rdbtnNewRadioButton_13);
		rdbtnNewRadioButton_13.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_13.setBounds(93, 235, 48, 23);
		getContentPane().add(rdbtnNewRadioButton_13);
		
		rdbtnNewRadioButton_14 = new JRadioButton("19");
		buttonGroup_4.add(rdbtnNewRadioButton_14);
		rdbtnNewRadioButton_14.setFont(new Font("Yu Gothic", Font.PLAIN, 10));
		rdbtnNewRadioButton_14.setBounds(183, 235, 55, 23);
		getContentPane().add(rdbtnNewRadioButton_14);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(305, 235, 119, 23);
		getContentPane().add(btnComprobar);
		
		lblNewLabel_6 = new JLabel(pNombre);
		lblNewLabel_6.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(10, 11, 101, 14);
		getContentPane().add(lblNewLabel_6);
		btnComprobar.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int aciertos = 0;
		if(rdbtnNewRadioButton_2.isSelected()) {
			aciertos++;
		}
		if(rdbtnNewRadioButton_4.isSelected()) {
			aciertos++;
		}
		if(rdbtnNewRadioButton_7.isSelected()) {
			aciertos++;
		}
		if(rdbtnNewRadioButton_9.isSelected()) {
			aciertos++;
		}
		if(rdbtnNewRadioButton_12.isSelected()) {
			aciertos++;
		}
		if(e.getSource().equals(btnComprobar)) {
			Ventana3 v3 = new Ventana3(this,true, aciertos, nombre);
			v3.setVisible(true);
			this.dispose();
		}
		
		
		
		
	}
}
