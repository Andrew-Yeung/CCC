import java.util.*;
import java.io.*;
public class BabblingBrooks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        List<Double> streams = new ArrayList<Double>();
        //flows of the river
        for(int i = 0;i<n;i++){
            streams.add(readDouble()); //use arraylist to add/remove indices easily
        }

        while(true){
            int a = readInt();
            if(a == 77){
                break;
            }else if(a == 99){
                //split
                int x = readInt();
                //the number of the stream that is split
                int p = readInt(); //the percentage of flow from the split stream that flows to the left fork
                //the percentage of flow from the split stream that flows to the left fork
                //replace the left with the amount
                double amount = streams.get(x-1)*((float)p/100);
                double remainder = streams.get(x-1)-amount;
                //index, integer element.
                streams.set((x-1), amount); //change left lane.
                streams.add((x), remainder); //adding the remainder to right lane
            }else if(a == 88){
                //join
                //the number of the stream that is rejoined with the stream to its right
                int x = readInt();
                double sum = streams.get(x-1)+streams.get(x);
                //index = x-1
                streams.set(x-1, sum);
                streams.remove(x);
            }
            //Your output is a sequence of real numbers, rounded to the nearest integer, giving the flow in rivers 1 through m.
        }
        for(int i=0;i<streams.size();i++){
            System.out.print(streams.get(i)+ " ");
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
}
