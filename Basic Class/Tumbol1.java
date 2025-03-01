// package CLASS;

// import java.util.Scanner;

// class Tumbol {
//     String nameTambol;
//     int lagitude;
//     int longitude;
//     int population;
//     int availBudget;

//     Tumbol(String name, int lagitude, int longitude, int people) {
//         this.nameTambol = name;
//         this.lagitude = lagitude;
//         this.longitude = longitude;
//         this.population = people;
//         this.availBudget = people * 5000;
//     }

//     void allocateBudget(int[] budget) {
//         boolean invalid=true;
//         for (int a = 0; a < budget.length; a++) {
//             if (this.availBudget - budget[a] >= 0) {
//                 this.availBudget -= budget[a];
//                 invalid=false;
//                 System.out.print((a + 1) + " ");
//             }
//         }
//         if(invalid){
//             System.out.print("none");
//         }
//         System.out.println();
//     }

// }

// public class Tumbol1 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String name = s.nextLine();
//         int lagi = s.nextInt();
//         int longi = s.nextInt();
//         int population = s.nextInt();
//         int n = s.nextInt();
//         Tumbol tumbol = new Tumbol(name, lagi, longi, population);
//         int[] budget = new int[n];
//         for (int a = 0; a < n; a++) {
//             budget[a] = s.nextInt();
//         }
//         tumbol.allocateBudget(budget);
//     }
// }
