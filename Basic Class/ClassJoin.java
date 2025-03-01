import java.util.Scanner;

class Component {
    String gen;
    int socket;
    int memory;
    boolean valid;

    Component(String gen, int sc, int mem) {
        this.gen = gen;
        this.socket = sc;
        this.memory = mem;
    }

    boolean isVa1idSpec(String gen, int sc, int mem) {
        if (gen == null || gen.length() <= 0 || sc <= 0 || mem <= 0 || mem > 10) {
            return false;
        }
        return true;
    }
    void printlnfo() {
        System.out.println(this.valid);
        System.out.println(this.gen);
        System.out.println(this.socket);
        System.out.println(this.memory);

    }

}

class MainBoard2 extends Component {

    MainBoard2(String gen, int sc, int mem) {
        super(gen, sc, mem);
        this.valid=super.isVa1idSpec(gen, sc, mem);
    }

}

class CPU2 extends Component {
    int clock;

    CPU2(String gen, int cl, int sc, int mem) {
        super(gen, sc, mem);
        this.clock = cl;
        this.valid=isVa1idSpec(gen, cl, sc, mem);
    }

    boolean isVa1idSpec(String gen, int cl, int sc, int mem) {
        if (super.isVa1idSpec(gen, sc, mem)) {
            if (cl > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    void printlnfo() {
        super.printlnfo();
        System.out.println(this.clock);
    }

}

public class ClassJoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        Component cpu = new CPU2(model, clocks, socket, memType);
        cpu.printlnfo();
        scan.nextLine(); // skip new line character
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        Component mb = new MainBoard2(model, socket, memType);
        mb.printlnfo();
    }
}
