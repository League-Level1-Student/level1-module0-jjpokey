import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
JFrame frame;
JPanel panel;
JButton b;
int click = 0;
	public static void main(String[] args) {
		
		new JackInTheBox().createUI();
		
	}
	
	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		b = new JButton();
		b.setText("Suprise!");
		frame.add(panel);
		panel.add(b);
		frame.setVisible(true);
		   b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
		click += 1;
		if(click == 5) {
			//popup jack in the box
		}
		}
		
	}
	
}
