import java.util.Scanner;

class FoodShop {
    String restaurantName;
    int nFoods = 0;
    String[] menu = new String[5];

    FoodShop(String name) {
        this.restaurantName = name;
    }

    boolean addFood(String name) {
        if (this.nFoods < 5) {
            this.menu[this.nFoods++] = name;
            System.out.print(this.nFoods);
            return true;
        }
        System.out.print(-1);
        return false;
    }

    void printMenu() {
        System.out.print(this.restaurantName + " ");
        for (int a = 0; a < this.nFoods; a++) {
            System.out.print(this.menu[a] + " ");
        }
        System.out.println();
    }

}

public class FoodTiger2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FoodShop[] fs = new FoodShop[N + 1];
        for (int i = 1; i < fs.length; ++i) {
            String name = scan.next();
            fs[i] = new FoodShop(name);
        }

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            int s = scan.nextInt();
            String foodName = scan.next();
            boolean ret = fs[s].addFood(foodName);
            System.out.println(" " + ret);
        }

        for (int i = 1; i < fs.length; ++i) {
            fs[i].printMenu();
        }
    }
}