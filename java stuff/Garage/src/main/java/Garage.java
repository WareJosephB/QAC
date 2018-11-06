import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private ArrayList<Vehicle> shopList = new ArrayList<Vehicle>();

	public static double Bill(Vehicle vehicle) {
		double base = (vehicle.getTotalCapacity() * 1);
		base += (vehicle.getNumberWheels() * 5);
		if (vehicle instanceof Aeroplane) {
			base += (((Aeroplane) vehicle).getNumberWings() * 50);
		} else if (vehicle instanceof Bus) {
			base += (vehicle.getNumberSeats() * -1) + (vehicle.getNumberWheels() * 5);
		} else if (vehicle instanceof Train) {
			base += 50 * (vehicle.getTotalCapacity() / ((Train) vehicle).getCarriages());
		}
		return base;

	}

	public void addVehicle(Vehicle addedVehicle, List<Vehicle> firm) {
		firm.add(addedVehicle);
	}

	public List<Vehicle> removeVehicle(String name, List<Vehicle> firm) {
		return firm.stream().filter(s -> !(s.getName().equals(name))).collect(Collectors.toList());
	}

	public void removeVehicleType(String type, List<Vehicle> firm) {
		if (type == "Aeroplane") {
			System.out.println(firm.stream().filter(s -> !(s instanceof Aeroplane)).collect(Collectors.toList()));

		} else {
			System.out.println("I only did Aeroplane, it'd be the same for the other two");
		}

	}
}
