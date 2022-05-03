public class Circle extends Shape implements Comparable {
	
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
	
	//compareTo -> overridden by wrapper classes
	@Override // <- Needs to implement Comparable interface
	public int compareTo (Object o)
	{
		// Temporal cast to the object we pass 
		// In order to have access to attributes of the class (radius in case of Circle)
		Circle temp = (Circle) o;
		
		if (this.radius == temp.radius)
		{
			return 0;
		}
		
		// Convention: return one when greater
		else if (this.radius > temp.radius)
		{
			return 1;
		}
		
		// Convention: return -1 when less than 
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}