import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active;

    Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }

    void printInfo() {
        if (this.active) {
            System.out.println(this.name + ", " + this.code + ", " + this.balance + ", active");
        } else
            System.out.println(this.name + ", " + this.code + ", " + this.balance + ", inactive");

    }

    double checkBalance() {
        return this.balance;
    }

    void closeAccount() {
        this.active = false;
        printInfo();
    }

    boolean deposit(double depo) {
        if (this.active) {
            this.balance += depo;
            System.out.print(this.balance + " ");
            return true;
        } else
            return false;
    }

    boolean withdrawn(double witd) {
        if (this.active && this.balance - witd >= 0) {
            this.balance -= witd;
            System.out.print(this.balance + " ");
            return true;
        } else
            return false;
    }
}

class Saving extends Account {
    String id = "";
    String tel = "";
    boolean promptPay;

    Saving(String name, String code, double balance) {
        super(name, code, balance);
        this.promptPay = false;
        System.out.println("Saving account");
    }

    boolean openPromptPay(int type, String numpromp) {
        if (type == 1) {
            if (numpromp.matches("^[0-9]{13}$")) {
                this.id = numpromp;
                this.promptPay = true;
                return true;
            }
            return false;
        } else if (type == 2) {
            if (numpromp.matches("^[0-9]{10}$")) {
                this.tel = numpromp;
                this.promptPay = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    void printInfo() {
        super.printInfo();
        if (this.promptPay) {
            System.out.print("PromptPay, ");
            if (!this.id.isEmpty() && !this.tel.isEmpty()) {
                System.out.println(this.id + ", " + this.tel);
            } else if (!this.tel.isEmpty()) {
                System.out.println(this.tel);
            } else {
                System.out.println(this.id);
            }
        } else {
            System.out.println("no PromptPay");
        }
    }

}

class FixedDeposit extends Account {
    double fixedAmount;

    FixedDeposit(String name, String code, double balance, double fixedAmount) {
        super(name, code, balance);
        this.fixedAmount = fixedAmount;
        System.out.println("FixedDeposit account with " + this.fixedAmount);
    }

    @Override
    boolean deposit(double depo) {
        if (depo >= this.fixedAmount) {
            return super.deposit(depo);
        }
        System.out.print("deposit less than " + this.fixedAmount+" ");
        return false;
    }
}

class CurrentAccount extends Account {
    double overDraft;

    CurrentAccount(String name, String code, double balance, double overDraft) {
        super(name, code, balance);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + this.overDraft);
    }

    @Override
    boolean withdrawn(double witd) {
        if (this.active && this.balance - witd >= (this.overDraft*-1)) {
            this.balance -= witd;
            if (this.balance >= 0) {
                System.out.print(this.balance + " ");
            } else {
                System.out.print(this.balance + " overdraft ");
            }
            return true;
        }
        return false;
    }
}

public class BankAccount3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int t = 1; t <= 3; t++) {
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();
            if (t == 1) {
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            } else if (t == 2) {
                double money2 = scan.nextDouble();
                scan.nextLine(); // Skip the remainder of the double line.
                fAcc = new FixedDeposit(name, code, money1, money2);

            } else if (t == 3) {
                double money2 = scan.nextDouble();
                scan.nextLine(); // Skip the remainder of the double line.
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            double amount;
            int type=scan.nextInt();
            int menu=scan.nextInt();
            
            switch (menu) {
                case 1 -> {
                    if(type==1){
                        sAcc.printInfo();
                    }else if(type==2){
                        fAcc.printInfo();
                    }else if(type==3){
                        cAcc.printInfo();
                    }
                }
                case 2 -> {
                    if(type==1){
                        System.out.println(sAcc.checkBalance());
                    }else if(type==2){
                        System.out.println(fAcc.checkBalance());
                    }else if(type==3){
                        System.out.println(cAcc.checkBalance());
                    }
                }
                case 3 -> {
                    if(type==1){
                        sAcc.closeAccount();
                    }else if(type==2){
                        fAcc.closeAccount();
                    }else if(type==3){
                        cAcc.closeAccount();
                    }
                }
                case 4 -> {
                    amount=scan.nextDouble();
                    if(type==1){
                        System.out.println(sAcc.deposit(amount));
                    }else if(type==2){
                        System.out.println(fAcc.deposit(amount));
                    }else if(type==3){
                        System.out.println(cAcc.deposit(amount));
                    }
                }
                case 5 -> {
                    amount=scan.nextDouble();
                    if(type==1){
                        System.out.println(sAcc.withdrawn(amount));
                    }else if(type==2){
                        System.out.println(fAcc.withdrawn(amount));
                    }else if(type==3){
                        System.out.println(cAcc.withdrawn(amount));
                    }
                }
            }
        }
    }
}