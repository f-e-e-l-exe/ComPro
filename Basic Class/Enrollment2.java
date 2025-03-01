package CLASS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import CLASS.TestUndergraduate.Student;

class Course {
    String subject;
    int students;
    List<Integer> student_id;

    Course(String subj, int student) {
        this.subject = subj;
        this.students = student;
        student_id = new ArrayList<>();
    }

    boolean enroll(int id, Student[] st) {
        for(int a=0; a<st.length; a++){
            if(st[a].id==id){
                if (student_id.size() < students && !student_id.contains(id)) {
                    student_id.add(id);
                    st[a].printInfo();
                    return true;
                }
                return false;
            }
        }
        System.out.print("Invalid ID ");
        return false;
    }

    void printInfo() {
        System.out.println(this.subject + " " + student_id.size());
        for (int id : student_id) {
            System.out.println(id);
        }
    }
}

class Student {
    int id;
    String name;
    String lastname;

    Student(int i, String n, String l) {
        this.id = i;
        this.name = n;
        this.lastname = l;
    }

    void printInfo() {
        System.out.print(this.name + " " + this.lastname+" ");
    }
}

public class Enrollment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student[] s = new Student[P];
        for (int i = 0; i < P; ++i) {
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            s[i]=new Student(id, firstName, lastName);
        }

        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result=co.enroll(id, s);
            System.out.println(result);
        }
        co.printInfo();
    }
}
