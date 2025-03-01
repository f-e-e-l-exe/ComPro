// package CLASS;

// import java.util.Scanner;

// class Item {
//     String product_name;
//     String code;
//     int price;
//     int deli;
//     int size;
//     int volume;
//     boolean valid;

//     Item(String n, String c, int p, int d, int s, int v) {
//         this.product_name = n;
//         this.code = c;
//         this.price = p;
//         this.deli = d;
//         this.size = s;
//         this.volume = v;
//         this.valid = basicCheck(n, c, p, d, s, v);
//     }

//     boolean basicCheck(String n, String c, int p, int d, int s, int v) {
//         if (n.length() < 3 || n == null) {
//             return false;
//         }
//         if (p < 0 || s < 0) {
//             return false;
//         }
//         if (d < 0) {
//             return false;
//         }
//         return true;
//     }

//     boolean cutStock(int n) {
//         if (n > this.volume) {
//             return false;
//         }
//         this.volume -= n;
//         return true;
//     }

//     void printInfo() {
//         System.out.println(this.product_name + " " + this.code+" "+this.price);
//         System.out.println(this.deli + " " + this.size + " " + this.volume + " " + this.valid);
//     }
// }

// public class ItemAndCart1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.next();
//         String id = scan.next();
//         int price = scan.nextInt();
//         int shipping = scan.nextInt();
//         int volume = scan.nextInt();
//         int quan = scan.nextInt();
//         Item item = new Item(name, id, price,
//                 shipping, volume, quan);
//         item.printInfo();

//         int n = scan.nextInt();
//         for (int i = 0; i < n; ++i) {
//             int q = scan.nextInt();
//             System.out.println(item.cutStock(q));
//             item.printInfo();
//         }
//     }
// }
