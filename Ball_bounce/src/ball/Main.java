package ball;

import javax.swing.JFrame;



public class Main {

	public static void main(String[] args) {
		Ventana a = new Ventana();
		a.setVisible(true);
		a.setSize(700, 800);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel();
		a.setContentPane(panel);

	}

}
