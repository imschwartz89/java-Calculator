import java.util.Scanner;

//////////////////////////////
// Author: Ian Schwartz
// Created: 12/16/2016
// Last Update: 10/20/2020
//////////////////////////////

public class calcTester
{
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
    Calculator one = new Calculator();
    char exit = 'y';

    //continue until they no longer enter 'y' or 'Y'
    while(exit == 'y' || exit == 'Y')
    {
      one.menu();
      char input = keyboard.next().charAt(0);
      one.sign = one.menuChoice(input);

      //while they do not choose a correct sign value
      while(one.sign == '0')
      {
        System.out.println("\nPlease reenter input:");
        one.menu();
        input = keyboard.next().charAt(0);
        one.sign = one.menuChoice(input);
      }

      input = keyboard.next().charAt(0);
      one.dataType = one.dataChoice(input);

      //while they do not choose a correct data type value
      while(one.dataType == '0')
      {
        System.out.println("Please reenter input:");
        one.sign = one.menuChoice(one.sign);
        input = keyboard.next().charAt(0);
        one.dataType = one.dataChoice(input);
      }

      //get user input for numbers
      System.out.print("Enter number 1: ");
      one.num1 = keyboard.nextDouble();
      System.out.print("Enter number 2: ");
      one.num2 = keyboard.nextDouble();

      //compute using sign, dataType, and numbers, then display results
      one.calc(one.sign, one.dataType, one.num1, one.num2);

      //determine if user wants to do another computation
      System.out.println("\nContinue(y = yes, n = no)");
      exit = keyboard.next().charAt(0);
    }
  }
}
