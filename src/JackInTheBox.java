import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		frame.resize(500, 500);
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
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
			createLabelImage("jackInTheBox.png");
		}
		}
	}
		private void showPicture(String fileName) { 
		     try {
		          JLabel imageLabel = createLabelImage(fileName);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.resize(500,500);
		          frame.pack();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		
	}
		private JLabel createLabelImage(String fileName) {
		     try {
		          URL imageURL = getClass().getResource(fileName);
		          if (imageURL == null) {
		               System.err.println("Could not find image " + fileName);
		               return new JLabel();
		          } else {
		               Icon icon = new ImageIcon(imageURL);
		               JLabel imageLabel = new JLabel(icon);
		               return imageLabel;
		          }
		     } catch (Exception e) {
		          System.err.println("Could not find image " + fileName);
		          return new JLabel();
		     }
		}
		private void playSound(String soundFile) { 
		     try {
		          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		          sound.play();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
}
