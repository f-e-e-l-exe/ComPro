package CLASS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Visitation {
    int code;
    int day;
    int[] time;
    int count=0;

    Visitation(int c, int d){
        this.code=c;
        this.day=d;
        this.time=new int[24];
    }
    void visit(int t){
        if(t<0||t>23){
            System.out.println("invalid hour: "+t);
        }else{
            this.time[t]=1;
            this.count++;
        }
    }
    int count(){
        return this.count;
    }
    void printVisitHours(String n){
        System.out.println(n);
        System.out.println(this.day);
        System.out.println(this.count);
        if(this.count==0){
            System.out.println("no visit");
        }else{
            for(int a=0; a<time.length; a++){
                if(this.time[a]==1){
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
    }
}

class Person{
    String name;
    List<Visitation> visitations=new ArrayList<>();

    Person(String n){
        this.name=n;
    }
    void addVisitation(Visitation v){
        if(v.count>0){
            visitations.add(v);
        }
    }
    void printAllVisitations(Place[] place){
        System.out.println(this.visitations.size());
        for(int a=0; a<visitations.size(); a++){
            for(int p=0; p<place.length; p++){
                if(place[p]!=null&&place[p].id==visitations.get(a).code){
                    visitations.get(a).printVisitHours(place[p].name);
                    break;
                }
            }
        }
    }
}

class Place{
    int id;
    String name;
    Place(int id, String n){
        this.id=id;
        this.name=n;
    }
}

public class Covid19Wins2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        Place[] place=new Place[n];
        int i=0;
        while (i<n) {
            int id=s.nextInt();
            String name=s.next();
            boolean notfound=true;
            for(int a=0; a<place.length; a++){
                if(place[a]!=null&&id==place[a].id){
                    place[a].name=name;
                    notfound=false;
                    i++;
                    break;
                }
            }
            if(notfound){
                place[i++]=new Place(id, name);
            }
        }
        s.nextLine();
        String name=s.nextLine();
        Person person=new Person(name);
        int all_p=s.nextInt();
        Visitation[] visitation=new Visitation[all_p]; 
        for(int a=0; a<all_p; a++){
            int id=s.nextInt();
            int d=s.nextInt();
            visitation[a]=new Visitation(id, d);
            int order_time=s.nextInt();
            for(int b=0; b<order_time; b++){
                int time_sec=s.nextInt();
                visitation[a].visit(time_sec);
            }
            person.addVisitation(visitation[a]);
        }
        person.printAllVisitations(place);     
    }
}