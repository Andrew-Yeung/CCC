import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
public class ChooseYourOwnPath {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        //bfs
        //to find the shortest path keep track of ending pages and depth of nodes
        int n = readInt();
        boolean[][] matrix = new boolean[n][n];

        boolean[] end = new boolean[n];
        for(int i=0;i<n;i++){
            int m = readInt();
            for(int j=0;j<m;j++){
                int curr = readInt();
                matrix[i][curr-1]=true; //directed connection
            }
            if(m == 0)end[i]=true; //means page number is end of book
        }
        int start = 0; //start BFS at 1
        int ans = Integer.MAX_VALUE;
        int[] depth = new int[n+1];
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        List<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int vis;
        while(!q.isEmpty()){
            vis = q.get(0);
            q.remove(q.get(0));
            for(int i=0;i<n;i++){
                if(matrix[vis][i] == true && (!visited[i])){
                    q.add(i);
                    visited[i] = true;
                    depth[i]=depth[vis]+1;
                    if(end[i]==true) ans = Math.min(ans, depth[i]);
                }
            }
        }
        boolean check = true;
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false) {
                check = false;
            }
        }
        System.out.println(check? "Y":"N");
        System.out.println(ans+1);

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
