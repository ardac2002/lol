package hello2;
import java.util.*;
public class Tester {
	public static void main (String args[])
	{
 		DistToLine d1 = new DistToLine();
		Scanner kbReader = new Scanner(System.in); 
 		System.out.println("Enter the A value for the line");
 		double A = kbReader.nextDouble();
 		System.out.println("Enter the B value for the line");
 		DistToLine.B = kbReader.nextDouble();
 		System.out.println("Enter the C value for the line");
 		DistToLine.C = kbReader.nextDouble();
 		System.out.println("Enter the x coordinate of the point");
 		double a = kbReader.nextDouble();
 		System.out.println("Enter the y coordinate of the point");
 		double b = kbReader.nextDouble();
 		d1.getDist(a, b);
	kbReader.close();
	}
}

