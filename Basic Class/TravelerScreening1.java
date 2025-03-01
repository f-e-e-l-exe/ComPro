// package CLASS;

// import java.util.Scanner;

// class Traveler{
//     String passportID;
//     String countryOrigin;
//     String travelDay;
//     double temperature;
//     boolean isolate;

//     Traveler(String id, String country, String day, double tem){
//         this.passportID=id;
//         this.countryOrigin=country;
//         this.travelDay=day;
//         this.temperature=tem;
//         if(tem>37.5||country.equals("IRAN")||country.equals("ITALY")||
//         country.equals("SINGAPORE")||country.equals("FRANCE")||
//         country.equals("TAIWAN")||country.equals("CHINA")||
//         country.equals("KOREA")||country.equals("GERMANY")||
//         country.equals("JAPAN")){
//             this.isolate=true;
//         }else this.isolate=false;
//     }

//     void printInfo(){
//         if(isolate){
//            System.out.println(this.passportID+" STATE-QUARANTINE"); 
//         }else System.out.println(this.passportID+" SELF-QUARANTINE");
//     }
// }

// public class TravelerScreening1{
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         Traveler[] travelers=new Traveler[n];
//         for(int a=0; a<travelers.length; a++){
//             String id=s.next();
//             String country=s.next();
//             String day=s.next();
//             double tem=s.nextDouble();
//             travelers[a]=new Traveler(id, country, day, tem);
//             travelers[a].printInfo();
//         }
//     }
// }
