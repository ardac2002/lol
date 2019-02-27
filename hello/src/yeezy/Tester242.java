package yeezy;

import java.util.Scanner;

public class Tester242
	{
		public static void main( String args[]) throws InterruptedException
		{
			Scanner kbReader = new Scanner(System.in);
			System.out.println("Do you want spam?");
			kbReader.nextLine();
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

