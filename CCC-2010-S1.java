import java.util.*;
import java.io.*;

public class COmputerPurchase {
    static class sort implements Comparable<sort>{
        int first, second;
        sort(int x, int y){
            first = x; second = y;
        }
        public int compareTo(sort check){
            if(second == check.second)return Integer.compare(check.first, first);
            return Integer.compare(check.second, second);
        }
    }
    public static void main(String[] args) throws IOException {
        int n = readInt(); if(n==0)return;
        Map<Integer, String> index = new HashMap();
        sort [] arr = new sort[n];
        for (int i = 1; i <= n; i++) {
            String name = next();
            index.put(i, name);
            int R = readInt();
            int S = readInt();
            int D = readInt();
            arr[i - 1] = new sort(i, 2*R + 3*S + D);
        }
        Arrays.sort(arr);
        if(n==1){
            System.out.println(index.get(arr[0].first));
        }else{
            int bruh = arr[0].second, ok = arr[1].second;
            if(bruh != ok){
                int highest = arr[0].second;
                List<String> orz = new ArrayList();
                for (int i = 0; i < n; i++) {
                    if(arr[i].second == highest){
                        orz.add(index.get(arr[i].first));
                    }
                }
                Collections.sort(orz);
                System.out.println(orz.get(0));
                //
                int second = arr[1].second;
                List<String> uwu = new ArrayList();
                for (int i = 0; i < n; i++) {
                    if(arr[i].second == second){
                        uwu.add(index.get(arr[i].first));
                    }
                }
                Collections.sort(uwu);
                System.out.println(uwu.get(0));
            }else{
                String [] temp = new String[2];
                temp[0] = index.get(arr[0].first);
                temp[1] = index.get(arr[1].first);
                Arrays.sort(temp);
                System.out.println(temp[0]);
                System.out.println(temp[1]);
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
