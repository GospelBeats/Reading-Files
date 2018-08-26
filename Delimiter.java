package readFiles;

import java.util.Scanner;

public class Delimiter 
{

	public static void main(String[] args) 
{
	Scanner userInput = new Scanner("Josh 18 Phil 26 Sally 22 Molly 17");
	
	//userInput.useDelimiter(" "); // you can use commas to separate strings 
	
	// REG EXPRESSIONS
	// userInput.useDelimiter("[^A-Za-z]+"); this means: see below
	
	System.out.println("The words in the String are: ");
	
	while (userInput.hasNext())
	{
		String temp = userInput.next();
		System.out.println(temp);
		
	}
		
	userInput.close();	
		
}

}

// Scanner looks for whitespace by default

// ("[^A-Za-z]+") ^use anything capital A-Z, lowercase a-z, and + has to be one or more characters 
// whitespace & numbers are not alpha characters

// ("[^0-9]+ ") only int between 0-9