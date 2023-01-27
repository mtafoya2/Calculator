package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.log;
import static java.lang.Math.sqrt;

/**
 *  Calculator class that inherits the JFrame Class.
 *  This class creates a functional calculator object
 *  with various arithmetic operations.
 *
 * @author Mario Tafoya
 * @version 1.0 Build November 6, 2022
 */
public class Calculator extends JFrame{

    /**
     * creates the panel of the calculator
     */
    public JPanel Calculator;
    /**
     * Creates the text field of the calculator for output
     */
    public JTextField textField;
    /**
     * Creates a Button to implement a value squared
     */
    public JButton squareBtn;
    /**
     * Creates a button to implement division
     */
    public JButton divideBtn;
    /**
     * Creates a button to implement addition
     */
    public JButton addBtn;
    /**
     * Creates a button to implement square root
     */
    public JButton sqrBtn;
    /**
     * Creates a button to implement natural log
     */
    public JButton logBtn;
    /**
     * Creates a button to implement power
     */
    public JButton powerBtn;
    /**
     * Creates a button to implement clear
     */
    public JButton clearBtn;
    /**
     * Creates a button to implement the number seven
     */
    public JButton sevenBtn;
    /**
     * Creates a button to implement the number four
     */
    public JButton fourBtn;
    /**
     * Creates a button to implement the number one
     */
    public JButton oneBtn;
    /**
     * Creates a button to implement the number zero
     */
    public JButton zeroBtn;
    /**
     * Creates a button to implement multiplication
     */
    public JButton mulBtn;
    /**
     * Creates a button to implement subtraction
     */
    public JButton minusBtn;
    /**
     * Creates a button to implement equality
     */
    public JButton equalBtn;
    /**
     * Creates a button to implement percentage
     */
    public JButton percentageBtn;
    /**
     * Creates a button to implement the number nine
     */
    public JButton nineBtn;
    /**
     * Creates a button to implement the number six
     */
    public JButton sixBtn;
    /**
     * Creates a button to implement the number three
     */
    public JButton threeBtn;
    /**
     * Creates a button to implement digit
     */
    public JButton digitBtn;
    /**
     * Creates a button to implement sign of the number
     */
    public JButton signBtn;
    /**
     * Creates a button to implement the number eight
     */
    public JButton eightBtn;
    /**
     * Creates a button to implement the number five
     */
    public JButton fiveBtn;
    /**
     * Creates a button to implement the number two
     */
    public JButton twoBtn;

    //Initialize the String for event handling & arithmetic values
    /**
     * String that holds the value of the text-field
     */
    String storage = "";           //Stores the string output
    /**
     * Stores string operation
     */
    String op = "";                //Stores the string operation
    /**
     * double variables that will hold intermidate operations and results
     */
    double numOne, numTwo, result; //String output to double
    /**
     * Hold the integer output
     */
    int res;                       //String output to int

    /**
     * Checks to see if the string is a decimal or integer value
     *
     */
    void checkType(){
        //using mod opearator we can check if a number is a decimal
        if (result % 1 != 0) textField.setText(String.valueOf(result));
        else {
            res = (int)result;
            textField.setText(String.valueOf(res));
        }
        storage = result + "";       //Reassign storage to result
    }

    /**
     * Creates a innerClass object to handle events
     */
    eventHandler handler = new eventHandler();

    /**
     * Initializes action listener for all buttons on the subclass eventHandler
     */
    public Calculator() {
        squareBtn.addActionListener(handler);
        powerBtn.addActionListener(handler);
        signBtn.addActionListener(handler);
        eightBtn.addActionListener(handler);
        fiveBtn.addActionListener(handler);
        twoBtn.addActionListener(handler);
        clearBtn.addActionListener(handler);
        sevenBtn.addActionListener(handler);
        fourBtn.addActionListener(handler);
        oneBtn.addActionListener(handler);
        zeroBtn.addActionListener(handler);
        logBtn.addActionListener(handler);
        percentageBtn.addActionListener(handler);
        nineBtn.addActionListener(handler);
        sixBtn.addActionListener(handler);
        threeBtn.addActionListener(handler);
        digitBtn.addActionListener(handler);
        sqrBtn.addActionListener(handler);
        addBtn.addActionListener(handler);
        equalBtn.addActionListener(handler);
        divideBtn.addActionListener(handler);
        mulBtn.addActionListener(handler);
        minusBtn.addActionListener(handler);
    }

