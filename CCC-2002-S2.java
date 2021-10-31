import java.util.*;
import java.io.*;
public class FractionAction {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt(), d = readInt();
        if(n % d == 0){
            System.out.println(n/d);
        }else{
            int highest = n/d;
            int difference = n-(d*highest);
            //gcd difference and d
            int check = gcd(difference, d);
            int one = difference/check;
            int two = d/check;
            System.out.println( highest != 0?highest + " " + one+ "/"+two: one +"/"+two);
        }
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    static int gcd(int  x, int y){
        return y==0? x:gcd(y, x%y);
    }
}
