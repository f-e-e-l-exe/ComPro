
import java.util.Scanner;
class Content{
    String name;
    int price;

    Content(String name, int price){
        this.name=name;
        this.price=price;
    }

    void updatePrice(int newPrice){
        if(newPrice>0){
            this.price=newPrice;
        }
    }
    void printSummarize(){
        System.out.println(name+" "+price);
    }
}
class Food{
    String name;
    Content[] contents;
    Food(String name, Content[] content){
        this.name=name;
        this.contents=content;
    }

    void printSummarize(){
        int totalprice=0;
        for(int a=0; a<contents.length; a++){
            totalprice+=contents[a].price;
        }
        System.out.println(name+" "+totalprice);
    }

}

public class Foodmachine {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int allContent=s.nextInt();
        Content[] contents=new Content[allContent];
        for(int a=0; a<allContent; a++){
            String name=s.next();
            int price=s.nextInt();
            contents[a]=new Content(name, price);
        }
        int allFood=s.nextInt();
        Food[] foods=new Food[allFood];
        for(int a=0; a<allFood; a++){
            String nameFood=s.next();
            int foodUsecontent=s.nextInt();
            Content[] useContent=new Content[foodUsecontent];
            for(int b=0; b<foodUsecontent; b++){
                int idContent=s.nextInt();
                // useContent[b]=contents[idContent];
                useContent[b]=new Content(contents[idContent].name, contents[idContent].price);
            }
            foods[a]=new Food(nameFood, useContent);
        }
        // while (true) {
        //     int idContent=s.nextInt();
        //     if(idContent<0){
        //         break;
        //     }
        //     int newPrice=s.nextInt();
        //     contents[idContent].updatePrice(newPrice);
        //     contents[idContent].printSummarize();
        // }
        while (true) {
            int idContent=s.nextInt();
            if(idContent<0){
                break;
            }
            int newPrice=s.nextInt();
            for(int a=0; a<foods.length; a++){
                foods[a].contents[idContent].updatePrice(newPrice);
                foods[a].contents[idContent].printSummarize();
            }
        }
        for(int a=0; a<foods.length; a++){
            foods[a].printSummarize();
        }
    }
    
}


