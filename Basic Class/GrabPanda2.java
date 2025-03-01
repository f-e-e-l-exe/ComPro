// package CLASS;

import java.util.Scanner;

class FoodOrder {
    String Customer;
    int foodTotal = 0;
    int grandTotal = 0;

    FoodOrder(String name) {
        this.Customer = name;
    }

    void addFood(int price) {
        this.foodTotal += price;
    }

    void distribIncome() {
        int rider = 0;
        int panda = 0;
        int seller = 0;
        if (foodTotal <= 200) {
            rider = 20;
            panda = (this.foodTotal * 3) / 10;
            seller = this.grandTotal - rider - panda;
        } else if (foodTotal > 200) {
            rider = 30;
            panda = (this.foodTotal * 3) / 10;
            seller = this.grandTotal - rider - panda;
        }
        System.out.println("Rider: " + rider);
        System.out.println("GrabPanda: " + panda);
        System.out.println("Food Seller: " + seller);

    }

    void finalizeReceipt() {
        int deli = 0;
        System.out.println(Customer);
        if (this.foodTotal <= 50) {
            deli = 20;
        } else if (this.foodTotal > 50 && this.foodTotal <= 150) {
            deli = 10;
        }
        this.grandTotal = this.foodTotal + deli;
        System.out.println(this.foodTotal);
        System.out.println(deli);
        System.out.println(this.foodTotal + deli);
    }
}

public class GrabPanda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        FoodOrder order = new FoodOrder(name);
        for (int i = 0; i < N; ++i) {
            int price = scan.nextInt();
            order.addFood(price);
        }
        order.finalizeReceipt();
        order.distribIncome();
    }
}