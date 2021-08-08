import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//////////////////////////////
// Author: Ian Schwartz
// Created: 10/6/2020
// Last Update: 10/19/2020
//////////////////////////////

public class calcGUI extends JFrame implements MouseListener{

  Calculator one = new Calculator();
  private JFrame frame = new JFrame();
  private JPanel panel = new JPanel();
  private JLabel numberLabel = new JLabel();   //contains the current number being entered
  private JLabel equationLabel = new JLabel(); //contains the current equation
  private JLabel dataTypeLabel = new JLabel(); //contains the current selected data type
  private JLabel errorLabel = new JLabel();    //contains the error/warning message if there is one
  private JLabel equalLabel = new JLabel();    //contains the computed number

  private JButton equalButton = new JButton("=");
  private JButton addButton = new JButton("+");
  private JButton subButton = new JButton("-");
  private JButton multButton = new JButton("*");
  private JButton divButton = new JButton("/");
  private JButton modButton = new JButton("%");
  private JButton button1 = new JButton("1");
  private JButton button2 = new JButton("2");
  private JButton button3 = new JButton("3");
  private JButton button4 = new JButton("4");
  private JButton button5 = new JButton("5");
  private JButton button6 = new JButton("6");
  private JButton button7 = new JButton("7");
  private JButton button8 = new JButton("8");
  private JButton button9 = new JButton("9");
  private JButton button0 = new JButton("0");
  private JButton decButton = new JButton(".");
  private JButton intButton = new JButton("int");
  private JButton shortButton = new JButton("short");
  private JButton longButton = new JButton("long");
  private JButton floatButton = new JButton("float");
  private JButton doubleButton = new JButton("double");
  private JButton resetButton = new JButton("R");
  private JButton negButton = new JButton("neg");//the negative button, adds or removes a negative sign to the number

  public calcGUI()
  {
    initListeners(); //initialize buttons

    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
    panel.setLayout(null); //will be replaced with a correct GridLayout/GridBagLayout
    panel.setPreferredSize(new Dimension(400,550));


    setBoundsButtons(); //creates each button of the desired size (will be removed after GridLayout)
    panelAddButtons();  //add buttons to the panels

    frameAddLabels();   //add labels to the frame

    frame.add(panel, BorderLayout.CENTER); //add panel to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Calculator");
    frame.pack();
    frame.setVisible(true);
    frame.setResizable(false);
  }

  //initializes mouse to listen to all buttons
  public void initListeners()
  {
    button0.addMouseListener(this);
    button1.addMouseListener(this);
    button2.addMouseListener(this);
    button3.addMouseListener(this);
    button4.addMouseListener(this);
    button5.addMouseListener(this);
    button6.addMouseListener(this);
    button7.addMouseListener(this);
    button8.addMouseListener(this);
    button9.addMouseListener(this);

    equalButton.addMouseListener(this);
    addButton.addMouseListener(this);
    subButton.addMouseListener(this);
    multButton.addMouseListener(this);
    divButton.addMouseListener(this);
    modButton.addMouseListener(this);

    decButton.addMouseListener(this);
    resetButton.addMouseListener(this);
    negButton.addMouseListener(this);

    intButton.addMouseListener(this);
    shortButton.addMouseListener(this);
    longButton.addMouseListener(this);
    floatButton.addMouseListener(this);
    doubleButton.addMouseListener(this);
  }

  //create desired size and location for each button
  //  will not be needed after GridLayout/GridBagLayout is used
  public void setBoundsButtons()
  {
    equalButton.setBounds(305, 445, 90, 100);
    addButton.setBounds(305, 385, 90, 60);
    subButton.setBounds(305, 325, 90, 60);
    multButton.setBounds(305, 265, 90, 60);
    divButton.setBounds(305, 205, 90, 60);
    modButton.setBounds(305, 145, 90, 60);

    button1.setBounds(95, 355, 70, 75);
    button2.setBounds(165, 355, 70, 75);
    button3.setBounds(235, 355, 70, 75);
    button4.setBounds(95, 280, 70, 75);
    button5.setBounds(165, 280, 70, 75);
    button6.setBounds(235, 280, 70, 75);
    button7.setBounds(95, 205, 70, 75);
    button8.setBounds(165, 205, 70, 75);
    button9.setBounds(235, 205, 70, 75);
    button0.setBounds(165, 430, 70, 115);

    decButton.setBounds(95, 430, 70, 60);
    resetButton.setBounds(235, 430, 70, 115);
    negButton.setBounds(95, 490, 70, 55);

    intButton.setBounds(5, 145, 90, 80);
    shortButton.setBounds(5, 225, 90, 80);
    longButton.setBounds(5, 305, 90, 80);
    floatButton.setBounds(5, 385, 90, 80);
    doubleButton.setBounds(5, 465, 90, 80);
  }

