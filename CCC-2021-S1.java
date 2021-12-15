import java.util.*;

public class CrazyFencing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] w = new int[n + 1];
        int[] l = new int[n];
        double total = 0;
        for(int i = 0; i < n + 1; i++){
            w[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++){
            l[i] = s.nextInt();
        }
        for(int i = 0; i < w.length - 1; i++){
            total += (float) l[i]*((w[i] + w[i + 1]))/2;
        }
        total = total*2;
        System.out.println(total/2);
    }
}
