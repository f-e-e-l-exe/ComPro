// package CLASS;

// import java.util.Scanner;

// class Runner{
//     String name;
//     String bib;
//     static int count=1;

//     Runner(String name, int sec){
//         this.name=name;
//         if(sec==1){
//             this.bib="A";
//         }else if(sec==2){
//             this.bib="B";
//         }else if(sec==3){
//             this.bib="C";
//         }else if(sec==4){
//             this.bib="D";
//         }
//         this.bib+=String.format("%03d", count);
//         count++;
//     }
//     void printInfo(){
//         System.out.println(this.bib+" "+this.name);
//     }
// }
// public class Marathon1 {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         Runner[] runner=new Runner[n];
//         for(int a=0; a<runner.length; a++){
//             String name=s.next();
//             int sec=s.nextInt();
//             if(sec>0&&sec<=4){
//                 runner[a]=new Runner(name, sec);
//                 runner[a].printInfo();
//             }else{
//                 System.out.println("INVALID");
//             }
//         }
//     }
// }
