
public class VehicleDriver {

	public static void main(String[] args) {
				
		Vehicle v1 = new Vehicle("Corolla", "Toyota");
		System.out.println(v1);

		Vehicle v2 = new Vehicle("Soul", "Kia", "White",
				                  2020, 20000);
		
		v1.changePrice(v2, 500);
		System.out.println(v1.getPrice());
	
		System.out.println();
		
		v1.changePrice(v2, v2.getPrice());
		System.out.println(v1.getPrice());
		
	}
}