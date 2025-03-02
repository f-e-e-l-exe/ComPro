// package CLASS;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// class Food {
// String Name;
// ArrayList<String> Ingredient;
// int totalweight = 0;

// Food(String name, String ingredient, int weight) {
// this.Name = name;
// this.Ingredient = new ArrayList<>(Arrays.asList(ingredient));
// this.totalweight = weight;
// }

// void addContent(String ingredient, int weight) {
// this.Ingredient.add(ingredient);
// this.totalweight += weight;
// }

// void printInfo() {
// System.out.println(this.Name);
// System.out.println(this.totalweight);
// for (String n : this.Ingredient) {
// System.out.print(n + " ");
// }
// System.out.println();
// }

// }

// public class FoodContents1 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// String foodName = scan.next();
// String content1 = scan.next();
// int w1 = scan.nextInt();
// Food food = new Food(foodName, content1, w1);
// int q = scan.nextInt();
// while (q != 0) {
// if (q == 1) {
// food.printInfo();
// } else if (q == 2) {
// String ingre = scan.next();
// int weight = scan.nextInt();
// food.addContent(ingre, weight);
// }
// q = scan.nextInt();
// }
// }

// }
