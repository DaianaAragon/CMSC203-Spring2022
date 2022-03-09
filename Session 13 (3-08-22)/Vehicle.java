
public class Vehicle {

	// Private attributes are accessible throughout the class
	private String modelName;
	private String make;
	private String color;
	private int year;
	private double price;	
	
	
	// Overloaded constructors
	// All have the same name, but accept different parameters.

	public Vehicle () 
	{
		modelName = "";
		make = "";
		color = "";
		year = 0;
		price = 0;
	}
	
	// Copy constructor (accepts another object as a parameter)
	public Vehicle (Vehicle anotherVehicle)
	{
		this.modelName = anotherVehicle.modelName;
		this.make = anotherVehicle.make;
		this.color = anotherVehicle.color;
		this.year = anotherVehicle.year;
		this.price = anotherVehicle.price;
	}
	

	public Vehicle (String modelName, String make)
	{
		this.modelName = modelName;
		this.make = make;
		color = "Black";
		year = 2022;
		price = 1000;
	}

	public Vehicle (String modelName, String make, String color,
					int year, double price)
	{
		this.modelName = modelName;
		this.make = make;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	

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

	/** 
	 * Method to display the vehicle information.
	 * @return a formatted string with all the information of the vehicle
	 */
	public String toString()
	{
		String str = "Model Name: "  + modelName 
					  + "\nMake: "  + make
					  + "\nColor: " + color 
					  + "\nYear: "  + year
					  + "\nPrice: " + price;
		
		return str;
	}

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
	
	// 1.- Change the price of this vehicle to the price 
	//     of anotherObject plus the new price.
				
	public void changePrice(Vehicle anotherObject, double newPrice)
	{
		this.price += anotherObject.price + newPrice;
	}
	
	// 2.- Write a method named swap that takes 
	//     a Vehicle argument and swaps 
	//     the content of this vehicle to the passed
	//     vehicle object.
	
	public void swap(Vehicle anotherVehicle)
	{
		//Local Variables 
		String tempName, tempMake, tempColor;
		int tempYear;
		double tempPrice;

		tempName = this.modelName;
		this.modelName = anotherVehicle.modelName;
		anotherVehicle.modelName = tempName;
		
		tempMake = this.make;
		this.make = anotherVehicle.make;
		anotherVehicle.make = tempMake;
		
		tempColor = this.color;
		this.color = anotherVehicle.color;
		anotherVehicle.color = tempColor;
		
		tempYear = this.year;
		this.year = anotherVehicle.year;
		anotherVehicle.year = tempYear;
		
		tempPrice = this.price;
		this.price = anotherVehicle.price;
		anotherVehicle.price = tempPrice;
	}
}