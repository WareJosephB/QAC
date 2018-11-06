
public class Bus extends Vehicle {

	private int numberStanding;

	public Bus(String name, int wheels, int seats, int standingCap) {
		super(name, wheels, seats);
		this.setNumberStanding(standingCap);
		super.setTotalCapacity(standingCap + seats);

	}

	public int getNumberStanding() {
		return numberStanding;
	}

	public void setNumberStanding(int numberStanding) {
		this.numberStanding = numberStanding;
	}

}
