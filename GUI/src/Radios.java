import javax.swing.*;

class Radios extends JFrame 
{
	JPanel pnl = new JPanel();
	//Add radio buttons for the wine
	JRadioButton rad1 = new JRadioButton( "Red", true ) ;
	JRadioButton rad2 = new JRadioButton( "Rosé" ) ;
	JRadioButton rad3 = new JRadioButton( "White" ) ;

	//Add radio buttons for the cheese
	JRadioButton rad4 = new JRadioButton("Brie",true);
	JRadioButton rad5 = new JRadioButton("Gouda");
	JRadioButton rad6 = new JRadioButton("Feta");
	//Add ButtonGroups
	ButtonGroup wines = new ButtonGroup() ;	
	ButtonGroup cheese = new ButtonGroup();

	public Radios()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		wines.add( rad1 ) ;
		wines.add( rad2 ) ;
		wines.add( rad3 ) ;

		cheese.add( rad4 ) ;
		cheese.add( rad5 ) ;
		cheese.add( rad6 ) ;
		
		pnl.add( rad1 ) ;
		pnl.add( rad2 ) ;
		pnl.add( rad3 ) ;

		pnl.add( rad4 ) ;
		pnl.add( rad5 ) ;
		pnl.add( rad6 ) ;

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		Radios gui = new Radios();
	} 
}
