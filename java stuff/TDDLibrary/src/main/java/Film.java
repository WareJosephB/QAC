import java.util.ArrayList;

public class Film extends Item {

	private int length;
	private String director;
	private ArrayList<String> actors = new ArrayList<>();

	public Film(String title, String director, String releaseDate) {
		super(title, releaseDate);
		this.setDirector(director);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}

	public void addActor(String actor) {
		this.actors.add(actor);
	}

}
