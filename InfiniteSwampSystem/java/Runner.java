import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Player you = new Player(0, 0);

		Swamp theSwamp = new Swamp();

		List<Item> items = new ArrayList<>();
		int i;

		for (i = 0; i < 19; i++) {
			items.add(new Item(Move.randLocation(), Move.randLocation()));
		}
		System.out.println(
				"You are in a dark and forbidding swamp, you feel like you could move North, East, South or West.");
		while (true) {
			theSwamp.distance(you, theSwamp.findClosest(you, items), (ArrayList<Item>) items);
			int Q = 0;
			while (Q < you.getMonkey()) {
				System.out.println("Ook");
			}
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			Move.move(you, Move.input(s));
		}
	}

}
