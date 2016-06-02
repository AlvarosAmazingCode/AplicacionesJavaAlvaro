package chat;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		JFrame a = new JFrame("Sumas");
		a.setSize(2000, 900);
		
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel();
		a.setContentPane(panel);
		panel.setLayout(null);
		
		
		JTextField t1 = new JTextField();
		t1.setBounds(100, 200, 200, 30);
		panel.add(t1);
		
		
		JTextField t2 = new JTextField();
		t2.setBounds(1600, 200, 200, 30);
		panel.add(t2);
	
		
		
		JButton boton=new JButton("SUMA");
		boton.setBounds(675, 0, 200, 50);
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent b) {
				int pN = 0;
				
				int sN = 0;
				try{
					pN = Integer.parseInt(t1.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t1.setText("0");
				}
				
				try{
					sN = Integer.parseInt(t2.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t2.setText("0");
				}
				System.out.printf("%s + %s = %s \n", pN, sN, (pN + sN));
				
				
			}
		});
		
		JButton botonResta=new JButton("RESTA");
		botonResta.setBounds(375, 0, 200, 50);
		botonResta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent b) {
				int pN=0;
				int sN = 0;
				try{
					pN = Integer.parseInt(t1.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t1.setText("0");
				}
				
				
				try{
					sN = Integer.parseInt(t2.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t2.setText("0");
				}
				System.out.printf("%s - %s = %s \n", pN, sN, (pN - sN));
				
				
			}
		});
		
		JButton botonMultiplicacion=new JButton("MULTIPLICACION");
		botonMultiplicacion.setBounds(975, 0, 200, 50);
		botonMultiplicacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent b) {
				int pN = 0;
				
				int sN = 0;
				
				try{
					pN = Integer.parseInt(t1.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t1.setText("0");
				}
				
				try{
					sN = Integer.parseInt(t2.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t2.setText("0");
				}
				System.out.printf("%s * %s = %s \n", pN, sN, (pN * sN));
				
				
			}
		});
		
		JButton botonDivision=new JButton("DIVISION");
		botonDivision.setBounds(1275, 0, 200, 50);
		botonDivision.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent b) {
				int pN = 0;
				
				int sN = 0;
				try{
					pN = Integer.parseInt(t1.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t1.setText("0");
				}
				
				try{
					sN = Integer.parseInt(t2.getText());
				}catch(NumberFormatException e){
					//e.printStackTrace();
					t2.setText("0");
				}
				
				if(sN == 0){
					System.out.println("No se puede dividir por 0");
				}else{
				System.out.printf("%s / %s = %s \n", pN, sN, (pN / sN));
				}
				
				
			}
		});
		panel.add(botonMultiplicacion);
		panel.add(botonResta);
		panel.add(botonDivision);
		panel.add(boton);
		a.setVisible(true);
	}

}
