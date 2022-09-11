import java.util.*;
import java.io.*;

public class snakesladders {

    public static void main(String[] args) throws IOException {
        int spot = 1;
        while(true){
            int x = readInt();
            if(x==0){
                System.out.println("You Quit!");
                return;
            }
            spot += x;
            if(spot == 54){
                spot = 19;
            }
            if(spot == 90){
                spot = 48;
            }
            if(spot == 99){
                spot = 77;
            }
            if(spot == 9){
                spot = 34;
            }
            if(spot == 40){
                spot = 64;
            }
            if(spot == 67) spot = 86;
            if(spot > 100){
                spot -= x;
            }
            System.out.println("You are now on square " + spot);
            if(spot == 100){
                System.out.println("You Win!");
                return;
            }
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
