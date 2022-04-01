import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		
		// Size is mutable.
		//ArrayList is a class.
		ArrayList<Animal> petsList = new ArrayList();
		
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		Dog e = new Dog();
		
		// Populate ArrayList
		petsList.add(d);
		petsList.add(c);
		petsList.add(b);
		petsList.add(e);
		
		System.out.println(petsList);
		
		for (int i = 0; i < petsList.size(); i++)
		{
			System.out.println(petsList.get(i));
		}

		// Create an ArrayList of type int named scores.
		// int -> primitive data type
		// Integer -> wrapper class
		// Every primitive data type has a wrapper class.
		
		ArrayList<Integer> scores = new ArrayList();
		
		scores.add(95);
		scores.add(96);
		scores.add(85);
		
		System.out.println(scores);
		
		// (index, element)
		scores.set(2, 46);
		System.out.println(scores);
		
		// (index, element)
		scores.add(1, 63);
		System.out.println(scores);
		
		// (index)
		scores.remove(3);
		System.out.println(scores);

	}

}
