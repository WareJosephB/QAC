
public class Ship {

	private String name;
	private String type;
	private int length;
	private int hits = 0;

	public Ship(String name, String type, int length) {
		this.name = name;
		this.length = length;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public int getLength() {
		return this.length;
	}

	public void bomb() {
		this.hits += 1;
		if (this.hits == this.getLength()) {
			System.out.println("You sunk my " + this.type + "!");
		}
	}

}
