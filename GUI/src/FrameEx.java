import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameEx {

	//invoke main
	public static void main(String[] args)
	  {
	    //set frame dimensions For JFrame, font characteristics
	    final int FRAME_WIDTH = 250;
	    final int FRAME_HEIGHT = 100;
	    Font headlineFont = new Font("Arial", Font.ITALIC + Font.BOLD, 36);
	    JFrame aFrame = new JFrame("Frame with font");
	    aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    aFrame.setVisible(true);
	//JLabel
	    JLabel greeting = new JLabel("Good Day");
	    greeting.setFont(headlineFont);
	    aFrame.add(greeting);
	  }
}
