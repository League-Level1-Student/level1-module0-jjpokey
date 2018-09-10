import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
JFrame frame;
JPanel panel;
JButton b1;
JButton b2;
JButton b3;


	public static void main(String[] args) {
	
		new CutenessTv().createUI();
	}
	void createUI() {
		frame = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		panel = new JPanel();
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		frame.setVisible(true);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			showDucks();
		}
if(e.getSource()==b2) {
			showFrog();
		}
if(e.getSource()==b3) {
	showFluffyUnicorns();
}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