  //add all buttons to the panel so they can be displayed
  public void panelAddButtons()
  {
    panel.add(equalButton);
    panel.add(addButton);
    panel.add(subButton);
    panel.add(multButton);
    panel.add(divButton);
    panel.add(modButton);

    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel.add(button7);
    panel.add(button8);
    panel.add(button9);
    panel.add(button0);

    panel.add(decButton);
    panel.add(resetButton);
    panel.add(negButton);

    panel.add(intButton);
    panel.add(shortButton);
    panel.add(longButton);
    panel.add(floatButton);
    panel.add(doubleButton);
  }

  //add all labels to the frame to allow user
  //  to be able to read what the equation, numbers, errors/warnings, and answer are
  public void frameAddLabels()
  {
    numberLabel.setBounds(10, 90, 380, 25);
    numberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    //numberLabel.setText("numberLabel"); //allows to see where numberLabel is
    frame.add(numberLabel);

    equationLabel.setBounds(10, 35, 380, 25);
    equationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    //equationLabel.setText("equationLabel"); //allows to see where equationLabel is
    frame.add(equationLabel);

    equalLabel.setBounds(10, 50, 380, 25);
    equalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    //equalLabel.setText("equalLabel-ABCDEFGHIJKLMNOPQRSTUVWXYZ"); //allows to see where equalLabel is
    frame.add(equalLabel);

    dataTypeLabel.setBounds(20, 115, 50, 25);
    dataTypeLabel.setText("int");
    frame.add(dataTypeLabel);

    errorLabel.setBounds(10, 5, 380, 25);
    //errorLabel.setText("ERROR - TESTING LENGTH OF THE BOX ABCDEFGHIJKLMNOPQRSTUVWXYZ"); //testing purposes
    frame.add(errorLabel);
  }


  //methods to handle mouse events, only need mouseClicked()
  public void mouseEntered(MouseEvent e) { }
  public void mouseClicked(MouseEvent e)
  {
    //determines what button is pressed if any are pressed
    //  will run the correct method for the button pressed afterwards
    if(isNumButtonPressed(e))
    {
      //this includes numbers 0-9 and the decimal buttons
      numButtonPressed((JButton)e.getSource());
    }
    else if(isDataTypeButtonPressed(e))
    {
      //this includes int, short, long, float, and double buttons
      dataTypeButtonPressed((JButton)e.getSource());
    }
    else if(e.getSource() == negButton)
    {
      negButtonPressed();
    }
    else if(e.getSource() == resetButton)
    {
      resetButtonPressed();
    }
    else if(isSignTypeButtonPressed(e))
    {
      signTypeButtonPressed((JButton)e.getSource());
    }
    else if(e.getSource() == equalButton)
    {
      equalButtonPressed();
    }

  }
  public void mouseExited(MouseEvent e) { }
  public void mousePressed(MouseEvent e) { }
  public void mouseReleased(MouseEvent e) { }

  //returns whether or not a number button is pressed
  //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
  //  also includes decimal button as well "."
  public boolean isNumButtonPressed(MouseEvent e)
  {
    return (e.getSource() == button0 || e.getSource() == button1 || e.getSource() == button2
      || e.getSource() == button3 || e.getSource() == button4 || e.getSource() == button5
      || e.getSource() == button6 || e.getSource() == button7 || e.getSource() == button8
      || e.getSource() == button9 || e.getSource() == decButton);
  }

  //returns whether a data type button has been pressed
  //  int, short, long, float, double
  public boolean isDataTypeButtonPressed(MouseEvent e)
  {
    return (e.getSource() == intButton || e.getSource() == shortButton || e.getSource() == longButton
      || e.getSource() == floatButton || e.getSource() == doubleButton);
  }

  //returns whether a sign button has been pressed
  //  add, sub, mult, div, mod
  public boolean isSignTypeButtonPressed(MouseEvent e)
  {
    return (e.getSource() == addButton || e.getSource() == subButton || e.getSource() == multButton
      || e.getSource() == divButton || e.getSource() == modButton);
  }

  //determines what to do if a number button is pressed
  public void numButtonPressed(JButton button)
  {
    //check if button pressed is decimal button
    //  if it is make sure there are no other decimals before adding decimal to the numberLabel
    //  otherwise, add a number to the numberLabel
    if(button == decButton)
    {
      if(numberLabel.getText().indexOf(".") == -1)
      {
        //has no decimal, add the decimal to the number
        numberLabel.setText(numberLabel.getText() + button.getText());
      }
      else
      {
        errorLabel.setText(one.returnWarning(2)); //already has a decimal warning
      }
    }
    else
    {
      errorLabel.setText("");
      numberLabel.setText(numberLabel.getText() + button.getText());
    }
  }


  //if a data type button is pressed, then change dataTypeLabel to be the buttons text value
  //  (this changes the selected data type by doing this)
  public void dataTypeButtonPressed(JButton button)
  {
    dataTypeLabel.setText(button.getText());
  }

