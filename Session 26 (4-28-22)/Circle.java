public class Circle extends Shape {
	
	private double radius;
	
	public Circle (String name, String color, double radius)
	{
		super(name, color);
		this.radius = radius;
	}
	
	//@Override
	public double findArea() throws Exception
	{
		if (radius < 0 )
		{
			// Creates a new object of type Exception and throws it.
			// Needs "throws" in signature of method
			throw new NegativeRadiusException(); 
		}
		
		else
			
		return (Math.PI * Math.pow(radius, 2));
	}

}