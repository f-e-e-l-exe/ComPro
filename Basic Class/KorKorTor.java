package CLASS;

import java.util.Arrays;
import java.util.Scanner;

class Party{
    String name_party;
    int amount;
    String[] first_name=new String[100];
    String[] last_name=new String[100];
    int[] number=new int[100];

    Party(String name, int amount, Scanner s){
        this.name_party=name;
        this.amount=amount+1;
        this.first_name=Arrays.copyOf(first_name, this.amount);
        this.last_name=Arrays.copyOf(last_name, this.amount);
        this.number=Arrays.copyOf(number, this.amount);
        for(int a=1; a<this.amount; a++){
            first_name[a]=s.next();
            last_name[a]=s.next();
            number[a]=s.nextInt();
        }
    }
    void printInfo(int numregion){
        if(numregion<0){
            System.out.println("invalid region number");
            return;
        }else if(numregion==0){
            for(int a=1; a<this.amount; a++){
                System.out.println(this.first_name[a]+" "+this.last_name[a]+" "+this.number[a]);
            }
            return;
        }
        boolean notfound=true;
        for(int a=1; a<this.amount; a++){
            if(numregion==this.number[a]){
                System.out.println(this.first_name[a]+" "+this.last_name[a]);
                notfound=false;
            }
        }
        if(notfound){
            System.out.println("none");
        }
    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        Party[] party=new Party[n+1];
        String[] All_Party=new String[n];
        int[] All_amonut=new int[n];
        for(int a=0; a<n; a++){
            All_Party[a]=scan.next();
            All_amonut[a]=scan.nextInt();
        }
        for(int a=1; a<party.length; a++){
            party[a]=new Party(All_Party[a-1], All_amonut[a-1], scan);
        }

        final int K = scan.nextInt();
        for(int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
    }

    
}