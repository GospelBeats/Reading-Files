package readFiles;
import java.io.*;
import java.util.Scanner;

public class ReadingFiles {
	
		public static void main(String[] args) throws IOException
		
		{
			
			//File temp = new File("info.txt")
					
			Scanner file = new Scanner(new File("info.txt"));
			
			System.out.println(file.nextLine());
			System.out.println(file.nextLine());
			System.out.println(file.nextLine());

		}
	
}
