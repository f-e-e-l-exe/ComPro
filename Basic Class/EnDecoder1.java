package CLASS;

import java.util.Arrays;
import java.util.Scanner;

class Encoder{
    String[] vocab;
    int[] num_code;
    Encoder(String[] vocab, int[] num_code){
        this.vocab=Arrays.copyOf(vocab, vocab.length);
        this.num_code=Arrays.copyOf(num_code, num_code.length);
    }

    private int encodeWord(String word){
        for(int a=0; a<this.vocab.length; a++){
            if(this.vocab[a].equals(word)){
                return this.num_code[a];
            }
        }
        return-1;
    }
    int[] encodeMsg(String[] vocab){
        int[] num=new int[vocab.length];
        for(int a=0; a<vocab.length; a++){
            num[a]=encodeWord(vocab[a]);
        }
        return num;
    }
}
public class EnDecoder1  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] vocab=new String[n];
        int[] num_code=new int[n];
        for(int a=0; a<n; a++){
            vocab[a]=s.next();
        }
        for(int a=0; a<n; a++){
            num_code[a]=s.nextInt();
        }
        Encoder encoder=new Encoder(vocab, num_code);
        int order=s.nextInt();
        String[] word=new String[order];
        for(int a=0; a<order; a++){
            word[a]=s.next();
        }
        int[] result=encoder.encodeMsg(word);
        for(int r:result){
            System.out.print(r+" ");
        }

    }
}
