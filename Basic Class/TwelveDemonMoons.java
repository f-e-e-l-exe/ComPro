package CLASS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Demons {

    private String name;
    private int Hp;
    private String Background;

    public Demons(String name, int Hp, String Background) {
        this.name = name;
        this.Hp = Hp;
        this.Background = Background;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    public String getBackground() {
        return Background;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

}

class Muzan extends Demons {
    String muzanAlias, muzanGender;
    private int muzanBlood;
    public int muzanPower;
    Muzan(String name, int[] lifepower, String background, int formtype){
        super(name, 0, background);
        if(formtype==0){
            this.muzanAlias="Child";
            this.muzanGender="Male";
        }else if(formtype==1){
            this.muzanAlias="Geisha";
            this.muzanGender="Female";
        }else if(formtype==2){
            this.muzanAlias="The King of Demons";
            this.muzanGender="Male";
        }
        int hp=lifepower[formtype]/2;
        this.setHp(hp);
        this.muzanBlood=hp;
        this.muzanPower=(muzanBlood+getHp())*50;

    }
    Muzan(String name){
        super(name, 0, "Unknown");
    }

    int Blood(){
        double b=muzanBlood*(10.0/100.0);
        double p=muzanPower*0.1;
        if(b>0){
            muzanBlood-=(int)b;
            muzanPower=(muzanBlood+getHp())*50;
            return (int)b;
        }
        return 0;//????????????
    }
    void printInfo(){
        System.out.println(getName()+" ( "+muzanAlias+" )");
        System.out.println("Gender : "+muzanGender);
        System.out.println("HP : "+getHp());
        System.out.println("Blood : "+muzanBlood);
        System.out.println("Power : "+muzanPower);
        System.out.println("Background : "+this.getBackground());
    }
}

class DemonMoons_UpperRanks extends Muzan {
    public int upperRank;

    DemonMoons_UpperRanks(String name, int rank, int getblood){
        super(name);
        this.upperRank=rank;
        this.muzanPower=(upperRank*getblood*50);
        this.setHp(upperRank*getblood*75);
    }
    void Blood(int blood){
        this.muzanPower+=(blood*50);
        this.setHp(getHp()+(blood*75));
    }
    
    void printInfo(){
        System.out.println("Name : "+getName());
        System.out.println("Upper Rank : "+upperRank);
        System.out.println("Power : "+muzanPower);
        System.out.println("HP : "+getHp());
        System.out.println("Background : "+getBackground());
    }
}

class DemonMoons_LowerRanks extends Muzan {
    public int lowerRank;

    DemonMoons_LowerRanks(String name, int rank, int getblood){
        super(name);
        this.lowerRank=rank;
        this.muzanPower=(lowerRank*getblood*25);
        this.setHp(lowerRank*getblood*50);
    }
    void Blood(int blood){
        this.muzanPower+=(blood*25);
        this.setHp(getHp()+(blood*50));
    }

    void printInfo(){
        System.out.println("Name : "+getName());
        System.out.println("Lower Ranks : "+lowerRank);
        System.out.println("Power : "+muzanPower);
        System.out.println("HP : "+getHp());
        System.out.println("Background : "+getBackground());
    }
}

public class TwelveDemonMoons {

    private static ArrayList<Muzan> DemonMoons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int hp[] = new int[3];
        for(int i=0;i<3;i++){
            hp[i] = sc.nextInt();
        }
        String t = sc.nextLine();
        String bg = sc.nextLine();
        int type = sc.nextInt();
        Muzan muzun = new Muzan(name, hp, bg, type);
        for (;;) {
            int type_demon = sc.nextInt();
            if (type_demon == 0) {
                break;
            } else if (type_demon > 0) {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan upper = new DemonMoons_UpperRanks(n, rank, blood);
                DemonMoons.add(upper);

            } else {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan lower = new DemonMoons_LowerRanks(n, rank, blood);
                DemonMoons.add(lower);
            }
        }

        int com = sc.nextInt();
        for (int i = 0; i < com; i++) {
            int id = sc.nextInt() - 1;
            int blood = muzun.Blood();
            if (DemonMoons.get(id) instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) DemonMoons.get(id);
                up.Blood(blood);
                DemonMoons.set(id, up);

            } else if (DemonMoons.get(id) instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) DemonMoons.get(id);
                low.Blood(blood);
                DemonMoons.set(id, low);

            }
        }
        muzun.printInfo();
        for (Muzan x : DemonMoons) {
            if (x instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) x;
                up.printInfo();
            } else if (x instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) x;
                low.printInfo();
            }
        }

    }
}
