import java.util.*;
import java.io.*;
public class FileTester
{
		public static void main(String args[]) throws IOException
		{
			Scanner sf = new Scanner(new File("C:\\Users\\ac026930\\Desktop\\MyData.in"));
			int maxIndx = -1
			String text[] = new String[1000];
			while(sf.hasNext())
			{
				maxIndx++;
				text[maxIndx] = sf.nextLine();
			}
			sf.close();
		}
}