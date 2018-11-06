
public class Move {

	public static void move(Player player, int dir) {
		System.out.println(dir);
		if (dir == 0) {
			player.setxLocat(player.getxLocat() + 1);
		} else if (dir == 1) {
			player.setyLocat(player.getyLocat() + 1);
		} else if (dir == 2) {
			player.setxLocat(player.getxLocat() - 1);
		} else if (dir == 3) {
			player.setyLocat(player.getyLocat() - 1);
		} else {
			System.out.println("I don't understand.");
		}

	}

	public static int input(String direction) {
		switch (direction) {
		case "North":
		case "N":
		case "Northwards":
			return 0;
		case "East":
		case "E":
		case "Eastwards":
			return 1;

		case "South":
		case "S":
		case "Southwards":
			return 2;

		case "West":
		case "W":
		case "Westwards":
			return 3;

		}
		return 128;

	}

	public static int randLocation() {
		return (int) (N * Math.random() - 2 * N);
	}

}
