package ejs;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Ejs {

	public static void main(String[] args) {
		double kms = Double.parseDouble(JOptionPane.showInputDialog("dime un valor en kilometros"));
		System.out.println(kms * 1000 + " m.");
		
	}

}
