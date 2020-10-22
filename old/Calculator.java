import java.util.Scanner;

//////////////////////////////
// Author: Ian Schwartz
// Created: 12/16/2016
// Last Update: 10/20/2020
//////////////////////////////

public class Calculator
{
	double num1;  //holds the first number
	double num2;  //holds the second number
	char sign;    //holds the sign value
	char dataType;//holds the data type


  //default constructor, initializes every member attribute to 0 or space
	public Calculator()
	{
		num1 = 0;
		num2 = 0;
		sign = ' ';
		dataType = ' ';
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//addition methods for each type
	//  each take two doubles and use casting to get the correct result

	public int addInt(double n1, double n2)
	{
		int sum = 0;
		sum = (int)n1 + (int)n2;
		return sum;
	}
	public short addShort(double n1, double n2)
	{
		int sum = 0;
		sum = (short)n1 + (short)n2;
		return (short) sum;
	}
	public long addLong(double n1, double n2)
	{
		long sum = 0;
		sum = (long)n1 + (long)n2;
		return sum;
	}
	public float addFloat(double n1, double n2)
	{
		float sum = 0;
		sum = (float)n1 + (float)n2;
		return sum;
	}
	public double addDouble(double n1, double n2)
	{
		double sum = 0;
		sum = n1 + n2;
		return sum;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //subtraction methods for each type
  //  each take two doubles and use casting to get the correct result

	public int subInt(double n1, double n2)
	{
		int sum = 0;
		sum = (int)n1 - (int)n2;
		return sum;
	}
	public short subShort(double n1, double n2)
	{
		int sum = 0;
		sum = (short)n1 - (short)n2;
		return (short) sum;
	}
	public long subLong(double n1, double n2)
	{
		long sum = 0;
		sum = (long)n1 - (long)n2;
		return sum;
	}
	public float subFloat(double n1, double n2)
	{
		float sum = 0;
		sum = (float)n1 - (float)n2;
		return sum;
	}
	public double subDouble(double n1, double n2)
	{
		double sum = 0;
		sum = n1 - n2;
		return sum;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //multiplication nethods for each type
  //  each take two doubles and use casting to get the correct result

	public int multInt(double n1, double n2)
	{
		int sum = 0;
		sum = (int)n1 * (int)n2;
		return sum;
	}
	public short multShort(double n1, double n2)
	{
		int sum = 0;
		sum = (short)n1 * (short)n2;
		return (short) sum;
	}
	public long multLong(double n1, double n2)
	{
		long sum = 0;
		sum = (long)n1 * (long)n2;
		return sum;
	}
	public float multFloat(double n1, double n2)
	{
		float sum = 0;
		sum = (float)n1 * (float)n2;
		return sum;
	}
	public double multDouble(double n1, double n2)
	{
		double sum = 0;
		sum = n1 * n2;
		return sum;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //division functions for each type
  //  each take two doubles and use casting to get the correct result

	public int divInt(double n1, double n2)
	{
		int sum = 0;
		sum = (int)n1 / (int)n2;
		return sum;
	}
	public short divShort(double n1, double n2)
	{
		int sum = 0;
		sum = (short)n1 / (short)n2;
		return (short) sum;
	}
	public long divLong(double n1, double n2)
	{
		long sum = 0;
		sum = (long)n1 / (long)n2;
		return sum;
	}
	public float divFloat(double n1, double n2)
	{
		float sum = 0;
		sum = (float)n1 / (float)n2;
		return sum;
	}
	public double divDouble(double n1, double n2)
	{
		double sum = 0;
		sum = n1 / n2;
		return sum;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //modulus methods for each type
  //  each take two doubles and use casting to get the correct result

	public int modInt(double n1, double n2)
	{
		int sum = 0;
		sum = (int)n1 % (int)n2;
		return sum;
	}
	public short modShort(double n1, double n2)
	{
		int sum = 0;
		sum = (short)n1 % (short)n2;
		return (short) sum;
	}
	public long modLong(double n1, double n2)
	{
		long sum = 0;
		sum = (long)n1 % (long)n2;
		return sum;
	}
	public float modFloat(double n1, double n2)
	{
		float sum = 0;
		sum = (float)n1 % (float)n2;
		return sum;
	}
	public double modDouble(double n1, double n2)
	{
		double sum = 0;
		sum = n1 % n2;
		return sum;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //menu methods for the command line

	public void menu()
	{
		System.out.println("\nCalculator Menu");
		System.out.println("===============");
		System.out.println("'+' = Addition\n'-' = Subtraction\n'*'= Multiplication\n'/' = Division\n'%' = Modulus\n");
		System.out.println("Enter a symbol to use for calulations:");
	}

	public void addMenu()
	{
		System.out.println("\nAddition Menu");
		System.out.println("-------------");
		System.out.println("'I' = Integer\n'S' = Short\n'L' = Long\n'F' = Float\n'D' = Double\n");
	}
	public void subMenu()
	{
		System.out.println("\nSubtraction Menu");
		System.out.println("----------------");
		System.out.println("'I' = Integer\n'S' = Short\n'L' = Long\n'F' = Float\n'D' = Double\n");
	}
	public void multMenu()
	{
		System.out.println("\nMultiplication Menu");
		System.out.println("-------------------");
		System.out.println("'I' = Integer\n'S' = Short\n'L' = Long\n'F' = Float\n'D' = Double\n");
	}
	public void divMenu()
	{
		System.out.println("\nDivision Menu");
		System.out.println("-------------");
		System.out.println("'I' = Integer\n'S' = Short\n'L' = Long\n'F' = Float\n'D' = Double\n");
	}
	public void modMenu()
	{
		System.out.println("\nModulus Menu");
		System.out.println("-------------");
		System.out.println("'I' = Integer\n'S' = Short\n'L' = Long\n'F' = Float\n'D' = Double\n");
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //method to choose which menu function to call

	public char menuChoice(char c)
	{
		if(c == '+')
		{
			addMenu();
			return c;
		}
		else if(c == '-')
		{
			subMenu();
			return c;
		}
		else if(c == '*')
		{
			multMenu();
			return c;
		}
		else if(c == '/')
		{
			divMenu();
			return c;
		}
		else if(c == '%')
		{
			modMenu();
			return c;
		}
		else
		{
			System.out.println("INVALID INPUT!");
			return '0';
		}
	}


	//method to return the correct value for the data type
	public char dataChoice(char c)
	{
		if(c == 'I' || c == 'i')
		{
			return 'I';
		}
		else if(c == 'S' || c == 's')
		{
			return 'S';
		}
		else if(c == 'L' || c == 'l')
		{
			return 'L';
		}
		else if(c == 'F' || c == 'f')
		{
			return 'F';
		}
		else if(c == 'D' || c == 'd')
		{
			return 'D';
		}
		else
		{
			System.out.println("INVALID INPUT!");
			return '0';
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //method to calculate the value
	//  determines the sign to use
	//  then determines which data type to use
	//  then passes n1 and n2 to the correct function
	public void calc(char s, char dT, double n1, double n2)
	{
		if(s == '+')
		{
			if(dT == 'I')
			{
				System.out.println("\nEquals: " + addInt(n1, n2));
			}
			else if(dT == 'S')
			{
				System.out.println("\nEquals: " + addShort(n1, n2));
			}
			else if(dT == 'L')
			{
				System.out.println("\nEquals: " + addLong(n1, n2));
			}
			else if(dT == 'F')
			{
				System.out.println("\nEquals: " + addFloat(n1, n2));
			}
			else if(dT == 'D')
			{
				System.out.println("\nEquals: " + addDouble(n1, n2));
			}
		}
		else if(s == '-')
		{
			if(dT == 'I')
			{
				System.out.println("\nEquals: " + subInt(n1, n2));
			}
			else if(dT == 'S')
			{
				System.out.println("\nEquals: " + subShort(n1, n2));
			}
			else if(dT == 'L')
			{
				System.out.println("\nEquals: " + subLong(n1, n2));
			}
			else if(dT == 'F')
			{
				System.out.println("\nEquals: " + subFloat(n1, n2));
			}
			else if(dT == 'D')
			{
				System.out.println("\nEquals: " + subDouble(n1, n2));
			}
		}
		else if(s == '*')
		{
			if(dT == 'I')
			{
				System.out.println("\nEquals: " + multInt(n1, n2));
			}
			else if(dT == 'S')
			{
				System.out.println("\nEquals: " + multShort(n1, n2));
			}
			else if(dT == 'L')
			{
				System.out.println("\nEquals: " + multLong(n1, n2));
			}
			else if(dT == 'F')
			{
				System.out.println("\nEquals: " + multFloat(n1, n2));
			}
			else if(dT == 'D')
			{
				System.out.println("\nEquals: " + multDouble(n1, n2));
			}
		}
		else if(s == '/')
		{
			if(n2 == 0)
			{
				System.out.println("\nERROR: Division by 0");
			}
			else if(dT == 'I')
			{
				System.out.println("\nEquals: " + divInt(n1, n2));
				System.out.println("Integer Division");
			}
			else if(dT == 'S')
			{
				System.out.println("\nEquals: " + divShort(n1, n2));
				System.out.println("Integer Division");
			}
			else if(dT == 'L')
			{
				System.out.println("\nEquals: " + divLong(n1, n2));
				System.out.println("Integer Division");
			}
			else if(dT == 'F')
			{
				System.out.println("\nEquals: " + divFloat(n1, n2));
			}
			else if(dT == 'D')
			{
				System.out.println("\nEquals: " + divDouble(n1, n2));
			}
		}
		else if(s == '%')
		{
			if(n2 == 0)
			{
				System.out.println("\nERROR: Modulus by 0");
			}
			else if(dT == 'I')
			{
				System.out.println("\nEquals: " + modInt(n1, n2));
			}
			else if(dT == 'S')
			{
				System.out.println("\nEquals: " + modShort(n1, n2));
			}
			else if(dT == 'L')
			{
				System.out.println("\nEquals: " + modLong(n1, n2));
			}
			else if(dT == 'F')
			{
				System.out.println("\nEquals: " + modFloat(n1, n2));
			}
			else if(dT == 'D')
			{
				System.out.println("\nEquals: " + modDouble(n1, n2));
			}
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//original tester method to make sure methods worked properly
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Calculator one = new Calculator();
		one.menu();
		char input = keyboard.next().charAt(0);
		one.sign = one.menuChoice(input);
		input = keyboard.next().charAt(0);
		one.dataType = one.dataChoice(input);

		System.out.print("Enter number 1: ");
		one.num1 = keyboard.nextDouble();
		System.out.print("Enter number 2: ");
		one.num2 = keyboard.nextDouble();

		one.calc(one.sign, one.dataType, one.num1, one.num2);
	}
}
