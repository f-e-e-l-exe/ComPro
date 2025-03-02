// package CLASS;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// class Course {
//     String subject;
//     int students;
//     List<Integer> student_id;

//     Course(String subj, int student){
//         this.subject=subj;
//         this.students=student;
//         student_id=new ArrayList<>();
//     }   

//     boolean enroll(int id){
//         if(student_id.size()<students&&!student_id.contains(id)){
//             student_id.add(id);
//             return true;
//         }
//         return false;
//     }
//     void printInfo(){
//         System.out.println(this.subject+" "+student_id.size());
//         for(int id:student_id){
//             System.out.println(id);
//         }
//     }

// }

// public class Enrollment1 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String str = scan.next();
//         final int N = scan.nextInt();
//         final int K = scan.nextInt();

//         Course co = new Course(str, N);
//         for (int i = 0; i < K; ++i) {
//             int id = scan.nextInt();
//             boolean result = co.enroll(id);
//             System.out.println(result);
//         }
//         co.printInfo();
//     }
// }
