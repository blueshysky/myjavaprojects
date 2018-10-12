import javax.swing.* ;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Xionghui Huang Programmer

class Layout extends JFrame implements ActionListener
{
	Container contentPane = getContentPane();

	JPanel pnl = new JPanel();
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JPanel grid = new JPanel(new GridLayout(2,2));
	JRadioButton rad1 = new JRadioButton( "Radio1", true ) ;
	JRadioButton rad2 = new JRadioButton( "Radio2" ) ;
	JRadioButton rad3 = new JRadioButton( "Radio3" ) ;
	JRadioButton rad4 = new JRadioButton( "Radio4" ) ;
	ButtonGroup button = new ButtonGroup();
	
	JCheckBox chk1 = new JCheckBox("checkbox 1");
	JCheckBox chk2 = new JCheckBox("checkbox 2");
	JCheckBox chk3 = new JCheckBox("checkbox 3");
	JCheckBox chk4 = new JCheckBox("checkbox 4");
	JCheckBox chk5 = new JCheckBox("checkbox 5");
	
	JButton North = new JButton("North");
	JButton East = new JButton("East");
	JButton South = new JButton("South");
	JButton West = new JButton("West");
	
	JTextArea txtArea = new JTextArea( 5, 37 ) ;
	
	JScrollPane pane = new JScrollPane( txtArea ) ;
	
	Font font = new Font( "Times New Roman", Font.ITALIC, 20);
	Color color = new Color(0,0,225);
	
	public Layout()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );	
		
			txtArea.setFont(font);
			txtArea.setForeground(color);
 
    		pnl.add(new JButton("Yes") ); 
    		pnl.add(new JButton("No") );
    		pnl.add(new JButton("Cancel") );
    		
 
    		grid.add(new JButton("1")); 
    		grid.add(new JButton("2")); 
    		grid.add(new JButton("3")); 
    		grid.add(new JButton("4")); 
    		
    		button.add(rad1);
    		button.add(rad2);
    		button.add(rad3);
    		button.add(rad4);
    		
    		pnl1.add(rad1);
    		pnl1.add(rad2);
    		pnl1.add(rad3);
    		pnl1.add(rad4);
    		
    		pnl3.add(chk1);
    		pnl3.add(chk2);
    		pnl3.add(chk3);
    		pnl3.add(chk4);
    		pnl3.add(chk5);

    		pnl2.add(pane);
    		//add component or objects to the content pane
    		contentPane.add("North", pnl); 
    		contentPane.add("Center", grid ); 
    		contentPane.add("East", East);
    		contentPane.add("West", West);
    		contentPane.add("South", South);
    		
    		East.addActionListener(this);
    		West.addActionListener(this);
    		South.addActionListener(this);
    		
    		
		setVisible( true );
	}
public void actionPerformed( ActionEvent event ) 
{
	if( event.getSource() == East ) 
	{
		int n = JOptionPane.showConfirmDialog( this, pnl1, "East", JOptionPane.PLAIN_MESSAGE);	
	}
	if ( event.getSource() == West )
	{
		int a = JOptionPane.showConfirmDialog( this,pane,"Wast", JOptionPane.PLAIN_MESSAGE);
	}
	if ( event.getSource() == South)
	{
		int c = JOptionPane.showConfirmDialog(this, pnl3, "South", JOptionPane.PLAIN_MESSAGE);	
	}
	
}

	public static void main( String[] args ) 
	{
		Layout gui = new Layout() ;
	}	
	
}
