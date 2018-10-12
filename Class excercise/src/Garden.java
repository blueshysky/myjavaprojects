import javax.swing.*;
import java.awt.*;
public class Garden {
public static void main(String args[])
{
	final int frame_width = 300;
	final int frame_length = 250;
	JFrame frame = new JFrame("My Garden");
	frame.setSize(frame_width, frame_length);
	frame.setVisible(true);
	frame.setDefaultLookAndFeelDecorated(true);
	
	GridLayout layout = new GridLayout();
	
	JButton nb = new JButton("North Button");
	JButton sb = new JButton("South Button");
	JButton eb = new JButton("East Button");
	JButton wb = new JButton("West Button");
	JButton cb = new JButton("Center Button");
	
	Container con = new Container();
	
	frame.setLayout(new FlowLayout());
	
	frame.add(nb);
	frame.add(sb);
	frame.add(eb);
	frame.add(wb);
	frame.add(cb);
}

}
