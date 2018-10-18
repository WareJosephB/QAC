
public class Square {

	private boolean ship;
	private boolean bombed;
	private String shipName;

	public Square() {
		this.ship = false;
		this.bombed = false;
		this.shipName = null;
	}

	public void bomb() {
		this.bombed = true;
	}

	public void addShip(String shipName) {
		this.ship = true;
		this.shipName = shipName;
	}

	public String shipped() {
		if (ship) {
			return shipName;
		} else {
			return "Nothing";
		}
	}

	public boolean bombed() {
		return bombed;
	}

	public String toString() {
		return "I exist";
	}

	public boolean ship() {
		return ship;
	}

}
