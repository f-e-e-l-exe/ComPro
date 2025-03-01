package CLASS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import CLASS.Roleplay.Hero;

class Hero {
    String heroName;
    int lifeForce;
    int typeAtt;
    int attackForce;
    int physicalDefense;
    int magicalDefense;

    Hero(String name, int life, int type, int att, int physi, int magic) {
        this.heroName = name;
        this.lifeForce = life;
        this.typeAtt = type;
        this.attackForce = att;
        this.physicalDefense = physi;
        this.magicalDefense = magic;
        checkAndWarn();
    }

    void printInfo() {
        System.out.println("Name: " + this.heroName);
        System.out.println("HP: " + this.lifeForce);
        System.out.print("Attack: " + this.attackForce);
        if (this.typeAtt == 1)
            System.out.println(" (physical)");
        else
            System.out.println(" (magical)");
        System.out.println("Defense: " + this.physicalDefense + " (physical), " + this.magicalDefense + " (magical)");
        checkAndWarn();
    }

    boolean checkAndWarn() {
        if (this.lifeForce < 0 || this.attackForce < 0 || this.physicalDefense < 0 || this.magicalDefense < 0) {
            System.out.println("warning: value cannot be negative");
            return false;
        }
        return true;
    }
}

class Team {
    Hero[] members;

    Team(Hero[] hero) {
        if (!is5MemberTeam(hero)) {
            return;
        } else {
            if (!isValid(hero)) {
                return;
            } else {
                this.members = Arrays.copyOf(hero, hero.length);
                isBalanced(this.members);
            }

        }
    }

    boolean is5MemberTeam(Hero[] members) {
        if (members.length < 5) {
            System.out.println("member is missing");
            return false;
        } else if (members.length > 5) {
            System.out.println("too many members");
            return false;
        } else {
            System.out.println("full team");
            return true;
        }
    }

    boolean isValid(Hero[] member) {
        if (member.length != 5) {
            return false;
        }
        for (int a = 0; a < member.length - 1; a++) {
            for (int b = a + 1; b < member.length; b++) {
                if (member[a].heroName.equals(member[b].heroName)) {
                    System.out.println("cannot select same hero: " + member[a].heroName);
                    return false;
                }
            }
        }
        System.out.println("valid hero selection");
        return true;

    }

    boolean isBalanced(Hero[] members) {
        if (members.length != 5) {
            return false;
        }
        boolean hasCarry = Arrays.stream(members).anyMatch(h -> h instanceof Carry);
        boolean hasFighter = Arrays.stream(members).anyMatch(h -> h instanceof Fighter);
        boolean hasMage = Arrays.stream(members).anyMatch(h -> h instanceof Mage);
        boolean hasTank = Arrays.stream(members).anyMatch(h -> h instanceof Tank);
        if (hasCarry && hasFighter && hasMage && hasTank) {
            System.out.println("balanced team");
            return true;
        }
        System.out.print("team needs ");
        System.out.print((!hasCarry) ? "carry " : "");
        System.out.print((!hasFighter) ? "fighter " : "");
        System.out.print((!hasMage) ? "mage " : "");
        System.out.print((!hasTank) ? "tank " : "");
        System.out.println();
        return false;
    }
}

class Carry extends Hero {
    Carry(String heroName, int lifeForce, int typeAtt, int attackForce, int physicalDefense, int magicalDefense) {
        super(heroName, lifeForce, typeAtt, attackForce, physicalDefense, magicalDefense);
    }
}

class Fighter extends Hero {
    Fighter(String heroName, int lifeForce, int typeAtt, int attackForce, int physicalDefense, int magicalDefense) {
        super(heroName, lifeForce, typeAtt, attackForce, physicalDefense, magicalDefense);
    }
}

class Mage extends Hero {
    Mage(String heroName, int lifeForce, int typeAtt, int attackForce, int physicalDefense, int magicalDefense) {
        super(heroName, lifeForce, typeAtt, attackForce, physicalDefense, magicalDefense);
    }
}

class Tank extends Hero {
    Tank(String heroName, int lifeForce, int typeAtt, int attackForce, int physicalDefense, int magicalDefense) {
        super(heroName, lifeForce, typeAtt, attackForce, physicalDefense, magicalDefense);
    }
}

class Support extends Hero {
    Support(String heroName, int lifeForce, int typeAtt, int attackForce, int physicalDefense, int magicalDefense) {
        super(heroName, lifeForce, typeAtt, attackForce, physicalDefense, magicalDefense);
    }
}

class Assassin extends Hero {
    Assassin(String heroName, int lifeForce, int typeAtt, int attackForce, int physicalDefense, int magicalDefense) {
        super(heroName, lifeForce, typeAtt, attackForce, physicalDefense, magicalDefense);
    }
}

public class AoSU3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero[] members = null;
        if (N > 0) {
            members = new Hero[N];
            for (int i = 0; i < N; ++i) {
                int type = scan.nextInt();
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                if (type == 1) members[i] = new Carry(name, hp, attkType, attkDmg, phyDef, magDef);
                else if (type == 2) members[i] = new Fighter(name, hp, attkType, attkDmg, phyDef, magDef);
                else if (type == 3) members[i] = new Mage(name, hp, attkType, attkDmg, phyDef, magDef);
                else if (type == 4) members[i] = new Tank(name, hp, attkType, attkDmg, phyDef, magDef);
                else if (type == 5) members[i] = new Support(name, hp, attkType, attkDmg, phyDef, magDef);
                else if (type == 6) members[i] = new Assassin(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        System.out.println(t.isBalanced(members));
    }
}