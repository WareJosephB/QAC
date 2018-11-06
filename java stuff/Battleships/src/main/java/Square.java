
public class Square {

	private boolean ship;
	private boolean bombed;
	private int shipNumber;

	public Square() {
		this.ship = false;
		this.bombed = false;
		this.shipNumber = -1;
	}

	public void bomb(Ship[] shipList) {
		this.bombed = true;
		if (this.shipNumber != 0) {
			shipList[this.shipNumber].bomb();
		}
	}

	public void addShip(int shipNumber) {
		this.ship = true;
		this.shipNumber = shipNumber;
	}

	public String shipped() {
		if (ship()) {
			return "Hit!";
		} else {
			return "Miss";
		}
	}

	public boolean bombed() {
		return this.bombed;
	}

	public boolean ship() {
		return this.ship;
	}

}
