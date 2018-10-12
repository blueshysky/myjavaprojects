import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonDemo_Extended implements  ActionListener{

    // Definition of global values and items that are part of the GUI.
    int redScoreAmount = 0;
    int blueScoreAmount = 0;
    int greenScoreAmount = 0;

    JPanel titlePanel, scorePanel, buttonPanel;
    JLabel redLabel, blueLabel, greenLabel, greenScore, redScore, blueScore;
    JButton redButton, blueButton, greenButton, resetButton;

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // Creation of a Panel to contain the title labels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(500, 30);
        totalGUI.add(titlePanel);

        redLabel = new JLabel("Red Team");
        redLabel.setLocation(0, 0);
        redLabel.setSize(120, 30);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);

        blueLabel = new JLabel("Blue Team");
        blueLabel.setLocation(130, 0);
        blueLabel.setSize(120, 30);
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);
        
        greenLabel = new JLabel("Green Team");
        greenLabel.setLocation(260,0);
        greenLabel.setSize(120,30);
        greenLabel.setHorizontalAlignment(0);
        greenLabel.setForeground(Color.green);
        titlePanel.add(greenLabel);
        // Creation of a Panel to contain the score labels.
        scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(10, 40);
        scorePanel.setSize(500, 30);
        totalGUI.add(scorePanel);

        redScore = new JLabel(""+redScoreAmount);
        redScore.setLocation(0, 0);
        redScore.setSize(120, 30);
        redScore.setHorizontalAlignment(0);
        scorePanel.add(redScore);

        blueScore = new JLabel(""+blueScoreAmount);
        blueScore.setLocation(130, 0);
        blueScore.setSize(120, 30);
        blueScore.setHorizontalAlignment(0);
        scorePanel.add(blueScore);

        greenScore = new JLabel(""+greenScoreAmount);
        greenScore.setLocation(260, 0);
        greenScore.setSize(120, 30);
        greenScore.setHorizontalAlignment(0);
        scorePanel.add(greenScore);
        
        // Creation of a Panel to contain all the JButtons.
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(500, 70);
        totalGUI.add(buttonPanel);

        // We create a button and manipulate it using the syntax we have
        // used before. Now each button has an ActionListener which posts 
        // its action out when the button is pressed.
        redButton = new JButton("Red Score!");
        redButton.setLocation(0, 0);
        redButton.setSize(120, 30);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        blueButton = new JButton("Blue Score!");
        blueButton.setLocation(130, 0);
        blueButton.setSize(120, 30);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        greenButton = new JButton("Green Score!");
        greenButton.setLocation(260, 0);
        greenButton.setSize(120, 30);
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);
        
        resetButton = new JButton("Reset Score");
        resetButton.setLocation(0, 40);
        resetButton.setSize(380, 30);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    // This is the new ActionPerformed Method.
    // It catches any events with an ActionListener attached.
    // Using an if statement, we can determine which button was pressed
    // and change the appropriate values in our GUI.
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == redButton)
        {
            redScoreAmount = redScoreAmount + 1;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blueButton)
        {
            blueScoreAmount = blueScoreAmount + 1;
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == greenButton)
        {
        	greenScoreAmount = greenScoreAmount + 1;
        	greenScore.setText(""+greenScoreAmount);
        }
        else if(e.getSource() == resetButton)
        {
            redScoreAmount = 0;
            blueScoreAmount = 0;
            greenScoreAmount = 0;
            redScore.setText(""+redScoreAmount);
            blueScore.setText(""+blueScoreAmount);
            greenScore.setText(""+greenScoreAmount);
        }
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JButton Scores! [=]");

        //Create and set up the content pane.
        ButtonDemo_Extended demo = new ButtonDemo_Extended();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 190);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
