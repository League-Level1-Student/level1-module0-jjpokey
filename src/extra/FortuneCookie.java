package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
		
		
		
		
		
		
		
		
		
		
			
	}
	public void showButton() {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will lose someone close very soon...");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "you shall become very wealthy in the next few weeks!");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "Your room will magically clean itself!!!");
		}
		else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You may become a legend in coding!!!");
		}
		else if(rand == 0) {
			JOptionPane.showMessageDialog(null, "you will become very famous, very soon!");
		}
	}
	
	
}

