import java.util.ArrayList;
import java.util.Scanner;

public class Sumac {
    public static void main(String[] args) {
        //https://dmoj.ca/problem/ccc11j3
        Scanner s = new Scanner(System.in);
        Integer a = s.nextInt();
        Integer b = s.nextInt();


        ArrayList<Integer> hi = new ArrayList<Integer>();
        hi.add(a); //0
        hi.add(b); //1
        int counter = hi.get(hi.size()-2) - hi.get(hi.size()-1);
        hi.add(counter);
        int index = 0;

        while(counter >= 0){
            counter = hi.get(hi.size()-2) - hi.get(hi.size()-1);
            hi.add(counter);

            index += 1;
        }
        System.out.println(index +2);


    }
}
