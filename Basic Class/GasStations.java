import java.util.Arrays;
import java.util.Scanner;


class GasStation {
    private String[] names = { "Dummy", "95S", "91S", "E20",
            "E85", "B7", "B20" };
    boolean[] proviceService;
    int[] maxcapacity;
    int[] capacityGas;

    GasStation(boolean[] provideService, int[] capacityGas) {
        this.proviceService = provideService;
        this.capacityGas = Arrays.copyOf(capacityGas, capacityGas.length);
        this.maxcapacity = Arrays.copyOf(capacityGas, capacityGas.length);
    }

    void dispense(int type, int required) {
        if (this.proviceService[type]) {
            if (this.capacityGas[type] <= 0) {
                System.out.println("No gas available");
            } else if (this.capacityGas[type] - required >= 0) {
                this.capacityGas[type] -= required;
                System.out.println(String.format("Dispense %d liters", required));
            } else {
                System.out.println(String.format("Dispense %d liters", this.capacityGas[type]));
                this.capacityGas[type] = 0;
            }
        } else
            System.out.println("Invalid gas type");
    }

    void refillStation(int type, int quantity) {
        if (this.proviceService[type]) {
            if (this.capacityGas[type] == this.maxcapacity[type]) {
                System.out.println("No storage capacity available");
            } else if (this.capacityGas[type] + quantity > this.maxcapacity[type]) {
                System.out.println(String.format("Refill %d liters", this.maxcapacity[type] - this.capacityGas[type]));
                this.capacityGas[type] = this.maxcapacity[type];
            } else {
                System.out.println(String.format("Refill %d liters", quantity));
                this.capacityGas[type] += quantity;
            }
        } else
            System.out.println("Invalid gas type");
    }

    void report() {
        for (int a = 1; a < this.proviceService.length; a++) {
            if (this.proviceService[a]) {
                System.out.print(this.names[a] + " " + this.capacityGas[a] + ", ");
            }
        }
        System.out.println();
    }
}

public class GasStations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        GasStation[] stations = new GasStation[N + 1];
        for (int s = 1; s <= N; ++s) {
            boolean[] gas = new boolean[7]; // gas with service
            int[] capa = new int[7]; // capacity for each gas type
            for (int g = 1; g <= 6; ++g) {
                int k = scan.nextInt();
                gas[g] = (k > 0) ? true : false;
                capa[g] = k;
            }
            stations[s] = new GasStation(gas, capa);
        }

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int S = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            if (A == 1) {
                stations[S].dispense(B, C);
            } else if (A == 2) {
                stations[S].refillStation(B, C);
            } else if (A == 3) {
                stations[S].report();
            }
        }
    }
}