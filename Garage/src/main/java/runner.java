public class runner {

	public static void main(String[] args) {
		Aeroplane biplane = new Aeroplane("Biplane", 4, 3, 2);
		Aeroplane jetliner = new Aeroplane("Jetliner", 2, 12, 270);
		Train steamTrain = new Train("Steam Train", 10, 20, 1);
		Train tubeTrain = new Train("Tube Train", 64, 80, 8);
		Bus greyhound = new Bus("Greyhound", 10, 40, 0);
		Bus doubleDecker = new Bus("Double Decker", 6, 25, 27);

		Garage MonkeyGarage = new Garage();
		MonkeyGarage.shopList.add(doubleDecker);
		MonkeyGarage.shopList.add(jetliner);
		MonkeyGarage.shopList.add(biplane);
		MonkeyGarage.shopList.add(tubeTrain);
		MonkeyGarage.shopList.add(steamTrain);
		MonkeyGarage.shopList.add(greyhound);

		System.out.println("Vehicles with more than 20 seats:");
		MonkeyGarage.shopList.stream().filter(s -> s.getTotalCapacity() > 20).forEach(System.out::println);

		System.out.println("---");

		System.out.println("Cost for maintenance:");

		MonkeyGarage.shopList.stream().map(s -> s + ": " + Garage.Bill(s)).forEach(System.out::println);

		System.out.println("---");

		System.out.println("Remove Tube Train");

		System.out.println(MonkeyGarage.removeVehicle("Tube Train", MonkeyGarage.shopList));

		System.out.println("---");

		System.out.println("Remove all Aeroplanes");

		MonkeyGarage.removeVehicleType("Aeroplane", MonkeyGarage.shopList);

	}

}
