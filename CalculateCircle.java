import java.util.Scanner;
import static java.lang.Math.*;

class CalculateCircle
{
	public static void main(String[] args)
	{
		double x, r, y, angle;
		
		Scanner input = new Scanner(System.in); // Scanner to read inputs by user
		System.out.println("*** Coordinates of a cirle centred at the origin Calculator ***"); 
		
		System.out.print("Please enter the radius");
		r = input.nextDouble(); // read first input (radius)
		
		System.out.print("Please enter the angle");
		angle = input.nextDouble(); // read second input (angle)
		
		x = r * cos(angle);
		y = r * sin(angle);
	    
		System.out.println("");
		System.out.println("The total value of X: " + x);
		System.out.println("The total value of Y: " + y);
	}
}