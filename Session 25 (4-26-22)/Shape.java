public class Shape {
	// 1.- Create an enumerated type called Dimensions that 
	// has the values TWO_D and THREE_D, then add an attribute
	// named dimension of type Dimensions.

	private String name;
	private String color;
	private Dimensions dimension; 
	
	// 2- Set the dimension to TWO_D by default 
	//    in this constructor.
	
	public Shape()
	{
		this("No name", "No color", Dimensions.TWO_D);
	}
	
	public Shape(String name, String color)
	{		
		// Calls the constructor that passes those parameters
		// (Constructor that calls another constructor)
		this(name, color, Dimensions.TWO_D);
	}
	

	public Shape(String name, String color, Dimensions dimension)
	{
		this.name = name;
		this.color = color;
		this.dimension = dimension;
	}

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
	
	// Type -> Dimensions (enum)
	public Dimensions getDimension()
	{
		return dimension;
	}
	
	public void setDimension(Dimensions dimension)
	{
		this.dimension = dimension;
	}
	
}