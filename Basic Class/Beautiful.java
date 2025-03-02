
import java.util.Arrays;
import java.util.Scanner;

class Audience {
    private String[] msg;
    private int N;
    private int currentIndex = 0;
    boolean disconnected;

    public Audience(String[] voice) {
        this.msg = Arrays.copyOf(voice, voice.length);
        this.disconnected = false;
        this.N = msg.length;
    }

    public String getvoice() {
        String voice = this.msg[currentIndex % N];
        this.currentIndex++;
        return voice;
    }

    boolean isBeautiful() {
        if (getvoice().equals("beautiful")) {
            return true;
        }
        this.disconnected = true;
        return false;
    }

    void addindex() {
        this.currentIndex++;
    }
}

public class Beautiful {
    public static void main(String[] args) {
        // Read all the inputs
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String[] phrases = new String[K];
        scan.nextLine();
        for (int i = 0; i < K; ++i) {
            phrases[i] = scan.nextLine();
        }

        final int C = scan.nextInt();
        Audience[] Cs = new Audience[C + 1];
        for (int p = 1; p <= C; ++p) {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine();
            for (int i = 0; i < N; ++i) {
                msg[i] = scan.nextLine();
            }
            Cs[p] = new Audience(msg);
        }
        boolean space = false;
        for (String p : phrases) {
            if (p.equals("crack")) {
                boolean notfound = true;
                for (int a = 1; a < Cs.length; a++) {
                    if (Cs[a].disconnected != true && Cs[a].isBeautiful() == false) {
                        System.out.print(a + " ");
                        notfound = false;
                        space = false;
                    }
                }
                if (notfound) {
                    System.out.println("x");
                }
                if (!space) {
                    System.out.println();
                    space = true;
                }
            } else {
                for (int a = 1; a < Cs.length; a++) {
                    Cs[a].addindex();
                }
            }
        }
    }
}