
public class AnimalDriver {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		Dog e = new Dog();
		
		Animal [] pets = {d, c, b, e};
		
		for (int i = 0; i < pets.length; i++)
		{
			pets[i].speak();
			eat(pets[i]);
		}

	}
	
	public static void eat(Animal a)
	{
		System.out.print("The animal said ");
		a.speak();
		System.out.println(" and ate");
	}

}