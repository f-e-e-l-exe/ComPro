// import java.util.Scanner;

// class Account {
//     String name;
//     String code;
//     double balance;
//     boolean active;

//     Account(String name, String code, double balance) {
//         this.name = name;
//         this.code = code;
//         this.balance = balance;
//         this.active = true;
//         System.out.println("Open account");
//     }

//     void printInfo() {
//         if (this.active) {
//             System.out.println(this.name + ", " + this.code + ", " + this.balance + ", active");
//         } else
//             System.out.println(this.name + ", " + this.code + ", " + this.balance + ", inactive");

//     }

//     double checkBalance() {
//         return this.balance;
//     }

//     void closeAccount() {
//         this.active = false;
//         printInfo();
//     }

//     boolean deposit(double depo) {
//         if (this.active) {
//             this.balance += depo;
//             System.out.print(this.balance + " ");
//             return true;
//         } else
//             return false;
//     }

//     boolean withdrawn(double witd) {
//         if (this.active && this.balance - witd >= 0) {
//             this.balance -= witd;
//             System.out.print(this.balance + " ");
//             return true;
//         } else
//             return false;
//     }
// }

// public class BankAccount1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.nextLine();
//         String code = scan.nextLine();
//         double money = scan.nextDouble();
//         Account account = new Account(name, code, money);
//         int N = scan.nextInt();
//         for (int i = 0; i < N; ++i) {
//             int op = scan.nextInt();
//             switch (op) {
//                 case 1:
//                     account.printInfo();
//                     break;
//                 case 2:
//                     System.out.println(account.checkBalance());
//                     break;
//                 case 3:
//                     account.closeAccount();
//                     break;
//                 case 4:
//                     double am = scan.nextDouble();
//                     System.out.println(account.deposit(am));
//                     break;
//                 case 5:
//                     double wd = scan.nextDouble();
//                     System.out.println(account.withdrawn(wd));
//                     break;
//             }
//         }
//     }
// }