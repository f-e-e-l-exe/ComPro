// package CLASS;

// import java.util.Scanner;

// class Car {
//     int id;
// 	String name;
//     int price;
//     int manufacture;
//     Car(int id, String n, int p, int m){
//         this.id=id;
//         this.name=n;
//         this.price=p;
//         this.manufacture=m;
//     }

//     static boolean check(String n, int p, int m){
//         if(n!=null&&n.length()>0&&p>0&&m>0){
//             return true;
//         }
//         return false;

//     }
// }

// public class AliCarCar1 {
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int N = scan.nextInt();
// 		Car[] cars = new Car[N];
// 		int id=0;
// 		for(int i = 0; i < N; ++i) {
// 			String name = scan.next();
// 			int price = scan.nextInt();
// 			int labor = scan.nextInt();
// 			if(Car.check(name, price, labor)) {
// 				cars[id++]=new Car(id, name, price, labor);
// 				System.out.println("valid");
// 			} 
// 			else {
// 				System.out.println("invalid");
// 			}
// 		}	
	
// 		for(int a=0; a<id; a++){
//             System.out.println((a+1)+ " " + cars[a].name);
//         }
// 	}
// }
