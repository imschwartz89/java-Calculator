//////////////////////////////
// Author: Ian Schwartz
// Created: 10/6/2020
// Last Update: 10/19/2020
//////////////////////////////

//Calculator class
//attributes: dataType, sign, num1, num2, intNum, shortNum, longNum, floatNum, doubleNum
//constructors: Calculator()
//methods:
//  setDataType(), setDTInt(), setDTShort(), setDTLong(), setDTFloat(), setDTDouble()
//  setSign(), setSPlus(), setSMinus(), setSMult(), setSDiv(), setSMod()
//  setNum1(), setNum2(), setNums()
//  getDataType(), getSign(), getNum1(), getNum2()
//  getIntNum(), getShortNum(), getLongNum, getFloatNum(), getDoubleNum()
//  returnError(), returnWarning()
//  add(), sub(), mult(), div(), mod()
//  menu(), menuChoice(), dataChoice()
//  calc()
public class Calculator
{
	private char dataType; //holds the first letter of the name of data type to be used
	private char sign;     //holds the sign as a character
	private double num1;   //holds the first number for computation
	private double num2;   //holds the second number for computation

	private int intNum;       //holds the int value after a computation involving ints
	private short shortNum;   //holds the short value after a computation involving shorts
	private long longNum;     //holds the long value after a computation involving longs
	private float floatNum;   //holds the float value after a computation involving floats
	private double doubleNum; //holds the double value after a computation involving doubles

