package condicionales;

import javax.swing.JOptionPane;

public class Ej9 {

	public static void main(String[] args) {
		int m = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero de un mes."));
		if(m == 1){
			System.out.println("Enero");
		}else{
			if(m == 2){
				System.out.println("Febrero");
			}else{
				if(m == 3){
					System.out.println("");
				}else{
					
				}
			}
		}

	}

}
