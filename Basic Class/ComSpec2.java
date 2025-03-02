package CLASS;

import java.util.Scanner;

class CPU {
    public String gen;
    public int clock;
    public int socket;
    public int memory;
    public boolean valid;

    CPU(String gen, int cl, int sc, int mem) {
        this.gen = gen;
        this.clock = cl;
        this.socket = sc;
        this.memory = mem;
        this.valid = isVa1idSpec(gen, cl, sc, mem);
    }

    boolean isVa1idSpec(String gen, int cl, int sc, int mem) {
        if (gen == null || gen.length() <= 0 || cl <= 0 || sc <= 0 || mem <= 0 || mem > 10) {
            return false;
        }
        return true;
    }

    void printlnfo() {
        System.out.println(this.gen);
        System.out.println(this.clock);
        System.out.println(this.socket);
        System.out.println(this.memory);
        System.out.println(this.valid);
    }
}

class MainBoard{
    public String gen;
    public int socket;
    public int memory;
    public boolean valid;
    MainBoard(String gen, int sc, int mem) {
        this.gen = gen;
        this.socket = sc;
        this.memory = mem;
        this.valid = isVa1idSpec(gen, sc, mem);
    }

    boolean isVa1idSpec(String gen, int sc, int mem) {
        if (gen == null || gen.length() <= 0 || sc <= 0 || mem <= 0 || mem > 10) {
            return false;
        }
        return true;
    }
    void printlnfo() {
        System.out.println(this.gen);
        System.out.println(this.socket);
        System.out.println(this.memory);
        System.out.println(this.valid);
    }
}

class Computer{
    CPU cpu;
    MainBoard mainboard;
    public boolean valid;

    Computer(MainBoard m,  CPU c){
        this.cpu=c;
        this.mainboard=m;
        this.valid=isvaIidCom(m, c);
    }
    boolean isvaIidCom(MainBoard m, CPU c){
        if(!m.valid||!c.valid||m.socket!=c.socket||m.memory!=c.memory){
            return false;
        }
        return true;
    }
    void printlnfo(){
        if(this.valid){
            System.out.println(cpu.gen);
            System.out.println(cpu.clock);
            System.out.println(mainboard.gen);
            System.out.println(cpu.socket);
            System.out.println(cpu.memory);
        }else{
            System.out.println("Invalid Spec");
            cpu.printlnfo();
            mainboard.printlnfo();
        }
    }
}

public class ComSpec2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        
        scan.nextLine();
        model=scan.nextLine();
        socket=scan.nextInt();
        memType=scan.nextInt();
        if(model.length()==0&&socket%2==0){
            model=null;
        }
        MainBoard mb=new MainBoard(model, socket, memType);
        Computer com=new Computer(mb, cpu);
        com.printlnfo();
    }
}
