import java.util.*;
import java.io.*;
public class WhoIsTaller{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int depth[];
    static boolean visited[];
    static int vertices;
    static ArrayList<Integer>[] adj;
    static void BFS(int start) {
        visited = new boolean[adj.length];
        Arrays.fill(visited, false);
        List<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int vis;
        while (!q.isEmpty()) {
            boolean isused = false;
            vis = q.get(0);
            q.remove(q.get(0));
            ArrayList<Integer> children = adj[vis];
            if (children == null)
                continue;
            for (int i : children) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        //https://dmoj.ca/problem/ccc13s4
        //topic: BFS
        //my approach: if just valid connection between p and q in directed graph, print YES
        //if valid connection from q to p, print NO
        //if not connected print UNKNOWN
        int num_people = readInt(), comparisons = readInt();
        depth = new int[num_people + 1];
        visited = new boolean[num_people];
        adj = new ArrayList[num_people];
        vertices = num_people;
        for (int i = 0; i < comparisons; i++) {
            int x = readInt() - 1, y = readInt() - 1;
            //person x taller than person y
            //matrix[x-1][y-1]=true;
            //directed
            if (adj[x] == null) {
                adj[x] = new ArrayList<Integer>();
            }
            adj[x].add(y);

        }
        int p = readInt()- 1, q = readInt() - 1;

        BFS(p);
        boolean one = visited[q];

        BFS(q);
        boolean two = visited[p];

        //3
        //  System.out.println(Arrays.toString(visited));
        // System.out.println(visited[p]);
        // System.out.println(one+ " " + two);
        if (one && !two) System.out.println("yes");
        else if (two && !one) System.out.println("no");
        else System.out.println("unknown");
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
