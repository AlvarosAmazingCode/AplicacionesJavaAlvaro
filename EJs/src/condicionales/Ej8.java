package condicionales;

import javax.swing.JOptionPane;

public class Ej8 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Dime un mes en numero."));
		if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12){
			System.out.println("Tiene 31 dias.");
		}else{
			if(a == 4 || a == 6 || a == 9 || a == 11){
				System.out.println("Tiene 30 dias.");
			}else{
				System.out.println("Tiene 28 dias.");
			}
		}
	}

}
