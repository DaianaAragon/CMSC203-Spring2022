public class Animal {
	
	// Create an attribute for Animal called name.
	// Implement get and set methods for this attribute.
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	// Polymorphism is only possible with inheritance
	
	public void speak()
	{
		System.out.println("?");
	}
	
	public String toString()
	{
		return "Animal";
	}
	
	// Override the equals method to compare the name attribute
	@Override
	public boolean equals(Object a)
	{
		Animal tempAnimal = (Animal)a;
		
		return this.name.equals(tempAnimal.name);
	}
	
}