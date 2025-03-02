// package CLASS;

// import java.util.Arrays;
// import java.util.Scanner;

// class PokiStats {
//     int[] hps;
//     int[] attks;
//     int[] defends;

//     PokiStats(int[] hp, int[] att, int[] defend) {
//         hps = new int[6];
//         attks = new int[6];
//         defends = new int[6];
//         hps = Arrays.copyOf(hp, hp.length);
//         attks = Arrays.copyOf(att, att.length);
//         defends = Arrays.copyOf(defend, defend.length);
//     }
// }

// class Pokimon {
//     PokiStats pokiStats;
//     String name;
//     int level;
//     int energy;

//     Pokimon(PokiStats pokiStat, String name, int level){
//         this.pokiStats=pokiStat;
//         this.name=name;
//         this.level=level;
//         this.energy=pokiStat.hps[level];
//     }
//     int attack(){
//         return pokiStats.attks[level];
//     }
//     int defend(){
//         return pokiStats.defends[level];
//     }
// }

// // Do not modify the code below this line.
// public class Pokimon2 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int[] hps = new int[6];
//         int[] attks = new int[6];
//         int[] defends = new int[6];
//         // Read PokiStats
//         for (int level = 1; level <= 5; ++level)
//             hps[level] = scan.nextInt();
//         for (int level = 1; level <= 5; ++level)
//             attks[level] = scan.nextInt();
//         for (int level = 1; level <= 5; ++level)
//             defends[level] = scan.nextInt();
//         PokiStats stats = new PokiStats(hps, attks, defends);

//         // Name, level and object creation
//         String name = scan.next();
//         int level = scan.nextInt();
//         Pokimon mon = new Pokimon(stats, name, level);

//         // Write output
//         System.out.println(mon.name);
//         System.out.println(mon.energy);
//         System.out.println(mon.attack());
//         System.out.println(mon.defend());

//     //     for (int lv2 = 1; lv2 <= 5; ++lv2)
//     //     hps[lv2] = scan.nextInt();
//     //     for (int lv2 = 1; lv2 <= 5; ++lv2)
//     //     attks[lv2] = scan.nextInt();
//     //     for (int lv2 = 1; lv2 <= 5; ++lv2)
//     //     defends[lv2] = scan.nextInt();
//     // stats = new PokiStats(hps, attks, defends);

//     // // Name, lv2 and object creation
//     // String name2 = scan.next();
//     // int lv2 = scan.nextInt();
//     // Pokimon m2 = new Pokimon(stats, name2, lv2);

//     // // Write output
//     // System.out.println(m2.name);
//     // System.out.println(m2.energy);
//     // System.out.println(m2.attack());
//     // System.out.println(m2.defend());
//     // System.out.println("///////////////");
//     // System.out.println(mon.name);
//     //     System.out.println(mon.energy);
//     //     System.out.println(mon.attack());
//     //     System.out.println(mon.defend());
       
//     }
// }