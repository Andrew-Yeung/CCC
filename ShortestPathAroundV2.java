//Author: Andrew Yeung
//Date:   November 25th, 2021
//Link:   https://dmoj.ca/problem/dwite08c4p4
import java.util.*;
import java.io.*;
public class Shortestpathgrid {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class pair{
        int r,c;
        pair(int r0, int c0){r=r0;c=c0;}
    }
    public static void main(String[] args) throws IOException{
        //template bfs
        int n=5;
        while(n-->0){
            char[][] grid = new char[8][8];
            int startx=0,starty=0,endx=0,endy=0;
            for(int i=0;i<8;i++){
                String a =readLine();
                for(int j=0;j<a.length();j++){
                    grid[i][j]=a.charAt(j);
                    if(grid[i][j]=='A'){startx=i;starty=j;}
                    if(grid[i][j]=='B'){endx=i;endy=j;}
                }
            }
            Queue<pair> q=new LinkedList();
            boolean[][]vis= new boolean[8][8];int[][]dis = new int[8][8];
            int[][] direction={{-1,0}, {1,0}, {0, -1}, {0, 1},{1,1},{-1,-1},{1,-1},{-1,1}};
            pair start = new pair(startx,starty), end = new pair(endx,endy);
            q.add(start); vis[start.r][start.c]=true;
            while(!q.isEmpty()){
                int r=q.peek().r, c = q.peek().c; q.poll();
                for(int i=0;i<8;i++){
                    int nr = r+direction[i][0], nc = c+direction[i][1];
                    if(nr < 0 || nr >=8|| nc <0 || nc >=8|| vis[nr][nc] ||grid[nr][nc]=='#')continue;
                    q.add(new pair(nr,nc));
                    vis[nr][nc]=true;
                    dis[nr][nc]=dis[r][c]+1;
                }
            }
            System.out.println(dis[end.r][end.c]);
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
