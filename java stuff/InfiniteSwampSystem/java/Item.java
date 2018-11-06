public class Item {

	private static int N = 0;
	private int itemNo;
	private int x;
	private int y;
	private String type;

	public Item(int x, int y) {
		this.setX(x);
		this.setY(y);
		this.itemNo = N;
		this.type = getShopList()[N];
		N += 1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static String[] getShopList() {
		return shopList;
	}

	private static String[] shopList = { "Boot", "Spring", "£5 note wait, no it's a sandwich wrapper", "Hair clipper",
			"chain of 3 paperclips", "Bicycle frame", "QA Consulting Lanyard for \"Trainee Number 666\"",
			"Two-thirds of a man", "A crop circle but made of ants", "2 spoons welded together at the tip",
			"thriving commune of anarcho-syndicalists",
			"whole bunch of dark matter just hanging around for anyone to discover",
			"pair of teenagers leaning against a wall smoking", "The Chunk",
			"A horse that only walks backwards ok actually just a regular horse that was reversing",
			"A way out fo this god-forsaken swamp",
			"group of really annoying monkies that you hope won't come with you", "Some treasure",
			"group of really annoying monkies that you hope won't come with you" };
}
