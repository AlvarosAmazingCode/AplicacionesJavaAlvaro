package condicionales;

import javax.swing.JOptionPane;

public class Ej2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"))%2;
		if(n == 0){
			System.out.println("es par");
		}else{
			System.out.println("es impar");
		}
	}

}
