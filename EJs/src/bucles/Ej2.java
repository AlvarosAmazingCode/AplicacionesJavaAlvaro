package bucles;

import javax.swing.JOptionPane;

public class Ej2 {

	public static void main(String[] args) {
	int j = 0;
	int a = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
	int h = a;
	while(j != 0){
		h = a / j;
	}
	while(j < 9){
	    a = a+h;
		j++;
		System.out.println(a);
		
	}

	}

}
