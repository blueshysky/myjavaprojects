import javax.swing.*;
import java.lang.Object;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomersFrame extends JFrame 
{
	
	
public CustomersFrame()
{
	super("Customer Menu");
	setSize(400,300);
	getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
	
	Panel panel = new Panel();
	getContentPane().add(panel);
	setVisible(true);
}
	
}