    /**
     *An inner class that inherits from the outer class and defines the action listener
     */
    public class eventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            /*Operations in the form if buttonpressed do something*/
            if (event.getSource() == zeroBtn) {
                storage += zeroBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == oneBtn) {
                storage += oneBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == twoBtn) {
                storage += twoBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == threeBtn) {
                storage += threeBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == fourBtn) {
                storage += fourBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == fiveBtn) {
                storage += fiveBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == sixBtn) {
                storage += sixBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == sevenBtn) {
                storage += sevenBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == eightBtn) {
                storage += eightBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == nineBtn) {
                storage += nineBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == clearBtn) {
                storage = "";
                textField.setText(zeroBtn.getText());
            }
            if(event.getSource() == digitBtn){
                storage += digitBtn.getText();
                textField.setText(storage);
            }
            if (event.getSource() == addBtn) {
                //Get the value of the current textfield
                try {
                    numOne = Double.parseDouble(textField.getText());   //set my first number
                    textField.setText("");                              //empty the textfield
                    op = "+";                                           //set the operation
                    storage = "";                                       //empty the storage string
                }catch (Exception e)
                {
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == minusBtn){
                //Get the value of the curretn textfield
                try {
                    numOne = Double.parseDouble(textField.getText());
                    textField.setText("");
                    op = "-";
                    storage = "";
                }catch (Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == mulBtn){
                //Get the value of the curretn textfield
                try {
                    numOne = Double.parseDouble(textField.getText());
                    textField.setText("");
                    op = "*";
                    storage = "";
                }catch(Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == divideBtn){
                //Get the value of the curretn textfield
                try {
                    numOne = Double.parseDouble(textField.getText());
                    textField.setText("");
                    op = "/";
                    storage = "";
                }catch(Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == squareBtn){
                try {
                    result = Double.parseDouble(storage);     //Number imputed will provide the operation
                    result *= result;                         //square the result
                    checkType();                              //check to print double or int
                }catch (Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == logBtn){
                try {
                    result = Double.parseDouble(storage);      //parse the result
                }catch (Exception e)
                {
                    textField.setText("ERROR");                //If there is no input
                }
                if(result<= 0){                                //case when log is less than zero
                    textField.setText("ERROR");
                }else {
                    result = log(result);                      //do the logarithic operation
                    checkType();
                }
            }
            if(event.getSource() == sqrBtn){
                try {
                    result = Double.parseDouble(storage);
                    if(result<0){
                        textField.setText("ERROR");
                    }else {
                        result = sqrt(result);
                        checkType();
                    }
                }catch (Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == powerBtn){
                //Get the value of the curretn textfield
                try {
                    numOne = Double.parseDouble(textField.getText());
                    textField.setText("");
                    op = "p";
                    storage = "";
                }catch (Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == signBtn)
            {
                try{
                    if(storage.charAt(0) == '-'){                              //check if first char is neg
                        StringBuilder biulder = new StringBuilder(storage);    //update to positive using stingbiulder methods
                        biulder.deleteCharAt(0);
                        storage = biulder.toString();
                    }else storage = "-" + storage;                             //if not neg update storage to neg value
                    textField.setText(storage);
                }catch (Exception e){
                    textField.setText("ERROR");
                }
            }
            if(event.getSource() == percentageBtn){
                try{
                    result = Double.parseDouble(storage);
                    result = result/100;                            //Percentage is just divding by 100
                    checkType();
                }catch (Exception e){
                    textField.setText("ERROR");
                }
            }
            if (event.getSource() == equalBtn) {                    //equal button handles most of arithmetic operations
                //This will tell us to print in decimal or int
                try {
                    numTwo = Double.parseDouble(textField.getText());   //Turn second input into double
                    storage = "";                                       //empty storage
                }catch (Exception E)
                {
                    textField.setText("ERROR");
                }
                switch (op) {                                       //check to see operation
                    case ("+") -> {
                        result = numOne + numTwo;
                        checkType();
                    }
                    case ("-") -> {
                        result = numOne - numTwo;
                        checkType();
                    }
                    case ("*") -> {
                        result = numOne * numTwo;
                        checkType();
                    }
                    case ("/") -> {
                        if (numTwo == 0) {
                            textField.setText("ERROR");
                            break;
                        }
                        result = numOne / numTwo;
                        checkType();
                    }
                    case ("p") ->{
                        //check if power is zero
                        if(numTwo == 0) result = 1;
                        else{
                           result = 1;
                            for (int i = 1; i <= numTwo; i++)
                                result *= numOne;
                        }
                        checkType();
                    }
                }
            }
        }
    }

    /**
     * method to test the Calculator class defines clicks based on cases
     * @param button Input the desired button
     */
    public void test( String button){
        switch (button){
            case "0": zeroBtn.doClick();break;
            case "1": oneBtn.doClick();break;
            case "2": twoBtn.doClick();break;
            case "3": threeBtn.doClick();break;
            case "4": fourBtn.doClick();break;
            case "5": fiveBtn.doClick();break;
            case "6": sixBtn.doClick();break;
            case "7": sevenBtn.doClick();break;
            case "8": eightBtn.doClick();break;
            case "9": nineBtn.doClick();break;
            case "%": percentageBtn.doClick();break;
            case "-/+": signBtn.doClick();break;
            case "AC": clearBtn.doClick();break;
            case "*2": squareBtn.doClick();break;
            case "sqr": sqrBtn.doClick();break;
            case "log": logBtn.doClick();break;
            case ".": digitBtn.doClick();break;
            case "+": addBtn.doClick();break;
            case "-": minusBtn.doClick();break;
            case "*": mulBtn.doClick();break;
            case "/": divideBtn.doClick();break;
            case "**": powerBtn.doClick();break;
            case "=": equalBtn.doClick();break;
            case "txt": System.out.println("The result is: " + textField.getText());break;
            default:System.out.println("invalid input");break;
        }
    }

    /**
     * Main method that will show the GUI and close on exit
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
