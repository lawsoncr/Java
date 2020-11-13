package solution;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 
 * @author Connor Lawson
 * @version 1.2.2520055562
 *
 */

public class Calculator
{
   
    JFrame frame;
   
    JButton addButton;
    JButton subButton;
    JButton multButton;
    JButton divButton;
   
    JTextField left;
    JTextField right;
   
    JPanel buttons = new JPanel();
    JPanel result = new JPanel();
    JPanel number = new JPanel();
   
    JLabel resultLabel;
    JLabel results;
    
    String first;
    String second;
    double numleft;
    double numright;
    double res;
   
    
   
    
   /**
    * no args constructor Calculator holds the frame for the calculator.
    */
    
    public Calculator()
    {
        frame = new JFrame();
        frame.setSize(300, 150);
        frame.setLocation(100, 100);
        frame.setTitle("Calculator");
       
        initializeComponents();
               
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
   
    /**
     * Sets all the buttons and components for the calculator.
     */
        
    public void initializeComponents()
    {
        
        left = new JTextField("", 10);
        left.setName("leftOperand");
        number.add(left);
       
        right = new JTextField("", 10);
        right.setName("rightOperand");
        number.add(right);
       
        frame.add(number, BorderLayout.NORTH);
        
        addButton = new JButton("ADD");
        addButton.setName("addButton");
        buttons.add(addButton);
       
        subButton = new JButton("SUB");
        subButton.setName("subButton");
        buttons.add(subButton);
       
        multButton = new JButton("MULT");
        multButton.setName("multButton");
        buttons.add(multButton);
       
        divButton = new JButton("DIV");
        divButton.setName("divButton");
        buttons.add(divButton);
       
        frame.add(buttons, BorderLayout.SOUTH);
        
        resultLabel = new JLabel(" ");
        resultLabel.setName("resultLabel");
        result.add(resultLabel);
       
        results = new JLabel("Result = ");
        result.setName("results");
        result.add(results);
            
        
        frame.add(result, BorderLayout.WEST);
        
               
        addActionListeners();
    }
    
    /**
     * Returns the frame.
     */
    public JFrame getFrame()
    {
        return frame;
    }
    
    /**
     * ActionListener interface specifies what happens to each of the buttons.
     */
    public void addActionListeners()
    {
        addButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateAdd();
            }
        });  
        
        subButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateSub();
            }
        });
        
        multButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateMult();
            }
        });
        
        divButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                updateDiv();
            }
        }); 
    }
    
    /**
     * Updates add button.
     */
    public void updateAdd()
    {    
        first = left.getText();
        second = right.getText();
        
        if (first.matches("[0-9.-]+") 
            && second.matches("[0-9.-]+"))
        {
            numleft = Double.parseDouble(first);
            numright = Double.parseDouble(second);
            res = numleft + numright;
            resultLabel.setText("" + res);
        }
        else
        {
            resultLabel.setText("Error");
        }
    }
    
    /**
     * Updates sub button.
     */
    public void updateSub()
    {
        first = left.getText();
        second = right.getText();
        
        if (first.matches("[0-9.-]+") 
            && second.matches("[0-9.-]+"))
        {
            numleft = Double.parseDouble(first);
            numright = Double.parseDouble(second);
            res = numleft - numright;
            resultLabel.setText("" + res);
        }
        else
        {
            resultLabel.setText("Error");
        }
    }
    
    /**
     * Updates mult button.
     */
    public void updateMult()
    {
        first = left.getText();
        second = right.getText();
        
        if (first.matches("[0-9.-]+") 
            && second.matches("[0-9.-]+"))
        {
            numleft = Double.parseDouble(first);
            numright = Double.parseDouble(second);
            res = numleft * numright;
            resultLabel.setText("" + res);
        }
        else
        {
            resultLabel.setText("Error");
        }
    }
    
    /**
     * Updates div button.
     */
    public void updateDiv()
    {
        first = left.getText();
        second = right.getText();
        
        if (first.matches("[0-9.-]+") 
            && second.matches("[1-9.-]+"))
        {
            numleft = Double.parseDouble(first);
            numright = Double.parseDouble(second);
            res = numleft / numright;
            resultLabel.setText("" + res);
        } 
        else
        {
            resultLabel.setText("Error");
        }
    }
    
    /**
     * Msin method that test uses.
     */
    public static void main(String[] args)
    {
       Calculator calc = new Calculator();     
    }
       
    
   
}

