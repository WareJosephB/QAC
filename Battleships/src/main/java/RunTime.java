// import java.util.Scanner;
//
// public class RunTime {
//
// public static void main(String[] args) {
//
// int x = 0;
// int y = 0;
// int z = 0;
//
// while (z < 2) {
// while (x < Grid.getX()) {
// while (y < Grid.getY()) {
// Grid.oneGrid[x][y][z] = new Square();
// y += 1;
// }
// y = 0;
// x += 1;
// }
// y = 0;
// x = 0;
// z += 1;
// }
//
// boolean startFirst;
//
// if (Player1.ships.length < Player2.ships.length) {
// startFirst = false;
// } else {
// startFirst = true;
// }
//
// if (Player1.ships.length != Player2.ships.length) {
// System.out.println("Differing number of ships, continue? Y/N");
// int temp = 0;
// while (temp == 0) {
// Scanner sc = new Scanner(System.in);
// String ch = sc.next();
// if (ch == "N") {
// System.exit(0);
// } else if (ch != "Y") {
// System.out.println("Wrong input, try again.");
// } else {
// temp = 1;
// }
// }
// }
//
// while (!CheckShips.shipChecker(1) && !CheckShips.shipChecker(2)) {
// turns.go();
// }
//
// PlotGrid.endPlot(0);
// PlotGrid.endPlot(1);
// if (CheckShips.shipChecker(1)) {
// System.out.println("Player 1 wins!");
// } else {
// System.out.println("Player 2 wins!");
// }
// }
//
// }
