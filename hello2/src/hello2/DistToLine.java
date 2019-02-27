package hello2;
public class DistToLine{
	static double A;
	static double B;
	static double C;
	
	public void getDist(double a, double b) {
		double Dist = (Math.abs((A*a)+(B*b)+C)) / (Math.sqrt((A*A)+(B*B)));
		System.out.println(Dist);
	}
}
