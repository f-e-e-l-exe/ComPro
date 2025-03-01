package CLASS;

import java.util.Scanner;

class Ethano {
    int number;
    int intense;
    int volume;
    int ethanal;
    int getethanal;

    Ethano(int intense, int volume, int ethanal, int a) {
        this.intense = intense;
        this.volume = volume;
        this.ethanal = ethanal;
        this.number=a+1;
    }

    int need(int e) {
        if(e-(this.volume-this.ethanal)>=0){
            this.getethanal=this.volume-this.ethanal;
            return this.getethanal;
        }
        this.getethanal=e;
        return e;
    }

    void printInfo() {
        System.out.print(this.number+":"+this.getethanal+" ");
    }

}

public class Ethanol2 {
    static int e75;
    static int e95;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        Ethano[] ethanos=new Ethano[n];
        for(int a=0; a<ethanos.length; a++){
            int intense=s.nextInt();
            int volume=s.nextInt();
            int ethanal=s.nextInt();
            ethanos[a]=new Ethano(intense, volume, ethanal, a);
        }
        e75=s.nextInt();
        e95=s.nextInt();
        for(int a=0; a<ethanos.length; a++){
            if(ethanos[a].intense==75){
                e75-=ethanos[a].need(e75);
            }else if(ethanos[a].intense==95){
                e95-=ethanos[a].need(e95);
            }
        }
        for(int a=0; a<ethanos.length; a++){
            if(ethanos[a].intense==75){
                ethanos[a].printInfo();
            }
        }
        System.out.println();
        for(int a=0; a<ethanos.length; a++){
            if(ethanos[a].intense==95){
                ethanos[a].printInfo();
            }
        }


    }
}
