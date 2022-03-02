
public class VehicleDemo {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		
		increasePrice(v1, 1000);
		System.out.println(v1.getPrice());
		
		Vehicle v2 = create(v1);
		
		System.out.println(v1);
		
	}
	
	public static Vehicle create(Vehicle vh) 
	{
		Vehicle vm = new Vehicle(vh);
		
		vm.setPrice(1000);
		
		return vm;
	}
	
	public double increasePrice(Vehicle vh)
	{
		return vh.getPrice() + 100;
	}
	
	public static void increasePrice(Vehicle vh, double amount)
	{
		vh.setPrice(vh.getPrice() + amount);
	}

}
