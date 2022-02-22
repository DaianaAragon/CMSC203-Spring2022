
public class VehicleDriver {

	public static void main(String[] args) {
				
		Vehicle v1 = new Vehicle("Corolla", "Toyota");
		System.out.println(v1);

		Vehicle v2 = new Vehicle("Soul", "Kia", "White",
				                  2020, 20000);
		
		System.out.println(v2);
		v2.swap(v1);
		System.out.println("After swap: ");
		System.out.println(v1);
		System.out.println(v2);
		
	}
}