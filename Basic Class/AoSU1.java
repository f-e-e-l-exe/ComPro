// package CLASS;
// import java.util.Scanner;

// class Hero {
//     String heroName;
//     int lifeForce;
//     int typeAtt;
//     int attackForce;
//     int physicalDefense;
//     int magicalDefense;
//     Hero(String name, int life, int type, int att, int physi, int magic){
//         this.heroName=name;
//         this.lifeForce=life;
//         this.typeAtt=type;
//         this.attackForce=att;
//         this.physicalDefense=physi;
//         this.magicalDefense=magic;
//         checkAndWarn();
//     }
//     void printInfo(){
//         System.out.println("Name: "+this.heroName);
//         System.out.println("HP: "+this.lifeForce);
//         System.out.print("Attack: "+this.attackForce);
//         if(this.typeAtt==1) System.out.println(" (physical)");
//         else System.out.println(" (magical)");
//         System.out.println("Defense: "+this.physicalDefense+" (physical), "+this.magicalDefense+" (magical)");
//         checkAndWarn();
//     }
//     boolean checkAndWarn(){
//         if(this.lifeForce<0||this.attackForce<0||this.physicalDefense<0||this.magicalDefense<0){
//             System.out.println("warning: value cannot be negative");
//             return false;
//         }
//         return true;
//     }

// }

// public class AoSU1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.next();
//         int hp = scan.nextInt();
//         int attkType = scan.nextInt();
//         int attkDmg = scan.nextInt();
//         int phyDef = scan.nextInt();
//         int magDef = scan.nextInt();

//         Hero hero = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
//         hero.printInfo();
//         System.out.println(hero.checkAndWarn());
//     }
// }