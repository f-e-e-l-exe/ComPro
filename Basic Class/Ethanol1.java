// package CLASS;

import java.util.Scanner;

class Ethano {
    int intense;
    int volume;
    int ethanal;

    Ethano(int intense, int volume, int ethanal) {
        this.intense = intense;
        this.volume = volume;
        this.ethanal = volume;
    }

    void used(int use) {
        this.volume -= use;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    void printInfo() {
        System.out.printf("Ethanol %d%% (%dml./%dml.)", this.intense, this.volume, this.ethanal);
    }

}

public class Ethanol1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int intense = s.nextInt();
        int volume = s.nextInt();
        int use = s.nextInt();
        Ethano ethanol = new Ethano(intense, volume, volume);
        ethanol.used(use);
        ethanol.printInfo();
    }
}
