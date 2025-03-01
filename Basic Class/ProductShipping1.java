// package CLASS;

// import java.util.Scanner;

// class Product {
// String product_name;
// int product_weight;
// int product_price;

// Product(String name, int weight, int price) {
// this.product_name = name;
// this.product_weight = weight;
// this.product_price = price;
// }

// void printInfo() {
// System.out.println(
// this.product_weight + " grams of " + this.product_name + " costs " +
// this.product_price + " baht.");
// }
// }

// public class ProductShipping1 {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// for (int i = 0; i < n; i++) {
// String name = in.next();
// int weight = in.nextInt();
// int price = in.nextInt();
// Product p = new Product(name, weight, price);
// p.printInfo();
// }
// }
// }