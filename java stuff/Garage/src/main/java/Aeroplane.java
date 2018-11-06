
public class Aeroplane extends Vehicle {
	private int numberWings;
	private int maximumAltitude;

	public Aeroplane(String name, int wings, int wheels, int seats) {
		super(name, wheels, seats);
		this.setNumberWings(wings);
	}

	public int getMaximumAltitude() {
		return maximumAltitude;
	}

	public void setMaximumAltitude(int maximumAltitude) {
		this.maximumAltitude = maximumAltitude;
	}

	public int getNumberWings() {
		return numberWings;
	}

	public void setNumberWings(int numberWings) {
		this.numberWings = numberWings;
	}

}
