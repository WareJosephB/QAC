
public class Player {

	public int Treasure = 0;
	private int xLocat;
	private int yLocat;
	private int monkey = 0;

	Player(int x, int y) {
		this.setxLocat(x);
		this.setyLocat(y);
	}

	public int getxLocat() {
		return xLocat;
	}

	public void setxLocat(int xLocat) {
		this.xLocat = xLocat;
	}

	public int getyLocat() {
		return yLocat;
	}

	public void setyLocat(int yLocat) {
		this.yLocat = yLocat;
	}

	public int getMonkey() {
		return monkey;
	}

	public void setMonkey(int monkey) {
		this.monkey = monkey;
	}

}
