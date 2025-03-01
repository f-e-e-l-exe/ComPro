// package CLASS;

import java.util.Scanner;

class HumanCharacters {
    String Human_name;
    String Human_Age;
    boolean Alive;
    String Human_Abilities;
    String Human_personality;
    String Human_Bg;

    HumanCharacters(String name, String age, boolean live, String abili,
            String personal, String bg) {
        this.Human_name = name;
        this.Human_Age = age;
        this.Alive = live;
        this.Human_Abilities = abili;
        this.Human_personality = personal;
        this.Human_Bg = bg;
    }
}

class GodCharacters {
    String God_name;
    String God_legend;
    String God_abilities;
    String God_personality;
    String God_bg;

    GodCharacters(Scanner s) {
        String temp[] = s.nextLine().split("\\(");
        String name = temp[0];
        String legen = temp[1].substring(0, temp[1].length() - 1);
        this.God_name = name;
        this.God_legend = legen;
        this.God_abilities = s.nextLine();
        this.God_personality = s.nextLine();
        this.God_bg = s.nextLine();
    }
}

public class RecordofRagnarok {
    private static void battleROR(HumanCharacters human, GodCharacters god, int round) {
        System.out.println("<>---------- Record of Ragnarok ----------<>");
        System.out.println("<< { --------- ROUND ( " + round + " ) --------- } >>");
        System.out.println("<<==== GOD ====>>");
        System.out.println("Name : " + god.God_name);
        System.out.println("Legend : [ " + god.God_legend + " ]");
        System.out.println("- Abilities: " + god.God_abilities);
        System.out.println("- Personality: " + god.God_personality);
        System.out.println("- Background: " + god.God_bg);
        System.out.println("VS");
        System.out.println("<<==== HUMAN ====>>");
        System.out.println("Name : " + human.Human_name);
        System.out.print("Age : " + human.Human_Age);
        if (human.Human_Age != null && !human.Human_Age.equals("Unknown") && human.Alive) {
            System.out.println(" at death");
        } else {
            System.out.println("");
        }
        System.out.println("- Abilities: " + human.Human_Abilities);
        System.out.println("- Personality: " + human.Human_personality);
        System.out.println("- Background: " + human.Human_Bg);
        System.out.println("<< { --------- ROUND ( " + round + " ) --------- } >>");
        System.out.println("<>---------- Record of Ragnarok ----------<>");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        String t = sc.nextLine();
        HumanCharacters[] human = new HumanCharacters[round];
        GodCharacters[] god = new GodCharacters[round];
        for (int i = 0; i < round; i++) {
            String Age = null;
            boolean Death = false;
            String tmp1[] = sc.nextLine().split("Age: ");
            String Name = tmp1[0].substring(0, tmp1[0].length() - 2);
            if (tmp1[1].indexOf(" at death") > 0) {
                Death = true;
                Age = tmp1[1].substring(0, 2);
            } else if (tmp1[1].indexOf("Unknown") >= 0) {
                Age = "Unknown";
            } else {
                Age = tmp1[1].substring(0, 2);
            }
            String Abilities = sc.nextLine();
            String Personality = sc.nextLine();
            String Background = sc.nextLine();
            human[i] = new HumanCharacters(Name, Age, Death, Abilities, Personality, Background);
        }
        for (int i = 0; i < round; i++) {
            god[i] = new GodCharacters(sc);
        }
        int count = 1;
        for (;;) {
            int h = sc.nextInt();
            int g = sc.nextInt();
            boolean booH = true;
            boolean booG = true;
            if (h < 0 || h >= human.length) {
                booH = false;
            }
            if (g < 0 || g >= god.length) {
                booG = false;
            }
            if (booH == true && booG == true) {
                battleROR(human[h], god[g], count);
                count++;
            } else {
                break;
            }
        }
    }
}
