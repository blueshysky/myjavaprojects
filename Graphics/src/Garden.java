import javax.swing.*;
import java.lang.Object;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Garden extends JFrame implements ActionListener
{
	ClassLoader ldr =  this.getClass().getClassLoader();
	
	java.net.URL saleURL = ldr.getResource( "sale.png" );
	java.net.URL toolURL = ldr.getResource( "tool.png" );
	java.net.URL tipsURL = ldr.getResource( "Gardentips.png" );
	java.net.URL contactURL = ldr.getResource( "contact.png" );
	java.net.URL listURL = ldr.getResource( "List.png" );
	
	ImageIcon Sale = new ImageIcon( saleURL );
	ImageIcon Tool = new ImageIcon( toolURL );
	ImageIcon Tips = new ImageIcon( tipsURL );
	ImageIcon Contact = new ImageIcon( contactURL );
	ImageIcon List = new ImageIcon( listURL );
	
	Container contentPane =  getContentPane();
	JFrame Frame = new JFrame();
	
	JPanel pnl = new JPanel();
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel(new GridLayout(4,1));
	JPanel pnl3 = new JPanel();
	JPanel grid = new JPanel(new GridLayout(1,2));
	
	JButton North = new JButton("Contact Information",Contact);
	JButton South = new JButton("Garden Supply Product", Tool);
	JButton East = new JButton("Gardening Tips", Tips);
	JButton West = new JButton("Plants on sale!", Sale);
	JButton Center = new JButton("List of Option", List);
	
	JCheckBox chk1 = new JCheckBox("Garden Tools",true);
	JCheckBox chk2 = new JCheckBox("Fertilizer");
	JCheckBox chk3 = new JCheckBox("Pest control");
	
	JRadioButton rad1 = new JRadioButton("Flower",true);
	JRadioButton rad2 = new JRadioButton("Grass");
	JRadioButton rad3 = new JRadioButton("Tree");
	JLabel info =  new JLabel("Hope De-Pot");
	JLabel info1 = new JLabel ("Phone Number 123-456-7890");
	JLabel info2 = new JLabel ("Location : 1234 N State St");
	JLabel info3 = new JLabel ("Chicago, Il 60616");
	
	JButton back = new JButton("back");
	
	JLabel tips = new JLabel ("If the soil feels dry to the touch, it's best to water the plant");
	
	
	String[] list = {"Garden Tips", "Garden Supplies", "Garden Plants- Flower", "Garden Plants- Fruit Trees", "Garden Plants- Vegetable"};
	JComboBox Combo = new JComboBox(list);	
	
	ButtonGroup plants = new ButtonGroup();
	CheckboxGroup utility = new CheckboxGroup();
	private final JMenuBar menuBar = new JMenuBar();
	private final JRadioButtonMenuItem rdbtnmntmBackButton = new JRadioButtonMenuItem("Back Button");
	
	public Garden() 
{
	super("Garden App");
	setSize(500,300);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	setVisible(true);
	
	pnl.add(chk1);
	pnl.add(chk2);
	pnl.add(chk3);
	
	plants.add(rad1);
	plants.add(rad2);
	plants.add(rad3);
	
	pnl1.add(rad1);
	pnl1.add(rad2);
	pnl1.add(rad3);
	
	pnl2.add(info);
	pnl2.add(info1);
	pnl2.add(info2);
	pnl2.add(info3);
	
	grid.add(Combo);
	
	
	contentPane.add("North", North);
	contentPane.add("South",South);
	contentPane.add("East", East);
	contentPane.add("West", West);
	contentPane.add("Center", Center);
	
	North.addActionListener(this);
	East.addActionListener(this);
	South.addActionListener(this);
	West.addActionListener(this);
	Center.addActionListener(this);
	
	setJMenuBar(menuBar);
	
	menuBar.add(rdbtnmntmBackButton);
	
	
	
}

public void actionPerformed(ActionEvent e)
{
	if (e.getSource() == North) {
		dispose();
		Frame.setVisible(true);
		Frame.setTitle("Contact Information");
		Frame.setSize(400,300);
		Frame.getContentPane().add(pnl2);
	}
	if (e.getSource() == South) {
		dispose();
		Frame.setVisible(true);
		Frame.setTitle("Tool Supplies Product");
		Frame.setSize(300,200);
		Frame.getContentPane().add(pnl);
	
	}	
	if (e.getSource() == Center) {
		dispose();
		Frame.setVisible(true);
		Frame.setSize(300,200);
		Frame.setTitle("The map of the app");
		Frame.getContentPane().add(grid);
	}		
	if (e.getSource() == East) {
		dispose();
		Frame.setVisible(true);
		Frame.setTitle(" Gardening tips");
		Frame.setSize(300,200);
		Frame.getContentPane().add(tips);
		
	}			
	if (e.getSource() == West) {
		dispose();
		Frame.setVisible(true);
		Frame.setSize(300,200);
		Frame.setTitle("Sales of Plants");
		Frame.getContentPane().add(pnl1);
	}		
}

public static void main(String[] args) 
{
	Garden a = new Garden();
}


}

