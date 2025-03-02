package CLASS;

import java.util.Scanner;

class Blade {
    int size;
    int number;
    int angle;
    double hp;
    boolean valid = true;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
        if (size % 2 != 0 || size < 16 || size > 24) {
            System.out.println("invalid size");
            this.valid = false;
        }
        if (number != 3 && number != 4 && number != 5) {
            System.out.println("invalid number of blades");
            this.valid = false;
        }
        if (angle != 27 && angle != 30 && angle != 33) {
            System.out.println("invalid angle");
            this.valid = false;
        }
        if (hp <= 0) {
            System.out.println("invalid horsepower");
            this.valid = false;
        }
    }

    void printInfo() {
        System.out.println(this.size + " " + this.number + " " + this.angle + " " + this.hp + " " + this.valid);
    }
}

class Motor {
    double v;
    double i;
    double eff;

    Motor(double v, double i, double e) {
        this.v = v;
        this.i = i;
        this.eff = e / 100.0;
    }

    Motor(double i, double e) {
        this(220., i, e);
    }

    double horsepower() {
        return (this.v * this.i * eff) / 746.0;
    }

    void printInfo() {
        System.out.println(this.v + " " + this.i + " " + this.eff + " " + String.format("%.2f", horsepower()));
    }

}

class ElectricFan {
    int product_id;
    Blade blade;
    Motor motor;
    boolean status;
    static int count = 0;

    ElectricFan(Blade b, Motor m) {
        this.product_id = ++count;
        this.blade = b;
        this.motor = m;
        if (this.motor.horsepower() >= this.blade.hp) {
            this.status = true;
        } else {
            this.status = false;
        }
    }
    boolean changeBlade(Blade nb){
        this.blade=nb;
        if(this.motor.horsepower()>=this.blade.hp){
            this.status=true;
            return true;
        }else{
            this.status=false;
            return false;
        }

    }
    boolean changeMotor(Motor nm) {
        this.motor = nm;
        if (this.motor.horsepower() >= this.blade.hp) {
            this.status = true;
            return true;
        } else {
            this.status = false;
            return false;
        }
    }

    void printInfo() {
        System.out.println(this.product_id + " " + this.blade.size + " " +
                this.blade.hp + " " + this.motor.i + " " + String.format("%.2f", this.motor.horsepower()) + " " + this.status);
    }

}

public class FanCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        for (int index = 0; index < n; index++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan = new ElectricFan(ablade, motor);
            } else if (cmd == 1) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                eFan.changeBlade(ablade);
            } else if (cmd == 2) {
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
    }
}
