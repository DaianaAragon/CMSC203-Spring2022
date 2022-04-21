public abstract class Shape {
	// Abstract class cannot be instantiated 
	// If a super class implements an interface,
	// all subclasses MUST override the methods in the interface.
	
	private String name;
	private String color;
	
	public Shape()
	{
		name = "No name";
		color = "No color";
	}
	
	public Shape(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	// An abstract method does not have any implementation.
	public abstract double findArea();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}