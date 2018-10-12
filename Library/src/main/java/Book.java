
public class Book extends Item {

	private String author;
	private String genre;
	private String publishDate;

	Book(String title, String author) {
		super(title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

}
