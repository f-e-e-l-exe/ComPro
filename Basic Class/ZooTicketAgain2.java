package CLASS;

import java.util.Scanner;

class ZooTicketA {
    boolean kid;
    boolean used = false;
    boolean tram=false;
    

    ZooTicketA(boolean tick) {
        this.kid = tick;
    }

    boolean enterZoo(int height) {
        if (used) {
            return false;
        } else {
            if (kid) {
                if (height <= 120) {
                    this.used=true;
                    return true;
                } else
                    return false;
            }
            this.used=true;
            return true;
        }
    }
    boolean useRide(){
        if(this.used){
            if(!this.tram){
                this.tram=true;
                return true;
            }
            return false;
        }else return false;
    }
}

public class ZooTicketAgain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        ZooTicketA[] tickets = new ZooTicketA[N + 1];
        for (int i = 1; i < tickets.length; ++i) {
            int type = scan.nextInt();
            if (type == 1)
                tickets[i] = new ZooTicketA(false);
            else
                tickets[i] = new ZooTicketA(true);
        }
        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            int id = scan.nextInt();
            int type=scan.nextInt();
            if(type==1){
                int height = scan.nextInt();
                System.out.println(tickets[id].enterZoo(height));
            }else if(type==2){
                System.out.println(tickets[id].useRide());
            }
        }
    }
}