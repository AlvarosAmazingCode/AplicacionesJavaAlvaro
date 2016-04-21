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
					System.out.println("Marzo");
				}else{
					if(m == 4){
						System.out.println("Abril");
					}else{
						if(m == 5){
							System.out.println("Mayo");
						}else{
							if(m == 6){
								System.out.println("Junio");
							}else{
								if(m == 7){
									System.out.println("Julio");
								}else{
									if(m == 8){
										System.out.println("Agosto");
									}else{
										if(m == 9){
											System.out.println("Septiembre");
										}else{
											if(m == 10){
												System.out.println("Octubre");
											}else{
												if(m == 11){
													System.out.println("Noviembre");
												}else{
													if(m == 12){
														System.out.println("Diciembre");
													}else{
														System.out.println("Valor desconocido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
