package CLASS;

import java.util.Scanner;

class Runner{
    String name;
    String bib;
    static int count=1;
    static int[] type=new int[4];

    Runner(String name, int sec){
        this.name=name;
        if(sec==1){
            this.bib="A";
            type[0]++;
        }else if(sec==2){
            this.bib="B";
            type[1]++;
        }else if(sec==3){
            this.bib="C";
            type[2]++;
        }else if(sec==4){
            this.bib="D";
            type[3]++;
        }
        this.bib+=String.format("%03d", count);
        count++;
    }
    void printInfo(){
        System.out.print(this.bib+" ");
    }
}
public class Marathon2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Runner[] runner=new Runner[n];
        for(int a=0; a<runner.length; a++){
            String name=s.next();
            int sec=s.nextInt();
            if(sec>0&&sec<=4){
                runner[a]=new Runner(name, sec);
            }
        }
        for(int a=0; a<4; a++){
            System.out.println(Runner.type[a]);
            if(Runner.type[a]==0){
                System.out.println("-");
            }else{
                for(int b=0; b<runner.length; b++){
                    if(runner[b]!=null){
                        if(a==0&&runner[b].bib.charAt(0)=='A'){
                            runner[b].printInfo();
                        }else if(a==1&&runner[b].bib.charAt(0)=='B'){
                            runner[b].printInfo();
                        }else if(a==2&&runner[b].bib.charAt(0)=='C'){
                            runner[b].printInfo();
                        }else if(a==3&&runner[b].bib.charAt(0)=='D'){
                            runner[b].printInfo();
                        }
                    }
                }
                System.out.println();
            }
        }
        
    }
}
