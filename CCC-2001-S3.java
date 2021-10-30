import java.util.*;
import java.io.*;
public class StrategicBombing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static int vertices;
    static boolean[] visited;
    static boolean[][] matrix;
    static boolean[][] copy;
    public static void main(String[] args) throws IOException{
        //brute force? Remove each connection, BFS to see if A is still connected to B.
        vertices = 26; visited = new boolean[26];
        matrix = new boolean[26][26];
        List<String> connections = new ArrayList();
        int count = 0;
        while(true){
            String a = readLine();
            if(a.equals("**")){
                break;
            }
            connections.add(a);
            int curr = alpha.indexOf(a.charAt(0));
            int next = alpha.indexOf(a.charAt(1));
            matrix[curr][next]=true;
            matrix[next][curr]=true;
        }
        for(int i=0;i<connections.size();i++){
            String a = connections.get(i);
            int curr = alpha.indexOf(a.charAt(0));
            int next = alpha.indexOf(a.charAt(1));
            copy = matrix;
            copy[curr][next]=false;
            copy[next][curr]=false;
            BFS(0);
            copy[curr][next]=true;
            copy[next][curr]=true;
            if(visited[alpha.indexOf("B")]==false){
                System.out.println(a);
                count++;
            }
        }
        System.out.println("There are " + count + " disconnecting roads.");
    }
    static void BFS(int start){
        visited = new boolean[vertices];
        Arrays.fill(visited, false);
        List<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int vis;
        while(!q.isEmpty()){
            boolean isused = false;
            vis = q.get(0);
            q.remove(q.get(0));
            for(int i=0;i<vertices;i++){
                if(copy[vis][i] == true && (!visited[i])){
                    q.add(i);
                    visited[i] = true;
                    //depth[i]=depth[vis]+1;
                }
            }
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
