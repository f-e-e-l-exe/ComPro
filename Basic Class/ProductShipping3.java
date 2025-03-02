// // package CLASS;

// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.stream.IntStream;

// class Product {
//     String product_name;
//     int product_weight;
//     int product_price;

//     Product(String name, int weight, int price) {
//         this.product_name = name;
//         this.product_weight = weight;
//         this.product_price = price;
//     }

//     void printInfo() {
//         System.out.println(
//                 this.product_weight + " grams of " + this.product_name + " costs " +
//                         this.product_price + " baht.");
//     }
// }

// class PurchaseOrder {
//     int total_product;
//     Product[] products;
//     int[] amount_product;
//     int total_price;
//     int total_weight;

//     PurchaseOrder(int total_product, Product[] products, int[] amount_product) {
//         this.total_product = total_product;
//         this.products = Arrays.copyOf(products, products.length);
//         this.amount_product = Arrays.copyOf(amount_product, amount_product.length);
//         this.total_price = IntStream.range(0, products.length).map(p -> products[p].product_price * amount_product[p])
//                 .sum();
//         this.total_weight = IntStream.range(0, products.length).map(p -> products[p].product_weight * amount_product[p])
//                 .sum();

//     }

//     void printInfo() {
//         System.out.println(total_product + " items = " + this.total_price + " baht "
//                 + this.total_weight + " grams");
//         for (int a = 0; a < products.length; a++) {
//             System.out.println(products[a].product_name + " " + amount_product[a] + "x" +
//                     products[a].product_price
//                     + " = " + products[a].product_price * amount_product[a]);
//         }
//     }

// }

// class Truck {
//     int truck_capacity;
//     PurchaseOrder purchaseorder;
//     int destination;
//     double shippingCost;

//     Truck(int capacity) {
//         this.truck_capacity = capacity;
//         this.destination = 0;
//         this.shippingCost = 0;
//     }

//     void add(PurchaseOrder purchaseOrder, int destination) {
//         this.purchaseorder = purchaseOrder;
//         this.destination = destination;
//         setFee();
//     }

//     void setFee() {
//         this.shippingCost = (this.purchaseorder.total_weight * 1.0 / 1000) *
//                 this.destination;
//         // String check = "" + this.shippingCost;
//         // if (check.split("\\.")[1].length() > 3) {
//         // this.shippingCost = Double.parseDouble(String.format("%.1f",
//         // this.shippingCost));
//         // }
//     }

//     double getFee() {
//         return this.shippingCost;
//     }
// }

// class SpecialTruck {

// }

// public class ProductShipping3 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         Truck[] trucks = new Truck[m];
//         for (int i = 0; i < m; i++) {
//             int capacity = in.nextInt();
//             trucks[i] = new Truck(capacity);
//         }
//         int n = in.nextInt();
//         int dest = in.nextInt();
//         Product[] products = new Product[n];
//         int[] amount = new int[n];
//         for (int i = 0; i < n; i++) {
//             String name = in.next();
//             int weight = in.nextInt();
//             int price = in.nextInt();
//             products[i] = new Product(name, weight, price);
//             amount[i] = in.nextInt();
//         }
//         PurchaseOrder po = new PurchaseOrder(n, products, amount);
//         int minvalue = Integer.MAX_VALUE;
//         int minIndex = -1;
//         for (int i = 0; i < m; i++) {
//             if ((trucks[i].truck_capacity >= po.total_weight) && (minvalue > trucks[i].truck_capacity)) {
//                 minvalue = trucks[i].truck_capacity;
//                 minIndex = i;
//             }
//         }
//         if (minIndex >= 0)

//         {
//             trucks[minIndex].add(po, dest);
//             System.out.println("Truck#" + (minIndex + 1));
//             System.out.println("Fee=" + trucks[minIndex].getFee());
//         } else {
//             System.out.println("No truck");
//             System.out.println("Fee=" + po.total_weight * dest / 1000.0);
//         }
//     }
// }