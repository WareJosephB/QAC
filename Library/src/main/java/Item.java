
public class Item {

	private boolean checkedOut = false;
	private String checkedBy = null;
	private String name;

	Item(String name) {
		this.name = name;
	}

	public void checkOut(Person person) {
		this.checkedOut = true;
		this.checkedBy = person.getName();
		person.checkOut(this.name);
	}

	public void checkIn(Person person) {
		this.checkedOut = false;
		this.checkedBy = null;
		person.checkIn(this.name);
	}

}
