import java.util.Scanner;

public class GoInside {
    String goInside(String str, boolean front) {
        // You can enter your code here, and only here.
        if(str.isEmpty()||str.length()==1){
            return str;
        }
        if(front){
            front=!front;
            return str.charAt(0)+""+str.charAt(str.length()-1)+goInside(str.substring(1, str.length()-1), front);

        }else{
            front=!front;
            return str.charAt(str.length()-1)+""+str.charAt(0)+goInside(str.substring(1, str.length()-1), front);
        }

    }

    //forloop TYPE/////////////////////////////////////////////
    String go(String str, boolean front){
        String result="";
        while (true) {
            if(str.length()==0){
                break;
            }
            if(str.length()==1){
                result+=str.charAt(0);
                break;
            }
            if(front){
                result+=str.charAt(0);
                result+=str.charAt(str.length()-1);
            }else{
                result+=str.charAt(str.length()-1);
                result+=str.charAt(0);
            }
            str=str.substring(1, str.length()-1);
            front=!front;
        }
        return result;
    }
    //////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}