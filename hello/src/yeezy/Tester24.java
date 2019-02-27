package yeezy;
	import java.util.*;
import java.io.File;
import java.io.IOException;
import java.text.*;
import java.util.Arrays;
	public class Tester24 {
	    public static void main(String args[]) throws IOException {
	    System.out.println("please type in your name");
	    Scanner kbReader = new Scanner(System.in); 
	    String name = kbReader.nextLine();
	    System.out.println();
	    String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
	    System.out.println(timeStamp);
	    char first = timeStamp.charAt(0);
	    char second = timeStamp.charAt(1);
	    int sum = first+second;
	    switch(sum){
	    	case 105:
	    		System.out.println("You're late, "+ name);
	    		break;
	    	case 97:
	    		System.out.println("You're late, "+name);
	    		break;
	    	case 98:
	    		System.out.println("You're on time, "+name);
	    		break;
	    	case 99:
	    		System.out.println("You're on time, "+name);
	    		break;
	    	case 104:
	    		System.out.println("You're on time, "+name);
	    		break;
	    	case 103:
	    		System.out.println("You're on time, "+name);
	    		break;
	    	case 102:
	    		System.out.println("You're on time, "+name);
	    		break;
	    	case 101:
	    		System.out.println("You're on time, "+name);
	    		break;
	    	case 100:
	    		System.out.println("You're on time, "+name);
	    		break;
	    }
	    }
	    }