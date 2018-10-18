
public class RunTime {

	public static void main(String[] args) {
		System.out.println(Grid.oneGrid);
		Grid.addShip(0, 0, 2, "The Flogging Oggin'", true, 0);
		Grid.addShip(1, 1, 2, "The Oggy Floggy", false, 1);
		System.out.println(Grid.oneGrid);

	}

}
