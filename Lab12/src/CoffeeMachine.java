
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

//Xionghui Huang

public class CoffeeMachine extends JFrame implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JLabel l1, l2, l3, l4, l5, l6;
  JButton b1, b2;
  JTextField t1, t2, t3;
  JCheckBox cream, raw, espresso; 
  private JRadioButton small;
  private JRadioButton large;
  private JRadioButton medium;
  private ButtonGroup group;

  CoffeeMachine() 
  {
    l1 = new JLabel(" Customer Name");
    l2 = new JLabel(" amount to pay");
    l3 = new JLabel("  ");
    l4 = new JLabel("  ");
    l5 = new JLabel("  ");
    l6 = new JLabel("  ");

    b1 = new JButton("COMPUTE");
    b2 = new JButton("EXIT");
  
    t1 = new JTextField(10);
    t2 = new JTextField(10);

    small = new JRadioButton("small", true);
    medium = new JRadioButton("medium", false);
    large = new JRadioButton("large", false);
    
    group = new ButtonGroup();
    group.add(small);
    group.add(large);
    group.add(medium);

    cream = new JCheckBox("cream", false);
    raw = new JCheckBox("raw sugar", false);
    espresso = new JCheckBox("espresso shot", false);
    
    JMenuBar menuBar = new JMenuBar();
    add(menuBar);
    
    JMenu mnFile = new JMenu("File");
	menuBar.add(mnFile);

	// add a File menu item
	JMenuItem mntmExit = new JMenuItem("Exit");
	mnFile.add(mntmExit);

	// add the Help menu
	JMenu mnHelp = new JMenu("Help");
	menuBar.add(mnHelp);

	// add a Help menu item
	JMenuItem mntmAbout = new JMenuItem("About");   
	mnHelp.add(mntmAbout);

	// display the menu bar on the frame
 	setJMenuBar(menuBar);

    add(l1);
    add(t1);
    add(small);
    add(cream);
    add(medium);
    add(raw);
    add(large);
    add(espresso);
    add(l2);
    add(t2);
    add(l5);
    add(l6);
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(e -> System.exit(0));
    mntmExit.addActionListener(e -> System.exit(0));
    setSize(500,300);
    setLayout(new GridLayout(7,2));
    setTitle("Coffee Machine");
	mntmAbout.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0)
		 {
		   JOptionPane.showMessageDialog(null, "My name is Xionghui Huang, an IIT undergraduate student.\nThis program is used for ordering coffee drinks and computer the cost right on the spot.\nHope you enjoy the program and the drink!", 
		   "About", JOptionPane.PLAIN_MESSAGE);
		 }
});

  }
  public void actionPerformed(ActionEvent ae)
  {
    float price = 0;
    String a = "", b = "", c = "", d = "" ,message = ""; 
    
    if (cream.isSelected() == true) 
    {
      c += " and cream";
      
    } 
    if (raw.isSelected() == true) 
    {
      c += " and raw surgar";
    } 
    if (espresso.isSelected() == true) 
    {
      c += " and a shot of espresso";
      price += 0.75;
    } 
    if (small.isSelected() == true) 
    {
	a = "Small Coffee";
     price += 1.25;
    }
    if (large.isSelected() == true) 
    {
	a = "Large Coffee";
	price += 2.30;
     
    }
    if (medium.isSelected() == true) 
    {
	a = "Medium Coffee";
	price += 1.75;
     
    }
    if(ae.getSource() == b1)
    {
    	b = t1.getText();
      message = 
    		  "Hello " + b + " Welcome and enjoy your drink\n"+
    		  "your order: " + a + "\nWith " + c.substring(4) + " \n$" + price;
      t2.setText("thank you: " + price );
    }
    JOptionPane.showMessageDialog(null, "Summary: \n" + message, 
		  "Order Summary", JOptionPane.PLAIN_MESSAGE);
  }
 
  

  public static void main(String args[])
  {
    CoffeeMachine a = new CoffeeMachine();
    a.setVisible(true);
    a.setLocation(200,200);
  }
}
		
