package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setSize(2000, 1000);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel();
		v.setContentPane(panel);

	}

}