  //determines what to do if a sign button is pressed
  public void signTypeButtonPressed(JButton button)
  {
    //if the numberLabel is empty, it means they want to reuse the answer
    //otherwise, they are starting a new equation with new numbers
    if(numberLabel.getText() == "")
    {
      //set the equationLabel equal to the equalLabel and the sign button value, then reset equalLabel
      equationLabel.setText("" + equalLabel.getText() + "  " + button.getText() + " ");
      equalLabel.setText("");
    }
    else
    {
      //set the equationLabel equal to the numberLabel and the sign button value, then reset numberLabel
      equationLabel.setText("" + numberLabel.getText() + "  " + button.getText() + " ");
      numberLabel.setText("");
    }
  }

  //determine what to do if the negative button is pressed
  public void negButtonPressed()
  {
    //check if the number has a length and then check if there is a negative sign at the front
    if(numberLabel.getText().length() > 0 && numberLabel.getText().charAt(0) == '-')
    {
      //there already is a negative sign, so remove it
      numberLabel.setText(numberLabel.getText().substring(1));
    }
    else
    {
      //there is no negative sign, add one to the front of the number
      numberLabel.setText("-" + numberLabel.getText());
    }
  }

  //determines what to do if the reset button is pressed
  //  if the reset button is clicked 3 times in a row,
  //    then numberLabel, equationLabel, and equalLabel will all be reset
  public void resetButtonPressed()
  {
    //check if reset should reset numberLabel, equationLabel, or equalLabel
    //  if numberLabel has a number, reset numberLabel
    //  if the equationLabel is empty, then reset the equalLabel
    //  otherwise, reset equationLabel
    if(numberLabel.getText() != "")
    {
      numberLabel.setText("");
    }
    else if(equationLabel.getText() == "")
    {
      equalLabel.setText("");
    }
    else
    {
      equationLabel.setText("");
    }
  }

  //determines what to do when the equal button is pressed
  public void equalButtonPressed()
  {
    String errorMessage = "";  //stores any error message that is returned by calc()
    String input = equationLabel.getText() + numberLabel.getText(); //combine inputs into one location
    String number = "0";  //stores number as a String to be displayed later
    double num1 = 0;  //holds the first number entered
    double num2 = 0;  //holds the second number entered
    char sign = '0';  //holds the sign value
    char datatype = dataTypeLabel.getText().charAt(0); //gets the data type from the dataTypeLabel

    int hasEqual = equationLabel.getText().indexOf("="); //checks if there is a "=" in the equationLabel already

    //nothing is being inputted, so there is nothing to do, return to end method
    if(equationLabel.getText() == "")
    {
      return;
    }
    //if numberLabel is empty then need to check that equationLabel has necessary things
    //  if there is no equal sign, then it is missing a number in the equation and there is nothing to do
    if(numberLabel.getText() == "" && hasEqual == -1)
    {
      return;
    }

    //checking for equals sign and then removing it, to prevent multiple "=" in output
    if(hasEqual != -1)
    {
      input = input.substring(0, input.indexOf("="));
    }

    //need to parse numbers
    //parse num1, up to first space we place in equation String
    num1 = Double.parseDouble(input.substring(0, input.indexOf(" ")));

    //change input String to not include the first number
    input = input.substring(input.indexOf(" ") + 2);

    //parse the sign out, up to first space we place in the equation String
    sign = input.substring(0, input.indexOf(" ")).charAt(0);

    //change input String to not include the sign
    input = input.substring(input.indexOf(" ") + 1);

    //parse num2, which is the remaining String
    num2 = Double.parseDouble(input);


    //calculate using the sign, dataType, and numbers: num1, num2
    //  and save error/warning message if there is one
    errorMessage = one.calc(sign, datatype, num1, num2);

    //turn the number from the calculation into a String
    number = one.makeNumberString(datatype);

    //update labels to display new information
    updateLabels(hasEqual, errorMessage, number);
  }

  //update labels to display new information
  //  runs in equalButtonPressed(), not meant to be run by itself
  public void updateLabels(int hasEqual, String errorMessage, String number)
  {
    //check if there is an equal sign in the equationLabel
    //  add the equal sign if necessary
    if(hasEqual == -1)
    {
      equationLabel.setText(equationLabel.getText() + " " + numberLabel.getText() + " = ");
    }

    //clear the numberLabel and display error/warning message
    numberLabel.setText("");
    errorLabel.setText(errorMessage);

    //check if there is an error or warning
    //  if the errorLabel is not empty and the first character is an E,
    //    then there is an error and no value to display
    //  otherwise, display the number that was returned
    if(errorLabel.getText() != "" && errorLabel.getText().charAt(0) == 'E')
    {
      equalLabel.setText("");
    }
    else
    {
      equalLabel.setText(number);
    }
  }

  //IS NOT USED
  //method to count how many decimals a String has
  //  returns the number of decimals in the String as an int
  public int countDecimals(String s)
  {
    int count = 0;
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == '.')
      {
        count++;
      }
    }
    return count;
  }

  //MAIN METHOD
  //launches the GUI by calling the constructor
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new calcGUI();
  }
}
