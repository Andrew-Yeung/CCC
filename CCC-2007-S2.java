import java.util.*;
import java.io.*;
public class CCC_2007_S2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt(); int[] length = new int[n]; int[] width = new int[n];
        int[] height = new int[n]; int[] vol = new int[n];
        for(int i=0;i<n;i++){//boxes available
            length[i]=readInt(); width[i]=readInt(); height[i]=readInt();
            vol[i]=length[i]*width[i]*height[i];
        }
        int m = readInt();//items
        for(int i=0;i<m;i++){
            int l = readInt(), w = readInt(), h = readInt();
            int volume = l*w*h;
            int ans = Integer.MAX_VALUE;
            for(int j=0;j<vol.length;j++){
                if(volume<=vol[j]){
                    if(l<=length[j]&&w<=width[j]&&h<=height[j])ans = Math.min(ans, vol[j]);
                    if(l<=length[j]&&h<=width[j]&&w<=height[j])ans = Math.min(ans, vol[j]);
                    
                    if(w<=length[j]&&l<=width[j]&&h<=height[j])ans = Math.min(ans, vol[j]);
                    if(w<=length[j]&&h<=width[j]&&l<=height[j])ans = Math.min(ans, vol[j]);
                    
                    if(h<=length[j]&&l<=width[j]&&w<=height[j])ans = Math.min(ans, vol[j]);
                    if(h<=length[j]&&w<=width[j]&&l<=height[j])ans = Math.min(ans, vol[j]);
                }
            }
            System.out.println(ans!=Integer.MAX_VALUE?ans:"Item does not fit.");
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
