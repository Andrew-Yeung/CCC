import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class palindromes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> hi = new ArrayList<String>();
        ArrayList<Integer> length = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                hi.add(str.substring(i,j));
            }
        }
        for(int i = 0; i < hi.size(); i++){
            StringBuffer buffer = new StringBuffer(hi.get(i));
            buffer.reverse();
            String data = buffer.toString();
            if(hi.get(i).equals(data)){
                length.add(hi.get(i).length());
            }
        }
        Collections.sort(length);
        System.out.println(length.get(length.size()-1));
    }



}
