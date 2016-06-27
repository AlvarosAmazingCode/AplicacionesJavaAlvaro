package photon_canon;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {


		JFrame v = new JFrame("                                                                                                                                                                                PHOTON RAY");
		v.setSize(1920, 1000);
		v.setIconImage(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel();
		v.setContentPane(panel);
		v.setVisible(true);




	}
}
