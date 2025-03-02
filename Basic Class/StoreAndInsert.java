
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;

// class ProductInfo {
// public String product_name;
// public int cheap_price;
// public int expensive_price;

// ProductInfo(String name, int[] price) {
// this.product_name = name;
// this.cheap_price = Arrays.stream(price).min().getAsInt();
// this.expensive_price = Arrays.stream(price).max().getAsInt();
// }

// void printInfo() {
// System.out.println(this.product_name + " " + this.cheap_price + " " +
// this.expensive_price);
// }
// }

// class Store {
// private List<ProductInfo> products = new ArrayList<>();

// void enterProductInfo(Scanner s) {
// String name = s.next();
// int n = s.nextInt();
// int[] price = new int[n];
// for (int a = 0; a < n; a++) {
// price[a] = s.nextInt();
// }
// this.products.add(new ProductInfo(name, price));
// }

// void printAllProductInfo() {
// for (ProductInfo s : products) {
// s.printInfo();
// }
// }
// }

// public class StoreAndInsert {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// Store store = new Store();
// int K = scan.nextInt();
// for (int i = 0; i < K; ++i) {
// store.enterProductInfo(scan);
// }
// store.printAllProductInfo();
// }

// }