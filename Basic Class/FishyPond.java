// package CLASS;

import java.util.Scanner;

class Pond {
    public int d;
    public int r;
    public int n;

    Pond(int d, int r) {
        this.d = d;
        this.r = r;
        this.n = 20 * (d * r);
        printInfo();
    }

    public void reproductive(int H) {
        this.n += ((H * r * d) / 4) + ((H * n) / 3);
    }

    public void takeFish(int K) {
        this.n -= K;
        if (this.n < 0) {
            this.n = 0;
        }
    }

    public void expand(int P) {
        this.r += P;
        if (this.r > 50) {
            this.r = 50;
        }
    }

    public void printInfo() {
        System.out.printf("Depth %d, Radius %d, Fish %d\n", this.d, this.r, this.n);
    }
}

public class FishyPond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        Pond pond = new Pond(d, r);
        while (true) {
            int C = sc.nextInt();
            if (C == 0) {
                return;
            } else if (C == 1) {
                int K = sc.nextInt();
                pond.takeFish(K);
            } else if (C == 2) {
                int H = sc.nextInt();
                pond.reproductive(H);
            } else if (C == 3) {
                int P = sc.nextInt();
                pond.expand(P);
            }
            pond.printInfo();
        }
    }
}
