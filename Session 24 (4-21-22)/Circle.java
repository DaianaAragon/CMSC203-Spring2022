public class Circle extends Shape {
	
	private double radius;
	
	@Override
	public double findArea()
	{
		return (Math.PI * Math.pow(radius, 2));
	}

}