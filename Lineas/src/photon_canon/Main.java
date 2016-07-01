package photon_canon;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Main{

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("WHAT DO YOU WANT TO BE CALLED");
		JFrame v = new JFrame();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setFont(new Font("Comic Sans MS", Font.ITALIC, 25));
		v.setTitle("PHOTON CANON");
		v.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		Panel panel = new Panel(name);
		v.setContentPane(panel);
		v.setVisible(true);
      
		
    }
 
}