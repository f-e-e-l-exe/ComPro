import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        // Your work here
        if(str.length()==1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return dupRemove(str.substring(1));
        }else{
            return str.substring(0, 1)+dupRemove(str.substring(1));
        }
        
    }
    //forloop TYPE
    String du(String str){
        char apb=str.charAt(0);
        String result=""+apb;
        for(int a=1; a<str.length(); a++){
            char apb2=str.charAt(a);
            if(apb2!=apb){
                result+=apb2;
                apb=apb2;
            }
        }
        return result;
    }
    //

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}