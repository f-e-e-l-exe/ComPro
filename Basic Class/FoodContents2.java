
// package CLASS;
// 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Food {
    String Name;
    ArrayList<String> Ingredient;
    int totalweight = 0;
    int Calories = 0;

    Food(String name, String ingredient, int weight, int cal) {
        this.Name = name;
        this.Ingredient = new ArrayList<>(Arrays.asList(ingredient));
        this.totalweight = weight;
        this.Calories = weight * cal;
    }

    void addContent(String ingredient, int weight, int cal) {
        this.Ingredient.add(ingredient);
        this.totalweight += weight;
        this.Calories += (weight * cal);
    }

    void printInfo() {
        System.out.println(this.Name);
        System.out.println(this.totalweight + " " + this.Calories);
        for (String n : this.Ingredient) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}

public class FoodContents2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        int cal = scan.nextInt();
        Food food = new Food(foodName, content1, w1, cal);
        int q = scan.nextInt();
        while (q != 0) {
            if (q == 1) {
                food.printInfo();
            } else if (q == 2) {
                String ingre = scan.next();
                int weight = scan.nextInt();
                int calo = scan.nextInt();
                food.addContent(ingre, weight, calo);
            }
            q = scan.nextInt();
        }
    }

}
