// package CLASS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Kaiju {
    private String Name_kaiju;
    private String Damage;
    private int height;
    private int weight;
    private List<String> ability;
    private String Info;

    Kaiju() {
        this.Name_kaiju = "Unknown";
        this.Damage = "Unknown";
        this.height = 0;
        this.weight = 0;
        this.ability = new ArrayList<>();
        this.Info = "Unknown";
    }

    Kaiju(String name) {
        this.Name_kaiju = name;
        this.Damage = "Unknown";
        this.height = 0;
        this.weight = 0;
        this.ability = new ArrayList<>();
        this.Info = "Unknown";
    }

    Kaiju(String name, String damage, int height, int weight,
            String[] ability, String Info) {
        this.Name_kaiju = name;
        this.Damage = damage;
        this.height = height;
        this.weight = weight;
        this.ability = new ArrayList<>(Arrays.asList(ability));
        this.Info = Info;
    }

    void PrintDetail() {
        double newhigh = this.height * 1.0 / 3.2808;
        System.out.println("Kaiju : " + this.Name_kaiju);
        System.out.printf("< Category: Category %s >\n", this.Damage);
        if (this.height == 0) {
            System.out.println("Height: Unknown");
        } else
            System.out.println("Height: " + this.height + " feet " + "(" + newhigh + " meters)");
        if (this.weight == 0) {
            System.out.println("Weight: Unknown");
        } else
            System.out.println("Weight: " + this.weight + " tons");
        if (this.ability.size() == 0) {
            System.out.println("Power: Unknown");
        } else {
            System.out.printf("Power: [%d] :\n", ability.size());
            for (String a : ability) {
                System.out.println(a + " ");
            }
        }

        System.out.println("Description: " + this.Info);
    }

}

class Jaeger {
    private String Name_Jaeger;
    private String county;
    private int code;
    private double height;
    private List<String> pilot;
    private List<String> weapon;

    Jaeger() {
        this.Name_Jaeger = "Unknown";
        this.county = "Unknown";
        this.code = 0;
        this.height = 0;
        this.pilot = new ArrayList<>();
        this.weapon = new ArrayList<>();
    }

    Jaeger(String name) {
        this.Name_Jaeger = name;
        this.county = "Unknown";
        this.code = 0;
        this.height = 0;
        this.pilot = new ArrayList<>();
        this.weapon = new ArrayList<>();
    }

    Jaeger(String name, String county, int code, double height,
            String[] pilot, String[] weapon) {
        this.Name_Jaeger = name;
        this.county = county;
        this.code = code;
        this.height = height;
        this.pilot = new ArrayList<>(Arrays.asList(pilot));
        this.weapon = new ArrayList<>(Arrays.asList(weapon));
    }

    void PrintDetail() {
        System.out.println("Jaegers : " + this.Name_Jaeger);
        System.out.printf("< Country of Origin: %s >\n", this.county);
        if (this.code == 0) {
            System.out.println("< Mark: Unknown >");
        } else
            System.out.printf("< Mark: Mark-%s >\n", this.code);
        if (this.height == 0) {
            System.out.println("Height: Unknown");
        } else
            System.out.println("Height: " + this.height + " meters");
        if (this.pilot.size() == 0) {
            System.out.println("Pilots: Unknown");
        } else {
            System.out.printf("Pilots: [%d] :\n", this.pilot.size());
            for (String p : pilot) {
                System.out.println(p + " ");
            }
        }
        if (this.weapon.size() == 0) {
            System.out.println("Weapons: Unknown");
        } else {
            System.out.printf("Weapons: [%d] :\n", this.weapon.size());
            for (String w : weapon) {
                System.out.println(w + " ");
            }
        }

    }

}

public class PacificRim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;

        int typeK = sc.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = sc.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = sc.next();
            String Category = sc.next();
            int Height = sc.nextInt();
            int Weight = sc.nextInt();
            String strp = sc.nextLine();
            strp = sc.nextLine();
            String Power[] = strp.split(",");
            String Description = sc.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }

        int typeJ = sc.nextInt();

        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = sc.nextLine();
            String name = sc.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = sc.nextLine();
            String name = sc.nextLine();
            String CoO = sc.nextLine();
            int mark = sc.nextInt();
            double h = sc.nextDouble();
            temp = sc.nextLine();
            String str = sc.nextLine();
            String strp[] = str.split(",");
            String str2 = sc.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }

        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");

    }

}
