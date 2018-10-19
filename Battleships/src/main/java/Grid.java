public class Grid {

	static private int X = 10;
	static private int Y = 10;
	static Square[][][] oneGrid = new Square[Grid.getX()][Grid.getY()][2];

	public static int getX() {
		return X;
	}

	public static int getY() {
		return Y;
	}

	public boolean bomb(int X, int Y, int P) {
		Square thisSquare = oneGrid[X][Y][P];

		if (thisSquare.bombed()) {
			return false;
		} else {
			Ship[][] shipListList = { Player1.ships, Player2.ships };
			System.out.println(thisSquare.shipped());
			thisSquare.bomb(shipListList[P]);
			return true;
		}

	}

	public static boolean addShip(int X, int Y, int shipNumber, boolean OrientationHorizontal, int P) {
		String Orientation;
		if (OrientationHorizontal) {
			Orientation = "Horizontally";
		} else {
			Orientation = "Vertically";
		}

		Ship[] shipList;

		if (P == 0) {
			shipList = Player1.ships;
		} else {
			shipList = Player2.ships;

		}

		System.out.println("You are currently placing the " + shipList[shipNumber].getName() + ", of length "
				+ shipList[shipNumber].getLength() + ", " + Orientation);

		if (X + shipList[shipNumber].getLength() > getX() || Y + shipList[shipNumber].getLength() > getY()) {
			System.out.println("Ship is falling off edge, try again.");
			return false;

		} else {

			boolean shipInWay = false;
			int i = 0;

			if (OrientationHorizontal) {
				i = 0;
				while (!shipInWay && i < shipList[shipNumber].getLength()) {
					shipInWay = oneGrid[X + i][Y][P].ship();
					i += 1;
				}
				if (!shipInWay) {
					i = 0;
					System.out
							.println(shipList[shipNumber].getName() + " placed at (" + X + "," + Y + ") succesfully.");
					while (i < shipList[shipNumber].getLength()) {
						oneGrid[X + i][Y][P].addShip(shipNumber);
						i += 1;

					}
				} else {
					System.out.println("Ship in the way, try again.");
					return false;
				}

			} else {

				i = 0;
				while (!shipInWay && i < shipList[shipNumber].getLength()) {
					shipInWay = oneGrid[X][Y + i][P].ship();
					i += 1;
				}
				if (!shipInWay) {
					i = 0;
					while (i < shipList[shipNumber].getLength()) {
						oneGrid[X][Y + i][P].addShip(shipNumber);
						i += 1;

					}

				} else {
					System.out.println("Ship in the way, try again.");
					return false;
				}
			}
			return true;
		}

	}
}
