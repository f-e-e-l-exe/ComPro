import java.util.Scanner;

public class MinMerge {

    String merge(String str1, String str2){
        if(str1.isEmpty()){
            return str2;
        }
        if(str2.isEmpty()){
            return str1;
        }
        char apb1=str1.charAt(0);
        char apb2=str2.charAt(0);
        char selec=(apb1<=apb2)? apb1:apb2;
        return selec+merge(str1.substring(1), str2.substring(1));

    }
    

    //forloop TYPE//////////////////////////////////////////
    String me(String str1, String str2){
        String result="";
        if(str1.length()>str2.length()){
            for(int a=0; a<str2.length(); a++){
                char apb1=str1.charAt(a);
                char apb2=str2.charAt(a);
                if(apb1<=apb2){
                    result+=apb1;
                }else{
                    result+=apb2;
                }
            }
            result+=str1.substring(str2.length());
        }else{
            for(int a=0; a<str1.length(); a++){
                char apb1=str1.charAt(a);
                char apb2=str2.charAt(a);
                if(apb1<=apb2){
                    result+=apb1;
                }else{
                    result+=apb2;
                }
            }
            result+=str2.substring(str1.length());
        }
        return result;
    }
    //////////////////////////////////////////////////////////


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        MinMerge merger=new MinMerge();
        System.out.println(merger.merge(str1, str2));
    }
}
