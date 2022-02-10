
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
	
	
	//6.- Define toString method and display the information based 
	//on the format of your choice
	
	//7.- 
	
	

}
