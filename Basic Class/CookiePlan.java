package CLASS;

import java.util.Scanner;

public class CookiePlan {
    static int planCookie(int[] pow, int[] but){
        int count=0;
        for(int a=0; a<pow.length; a++){
            int bag=Math.min((pow[a]/6), (but[a]/3));
            if(bag<10){
                System.out.println(a+1);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for(int a=0; a<N; a++){
            flours[a]=scan.nextInt();
            butters[a]=scan.nextInt();
        }
        int resule=planCookie(flours, butters);
        System.out.printf("There are %d days that ingredients are insufficient", resule);
    }
}
