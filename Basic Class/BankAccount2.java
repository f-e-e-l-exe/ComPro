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

// class Saving extends Account {
//     String id = "";
//     String tel = "";
//     boolean promptPay;

//     Saving(String name, String code, double balance) {
//         super(name, code, balance);
//         this.promptPay = false;
//         System.out.println("Saving account");
//     }

//     boolean openPromptPay(int type, String numpromp) {
//         if (type == 1) {
//             if (numpromp.matches("^[0-9]{13}$")) {
//                 this.id = numpromp;
//                 this.promptPay = true;
//                 return true;
//             }
//             return false;
//         } else if (type == 2) {
//             if (numpromp.matches("^[0-9]{10}$")) {
//                 this.tel = numpromp;
//                 this.promptPay = true;
//                 return true;
//             }
//             return false;
//         }
//         return false;
//     }

//     void printInfo() {
//         super.printInfo();
//         if (this.promptPay) {
//             System.out.print("PromptPay, ");
//             if (!this.id.isEmpty()&&!this.tel.isEmpty()) {
//                 System.out.println(this.id+", "+this.tel);
//             }else if (!this.tel.isEmpty()) {
//                 System.out.println(this.tel);
//             }else {
//                 System.out.println(this.id);
//             }
//         } else {
//             System.out.println("no PromptPay");
//         }
//     }

// }

// public class BankAccount2 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.nextLine();
//         String code = scan.nextLine();
//         double money = scan.nextDouble();
//         Saving account=new Saving(name, code, money);
//         int N = scan.nextInt();
//         for (int i = 0; i < N; ++i) {
//             int op=scan.nextInt();
//             switch(op){
//                 case 1:account.printInfo();
//                 break;
//                 case 2:System.out.println(account.checkBalance());
//                 break;
//                 case 3:account.closeAccount();
//                 break;
//                 case 4:System.out.println(account.deposit(scan.nextDouble()));
//                 break;
//                 case 5:System.out.println(account.withdrawn(scan.nextDouble()));
//                 break;
//                 case 6:System.out.println(account.openPromptPay(scan.nextInt(), scan.nextLine().strip()));
//                 break;
//             }
//         }
//     }
// }