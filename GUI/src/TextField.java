import javax.swing.*;

class TextField extends JFrame 
{
	JPanel pnl = new JPanel();

	JTextField txt1 = new JTextField( 38 ) ;
	JTextField txt2 = new JTextField( "Default Text", 38 ) ;
	
	JTextArea txtArea = new JTextArea( 5, 37 ) ;
	
	JScrollPane pane = new JScrollPane( txtArea ) ;

	public TextField()
	{
		//create window and its properties
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		
		//create the text Areas
		txtArea.setLineWrap( true ) ;
		txtArea.setWrapStyleWord( true ) ;

		//create a scrollbar - vertical
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//add to the object pnl the textboxes
		pnl.add( txt1 ) ;
		pnl.add( txt2 ) ;
		pnl.add( pane ) ;

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		TextField gui = new TextField();
	} 
}

