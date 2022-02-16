
public class Vehicle {
	//Note: create your driver file named VehicleDriver
	//and at any point in your code, test it.
	
	
	//1.- Define the following private attributes
	//for the Vehicle class:
	//Model Name example: Accord
	//Make example: Honda
	//Year example: 2020
	//Color example: Black
	//Price example: 20000
	
	//camelCase
	private String modelName;
	private String make;
	private String color;
	private int year;
	private double price;	
	
	//2.- Define the following constructors:
	//No-arg constructor, this constructor sets the attributes 
	//to all empty strings for model, make, color and the price and year to 0.
	
	public Vehicle () 
	{
		modelName = "";
		make = "";
		color = "";
		year = 0;
		price = 0;
	}
	
	
	//3.- Create a constructor that takes only the name, and make,
	//and sets the year to 2022, the price to 1000, and color to black.

	public Vehicle (String modelName, String make)
	{
		this.modelName = modelName;
		this.make = make;
		color = "Black";
		year = 2022;
		price = 1000;
	}
	
	//4.- Create another constructor that takes all the parameters
	// for attributes and sets them accordingly.
	
	public Vehicle (String modelName, String make, String color,
					int year, double price)
	{
		this.modelName = modelName;
		this.make = make;
		this.color = color;
		this.year = year;
		this.price = price;
	}

	//5.- Provide get and set methods for all the attributes.

	/**
	 * Gets the model name of the vehicle
	 * @return the model of the vehicle
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Sets the model name of the vehicle.
	 * @param modelName the model name of the vehicle.
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
	//6.- Define toString method and display the information based 
	//on the format of your choice
	
	/** 
	 * Method to display the vehicle information.
	 * @return a formatted string with all the information of the vehicle
	 */
	public String toString()
	{
		String str = "Model Name:"  + modelName 
					  + "\nMake: "  + make
					  + "\nColor: " + color 
					  + "\nYear: "  + year
					  + "\nPrice: " + price;
		
		return str;
	}

	// Complete the code:
	// Two vehicles are equal 
	// if their model name is the same

	/**
	 * Method to compare the attributes of two objects
	 */
	public boolean equals(Vehicle anotherVehicle)
	{
		//Option 1:
		
		/*if(this.modelName.equals(anotherVehicle.modelName))
		{
			return true;
		}
		
		return false;*/
		
		
		//Option 2:
		return this.modelName.equals(anotherVehicle.modelName) 
			&& this.make.equals(anotherVehicle.make)
			&& this.price==anotherVehicle.price;
	}
	
}