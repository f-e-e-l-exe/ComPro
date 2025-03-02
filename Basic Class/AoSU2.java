// package CLASS;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;

// class Hero {
//     String heroName;
//     int lifeForce;
//     int typeAtt;
//     int attackForce;
//     int physicalDefense;
//     int magicalDefense;

//     Hero(String name, int life, int type, int att, int physi, int magic) {
//         this.heroName = name;
//         this.lifeForce = life;
//         this.typeAtt = type;
//         this.attackForce = att;
//         this.physicalDefense = physi;
//         this.magicalDefense = magic;
//         checkAndWarn();
//     }

//     void printInfo() {
//         System.out.println("Name: " + this.heroName);
//         System.out.println("HP: " + this.lifeForce);
//         System.out.print("Attack: " + this.attackForce);
//         if (this.typeAtt == 1)
//             System.out.println(" (physical)");
//         else
//             System.out.println(" (magical)");
//         System.out.println("Defense: " + this.physicalDefense + " (physical), " + this.magicalDefense + " (magical)");
//         checkAndWarn();
//     }

//     boolean checkAndWarn() {
//         if (this.lifeForce < 0 || this.attackForce < 0 || this.physicalDefense < 0 || this.magicalDefense < 0) {
//             System.out.println("warning: value cannot be negative");
//             return false;
//         }
//         return true;
//     }
// }

// class Team {
//     Hero[] members;

//     Team(Hero[] hero) {
//         if (!is5MemberTeam(hero)) {
//             return;
//         } else {
//             if(!isValid(hero)){
//                 return;
//             }else{
//                 this.members = Arrays.copyOf(hero, hero.length);
//             }
            
//         }
//     }

//     boolean is5MemberTeam(Hero[] members) {
//         if (members.length < 5) {
//             System.out.println("member is missing");
//             return false;
//         } else if (members.length > 5) {
//             System.out.println("too many members");
//             return false;
//         } else {
//             System.out.println("full team");
//             return true;
//         }
//     }

//     boolean isValid(Hero[] member) {
//         if (member.length!=5) {
//             return false;
//         }
//         for (int a = 0; a < member.length - 1; a++) {
//             for(int b=a+1; b<member.length; b++){
//                 if (member[a].heroName.equals(member[b].heroName)) {
//                     System.out.println("cannot select same hero: " + member[a].heroName);
//                     return false;
//                 }
//             }
//         }
//         System.out.println("valid hero selection");
//         return true;

//     }
// }

// public class AoSU2 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         Hero[] members=null;
//         if (N>0) {
//             members = new Hero[N];
//             for (int i = 0; i < N; ++i) {
//                 String name = scan.next();
//                 int hp = scan.nextInt();
//                 int attkType = scan.nextInt();
//                 int attkDmg = scan.nextInt();
//                 int phyDef = scan.nextInt();
//                 int magDef = scan.nextInt();
//                 members[i] = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
//             }
//         }
//         Team t = new Team(members);
//         System.out.println(t.is5MemberTeam(members));
//         System.out.println(t.isValid(members));
//     }
// }