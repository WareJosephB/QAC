
public class PlotGrid {

	public static void Plot(int Player) {

		int x = 0;
		int y = 0;

		while (y < Grid.getY()) {
			System.out.print(String.valueOf(Grid.getY() - y - 1));
			while (x < Grid.getX()) {
				if (Grid.oneGrid[x][Grid.getY() - y - 1][Player].bombed()) {
					if (Grid.oneGrid[x][Grid.getY() - y - 1][Player].ship()) {
						System.out.print("x");
					} else {
						System.out.print("o");
					}
				} else {
					System.out.print(".");
				}
				x++;

			}
			y++;
			System.out.println();
			x = 0;
		}
		x = 0;
		System.out.print("/");
		while (x < Grid.getX()) {
			System.out.print(String.valueOf(x));
			x++;
		}
		System.out.println();

	}

	public static void initPlot(int Player) {
		int x = 0;
		int y = 0;

		while (y < Grid.getY()) {
			System.out.print(String.valueOf(Grid.getY() - y - 1));
			while (x < Grid.getX()) {
				if (Grid.oneGrid[x][Grid.getY() - y - 1][Player].ship()) {
					System.out.print("x");

				} else {
					System.out.print(".");
				}
				x++;

			}
			y++;
			System.out.println();
			x = 0;
		}
		x = 0;
		System.out.print("/");
		while (x < Grid.getX()) {
			System.out.print(String.valueOf(x));
			x++;
		}
		System.out.println();
	}

	public static void ObfusPlot(int Player) {
		int x = 0;
		int y = 0;

		while (y < Grid.getY()) {
			System.out.print(String.valueOf(Grid.getY() - y - 1));
			while (x < Grid.getX()) {
				System.out.print("x");
				x++;

			}
			y++;
			x = 0;
			System.out.println();
		}

		x = 0;
		System.out.print("/");
		while (x < Grid.getX()) {

			System.out.print(String.valueOf(x));
			x++;
			System.out.println();
		}
	}

	public static void endPlot(int Player) {
		int x = 0;
		int y = 0;

		while (y < Grid.getY()) {
			System.out.print(String.valueOf(Grid.getY() - y - 1));
			while (x < Grid.getX()) {
				if (Grid.oneGrid[x][Grid.getY() - y - 1][Player].bombed()) {
					if (Grid.oneGrid[x][Grid.getY() - y - 1][Player].ship()) {
						System.out.print("x");
					} else {
						System.out.print("o");
					}
				} else if (Grid.oneGrid[x][Grid.getY() - y - 1][Player].ship()) {
					System.out.print("s");

				} else {
					System.out.print(".");
				}
				x++;

			}
			y++;
			System.out.println();
			x = 0;
		}
		x = 0;
		System.out.print("/");
		while (x < Grid.getX()) {
			System.out.print(String.valueOf(x));
			x++;
		}
		System.out.println();

	}
}
