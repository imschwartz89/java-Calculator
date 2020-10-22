import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//////////////////////////////
// Author: Ian Schwartz
// Created: 12/16/2016
// Last Update: 10/20/2020
//////////////////////////////

public class calcGUI extends JFrame implements MouseListener{

    Calculator one = new Calculator();
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();

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
	private JButton negButton = new JButton("neg");

	public calcGUI()
	{
		//frame.setLayout(new FlowLayout());
//		JButton equalButton = new JButton("=");
//		JButton addButton = new JButton("+");
//		JButton subButton = new JButton("-");
//		JButton multButton = new JButton("*");
//		JButton divButton = new JButton("/");
//		JButton modButton = new JButton("%");
//		JButton button1 = new JButton("1");
//		JButton button2 = new JButton("2");
//		JButton button3 = new JButton("3");
//		JButton button4 = new JButton("4");
//		JButton button5 = new JButton("5");
//		JButton button6 = new JButton("6");
//		JButton button7 = new JButton("7");
//		JButton button8 = new JButton("8");
//		JButton button9 = new JButton("9");
//		button9.addMouseListener(this);
//		JButton button0 = new JButton("0");
//		button0.addMouseListener(this);
//		JButton decButton = new JButton(".");
//		JButton intButton = new JButton("int");
//		JButton shortButton = new JButton("short");
//		JButton longButton = new JButton("long");
//		JButton floatButton = new JButton("float");
//		JButton doubleButton = new JButton("double");
//		JButton resetButton = new JButton("R");
//		JButton negButton = new JButton("neg");

    //add listeners to buttons
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

    //initialize button sizes and add them to the panel
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(350,550));
		equalButton.setBounds(265, 445, 80, 100);
		panel.add(equalButton);
		addButton.setBounds(265, 385, 80, 60);
		panel.add(addButton);
		subButton.setBounds(265, 325, 80, 60);
		panel.add(subButton);
		multButton.setBounds(265, 265, 80, 60);
		panel.add(multButton);
		divButton.setBounds(265, 205, 80, 60);
		panel.add(divButton);
		modButton.setBounds(265, 145, 80, 60);
		panel.add(modButton);

		button1.setBounds(85, 355, 60, 75);
		//button1.setBackground(Color.RED);
		//button1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(button1);
		button2.setBounds(145, 355, 60, 75);
		panel.add(button2);
		button3.setBounds(205, 355, 60, 75);
		panel.add(button3);
		button4.setBounds(85, 280, 60, 75);
		panel.add(button4);
		button5.setBounds(145, 280, 60, 75);
		panel.add(button5);
		button6.setBounds(205, 280, 60, 75);
		panel.add(button6);
		button7.setBounds(85, 205, 60, 75);
		panel.add(button7);
		button8.setBounds(145, 205, 60, 75);
		panel.add(button8);
		button9.setBounds(205, 205, 60, 75);
		panel.add(button9);
		button0.setBounds(145, 430, 60, 115);
		panel.add(button0);

		decButton.setBounds(85, 430, 60, 60);
		panel.add(decButton);
		resetButton.setBounds(205, 430, 60, 115);
		panel.add(resetButton);
		negButton.setBounds(85, 490, 60, 55);
		panel.add(negButton);

		intButton.setBounds(5, 145, 80, 80);
		panel.add(intButton);
		shortButton.setBounds(5, 225, 80, 80);
		panel.add(shortButton);
		longButton.setBounds(5, 305, 80, 80);
		panel.add(longButton);
		floatButton.setBounds(5, 385, 80, 80);
		panel.add(floatButton);
		doubleButton.setBounds(5, 465, 80, 80);
		panel.add(doubleButton);

		label.setBounds(20, 10, 150, 100);
		frame.add(label);

		label2.setBounds(120, 0, 150, 100);
		frame.add(label2);

		label3.setBounds(20, 70, 150, 100);
		label3.setText("int");
		frame.add(label3);

