
public class CheckShips {

	public static boolean shipChecker(int Player) {

		boolean sunk = true;
		int x = 0;
		int y = 0;

		while (x < Grid.getX()) {
			while (y < Grid.getY()) {
				if (Grid.oneGrid[x][y][Player].ship() && !Grid.oneGrid[x][y][Player].bombed()) {
					x = Grid.getX();
					y = Grid.getY();
					sunk = false;
				}
				y++;
			}
			x++;
			y = 0;
		}
		return sunk;
	}

}
