package condicionales;

import javax.swing.JOptionPane;

public class Ej10 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero que no sea 0"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero que no sea 0"));
		
		if( b == 0 || a==0){
			System.out.println("Un numero es 0.");
		}else{
			System.out.println(a/b);
		}
		}

}
