// package CLASS;

// import java.util.Scanner;

// class Blade {
//     int size;
//     int number;
//     int angle;
//     double hp;
//     boolean valid=true;

//     Blade(int size, int number, int angle, double hp) {
//         this.size=size;
//         this.number=number;
//         this.angle=angle;
//         this.hp=hp;
//         if(size%2==0&&size<16||size>24){
//             System.out.println("invalid size");
//             this.valid=false;
//         }
//         if(number!=3&&number!=4&&number!=5){
//             System.out.println("invalid number of blades");
//             this.valid=false;
//         }
//         if(angle!=27&&angle!=30&&angle!=33){
//             System.out.println("invalid angle");
//             this.valid=false;
//         }
//         if(hp<=0){
//             System.out.println("invalid horsepower");
//             this.valid=false;
//         }
//     }
//     void printInfo() {
//         System.out.println(this.size+" "+this.number+" "+this.angle+" "+this.hp+" "+this.valid);
//     }
// }
// public class FanCompany1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int size = scan.nextInt();
//         int numb = scan.nextInt();
//         int angle = scan.nextInt();
//         double hp = scan.nextDouble();
//         Blade ablade = new Blade(size, numb, angle, hp);
//         ablade.printInfo();
//     }
    
// }