  //constructor for Calculator, initializes every value to be 0 or space
	public Calculator()
	{
		dataType = ' ';
		sign = ' ';
		num1 = 0;
		num2 = 0;

		intNum = 0;
		shortNum = 0;
		longNum = 0;
		floatNum = 0;
		doubleNum = 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//these are single lined to save space

  //setters for dataType value
	public void setDataType(char type)	{ dataType = type; }
	public void setDTInt() 							{ setDataType('i'); }
	public void setDTShort() 						{ setDataType('s'); }
	public void setDTLong() 						{ setDataType('l'); }
	public void setDTFloat() 						{ setDataType('f'); }
	public void setDTDouble() 					{ setDataType('d'); }

  //setters for sign value
	public void setSign(char s)			{ sign = s; }
	public void setSPlus() 					{ setSign('+'); }
	public void setSMinus() 				{ setSign('-'); }
	public void setSMult() 					{ setSign('*'); }
	public void setSDiv() 					{ setSign('/'); }
	public void setSMod() 					{ setSign('%'); }

  //setters for num1 and num2 value
	public void setNum1(double n) 							{ num1 = n; }
	public void setNum2(double n) 							{ num2 = n; }
	public void setNums(double n1, double n2) 	{ setNum1(n1); setNum2(n2); }


	//getters for all attributes
	public char getDataType() 		{ return dataType; }
	public char getSign()					{ return sign; }
	public double getNum1()				{ return num1; }
	public double getNum2()				{ return num2; }
	public int getIntNum()        { return intNum; }
	public short getShortNum()		{ return shortNum; }
	public long getLongNum()			{ return longNum; }
	public float getFloatNum()    { return floatNum; }
	public double getDoubleNum()  { return doubleNum; }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //returns the correct error message as a String
	public String returnError(int e)
	{
		switch(e)
		{
			case 1:
			  return "ERROR 1001 - Division by 0";
			case 2:
			  return "ERROR 1002 - Modulus by 0";
			case 3:
			  return "ERROR 1003 - sign is not valid";
			case 4:
			  return "ERROR 1004 - dataType is not valid";
			default:
			  return "ERROR 1000 - Unknown ERROR has occurred";
		}
	}

  //returns the correct warning message as a String
	public String returnWarning(int w)
	{
		switch(w)
		{
			case 1:
			  return "WARNING 1001 - Integer Division";
			case 2:
			  return "WARNING 1002 - Number already contains a decimal";
			default:
			  return "WARNING 1000 - Unknown WARNING has occurred";
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //adds num1 and num2 as the correct data type by casting them
	//  value is saved in the correct variable to hold that data type
	//  returns a String that is empty if everything is fine,
	//     if there is an error, will return the correct error message
	public String add()
	{
		switch(dataType)
		{
		  case 'i':
		    intNum = (int)num1 + (int)num2;
				break;
			case 's':
			  //extra cast needed to get around compiler error for lossy conversion
		    shortNum = (short)((short)num1 + (short)num2);
				break;
			case 'l':
		    longNum = (long)num1 + (long)num2;
				break;
			case 'f':
		    floatNum = (float)num1 + (float)num2;
				break;
			case 'd':
		    doubleNum = num1 + num2; //does not need cast because already are doubles
				break;
			default:
			  return returnError(4); //dataType is not valid error
	  }
		return "";
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //subtracts num1 and num2 as the correct data type by casting them
  //  value is saved in the correct variable to hold that data type
  //  returns a String that is empty if everything is fine,
  //     if there is an error, will return the correct error message
	public String sub()
  {
	  switch(dataType)
	  {
		  case 'i':
			  intNum = (int)num1 - (int)num2;
			  break;
		  case 's':
			  //extra cast needed to get around compiler error for lossy conversion
			  shortNum = (short)((short)num1 - (short)num2);
			  break;
		  case 'l':
			  longNum = (long)num1 - (long)num2;
			  break;
		  case 'f':
			  floatNum = (float)num1 - (float)num2;
			  break;
		  case 'd':
			  doubleNum = num1 - num2; //does not need cast because already are doubles
			  break;
		  default:
			  return returnError(4); //dataType is not valid error
	  }
		return "";
  }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //multiplies num1 and num2 as the correct data type by casting them
  //  value is saved in the correct variable to hold that data type
  //  returns a String that is empty if everything is fine,
  //     if there is an error, will return the correct error message
	public String mult()
  {
	  switch(dataType)
	  {
		  case 'i':
			  intNum = (int)num1 * (int)num2;
			  break;
		  case 's':
			  //extra cast needed to get around compiler error for lossy conversion
			  shortNum = (short)((short)num1 * (short)num2);
			  break;
		  case 'l':
			  longNum = (long)num1 * (long)num2;
			  break;
		  case 'f':
			  floatNum = (float)num1 * (float)num2;
			  break;
		  case 'd':
			  doubleNum = num1 * num2; //does not need cast because already are doubles
			  break;
		  default:
			  return returnError(4); //dataType is not valid error
	  }
		return "";
  }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //divides num1 and num2 as the correct data type by casting them
  //  value is saved in the correct variable to hold that data type
  //  returns a String that is empty if everything is fine,
  //     if there is an error, will return the correct error message
	//     if there is a warning, will return the warning message (integer division warning for int, short, long)
	public String div()
	{
		//check for divide by zero error
		if(num2 == 0)
		{
			return returnError(1); //divide by zero error
		}

	  switch(dataType)
	  {
		  case 'i':
			  intNum = (int)num1 / (int)num2;
				return returnWarning(1); //integer division warning
		  case 's':
			  //extra cast needed to get around compiler error for lossy conversion
			  shortNum = (short)((short)num1 / (short)num2);
				return returnWarning(1); //integer division warning
		  case 'l':
			  longNum = (long)num1 / (long)num2;
				return returnWarning(1); //integer division warning
		  case 'f':
			  floatNum = (float)num1 / (float)num2;
			  break;
		  case 'd':
			  doubleNum = num1 / num2; //does not need cast because already are doubles
			  break;
		  default:
			  return returnError(4); //dataType is not valid error
	  }
		return "";
  }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //modulus num1 and num2 as the correct data type by casting them
  //  value is saved in the correct variable to hold that data type
  //  returns a String that is empty if everything is fine,
  //     if there is an error, will return the correct error message
	public String mod()
	{
		//check for mod by zero error
		if(num2 == 0)
		{
			return returnError(2); //mod by zero error
		}

	  switch(dataType)
	  {
		  case 'i':
			  intNum = (int)num1 % (int)num2;
			  break;
		  case 's':
			  //extra cast needed to get around compiler error for lossy conversion
			  shortNum = (short)((short)num1 % (short)num2);
			  break;
		  case 'l':
			  longNum = (long)num1 % (long)num2;
			  break;
		  case 'f':
			  floatNum = (float)num1 % (float)num2;
			  break;
		  case 'd':
			  doubleNum = num1 % num2; //does not need cast because already are doubles
			  break;
		  default:
			  return returnError(4); //dataType is not valid error
	  }
		return "";
  }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //this is the menu to choose the sign for the command line version
	//  returns a String that is the menu to be printed for the user to choose from
	public String menu()
	{
		return ("\nCalculator Menu"
		       + "\n==============="
		       + "\n'+' = Addition\n'-' = Subtraction\n'*'= Multiplication\n'/' = Division\n'%' = Modulus"
		       + "\nEnter a symbol to use for calculations:");
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//this is the menu to choose the dataType for the command line version
	//  takes a character for the dataType to use (I, S, L, F, D), not case sensitive
	//  returns a String that is the menu to be printed for the user to choose from
	public String menuChoice(char c)
	{
		String message = "";
		if(c == '+')
		{
			message += "\nAddition Menu";
		}
		else if(c == '-')
		{
			message += "\nSubtraction Menu";
		}
		else if(c == '*')
		{
			message += "\nMultiplication Menu";
		}
		else if(c == '/')
		{
			message += "\nDivision Menu";
		}
		else if(c == '%')
		{
			message += "\nModulus Menu";
		}
		else
		{
			message += "INVALID INPUT!";
			sign = '0'; //for error checking reasons
			return message;
		}
		sign = c; // maybe would be fix and can change to return string
		message += ("\n-------------\n"
						+ "'I' = Integer\n'S' = Short\n'L' = Long\n'F' = Float\n'D' = Double\n");
		return message;
	}

  //this sets the correct dataType based on the character given to the method
	//  uses the setter methods to do this
	//  returns a String which is empty if there are no problems
	//    will return "INVALID INPUT!" if it receives the wrong input
	public String dataChoice(char c)
	{
		c = Character.toLowerCase(c);

		if(c == 'i')
		{
			setDTInt();
		}
		else if(c == 's')
		{
			setDTShort();
		}
		else if(c == 'l')
		{
			setDTLong();
		}
		else if(c == 'f')
		{
			setDTFloat();
		}
		else if(c == 'd')
		{
			setDTDouble();
		}
		else
		{
			dataType = '0'; //for error checking reasons
			return "INVALID INPUT!";
		}
		return "";
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //calculates the correct value, given the sign, dataType, and two numbers
	//  requires:
	//    s which is the sign as a character
	//    dT which is the dataType as a character
	//    n1 which is the first number as a double
	//    n2 which is the second number as a double
	//  returns a String which will be empty if everything works correctly
	//    if there is an error, it will return the correct error String
	//      if the error is during the computation process it will be returned from that method
	//      otherwise it will be a wrong sign error
	public String calc(char s, char dT, double n1, double n2)
	{
		dataChoice(dT);  //set the dataType as type dT

		setNums(n1, n2); //set the numbers as n1 and n2
		setSign(s);      //set the sign as s

		//check what sign was given and excute the correct method
		if(s == '+')
		{
			return add();
		}
		else if(s == '-')
		{
			return sub();
		}
		else if(s == '*')
		{
			return mult();
		}
		else if(s == '/')
		{
			return div();
		}
		else if(s == '%')
		{
			return mod();
		}
		else
		{
			return returnError(3); //wrong sign error
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//return the correct value to be displayed based on the selected data type
  public String makeNumberString(char dT)
  {
	  String number;
	  if(dT == 'i')
	  {
		  number = "" + getIntNum();
 	  }
	  else if(dT == 's')
	  {
		  number = "" + getShortNum();
	  }
	  else if(dT == 'l')
	  {
		  number = "" + getLongNum();
	  }
	  else if(dT == 'f')
	  {
		  number = "" + getFloatNum();
	  }
	  else if(dT == 'd')
	  {
		  number = "" + getDoubleNum();
	  }
	  else
	  {
		  number = "ERROR";
	  }
	  return number;
  }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
