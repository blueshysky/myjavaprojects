import javax.swing.*;

class Radio extends JFrame 
{
	JPanel pnl = new JPanel();
	
	JRadioButton rad1 = new JRadioButton( "Red", true ) ;
	JRadioButton rad2 = new JRadioButton( "Rosé" ) ;
	JRadioButton rad3 = new JRadioButton( "White" ) ;

	ButtonGroup wines = new ButtonGroup() ;	

	public Radio()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		//this add the panel 
		add(pnl);
		
		//this add the option in a group
		wines.add( rad1 ) ;
		wines.add( rad2 ) ;
		wines.add( rad3 ) ;
		
		//once group add to the panel
		pnl.add( rad1 ) ;
		pnl.add( rad2 ) ;
		pnl.add( rad3 ) ;

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		Radio gui = new Radio();
	} 
}

