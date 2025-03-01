package CLASS;

import java.util.Scanner;

class ContactBook {
    String[] name;
    String[] number;

    ContactBook(String[] name, String[] number){
        this.name=name;
        this.number=number;
    }
    void getAllContact(){
        for(int a=0; a<name.length; a++){
            System.out.println(name[a]+" "+number[a]);
        }
    }
    void getContact(String name){
        boolean notfound=true;
        for(int a=0; a<this.name.length; a++){
            if(this.name[a].equals(name)){
                System.out.println(this.number[a]);
                notfound=false;
                break;
            }
        }
        if(notfound){
            System.out.println("Invalid contact");
        }
    }
    boolean onlyDigits(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    void editNumber(String name, String number){
        for(int a=0; a<this.name.length; a++){
            if(this.name[a].equals(name)){
                if(onlyDigits(number)&&number.charAt(0)=='0'&&(number.length()==9||number.length()==10)){
                    this.number[a]=number;
                    System.out.println(String.format("%s new number is %s", this.name[a], this.number[a]));
                    return;
                }
            }
        }
        System.out.println("Invalid number");
        return;
    }

    
}
public class ContactManager {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] name=new String[n];
        String[] number=new String[n];
        for(int a=0; a<name.length; a++){
            name[a]=s.next();
            number[a]=s.next();
        }
        ContactBook contactBook=new ContactBook(name, number);
        int k=s.nextInt();
        for(int a=0; a<k; a++){
            int op=s.nextInt();
            switch (op) {
                case 1:
                    contactBook.getContact(s.next());
                    break;
                case 2:
                    contactBook.editNumber(s.next(), s.next());
                    break;
                case 3:
                    contactBook.getAllContact();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
