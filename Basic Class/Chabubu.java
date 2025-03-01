package CLASS;

import java.util.Scanner;

class Combo {
    private String namecombo;
    private int beef;
    private int pork;
    private int vegetable;
    private int seafood;
    private int price;

    Combo(String name, int beef, int pork, int vegetable, int seafood){
        this.namecombo=name;
        this.beef=beef;
        this.pork=pork;
        this.vegetable=vegetable;
        this.seafood=seafood;
        this.price=((beef+pork+seafood)*60)+(vegetable*30);

    }

    static boolean isValid(int beef, int pork, int vegetable, int seafood){
        int total=beef+pork+vegetable+seafood;
        if(total>=4&&total<=15){
            return true;
        }
        return false;
    }

    void printInfo(){
       System.out.println(String.format("%s Beef %d Pork %d Veg %d Seafood %d Price %d",this.namecombo, this.beef, this.pork, this.vegetable, this.seafood, this.price)); 
    }
}

public class Chabubu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Combo[] CBs = new Combo[50];
        int totalCombo = 0;
        int n=sc.nextInt();
        for(int a=0; a<n; a++){
            String name=sc.next();
            int b=sc.nextInt();
            int p=sc.nextInt();
            int v=sc.nextInt();
            int sf=sc.nextInt();
            if(Combo.isValid(b, p, v, sf)){
                CBs[totalCombo++]=new Combo(name, b, p, v, sf);
                System.out.println("valid");
            }else System.out.println("invalid");
        }
        for(int a=0; a<totalCombo; a++){
            CBs[a].printInfo();
        }
    }
}
