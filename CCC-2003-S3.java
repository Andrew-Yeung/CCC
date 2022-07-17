//hihihihihi
import java.util.*;
import java.io.*;

public class FloorPlan {
    static class pair{
        int r, c;
        pair(int a, int b){
            r = a;
            c = b;
        }
    }
    static int[][] direction = {{-1,0}, {1,0},{0,-1}, {0,1}};
    public static void main(String[] args) throws IOException {
        int hashashashahsahhsahasash = readInt();
        int r = readInt(), c = readInt();
        char [][] grid = new char[r][c];
        boolean [][] vis = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String a = next();
            for (int j = 0; j < a.length(); j++) {
                grid[i][j] = a.charAt(j);
            }
        }
        List<Integer> nou = new ArrayList();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(!vis[i][j] && grid[i][j] != 'I'){
                    int count = 1;
                    Queue<pair> q = new LinkedList();
                    q.add(new pair(i, j));
                    vis[i][j] = true;
                    while(!q.isEmpty()){
                        int r1 = q.peek().r, c1 = q.peek().c;
                        q.poll();
                        for(int w = 0; w < 4; w++){
                            int nr = r1 + direction[w][0], nc = c1 + direction[w][1];
                            if(nr < 0 || nr >= r || nc < 0 || nc >= c || vis[nr][nc] || grid[nr][nc] == 'I'){
                                continue;
                            }
                            q.add(new pair(nr, nc));
                            vis[nr][nc] = true;
                            count++;
                        }
                    }
                    nou.add(count);
                }
            }
        }
        Collections.sort(nou, Collections.reverseOrder());
        int ans = 0, rem = hashashashahsahhsahasash, cur = 0;
        while(true){
            if(cur > nou.size() - 1)break;
            if(rem - nou.get(cur) >= 0){
                ans++; rem -= nou.get(cur); cur++;
            }else break;
        }
        if(ans == 1){
            System.out.println("1 room, " + rem + " square metre(s) left over");
        }else System.out.println(ans + " rooms, " + rem +" square metre(s) left over");
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
