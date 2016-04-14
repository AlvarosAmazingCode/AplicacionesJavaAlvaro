package condicionales;

import javax.swing.JOptionPane;

public class Ej7 {

	public static void main(String[] args) {
		int h = Integer.parseInt(JOptionPane.showInputDialog("Dime una hora"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Dime un minuto"));
		int s = Integer.parseInt(JOptionPane.showInputDialog("Dime un segundo"));
		if(h < 13){
			System.out.println("La hora es valida");
		}else{
			System.out.println("La hora no es valida");
		}if(m < 60){
			System.out.println("El minuto es valido");
		}else{
			System.out.println("El minuto no es valido");
		}if(s < 60){
			System.out.println("El minuto es valido");
		}else{
			System.out.println("El minuto no es valido");
		}
	}

}
