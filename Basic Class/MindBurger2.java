import java.util.Scanner;

class Burger {
    String meat;
    boolean lettuce, tomato, pickled;
    int numCheese;
    double price;

    Burger(String meat, boolean lettuce, boolean tomato,
            boolean pickled, int num) {
        this.meat = meat + "BURGER";
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickled = pickled;
        if (num < 0)
            this.numCheese = 0;
        else if (num > 3)
            this.numCheese = 3;
        else
            this.numCheese = num;
        this.price = 49 + (20 * this.numCheese);
    }

    void printInfo() {
        System.out.print(meat);
        if (lettuce)
            System.out.print(" lettuce");
        if (tomato)
            System.out.print(" tomato");
        if (pickled)
            System.out.print(" pickled");
        System.out.print(" cheese" + numCheese);
        System.out.print(" = $" + price);
    }
}

class SetBurger {
    static String[] beverageChoice = { "", "Coke", "Sprite", "GreenTea", "Lemonade" };
    Burger burger;
    String beverage;
    int sizeFrenchfries;
    double baseprice;
    double discount;

    SetBurger(Burger burger, int choice, int size) {
        this.burger = burger;
        this.beverage = beverageChoice[choice];
        int numBev = ((choice != 0) ? 1 : 0);
        this.sizeFrenchfries = ((size >= 0 && size <= 3) ? size : 1);
        baseprice = burger.price + (39 * numBev) + (15 * sizeFrenchfries);
        discount = promotion();
    }

    double promotion() {
        boolean flag_bevarage = false;
        boolean flag_frencefries = false;
        if ((beverage != null) && (beverage.length() > 0)) {
            flag_bevarage = true;
            discount = 10;
        }
        if (sizeFrenchfries > 0) {
            flag_frencefries = true;
            discount = 10;
        }
        if (flag_bevarage && flag_frencefries)
            discount = 25;
        return discount;
    }

    void printInfo() {
        System.out.print(this.burger.price + ":");
        if (this.beverage.length() > 0) {
            System.out.print(39 + ":");
        } else
            System.out.print("0:");
        if (sizeFrenchfries > 0) {
            System.out.println(sizeFrenchfries);
        } else
            System.out.println("0");
        System.out.print(burger.meat);
        if (beverage.length() > 0)
            System.out.print("+" + beverage);
        if (sizeFrenchfries > 0) {
            switch (sizeFrenchfries) {
                case 1:
                    System.out.print("+fries S");
                    break;
                case 2:
                    System.out.print("+fries M");
                    break;
                case 3:
                    System.out.print("+fries L");
                    break;
            }
        }
        System.out.println(" = $" + baseprice * (100 - discount) / 100);
    }
}

public class MindBurger2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String meat = sc.next();
        String veg = sc.next();
        int n = sc.nextInt();
        boolean flag_lettuce = (veg.charAt(0) == 'Y' ? true : false);
        boolean flag_tomato = (veg.charAt(1) == 'Y' ? true : false);
        boolean flag_pickled = (veg.charAt(2) == 'Y' ? true : false);
        Burger b = new Burger(meat, flag_lettuce, flag_tomato, flag_pickled, n);
        int beverageChoice = sc.nextInt();
        if (beverageChoice < 0 || beverageChoice >= SetBurger.beverageChoice.length) {
            System.out.println("invalid choice of beverage, then let try lemonade");
            beverageChoice = 4;
        }
        int fries_size = sc.nextInt();
        if (fries_size < 0 || fries_size > 3) {
            System.out.println("invalid size of fries, then take a small one");
            fries_size = 1;
        }
        SetBurger setburger = new SetBurger(b, beverageChoice,
                fries_size);
        setburger.printInfo();
    }
}