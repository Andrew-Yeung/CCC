import java.util.Arrays;
import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt(); s.nextLine();
        for(int i=0;i<n;i++){
            String[] a = s.nextLine().split(" ");
            String print = "";
            for(int j=0;j<a.length;j++){
                if(a[j].length()==4){
                    print+="**** ";
                }else print+=a[j] + " ";
            }
            System.out.println(print);
        }
    }
}
