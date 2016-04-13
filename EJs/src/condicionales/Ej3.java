package condicionales;

import javax.swing.JOptionPane;

public class Ej3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
		System.out.println(n);
		if(n % 2 == 0){
			System.out.println("Es par");
		}else{
			System.out.println("Es impar");
		}
		if(n > -1){
			System.out.println("Es positivo");
		}else{
			System.out.println("Es negativo");
		}
		if(n % 10 == 0){
			System.out.println("Multiplo de 10");
		}else{
			System.out.println("No es multiplo de 10");
		}
		if(n % 5 == 0){
			System.out.println("Multiplo de 5");
		}else{
			System.out.println("No es multiplo de 5");
		}
		if(n > 100){
			System.out.println("Es mayor que 100");
		}else{
			System.out.println("No es mayor que 100");
		}
	}

}