    //add panel to the frame
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible(true);
	}

  //handling when a mouse click occurs
	public void mouseEntered(MouseEvent e)
	{

	}
	public void mouseClicked(MouseEvent e)
	{
    //handling each button
		if(e.getSource() == button0)
		{
			label.setText(label.getText() + "0");
		}
		else if(e.getSource() == button1)
		{
			label.setText(label.getText() + "1");
		}
		else if(e.getSource() == button2)
		{
			label.setText(label.getText() + "2");
		}
		else if(e.getSource() == button3)
		{
			label.setText(label.getText() + "3");
		}
		else if(e.getSource() == button4)
		{
			label.setText(label.getText() + "4");
		}
		else if(e.getSource() == button5)
		{
			label.setText(label.getText() + "5");
		}
		else if(e.getSource() == button6)
		{
			label.setText(label.getText() + "6");
		}
		else if(e.getSource() == button7)
		{
			label.setText(label.getText() + "7");
		}
		else if(e.getSource() == button8)
		{
			label.setText(label.getText() + "8");
		}
		else if(e.getSource() == button9)
		{
			label.setText(label.getText() + "9");
		}
		else if(e.getSource() == intButton)
		{
            label3.setText("int");
		}
		else if(e.getSource() == shortButton)
		{
            label3.setText("short");
		}
		else if(e.getSource() == longButton)
		{
            label3.setText("long");
		}
		else if(e.getSource() == floatButton)
		{
            label3.setText("float");
		}
		else if(e.getSource() == doubleButton)
		{
            label3.setText("double");
		}
		else if(e.getSource() == negButton)
		{
			label.setText("-");
		}
		else if(e.getSource() == decButton)
		{
			label.setText(label.getText() + ".");
		}
		else if(e.getSource() == resetButton)
		{
			label.setText("");
		}
		else if(e.getSource() == addButton)
		{
			label2.setText("" + label.getText() + "  + ");
			label.setText("");
		}
		else if(e.getSource() == subButton)
		{
			label2.setText("" + label.getText() + "  - ");
			label.setText("");
		}
		else if(e.getSource() == multButton)
		{
			label2.setText("" + label.getText() + "  * ");
			label.setText("");
		}
		else if(e.getSource() == divButton)
		{
			label2.setText("" + label.getText() + "  / ");
			label.setText("");
		}
		else if(e.getSource() == modButton)
		{
			label2.setText("" + label.getText() + "  % ");
			label.setText("");
		}
		else if(e.getSource() == equalButton)
		{
			String input = label2.getText() + label.getText();
			String number = "0";
			double num1 = 0;
			double num2 = 0;
			char sign = '0';
			char datatype = label3.getText().charAt(0);

			//NEEDS ERROR CHECKING, clear button, memory

			//need to parse numbers
			num1 = Double.parseDouble(input.substring(0, input.indexOf(" ")));
			//System.out.println("num1: " + num1);
			input = input.substring(input.indexOf(" ") + 2);

			sign = input.substring(0, input.indexOf(" ")).charAt(0);
			//System.out.println("sign: " + sign);
			input = input.substring(input.indexOf(" ") + 1);

			num2 = Double.parseDouble(input);
			//System.out.println("num2: " + num2);

			//need to give to right method based on given sign and data type
      if(sign == '+')
      {
        if(datatype == 'i')
        {
          number = "" + one.addInt(num1, num2);
        }
        else if(datatype == 's')
        {
          number = "" + one.addShort(num1, num2);
        }
        else if(datatype == 'l')
        {
          number = "" + one.addLong(num1, num2);
        }
        else if(datatype == 'f')
        {
          number = "" + one.addFloat(num1, num2);
        }
        else if(datatype == 'd')
        {
          number = "" + one.addDouble(num1, num2);
        }
      }
      else if(sign == '-')
      {
        if(datatype == 'i')
        {
          number = "" + one.subInt(num1, num2);
        }
        else if(datatype == 's')
        {
          number = "" + one.subShort(num1, num2);
        }
        else if(datatype == 'l')
        {
          number = "" + one.subLong(num1, num2);
        }
        else if(datatype == 'f')
        {
          number = "" + one.subFloat(num1, num2);
        }
        else if(datatype == 'd')
        {
          number = "" + one.subDouble(num1, num2);
        }
      }
      else if(sign == '*')
      {
        if(datatype == 'i')
        {
          number = "" + one.multInt(num1, num2);
        }
        else if(datatype == 's')
        {
          number = "" + one.multShort(num1, num2);
        }
        else if(datatype == 'l')
        {
          number = "" + one.multLong(num1, num2);
        }
        else if(datatype == 'f')
        {
          number = "" + one.multFloat(num1, num2);
        }
        else if(datatype == 'd')
        {
          number = "" + one.multDouble(num1, num2);
        }
      }
      else if(sign == '/')
      {
        if(datatype == 'i')
        {
          number = "" + one.divInt(num1, num2);
        }
        else if(datatype == 's')
        {
          number = "" + one.divShort(num1, num2);
        }
        else if(datatype == 'l')
        {
          number = "" + one.divLong(num1, num2);
        }
        else if(datatype == 'f')
        {
          number = "" + one.divFloat(num1, num2);
        }
        else if(datatype == 'd')
        {
          number = "" + one.divDouble(num1, num2);
        }
      }
      else if(sign == '%')
      {
        if(datatype == 'i')
        {
          number = "" + one.modInt(num1, num2);
        }
        else if(datatype == 's')
        {
          number = "" + one.modShort(num1, num2);
        }
        else if(datatype == 'l')
        {
          number = "" + one.modLong(num1, num2);
        }
        else if(datatype == 'f')
        {
          number = "" + one.modFloat(num1, num2);
        }
        else if(datatype == 'd')
        {
          number = "" + one.modDouble(num1, num2);
        }
      }
			else
			{
        label.setText("No sign given");
			}

			//then print results
			label2.setText(label2.getText() + " " + label.getText() + " = " + number);
			label.setText("");


		}

	}
	public void mouseExited(MouseEvent e)
	{

	}
	public void mousePressed(MouseEvent e)
	{

	}
	public void mouseReleased(MouseEvent e)
	{

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calcGUI();
	}
}
