package CLASS;
import java.util.Arrays;
import java.util.Scanner;

class Precinct{
    String Unit_Poll;
    String[] Team_party;
    int[] Score;

    Precinct(String Unit_name, String[] Team_name){
        this.Unit_Poll=Unit_name;
        this.Team_party=Arrays.copyOf(Team_name, Team_name.length);
        this.Score=new int[Team_name.length];
    }

    void count(int number){
        try{
            Score[number]++;
            System.out.println(Team_party[number]+" "+Score[number]);
        }catch(Exception e){
            System.out.println("invalid number");
        }
    }
    void printInfo(){
        for(int a=0; a<Team_party.length; a++){
            System.out.println((a+1)+" "+Team_party[a]+" "+Score[a]);
        }
    }
    void printMax(){
        int max=Arrays.stream(this.Score).max().getAsInt();
        for(int a=0; a<Team_party.length; a++){
            if(Score[a]==max){
                System.out.println((a+1)+" "+this.Team_party[a]+" "+max);
            }
        }
    }
}
public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String Unit=s.nextLine();
        int n=s.nextInt();
        s.nextLine();
        String[] party=new String[n];
        for(int a=0; a<n; a++){
            party[a]=s.nextLine();
        }
        Precinct precinct=new Precinct(Unit, party);
        int k=s.nextInt();
        while (k>0) {
            int op=s.nextInt();
            if(op==1){
                int sec=s.nextInt()-1;
                precinct.count(sec);
            }else if(op==2){
                precinct.printInfo();
            }else if(op==3){
                precinct.printMax();
            }
            k--;
        }
    }
    
}