package CLASS;

import java.util.Scanner;

class Item {
    boolean Type;
    double weight;

    Item(boolean type, double weight){
        this.Type=type;
        this.weight=weight;
    }
    Item(double weight){
        this.weight=weight;
    }
    double saleprice(double price){
        double total=0;
        if(this.Type){
            total=(price*this.weight)+(1000*this.weight);
        }else{
            total=this.weight*price;
        }
        return total;
    }
    double buyprice(double price){
        double total=0;
        if(this.Type){
            total=(price*this.weight)*(98.0/100.0);
        }else{
            total=(price-100)*this.weight;
        }
        return total;
    }
    void showdetail(double price){
        if(this.Type){
            System.out.print("ornament "+this.weight+" baht");
        }else{
            System.out.print("bar "+this.weight+" baht");
        }
    }
}

public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t"))
                arrayx[i] = new Item(true, weight);
            else
                arrayx[i] = new Item(false, weight);
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.println(" sale " + arrayx[i].saleprice(pricegold));
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.println(" buy " + arrayx[i].buyprice(pricegold));
            }
        }
    }
}
