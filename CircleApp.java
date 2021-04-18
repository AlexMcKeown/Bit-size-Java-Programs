class Circle {
	private static double r;
	public static void circle(double rd) 
	{
		r = rd;
		
	}
	
	
public double calCircumference()
	 {
		return 2 * Math.PI * r;
	}
	
	
	
public static double calArea() 
	{  
		return Math.PI * r * r;
	}
}



class CircleApp {
	public static void main(String[] args)
	{
		
		double rd = Double.parseDouble(args[0]);
		System.out.println("Circle radius = " + rd);
		Circle circle1 = new Circle();
		circle1.circle(rd);
		
		double cir = circle1.calCircumference(); 
		double area = circle1.calArea();
		
		System.out.println("Circumference = " + cir);
		System.out.println("Area = " + area);
	}
}