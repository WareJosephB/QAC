
public class Train extends Vehicle {

	private int carriages;

	public Train(String name, int wheels, int seats, int carriages) {
		super(name, wheels, seats);
		this.setCarriages(carriages);

	}

	public int getCarriages() {
		return carriages;
	}

	public void setCarriages(int carriages) {
		this.carriages = carriages;
	}

}
