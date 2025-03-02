import java.util.Scanner;

class LectRoom {
    int classCode;
    String name;
    int capacity;
    int currentSeats = 0;

    public LectRoom(int code, String Room_name, int capacity) {
        this.classCode = code;
        this.name = Room_name;
        this.capacity = capacity;
    }

    public boolean reserveSeats(int classcode, int reserve) {
        if (this.classCode == classcode) {
            if (reserve + currentSeats <= capacity) {
                currentSeats += reserve;
                return true;
            }
        }
        return false;
    }
}

public class LectureRoom2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        LectRoom[] room = new LectRoom[k];
        for (int a = 0; a < k; a++) {
            int code = s.nextInt();
            String name = s.next();
            int capacity = s.nextInt();
            room[a] = new LectRoom(code, name, capacity);
        }
        int order = s.nextInt();
        for (int a = 0; a < order; a++) {
            int number = s.nextInt();
            int reserve = s.nextInt();
            boolean pass = false;
            for (int b = 0; b < room.length; b++) {
                pass = room[b].reserveSeats(number, reserve);
                if (pass) {
                    System.out.println(room[b].name);
                    break;
                }
            }
            if (!pass) {
                System.out.println("sorry");
            }

        }
    }
}
