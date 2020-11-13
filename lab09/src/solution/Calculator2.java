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
 * @author Connor Lawson
 * @version 3.2020145
 */
public class Calculator2
{
    private final static int DIMENSION = 400;
    JFrame calculatorFrame;
    
    JTextField infixExpression;
    JLabel equals;
    JButton calculateButton;
    JButton clearButton;
    JLabel resultLabel;
    
    JPanel inputPanel;
    JPanel buttonPanel;
    /**
     * Constructor.
     */
    public Calculator2()
    {
        calculatorFrame = new JFrame();
        calculatorFrame.setLocation(100, 100);
        calculatorFrame.setSize(DIMENSION, DIMENSION);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setTitle("Postfix Calculator");
        
        initializeComponents();
        
        calculatorFrame.pack();
        calculatorFrame.setVisible(true);
    }
    /**
     * Method for initializer
     */
    public void initializeComponents()
    {
        //JTextField equation;
        equals = new JLabel("=");
        equals.setName("equals");
        
        infixExpression = new JTextField(10);
        infixExpression.setName("infixExpression");
        
        resultLabel = new JLabel("");
        resultLabel.setName("resultLabel");
        
        calculateButton = new JButton("Calculate");
        calculateButton.setName("calculateButton");
        
        clearButton = new JButton("Clear");
        clearButton.setName("clearButton");
        addPanel();
        addActionListeners();
    }
    /**
     * Method that creates the panel.
     */
    public void addPanel()
    {
        buttonPanel = new JPanel();
        inputPanel = new JPanel();
        
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);
        inputPanel.add(infixExpression);
        inputPanel.add(equals);
        inputPanel.add(resultLabel);
        
        calculatorFrame.add(inputPanel, BorderLayout.PAGE_START);
        calculatorFrame.add(buttonPanel, BorderLayout.PAGE_END);
    }
    /**
     * Method for the action listeners.
     */
    public void addActionListeners()
    {
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                String postFix;
                double result;
                String answer;
                ExpressionEvaluator calc = new ExpressionEvaluator();
                postFix = calc.toPostfix(infixExpression.getText());
                if (!postFix.equals("error"))
                {
                    result = calc.evaluate(postFix);
                    answer = String.valueOf(result);
                    resultLabel.setText(answer);
                }
                else
                {
                    resultLabel.setText("error!");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                infixExpression.setText("");
            }
        });
    }
    /**
     * @return calculatorFrame.
     */
    public JFrame getFrame()
    {
        return calculatorFrame;
    }
    
}