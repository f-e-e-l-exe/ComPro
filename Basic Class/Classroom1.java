import java.util.Scanner;

class Classroom {
    String roomname;
    int roomcapacity;
    boolean projector, visual, smartbroad, camera;
    boolean avilable = true;

    Classroom(String name, int capacity, boolean project, boolean visual, boolean smartbroad, boolean camera) {
        this.roomname = name;
        this.roomcapacity = capacity;
        this.projector = project;
        this.visual = visual;
        this.smartbroad = smartbroad;
        this.camera = camera;
    }

    boolean isAvailable(int capacity, boolean secproject, boolean secvisual, boolean secsmartb, boolean seccamera) {
        if (this.roomcapacity < capacity) {
            return false;
        }
        if (secproject && !this.projector) {
            return false;
        }
        if (secvisual && !this.visual) {
            return false;
        }
        if (secsmartb && !this.smartbroad) {
            return false;
        }
        if (seccamera && !this.camera) {
            return false;
        }
        return true;
    }

    boolean reserve(int capacity, boolean secproject, boolean secvisual, boolean secsmartb, boolean seccamera) {
        if (this.avilable && isAvailable(capacity, secproject, secvisual, secsmartb, seccamera)) {
            this.avilable = false;
            return true;
        }
        return false;
    }
}

public class Classroom1 {
    static boolean check(int num) {
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Classroom[] rooms = new Classroom[n];
        for (int a = 0; a < rooms.length; a++) {
            String name = scan.next();
            int numSeats = scan.nextInt();
            int nProj = scan.nextInt();
            int nVisual = scan.nextInt();
            int nSmart = scan.nextInt();
            int nCam = scan.nextInt();

            boolean pro = check(nProj);
            boolean vis = check(nVisual);
            boolean smart = check(nSmart);
            boolean came = check(nCam);
            rooms[a] = new Classroom(name, numSeats, pro, vis, smart, came);
        }

        int k = scan.nextInt();
        for (int a = 0; a < k; a++) {
            int numSeats = scan.nextInt();
            int nProj = scan.nextInt();
            int nVisual = scan.nextInt();
            int nSmart = scan.nextInt();
            int nCam = scan.nextInt();

            boolean pro = check(nProj);
            boolean vis = check(nVisual);
            boolean smart = check(nSmart);
            boolean came = check(nCam);

            boolean notfound = true;
            for (int b = 0; b < rooms.length; b++) {
                if (rooms[b].reserve(numSeats, pro, vis, smart, came)) {
                    System.out.println(rooms[b].roomname);
                    notfound = false;
                    break;
                }
            }
            if (notfound) {
                System.out.println("classroom not available");
            }
        }
    }
}
