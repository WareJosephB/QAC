import java.util.ArrayList;
import java.util.List;

public class Swamp {

	public void distance(Player you, int closest, ArrayList<Item> items) {

		double X = you.getxLocat() - items.get(closest).getX();
		double Y = you.getyLocat() - items.get(closest).getY();

		System.out.println("You see... something  in the swamp, "
				+ String.valueOf(Math.floor(Math.sqrt(X * X + Y * Y) * 100) / 100) + " metres away");
		if (X * X + Y * Y < 1) {
			System.out.println("You have found a " + randItem(closest));
			if (closest == 16 || closest == 18) {
				you.setMonkey(you.getMonkey() + 1);
				items.get(closest).setX(Move.randLocation());
				items.get(closest).setX(Move.randLocation());
			} else {
				items.get(closest).setX(Integer.MAX_VALUE);
				items.get(closest).setX(Integer.MAX_VALUE);
			}
			if (closest == 17) {
				you.Treasure = 1;
			}
			if (closest == 15) {
				if (you.Treasure == 1) {
					System.out.println("Congratulations");
					System.exit(0);
				} else {
					System.out.println("Don't you want to find some treasure to make your time here worth it?");
				}
			}

		}
	}

	public String randItem(int closest) {
		return Item.getShopList()[closest];

	}

	public int findClosest(Player player, List<Item> items) {
		double O = Double.MAX_VALUE;
		int p = -1;
		int i;
		for (i = 0; i < 18; i++) {
			double X = (items.get(i).getX() * items.get(i).getX() - player.getxLocat() * player.getxLocat());
			double Y = (items.get(i).getY() * items.get(i).getY() - player.getyLocat() * player.getyLocat());
			if (X * X + Y * Y < O) {
				O = X * X + Y * Y;
				p = i;
			}
		}
		return p;

	}

	public static List<String> shopList() {

		return null;
	}
}
