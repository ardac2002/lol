package yeezy;
import java.util.*;
	public class Tester2
	{
		public static void main( String args[]) throws InterruptedException 
		{
			Scanner kbReader = new Scanner(System.in);
			System.out.println("What do you want to do?");
			String s = kbReader.nextLine();
			System.out.println("What is your first number?");
			double op1 = kbReader.nextDouble();
			System.out.println("What is your second number?");
			double op2 = kbReader.nextDouble();
			switch (s)
			{
				case "Add":
				case "add":
				System.out.println(op1+" plus "+op2+" = "+(op1+op2));
				break;
				case "Subtract":
				case "subtract":
				System.out.println(op1+" minus "+op2+" = "+(op1-op2));
				break;
				case "Multiply":
				case "multiply":
				System.out.println(op1+" times "+op2+" = "+(op1*op2));
				break;
				case "Divide":
				case "divide":
				System.out.println(op1+" divided by "+op2+" = "+(op1/op2));
				break;
				default:
				System.out.println("Please only enter add, subtract, multiply, or divide!");
					for (int k=1; k<1000; k++)
					{
						System.out.print("SPAM ");
						Thread.sleep(5);
						if (k%25 == 0) {
							System.out.println();

							}
			}
			kbReader.close();
			}
		}
	}