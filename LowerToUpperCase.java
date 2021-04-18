import java.util.Scanner;
public class LowerToUpperCase {
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		char lowercase;
		int uppercase;
		System.out.println("Please Enter a single lowercase character");
		lowercase = input.next().charAt(0); // reads user input of lowercase + "charAt" first charater of input
		
	
		uppercase = (int)lowercase; //lowercase's value (as integer) is now uppercase
		uppercase = uppercase-32; // uppercase is now -32 
		lowercase = (char)uppercase;// uppercase's value (as character) is now lowercase
		
		
		System.out.println("Here is the uppercase character: " + lowercase);
		
	}
}
	