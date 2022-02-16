
public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		System.out.println(v1);
		
		System.out.println();
		
		Vehicle v2 = new Vehicle("Corolla", "Toyota");
		System.out.println(v2);
		
		System.out.println();
		
		Vehicle v3 = v2;
		
		//1.- Change the name of v2 to Camry.
		//     v2.setModelName("Camry");
		
		//2.- Display the model name of v3.
		System.out.println(v3.getModelName());
		
		
		//3.- Write code to compare v2 and v3.
		//    Something to think about: 
		//    What equality means for objects?
		
		// DO NOT USE THE == WITH OBJECTS!
		// == is used to compare primitive data types.
		// If you use == to compare objects, only the addresses are going to be compared.
		
		System.out.println(v1.equals(v2));
		System.out.println();
		
		Vehicle v4 = new Vehicle("Corolla", "Kia");
		System.out.println(v2.equals(v4));
		System.out.println();
		
		System.out.println(v2.equals(v3));
		System.out.println();
		
	}
}