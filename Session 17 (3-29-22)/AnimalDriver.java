
public class AnimalDriver {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		Dog e = new Dog();
		
		Animal [] pets = {d, c, b, e};
		
		for (int i=0; i<pets.length; i++)
		{
			pets[i].speak();
		}

	}

}
