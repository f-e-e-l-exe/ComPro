import java.util.Scanner;

public class IncreasingString {
    String makeIncreasingString(String str, char lastPrint) {
        // You can enter your code here and only here.
        if(str.isEmpty()){
            return str;
        }
        char apb=str.charAt(0);
        if(apb!='A'){
            if(apb>lastPrint){
                lastPrint=apb;
                return apb+makeIncreasingString(str.substring(1), lastPrint);
            }
            return makeIncreasingString(str.substring(1), lastPrint);
        }else{
            lastPrint=apb;
            return apb+makeIncreasingString(str.substring(1), lastPrint);
        }

    }

    //forloop TYPE//////////////////////////////////////////
    String make(String str, char lastPrint){
        String result=lastPrint+"";
        for(int a=1; a<str.length(); a++){
            char apb=str.charAt(a);
            if(apb!='A'){
                if(apb>lastPrint){
                    result+=apb;
                    lastPrint=apb;
                }
            }else{
                result+='A';
                lastPrint='A';
            }
        }
        return result;
    }
    /////////////////////////////////////////////////////////

    public static void main(String[] args) {
        IncreasingString inc = new IncreasingString();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = inc.makeIncreasingString(str, 'A');
        System.out.print(result);
    }
}