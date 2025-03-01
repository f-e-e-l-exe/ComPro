// package CLASS;

import java.util.Scanner;

class Station {
    int benzin;
    int diesel;

    Station(int benzin, int diesel) {
        this.benzin = benzin;
        this.diesel = diesel;
    }

    void dispense(Car car) {
        int need = car.getNeededVol();
        if (car.gasType == 1) {
            if (this.benzin - need >= 0) {
                this.benzin -= need;
                System.out.println("Dispense " + need + " liters of benzin");
            } else {
                if (this.benzin >= 0) {
                    System.out.println("Dispense " + this.benzin + " liters of benzin");
                    this.benzin = 0;
                }
            }
        }
        if (car.gasType == 2) {
            if (this.diesel - need >= 0) {
                this.diesel -= need;
                System.out.println("Dispense " + need + " liters of diesel");
            } else {
                if (this.diesel >= 0) {
                    System.out.println("Dispense " + this.diesel + " liters of diesel");
                    this.diesel = 0;
                }
            }
        }
    }

    void refillBenzin(int addbenzin) {
        this.benzin += addbenzin;
        System.out.println(String.format("Station has %d liters of benzin", this.benzin));
    }

    void refillDiesel(int adddiesel) {
        this.diesel += adddiesel;
        System.out.println(String.format("Station has %d liters of diesel", this.diesel));
    }
}

class Car {
    int gasType;
    int carCapacity;
    int fuelLevel;

    Car(int type, int capa, int level) {
        this.gasType = type;
        this.carCapacity = capa;
        this.fuelLevel = level;
    }

    int getNeededVol() {
        return this.carCapacity - this.fuelLevel;
    }
}

public class StationAndCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station station = new Station(benzin, diesel);
        Car c;
        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();
            if (A == 1) {
                c = new Car(B, C, D);
                station.dispense(c);
            } else if (A == 2) {
                if (B == 1) {
                    station.refillBenzin(C);
                } else if (B == 2) {
                    station.refillDiesel(C);
                }
            }
        }
    }
}
