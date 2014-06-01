/**
 * @(#)CoffeeFrame.java
 *
 *
 * @author
 * @version 1.00 2014/5/13
 */
import javax.swing.*;


public class CoffeeFrame extends JFrame {
   	JPanel myPanel;
   	JButton myButton;
   	JLabel myLabel;

    public CoffeeFrame(){
    	myPanel= new JPanel();
    	myButton= new JButton("OK");
    	myLabel = new JLabel();

    	myPanel.add(myButton);
    	myPanel.add(myLabel);
    	this.add(myPanel);
    	//adds components of frame
    	this.setTitle("Sound Board Creator");
    	this.setSize(640, 480);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    }



}