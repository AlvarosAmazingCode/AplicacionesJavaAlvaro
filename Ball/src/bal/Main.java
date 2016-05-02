package bal;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setSize(2000, 1200);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		v.setContentPane(panel);
	}

}
