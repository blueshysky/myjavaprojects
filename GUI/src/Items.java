import javax.swing.*;

class Items extends JFrame 
{
	//declare the variables (objects) and method(s)
	//create the panel to place objects such as checkboxes
	JPanel pnl = new JPanel();
	
	//create a String Array
	String[] toppings = { "Pepperoni", "Mushroom","Ham","Tomato" } ;

	//create the checkboxes
	JCheckBox chk1 = new JCheckBox( toppings[0] ) ;
	JCheckBox chk2 = new JCheckBox( toppings[1], true) ; 
	JCheckBox chk3 = new JCheckBox( toppings[2] ) ;
	JCheckBox chk4 = new JCheckBox( toppings[3] ) ;
	


	//create another array for other choices
	String[] styles = { "Deep Dish", "Gourmet Style", "Thin & Crispy" } ;	
	
	JCheckBox chk5 = new JCheckBox( styles[0] ) ;
	JCheckBox chk6 = new JCheckBox( styles[1], true) ; 
	JCheckBox chk7 = new JCheckBox( styles[2] ) ;
	//create a combobox
	JComboBox box1 = new JComboBox(toppings);
	JComboBox box2 = new JComboBox(styles);
	//create another item called a listbox
	JList lst1 = new JList(toppings);
	JList lst2 = new JList(styles);
	//create the class method Items()
	public Items()
	{
		//create the window/panel
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		

		//add the different checkboxes to the panel
		pnl.add( chk1 ) ;
		pnl.add( chk2 ) ;
		pnl.add( chk3 ) ;
		pnl.add( chk4 ) ;
		
		//pnl.add( chk5 ) ;
		//pnl.add( chk6 ) ;
		//pnl.add( chk7 ) ;
		//add the combobox
		box1.setSelectedIndex(0);
		pnl.add( box1 ) ;
		
		box2.setSelectedIndex(0);
		pnl.add( box2 ) ;
		
		pnl.add( lst1 ) ; 
		pnl.add( lst2 ) ; 
		setVisible( true );
	}

	public static void main ( String[] args )
	{
		Items gui = new Items();
	} 
}	
