package bucles;

import javax.swing.JOptionPane;

public class Ej1 {

	public static void main(String[] args) {
		int b = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero."));
		int a = 0;
		while( b > 0){
			b = b / 10;
			a++;
		}
		System.out.println(a);
	}

}
