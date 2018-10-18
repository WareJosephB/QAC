import java.util.ArrayList;

public class Card {

	private int price;
	private String type;
	private ArrayList<String> tags = new ArrayList<>();

	public Card(int price, String type, String tag) {
		this.price = price;
		if (type == "R" || type == "E" || type == "Event") {
			this.type = "Event";
		} else if (type == "B" || type == "Active") {
			this.type = "Active";
		} else if (type == "G" || type == "Automated") {
			this.type = "Automated";
		}
		this.tags.add(tag);
	}

	public Card(int price, String type, String tag, String tag2) {
		this(price, type, tag);
		this.tags.add(tag2);
	}

	public Card(int price, String type, String tag, String tag2, String tag3) {
		this(price, type, tag, tag2);
		this.tags.add(tag3);
	}
}
