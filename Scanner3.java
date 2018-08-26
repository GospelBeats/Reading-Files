package readFiles;

import java.util.Scanner;

public class Scanner3 
{

	public static void main(String[] args)
{
		
	String str = "Hello World";	
		
	Scanner userInput = new Scanner(str);
	
	System.out.println("The words in the String are: ");
	
	
	while(userInput.hasNext()) // boolean that looks for whitespace & words, if none, it stops
	{
	System.out.println(userInput.next());	
	}
	
	//System.out.println("The first word is :: " + userInput.next());
	//System.out.println("The second word is :: " + userInput.next());
	//System.out.println("The third word is :: " + userInput.next()); no 3rd word exception error
	
	//CONVERT STRING TO INT below
	
	String strI = "1 2 3 4 5";	
	
	Scanner userInput2 = new Scanner(strI);
	
	System.out.println("The numbers in the String are: ");
	
	while(userInput2.hasNextInt()) 
	{
	System.out.println(userInput2.nextInt());	
	}
	
	userInput.close();
	userInput2.close();
}

}


