package CLASS;

import java.util.Scanner;

class House {
    public int W;
    public int L;
    public int P=0;
    
    House(int w, int l){
        this.W=w;
        this.L=l;
    }
    void printPiggies(){
        System.out.printf("Piggies %d, Space %d\n", P, (9*P));
    }
    static void encourage(){
        System.out.println("Piggy Together STRONG!");
    }
}

public class PiggyHouse1 {
    public static void main(String[] args) {
        House.encourage();
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        House h=new House(w, l);
        while (true) {
            int K = sc.nextInt();
            if((9*(h.P+K))<=h.W*h.L){
                h.P+=K;
                h.printPiggies();
            }else{
                System.out.println("no space, need a new house");
                return;
            }
            
        }
    }
}
