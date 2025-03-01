// package CLASS;

// import java.util.Scanner;

// class SlaagOffice {
//     int[] prize;

//     SlaagOffice(int st, int[] nd) {
//         prize = new int[3];
//         this.prize[0] = st;
//         this.prize[1] = nd[0];
//         this.prize[2] = nd[1];
//     }

//     void checkPrize(Lottery lottery) {
//         if (lottery.number[0] == prize[0]) {
//             lottery.oneFront = true;
//         }
//         if (lottery.number[3] == prize[0]) {
//             lottery.oneBack = true;
//         }
//         if (lottery.number[0] == prize[1] && lottery.number[1] == prize[2]) {
//             lottery.twoFront = true;
//         }
//         if (lottery.number[2] == prize[1] && lottery.number[3] == prize[2]) {
//             lottery.twoBack = true;
//         }
//     }
// }

// class Lottery {
//     int[] number = new int[4];
//     boolean oneFront = false;
//     boolean oneBack = false;
//     boolean twoFront = false;
//     boolean twoBack = false;

//     Lottery(int[] number) {
//         this.number = number;
//     }

//     void reportPrize() {
//         if(!oneFront&&!twoFront&&!oneBack&&!twoBack){
//             System.out.println("Sorry, no prize");
//             return;
//         }
//         if (oneFront) {
//             System.out.println("You got one front prize");
//         }
//         if (oneBack) {
//             System.out.println("You got one back prize");
//         }
//         if (twoFront) {
//             System.out.println("You got two front prize");
//         }
//         if (twoBack) {
//             System.out.println("You got two back prize");
//         }
//     }
// }

// public class KongSlaag1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         // Create a 2-number array from user inputs.
//         int[] b = { scan.nextInt(), scan.nextInt() };
//         SlaagOffice office = new SlaagOffice(a, b);

//         final int Q = scan.nextInt();
//         for (int i = 0; i < Q; ++i) {
//             // Create a 4-number array from user inputs.
//             int[] nums = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
//             Lottery lotto = new Lottery(nums);
//             office.checkPrize(lotto);
//             lotto.reportPrize();
//         }
//     }
// }
