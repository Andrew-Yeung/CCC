import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class AssigningPartners{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String[] first = new String[n];
        String[] second = new String[n];
        for(int i=0;i<n;i++) first[i]=s.next().toLowerCase(Locale.ROOT);
        for(int i=0;i<n;i++) second[i]=s.next().toLowerCase(Locale.ROOT);

        //iterate and check
        boolean ans = true;
        for(int i=0;i<n;i++){
            String pair1 = first[i], pair2 = second[i];
            if(pair1.equals(pair2)) {ans = false;}
            for(int j=0;j<n;j++){
                if(first[j].equals(pair1)){
                    if(!second[j].equals(pair2)) {ans = false;}
                    else continue;
                }
            }
            for(int j=0;j<n;j++){
                if(second[j].equals(pair1)){
                    if(!first[j].equals(pair2)) {ans = false;}
                    else continue;
                }
            }
        }
        System.out.println(ans ? "good":"bad");
    }
}
