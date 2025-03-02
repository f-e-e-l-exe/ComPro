package CLASS;

import java.util.Scanner;

class Tumbol {
    String nameTambol;
    int lagitude;
    int longitude;
    int population;
    int availBudget;

    Tumbol(String name, int lagitude, int longitude, int people) {
        this.nameTambol = name;
        this.lagitude = lagitude;
        this.longitude = longitude;
        this.population = people;
        this.availBudget = people * 5000;
    }

    int allocateBudget(int[] budget) {
        boolean invalid = true;
        int total = 0;
        for (int a = 0; a < budget.length; a++) {
            if (this.availBudget - budget[a] >= 0) {
                this.availBudget -= budget[a];
                total += budget[a];
                invalid = false;
                System.out.print((a + 1) + " ");
            }
        }
        if (invalid) {
            System.out.print("none");
        }
        System.out.println();
        return total;
    }

}

public class Tumbol2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Tumbol[] tumbols = new Tumbol[k];
        for (int i = 0; i < k; ++i) {
            String name = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int population = scan.nextInt();
            tumbols[i]=new Tumbol(name, x, y, population);
        }

        int total = 0;
        for (int i = 0; i < k; ++i) {
            int N = scan.nextInt();
            int[] budget = new int[N];
            for(int a=0; a<budget.length; a++){
                budget[a]=scan.nextInt();
            }
            total+=tumbols[i].allocateBudget(budget);
        }
        System.out.println(total);
    }
}
