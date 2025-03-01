// package CLASS;

// import java.util.Scanner;

// class FoodOrder{
//     String Customer;
//     int foodTotal=0;

//     FoodOrder(String name){
//         this.Customer=name;   
//     }
//     void addFood(int price){
//         this.foodTotal+=price;
//     }
//     void finalizeReceipt(){
//         int deli=0;
//         System.out.println(Customer);
//         if(this.foodTotal<=50){
//             deli=20;
//         }else if(this.foodTotal>50&&this.foodTotal<=150){
//             deli=10;
//         }
//         System.out.println(this.foodTotal);
//         System.out.println(deli);
//         System.out.println(this.foodTotal+deli);
//     }
// }

// public class GrabPanda1 {
//     public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     String name = scan.next();
//     int N = scan.nextInt();
//     FoodOrder order = new FoodOrder(name);
//     for(int i = 0; i < N; ++i) {
//         int price = scan.nextInt();
//         order.addFood(price);
//     }
//     order.finalizeReceipt();
//     }
//    }