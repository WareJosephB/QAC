
public class Item {

	private static int N = 1;

	private String title;
	private String publishDate;
	private int refNumber;

	Item(String title, String publishDate) {
		this.setTitle(title);
		this.setPublishDate(publishDate);
		this.refNumber = N;
		N += 1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public int getRefNumber() {
		return refNumber;
	}

}
