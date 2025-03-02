// package CLASS;

// import java.util.Arrays;
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

// public class PriceRange {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// String name = scan.next();
// int N = scan.nextInt();
// int[] prices = new int[N];
// for (int i = 0; i < N; ++i)
// prices[i] = scan.nextInt();
// ProductInfo pInfo = new ProductInfo(name, prices);
// pInfo.printInfo();
// }
// }