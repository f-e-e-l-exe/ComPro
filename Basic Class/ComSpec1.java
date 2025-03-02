// package CLASS;

// import java.util.Scanner;

// class CPU {
//     public String gen;
//     public int clock;
//     public int socket;
//     public int memory;
//     public boolean valid;

//     CPU(String gen, int cl, int sc, int mem){
//         this.gen=gen;
//         this.clock=cl;
//         this.socket=sc;
//         this.memory=mem;
//         this.valid=isVa1idSpec(gen, cl, sc, mem);
//     }

//     boolean isVa1idSpec(String gen, int cl, int sc, int mem){
//         if(gen==null||gen.length()<=0||cl<=0||sc<=0||mem<=0||mem>10){
//             return false;
//         }
//         return true;
//     }
//     void printlnfo(){
//         System.out.println(this.gen);
//         System.out.println(this.clock);
//         System.out.println(this.socket);
//         System.out.println(this.memory);
//         System.out.println(this.valid);
//     }
// }

// public class ComSpec1 {
//     // Do not change the main method.
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System. in);
//         String model =scan.nextLine();
//         int clocks = scan.nextInt();
//         int socket =scan.nextInt();
//         int memType = scan.nextInt();
//         if(model.length()==0&&socket%2==0){
//             model = null;
//         }
//         CPU cpu =new CPU(model, clocks, socket, memType);
//         cpu. printlnfo();
//     }
// }
