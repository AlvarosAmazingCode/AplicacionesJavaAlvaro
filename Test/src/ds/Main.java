package ds;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setSize(1970, 1044);
		MyPanel panel = new MyPanel();
		v.setContentPane(panel);
	}

}
