import java.util.*;
import java.io.*;
public class timeONtask {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        //cc2 work
        int time = readInt();
        int n = readInt();
        int[] times = new int[n];
        for(int i = 0; i < n; i++){
            times[i] = readInt();
        }
        Arrays.sort(times);
        int increment = 0;
        int counter = 0;
        while(increment <= time){
            increment += times[counter];
            counter++;
        }
        System.out.println(counter - 1);
        //orz why is this j4
        
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
}
