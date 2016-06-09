package program;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame v = new JFrame("XTRM");
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setSize(2000, 1000);
		
		Panel panel = new Panel();
		v.setContentPane(panel);
		panel.setLayout(null);
		JButton boton = new JButton("TOCAME");
		boton.setFont(new Font("Comic Sans MS", Font.BOLD, 38));
		boton.setBackground(Color.RED);
		boton.setBounds(875, 0, 200, 50);
		
		boton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent b) {
				 panel.l(2);
			}
			
		});
		panel.add(boton);
		v.setVisible(true);
	

	}
	
	

}

