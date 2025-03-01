package CLASS;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

class Car {
    int id;
	String name;
    int price;
    int manufacture;
    Car(int id, String n, int p, int m){
        this.id=id;
        this.name=n;
        this.price=p;
        this.manufacture=m;
    }
    static boolean check(String n, int p, int m){
        if(n!=null&&n.length()>0&&p>0&&m>0){
            return true;
        }
        return false;
    }
}

class Factory{
    Car[] cars;
    boolean[] all_manufacture;
    int manufacture;

    Factory(Car[] cars, boolean[] all_m, int manufacture){
        this.cars=cars;
        this.all_manufacture=Arrays.copyOf(all_m, all_m.length);
        this.manufacture=manufacture;
    }
}

public class AliCarCar2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Car[] cars = new Car[N];
		int id=0;
		for(int i = 0; i < N; ++i) {
			String name = scan.next();
			int price = scan.nextInt();
			int labor = scan.nextInt();
			if(Car.check(name, price, labor)) {
				cars[id++]=new Car(id, name, price, labor);
				// System.out.println("valid");
			} 
		}
        Factory[] factory=new Factory[5];
        for(int a=0; a<factory.length; a++){
            int manuf=scan.nextInt();
            boolean[] all_m=new boolean[cars.length];
            for(int b=0; b<cars.length; b++){
                int op=scan.nextInt();
                if(op==0){
                    all_m[b]=false;
                }else{
                    all_m[b]=true;
                }
            }
            factory[a]=new Factory(cars, all_m, manuf);
        }
        int order=scan.nextInt();
        while (order>0) {
            int cid=scan.nextInt()-1;
            if(cid<0||cid<=cars.length&&cars[cid]==null||cid>=cars.length){
                System.out.println("invalid model");
                order--;
                continue;
            }
            boolean notfound=true;
            for(int a=0; a<factory.length; a++){
                if(factory[a].all_manufacture[cid]&&factory[a].manufacture-cars[cid].manufacture>=0){
                    System.out.println("okay "+(a+1));
                    factory[a].manufacture-=cars[cid].manufacture;
                    notfound=false;
                    break;
                }
            }
            if(notfound){
                System.out.println("unable to build");
            }
            order--;
        }
	}
}
