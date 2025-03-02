import java.util.Scanner;

class Bill {
    String pin;
    String saleDate;
    int size;
    int price;
    double tax;
    double fee;
    double stamp;

    Bill(String pin, String date, int size, int price) {
        this.pin = pin;
        this.saleDate = date;
        this.size = size;
        this.price = price;
        this.tax = (price * size) * 0.03;
        this.fee = (price * size) * 0.05;
        this.stamp = (price * size) * 0.01;

    }

    void printInfo() {
        System.out.println(this.pin + " " + this.saleDate + " " + this.size + " " + this.price);
        System.out.println(this.tax + "+" + this.fee + "+" + this.stamp + "=" + (this.tax + this.fee + this.stamp));
    }

}

public class LandFee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Bill[] bill = new Bill[N];

        for (int i = 0; i < N; i++) {
            String pin = scan.next();
            String dmy = scan.next();
            int size = scan.nextInt();
            int price = scan.nextInt();

            bill[i] = new Bill(pin, dmy, size, price);
            bill[i].printInfo();

        }
    }
}