import java.util.Scanner;

public class CutHalfRecursive {
    public static String cutHalf(String s) {
        // your code here


    }
    public static String cut(String s){
        String result="";
        String part1=s.substring(0,s.length()/2);
        String part2=s.substring(s.length()/2+1);
        // result+=part1.charAt(s.length()/2+1);
        int currentIndex=s.length()/2+1;
        result+=s.charAt(currentIndex);
        while (currentIndex!=0) {
            String temp=part1.substring(0, currentIndex);
            result+=temp.charAt(temp.length()/2);
            currentIndex=temp.length()/2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
    }
}
