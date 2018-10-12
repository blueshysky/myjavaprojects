import javax.swing.* ;
import java.awt.event.* ;

//implement is to use
class Actions extends JFrame implements ActionListener
{
	//first make panel allow us to put stuff in there
	JPanel pnl = new JPanel() ;
	
	//creates objects for this it is buttons
	JButton btn1 = new JButton( "Button 1" ) ;
	JButton btn2 = new JButton( "Button 2" ) ;
	//this is a text box to display or place there
	JTextArea txtArea = new JTextArea( 5 , 38 ) ;
	
	public Actions()
	{
		//making a gui window
		super("Swing Window");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		
		//placing component to the panel
		pnl.add( btn1 ) ;
		pnl.add( btn2 ) ;
		pnl.add( txtArea ) ;
		
		btn2.setEnabled( false ) ;
		txtArea.setText( "Button 2 is Disabled" ) ;
		
		//add the listener
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setVisible( true );
	}
	//event handler
	public void actionPerformed( ActionEvent event )
	{
		//action command is what you did
		txtArea.setText( event.getActionCommand() + " Clicked and Disabled" ) ;
		
		//if what you click is true 
		if( event.getSource() == btn1) 
		{
			btn2.setEnabled( true ); 
			btn1.setEnabled( false ) ;
		}		
		
		
		if( event.getSource() == btn2)
		{
			btn1.setEnabled( true );
			btn2.setEnabled( false ) ;
		}	
	}

	public static void main( String[] args )
	{
		Actions gui = new Actions();
	}
}
