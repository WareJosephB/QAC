
public class turns {

	public boolean Bomb(int X, int Y, int Player) {
		// if (Grid.oneGrid[X][Y][Player].bombed()){
		System.out.println("Already bombed, try again.");
		anotherGo = false;
		return false;
	}else

	{
		Grid.oneGrid[X][Y][Player].bomb();
		if Grid.oneGrid[X][Y][Player].ship(){

 }return true;

	}}

	public static void go() {
		int P;
		while (!shipChecker) {

			boolean anotherGo = true;

			if (startFirst) {
				P = 0;
			} else {
				P = 1;
			}
			startFirst = !startFirst;
			// TO DO: Listener

			X = sc;
			Y = sc;

			Bomb(X, Y, P);

		}

	}
}
