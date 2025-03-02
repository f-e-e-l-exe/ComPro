// import java.util.Scanner;

// class FoodShop {
// String restaurantName;
// int nFoods = 0;

// FoodShop(String name) {
// this.restaurantName = name;
// }

// boolean addFood() {
// if (this.nFoods < 5) {
// this.nFoods++;
// System.out.print(this.nFoods);
// return true;
// }
// System.out.print(-1);
// return false;
// }

// void printMenu() {
// System.out.println(this.restaurantName + " " + this.nFoods);
// }

// }

// public class FoodTiger1 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// final int N = scan.nextInt();
// FoodShop[] fs = new FoodShop[N + 1];
// for (int i = 1; i < fs.length; ++i) {
// String name = scan.next();
// fs[i] = new FoodShop(name);
// }

// final int Q = scan.nextInt();
// for (int i = 0; i < Q; ++i) {
// int s = scan.nextInt();
// boolean ret = fs[s].addFood();
// System.out.println(" " + ret);
// }

// for (int i = 1; i < fs.length; ++i) {
// fs[i].printMenu();
// }
// }
// }