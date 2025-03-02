// package CLASS;

// import java.util.Scanner;

// class Blade {
//     int size;
//     int number;
//     int angle;
//     double hp;
//     boolean valid = true;

//     Blade(int size, int number, int angle, double hp) {
//         this.size = size;
//         this.number = number;
//         this.angle = angle;
//         this.hp = hp;
//         if (size % 2 != 0 || size < 16 || size > 24) {
//             System.out.println("invalid size");
//             this.valid = false;
//         }
//         if (number != 3 && number != 4 && number != 5) {
//             System.out.println("invalid number of blades");
//             this.valid = false;
//         }
//         if (angle != 27 && angle != 30 && angle != 33) {
//             System.out.println("invalid angle");
//             this.valid = false;
//         }
//         if (hp <= 0) {
//             System.out.println("invalid horsepower");
//             this.valid = false;
//         }
//     }

//     void printInfo() {
//         System.out.println(this.size + " " + this.number + " " + this.angle + " " + this.hp + " " + this.valid);
//     }
// }

// class Motor {
//     double v;
//     double i;
//     double eff;

//     Motor(double v, double i, double e) {
//         this.v = v;
//         this.i = i;
//         this.eff = e / 100.0;
//     }

//     Motor(double i, double e) {
//         this(220., i, e);
//     }

//     double horsepower() {
//         return (this.v * this.i * eff) / 746.0;
//     }

//     void printInfo() {
//         System.out.println(this.v + " " + this.i + " " + this.eff + " " + String.format("%.2f", horsepower()));
//     }

// }

// public class FanCompany2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double v = sc.nextDouble();
//         double i = sc.nextDouble();
//         double eff = sc.nextDouble();
//         Motor motor = null;
//         if (v == 220) {
//             motor=new Motor(i, eff);
//         } else {
//             motor = new Motor(v, i, eff);
//         }
//         motor.printInfo();
//     }

// }
