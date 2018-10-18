public class Grid {

	static private int X = 3;
	static private int Y = 3;
	static private int x = 0;
	static private int y = 0;
	static private int z = 0;

	public static int getX() {
		return X;
	}

	public static int getY() {
		return Y;
	}

	private static Square[][][] oneGrid = new Square[getX()][getY()][2];

	while(z<2)
	{
		while (x < X) {
			while (y < Y) {
				oneGrid[x][y][z] = new Square();
				y += 1;
			}
			y = 0;
			x += 1;
		}
		y = 0;
		x = 0;
		z += 1;
	}

	public boolean bomb(int X, int Y, int P) {
		Square thisSquare = oneGrid[X][Y][P];

		if (thisSquare.bombed()) {
			return false;
		} else {
			thisSquare.bomb();
			System.out.println(thisSquare.shipped());
			return true;
		}

	}

	public static boolean addShip(int X, int Y, int length, String shipName, boolean OrientationHorizontal, int P) {

		if (X + length > getX() || Y + length > getY()) {
			System.out.println("Not enough space");
			return false;

		} else {

			boolean shipInWay = false;
			int i = 0;

			if (OrientationHorizontal) {
				i = 0;
				while (!shipInWay && i < length) {
					shipInWay = oneGrid[X + i][Y][P].ship();
					i += 1;
				}
				if (!shipInWay) {
					i = 0;
					while (i < length) {
						oneGrid[X + i][Y][P].addShip(shipName);
						i += 1;

					}
				} else {
					System.out.println("Not enough space");
					return false;
				}

			} else {

				i = 0;
				while (!shipInWay && i < length) {
					shipInWay = oneGrid[X][Y + i][P].ship();
					i += 1;
				}
				if (!shipInWay) {
					i = 0;
					while (i < length) {
						oneGrid[X][Y + i][P].addShip(shipName);
						i += 1;

					}

				} else {
					System.out.println("Not enough space");
					return false;
				}
			}
			return true;
		}

	}
}
