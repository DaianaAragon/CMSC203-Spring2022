import java.util.ArrayList;

public class animalArrayList {

	public static void main(String[] args) {
		// Create a driver named animalArrayList.java
		// Create two cat objects with different names 
		// Create a bird and a dog objects with the name of your choice
		// Add the above objects to an ArrayList named animals 
		// Display the content of animals 
		// Remove one of the cat objects 
		// Display the contents of animals again.
		
		Cat c1 = new Cat();
		c1.setName("Gazpacho");
		
		Cat c2 = new Cat();
		c2.setName("Gazpacho");
		
		Bird b1 = new Bird();
		b1.setName("Tweety");
		
		Dog d1 = new Dog();
		d1.setName("Carlos");
		
		
		
		ArrayList<Animal> animals = new ArrayList();
		animals.add(c1);
		animals.add(c2); // once

		System.out.println(animals);
		
		
		int count = 0;
		
		for (int i = 0; i < animals.size(); i++)
		{
			if (animals.get(i).equals(c2))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
				
		animals.remove(c2);
		System.out.println(animals);
		
		

	}

}
