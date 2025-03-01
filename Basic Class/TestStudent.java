import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student {
    final static int NUM_TEST = 4;
    public String firstName;
    public String lastName;
    private int[] stepScore;

    Student(String name, String lname) {
        this.firstName = name;
        this.lastName = lname;
        this.stepScore = new int[5];

    }

    int getTestScore(int type) {
        return this.stepScore[type];
    }

    void setTestScore(int type, int score) {
        this.stepScore[type] = score;
    }

    int computeTotal() {
        return Arrays.stream(stepScore).sum();
    }

    void printInfo() {
        System.out.println(this.firstName + " " + this.lastName + " " + computeTotal());
    }
}

public class TestStudent {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Student[] roster = new Student[N];
        for (int i = 0; i < N; i++) {
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Student(fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score);
            }
            roster[i].printInfo();
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int rosterNum = scan.nextInt();
            int testNum = scan.nextInt();
            System.out.println(roster[rosterNum - 1].getTestScore(testNum));
        }
    }
}
