package lineas;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {


	Ventana v = new Ventana();
	v.setVisible(true);
	v.setSize(1920, 1080);
	v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Panel panel = new Panel();
	v.setContentPane(panel);
	 




}
}
