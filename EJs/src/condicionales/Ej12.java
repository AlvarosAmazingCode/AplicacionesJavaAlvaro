package condicionales;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero."));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero."));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero."));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero."));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero."));
		
		if((a % 2) == 0){
			System.out.println("Acaba en 2.");
		}else{
			System.out.println("No acaba en 2.");
		}
		if((b % 2) == 0){
			System.out.println("Acaba en 2.");
		}else{
			System.out.println("No acaba en 2.");
		}
		if((c % 2) == 0){
			System.out.println("Acaba en 2.");
		}else{
			System.out.println("No acaba en 2.");
		}
		if((d % 2) == 0){
			System.out.println("Acaba en 2.");
		}else{
			System.out.println("No acaba en 2.");
		}
		if((e % 2) == 0){
			System.out.println("Acaba en 2.");
		}else{
			System.out.println("No acaba en 2.");
		}
	}

}
