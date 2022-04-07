
// You cannot create an instance of an abstract class.
public abstract class Shape {
	
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
