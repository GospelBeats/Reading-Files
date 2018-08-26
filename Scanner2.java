package readFiles;
import java.util.Scanner;
public class Scanner2 
{

	public static void main(String[] args) 
{
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please input a Sentence--> ");
	String word1 = input.next();
	char letter = word1.charAt(0);
	
	System.out.println("The Sentence you entered is :: " + letter);
	
	
	input.close();	
}

}

// next() finds and returns the next complete token from this scanner
// next() ends at the first space - so only prints a word

// nextLine() advances this scanner past the current line and returns
// nextLine() prints the entire sentence - including spaces everything on the line

// better to use sys.out.print( no 'ln')

// CLEAN UP with input.nextLine(); if String userInput comes after int/double userInput

// the input that was skipped - you can't do nextChar
// don't use util* too much resources for CPU
