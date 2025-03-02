import java.util.Scanner;

class Carriage {
    int allseat;
    int type;
    int code;
    int bookseat;
    // int stand;

    Carriage(int seat, int type, int code) {
        this.allseat = seat;
        this.type = type;
        this.code = code;
        this.bookseat = 0;
        if (type == 3) {
            this.allseat += 10;
        }
    }

    void reserveSeats(int needseat) {
        if (this.type == 3) {
            if (needseat + this.bookseat <= this.allseat) {
                this.bookseat += needseat;
            }
        } else {
            if (needseat + this.bookseat <= allseat) {
                this.bookseat += needseat;
            }
        }
    }

    void printStats() {
        if (this.type == 3) {
            if (this.bookseat > this.allseat - 10) {
                System.out.println(this.code + " " + this.type + " " + (this.allseat - 10) + " " + (this.allseat - 10)
                        + " " + ((this.bookseat) - (this.allseat - 10)) + " 10");
            } else {
                System.out.println(
                        this.code + " " + this.type + " " + this.bookseat + " " + (this.allseat - 10) + " " + "0 10");
            }
        } else {
            System.out.println(this.code + " " + this.type + " " + this.bookseat + " " + this.allseat);
        }
    }

}

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        Carriage[] carriages = new Carriage[N + 1];
        for (int a = 1; a < carriages.length; a++) {
            int type = scan.nextInt();
            int capa = scan.nextInt();
            int id = scan.nextInt();
            carriages[a] = new Carriage(capa, type, id);
        }

        final int K = scan.nextInt();
        for (int a = 1; a < K + 1; a++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            carriages[p].reserveSeats(q);
        }

        for (int a = 1; a < carriages.length; a++) {
            carriages[a].printStats();
        }
    }
}
