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

//     Pokimon(PokiStats pokiStat, String name, int level) {
//         this.pokiStats = pokiStat;
//         this.name = name;
//         this.level = level;
//         this.energy = pokiStat.hps[level];
//     }

//     int attack() {
//         return pokiStats.attks[level];
//     }

//     int defend() {
//         return pokiStats.defends[level];
//     }
// }

// class WaterPokimon extends Pokimon {
//     WaterPokimon(PokiStats pokiStat, String name, int level){
//         super(pokiStat, name, level);
//     }

//     int attack(WaterPokimon water) {
//         return pokiStats.attks[level];
//     }
//     int attack(FirePokimon fire) {
//         return pokiStats.attks[level]*2;
//     }
//     int attack(ElectricPokimon elec) {
//         return pokiStats.attks[level];
//     }

// }

// class FirePokimon extends Pokimon {
//     FirePokimon(PokiStats pokiStat, String name, int level){
//         super(pokiStat, name, level);
//     }
//     int attack(WaterPokimon water) {
//         return pokiStats.attks[level];
//     }
//     int attack(FirePokimon fire) {
//         return pokiStats.attks[level];
//     }
//     int attack(ElectricPokimon elec) {
//         return pokiStats.attks[level]*2;
//     }
// }

// class ElectricPokimon extends Pokimon {
//     ElectricPokimon(PokiStats pokiStat, String name, int level){
//         super(pokiStat, name, level);
//     }
//     int attack(WaterPokimon water) {
//         return pokiStats.attks[level]*2;
//     }
//     int attack(FirePokimon fire) {
//         return pokiStats.attks[level];
//     }
//     int attack(ElectricPokimon elec) {
//         return pokiStats.attks[level];
//     }
// }

// // Do not modify the code below this line.
// public class Pokimon3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int[] hps = new int[6];
//         int[] attks = new int[6];
//         int[] defends = new int[6];
//         WaterPokimon water = null;
//         FirePokimon fire = null;
//         ElectricPokimon electric = null;
//         // Read PokiStats
//         for (int t = 1; t <= 3; ++t) {
//             for (int level = 1; level <= 5; ++level)
//                 hps[level] = scan.nextInt();
//             for (int level = 1; level <= 5; ++level)
//                 attks[level] = scan.nextInt();
//             for (int level = 1; level <= 5; ++level)
//                 defends[level] = scan.nextInt();
//             PokiStats stats = new PokiStats(hps, attks, defends);
//             // Name, level and object creation
//             String name = scan.next();
//             int level = scan.nextInt();
//             if (t == 1)
//                 water = new WaterPokimon(stats, name, level);
//             else if (t == 2)
//                 fire = new FirePokimon(stats, name, level);
//             else if (t == 3)
//                 electric = new ElectricPokimon(stats, name, level);
//         }

//         // Write output
//         System.out.println(water.attack(water) + " " +
//                 water.attack(fire) + " " +
//                 water.attack(electric));
//         System.out.println(fire.attack(water) + " " +
//                 fire.attack(fire) + " " + fire.attack(electric));
//         System.out.println(electric.attack(water) + " "
//                 + electric.attack(fire) + " "
//                 + electric.attack(electric));
//     }
// }