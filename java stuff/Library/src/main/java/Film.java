import java.util.ArrayList;
import java.util.List;

public class Film extends Item {

	private String director;
	private List<String> actors = new ArrayList<>();
	private double length;
	private int rating;

	public Film(String title, String director, double length) {
		super(title);
		this.director = director;
		this.length = length;
	}

	public void addActor(String Actor) {
		this.actors.add(Actor);
	}

	public void addRating(int rating) {
		this.rating = rating;
	}

}
