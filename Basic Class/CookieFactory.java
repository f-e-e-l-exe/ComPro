package CLASS;

import java.util.Scanner;

class CookiePlanner {
    int uf;
    int ub;
    int butter=0;
    int flour=0;
    int bags=0;

    CookiePlanner(int f, int b){
        this.ub=b;
        this.uf=f;
    }
    int calculate(){
        return Math.min((butter/ub), (flour/uf));
    }
    boolean produce(int Nbag){
        if(this.uf*Nbag<=this.flour&&this.ub*Nbag<=this.butter){
            this.bags+=Nbag;
            this.flour-=this.uf*Nbag;
            this.butter-=this.ub*Nbag;
            System.out.print(this.bags+" ");
            return true;
        }else{
            int n=calculate();
            System.out.printf("Max capacity = %d bags, but %d bags requested ", n, Nbag);
            return false;
        }
    }
    boolean addFlour(int flour){
        if(flour<=0){
            System.out.print("Invalid flour quantity ");
            return false;
        }
        this.flour+=flour;
        System.out.print(this.flour+" ");
        return true;
    }
    boolean addButter(int butter){
        if(butter<=0){
            System.out.print("Invalid butter quantity ");
            return false;
        }
        this.butter+=butter;
        System.out.print(this.butter+" ");
        return true;
    }
    void reportProduction(){
        System.out.println("Cookie bags: "+this.bags);
        System.out.println("Flour left: "+this.flour);
        System.out.println("Butter left: "+this.butter);
    }
}

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int F = scan.nextInt();
        final int B = scan.nextInt();
        CookiePlanner planner = new CookiePlanner(F, B);

        final int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            if(K==1){
                System.out.println(planner.addFlour(A));
            }else if(K==2){
                System.out.println(planner.addButter(A));
            }else if(K==3){
                System.out.println(planner.produce(A));
            }
                
        }
        planner.reportProduction();
    }
}
