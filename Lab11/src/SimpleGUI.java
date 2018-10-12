import java.lang.Math;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
//Xionghui Huang programmer
public class SimpleGUI extends JFrame implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JLabel l1, l2, l3, l4, l5;
  JButton b1,b2; 
  JTextField t1, t2, t3, t4;
  JCheckBox check1;
   
  SimpleGUI() 
  {
    l1 = new JLabel(" Current Salary ($USD)");
    l2 = new JLabel(" Percentage rate (%)");
    l3 = new JLabel(" New Salary ");
    l4 = new JLabel(" ");
    l5 = new JLabel("Difference");
    b1 = new JButton(" Compute ");
    b2 = new JButton("EXIT");
    t1 = new JTextField(10);
    t2 = new JTextField(10);
    t3 = new JTextField(10);
    t4 = new JTextField("0",10);
    check1 = new JCheckBox("Bonus Pay");
    
    check1.setSelected(true);
  
    
    
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(check1);
    add(l4);
    add(l5);
    add(t4);
    add(b1);
    add(b2);
    
    b2.addActionListener(e -> System.exit(0));
    b1.addActionListener(this);
  
    setSize(500,300);
    setLayout(new GridLayout(6,2));
    setTitle("Salary Calculator");
  }

  public void actionPerformed(ActionEvent ae)
  {
	  Locale locale = new Locale("en", "US");      
	  NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    float a, b, c, d;
    
    if(ae.getSource() == b1)
    {
      a = Float.parseFloat(t1.getText());
      b = Float.parseFloat(t2.getText());
      d = Float.parseFloat(t4.getText());
      c = ((b/100) + 1) * a - d;
      currencyFormatter.format(c);
      t3.setText(String.valueOf(currencyFormatter.format(Math.round(c))));
    } 
    if(check1.isSelected()) {
    	a = Float.parseFloat(t1.getText());
        b = Float.parseFloat(t2.getText());
        d = Float.parseFloat(t4.getText());
        c = (((b/100) + 1) * a) + 500 - d;
        t3.setText(String.valueOf(currencyFormatter.format(Math.round(c))));
    }
    else {
        a = Float.parseFloat(t1.getText());
        b = Float.parseFloat(t2.getText());
        d = Float.parseFloat(t4.getText());
        c = ((b/100) + 1) * a - d;
        currencyFormatter.format(c);
        t3.setText(String.valueOf(currencyFormatter.format(Math.round(c))));
    }
  }
   
  
    		

  public static void main(String args[])
  {
    SimpleGUI a = new SimpleGUI();
    a.setVisible(true);
    a.setLocation(200, 200);
  }
}
  		
