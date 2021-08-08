import java.util.Scanner;

//////////////////////////////
// Author: Ian Schwartz
// Created: 10/6/2020
// Last Update: 10/19/2020
//////////////////////////////

public class calcTester
{
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
    Calculator one = new Calculator();
    char exit = 'y';         //to hold whether to continue or exit program
    String errMessage = "";  //to hold error/warning message
    String number = "";      //to hold number as String

    //continue until they no longer enter 'y' or 'Y'
    while(exit == 'y' || exit == 'Y')
    {
      System.out.println(one.menu());
      char input = keyboard.next().charAt(0);
      System.out.println(one.menuChoice(input));

      //while they do not choose a correct sign value
      while(one.getSign() == '0')
      {
        System.out.println("\nPlease reenter input:");
        System.out.println(one.menu());
        input = keyboard.next().charAt(0);
        System.out.println(one.menuChoice(input));
      }

      input = keyboard.next().charAt(0);
      one.dataChoice(input);

      //while they do not choose a correct data type value
      while(one.getDataType() == '0')
      {
        System.out.println("Please reenter input:");
        System.out.println(one.menuChoice(one.getSign()));
        input = keyboard.next().charAt(0);
        one.dataChoice(input);
      }

      //get user input for numbers
      System.out.print("Enter number 1: ");
      one.setNum1(keyboard.nextDouble());
      System.out.print("Enter number 2: ");
      one.setNum2(keyboard.nextDouble());

      //calculate value and store any error/warning
      errMessage = one.calc(one.getSign(), one.getDataType(), one.getNum1(), one.getNum2());

      //determine the datatype and return correct value for number
      char datatype = one.getDataType();

      number = one.makeNumberString(datatype);

      //print results
      System.out.println("\n\n" + one.getNum1() + " " + one.getSign() + " " + one.getNum2() + " = " + number);
      System.out.println("\n" + errMessage);

      //determine if user wants to do another computation
      System.out.println("\nContinue(y = yes, n = no)");
      exit = keyboard.next().charAt(0);
    }
  }
}
