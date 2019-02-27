package yeezy;
import java.util.*; import java.awt.*;
import javax.swing.*; 

import java.io.*;
import java.util.Random;
public class hello {
	static class MonteCarlo{
	public double h,k,r;
	private Random rndm= new Random();
	public void setK(double K) {
	}
	public void setH(double H) {
	}
	public void setR(double R) {
	}
	public double nextRainDrop_x() {
		double x = 3+4*rndm.nextDouble();
		return x;
	}
	public double nextRainDrop_y() {
		double y = 1+4*rndm.nextDouble();
		return y;
	}
	public boolean insideCircle(double x, double y) {
		double i= (x-5)*(x-5)+(y-3)*(y-3);
		if(i>=2*2) {
			return false;
		}
		else {
		return true;
	}
	}
	public static class Tester{
		public static void main(String args[])
		{
			double cirCount = 0;
			double sqrCount=0;
			MonteCarlo mcObj = new MonteCarlo();
			mcObj.setH(5.0);
			mcObj.setK(3.0);
			mcObj.setR(2.0);
			int j;
			int b;
			double sum=0;
			for(b=0;b<=10;b++) {
			for(j=0;j<10000000;j++) {
				if(	mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y()))
				{
					cirCount++;
				}
				else {

				}
				sqrCount++;
			}
			System.out.println(cirCount);
			System.out.println(sqrCount);
			double pi = (cirCount*16)/(sqrCount*4);
			System.out.println(pi);
			sum += pi;
			System.out.println(sum);
			System.out.println(b);
		}
			System.out.println(sum/b);
	}
		}
	}
}