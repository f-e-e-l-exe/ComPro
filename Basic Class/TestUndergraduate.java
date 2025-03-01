package CLASS.TestUndergraduate;

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
        // this.stepScore[0] = 0
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

class Undergraduate extends Student {
    public int id;
    private String stepLevel;
    private boolean engPass;

    Undergraduate(int id, String fname, String lname) {
        super(fname, lname);
        this.id = id;
        this.engPass = false;
        this.stepLevel = "";
    }

    String computeLevel() {
        int sum = computeTotal();
        if (sum >= 76 && sum < 120) {
            engPass = true;
            System.out.print("Pass ");
        } else if (sum < 76 && sum > 0) {
            engPass = false;
            System.out.print("Not pass ");
        } else {
            IntStream.range(0, 5).forEach(i -> setTestScore(i, 0));
            stepLevel = "NA";
            System.out.print("Invalid score ");
            return stepLevel;
        }
        if (sum <= 25) {
            stepLevel = "A1";
        } else if (sum <= 50) {
            stepLevel = "A2";
        } else if (sum <= 75) {
            stepLevel = "B1";
        } else if (sum <= 100) {
            stepLevel = "B2";
        } else if (sum <= 120) {
            stepLevel = "C1";
        }
        return stepLevel;

    }

    @Override
    void printInfo() {
        System.out.print(id+" ");
        super.printInfo();
        System.out.println(computeLevel());
    }

}

public class TestUndergraduate {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Undergraduate[] roster = new Undergraduate[N];
        for (int i = 0; i < N; i++) {
            int id = scan.nextInt();
            String fname = scan.next();
            String lname = scan.next();
            // Your code: create Undergraduate object
            roster[i] = new Undergraduate(id, fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                // Your code: call setTestScore
                roster[i].setTestScore(j, score);
            }
        }
        boolean found = false;
        int rosterId = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if (rosterId==roster[i].id) {
                // Your code: call printInfo
                roster[i].printInfo();
                for (int j = 1; j <= 4; j++) {
                    System.out.print(roster[i].getTestScore(j)+" ");
                }
                // Your code here
                found=true;
            }
        }
        // Your code to print “Not found”
        if(!found){
            System.out.println("Not found");
        }
    }
}