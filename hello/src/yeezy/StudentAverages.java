package yeezy;
import java.util.*;

import java.io.*;
import java.util.Random;
public class StudentAverages {
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
		double i= (x-h)*(x-h)+(y-k)*(y-k);
		if(i>=r*r) {
			return false;
		}
		else {
		return true;
	}
	}
	public static class Tester{
		public static void main(String args[])
		{

			MonteCarlo mcObj = new MonteCarlo();
			mcObj.setH(5.0);
			mcObj.setK(3.0);
			mcObj.setR(2.0);
			int j;
			for(j=0;j<100;j++) {
				mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y());
			}
				
		}
	}
	}
		}