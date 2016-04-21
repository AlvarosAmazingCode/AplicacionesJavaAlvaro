package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{
public Ventana(){
	super.setSize(1800, 800);
	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	super.setResizable(true);
	super.setVisible(true);
	super.setContentPane(new Panel());
}

}
