import java.util.*;
import java.io.*;

public class CCCOthello {
    static int [][] grid;
    public static void main(String[] args) throws IOException {
        char ok = readCharacter();
        grid = new int[9][9];
        setup(ok);
        int n = readInt();
        for (int i = 0; i < n; i++) {
            int r = readInt(), c = readInt();
            if(i % 2==0){
                //black
                grid[r][c]=1;
                fix(r, c, 1);
            }else{
                //white
                grid[r][c]=2;
                fix(r, c, 2);
            }
        }
        int black = 0, white = 0;
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                if(grid[i][j] == 1)black++;
                if(grid[i][j] == 2)white++;
            }
        }
        System.out.println(black + " " + white);
    }
    static void fix(int r, int c, int colour){
        //look up
        for(int i = r; i >= 1; i--){
            if(grid[i][c]==colour && i != r){
                for(int x=r;x>=i;x--){
                    if(grid[x][c] != colour && grid[x][c] != 0)grid[x][c]=colour;
                }
                break;
            }
        }
        //look down
        for(int i=r;i<=8;i++){
            if(grid[i][c]==colour && i != r){
                for(int x=r;x<=i;x++){
                    if(grid[x][c] != colour && grid[x][c] != 0)grid[x][c]=colour;
                }
                break;
            }
        }
        //look left
        for(int i=c;i>=1;i--){
            if(grid[r][i]==colour && i != c){
                for(int x=c;x>=i;x--){
                    if(grid[r][x] != colour && grid[r][x] != 0)grid[r][x]=colour;
                }
                break;
            }
        }
        //look right
        for(int i=c;i<=8;i++){
            if(grid[r][i]==colour && i != c){
                for(int x=c;x<=i;x++){
                    if(grid[r][x] != colour && grid[r][x] != 0)grid[r][x]=colour;
                }
                break;
            }
        }
        //DIAGONAL
        //up left
        int min_r=Integer.MAX_VALUE, min_c=Integer.MAX_VALUE;
        for(int i = r, j = c; i>=1 && j>=1; i--, j--){
            if(grid[i][j]==colour && (i != r && j != c)){
                min_r=Math.min(min_r, i);
                min_c=Math.min(min_c, j);
                break;
            }
        }
        if(min_r != Integer.MAX_VALUE && min_c != Integer.MAX_VALUE) {
            for (int i = min_r, j = min_c; i <= r && j <= c; i++, j++) {
                if(grid[i][j] != colour && grid[i][j] != 0)grid[i][j] = colour;
            }
        }
        //down right
        min_r=Integer.MAX_VALUE; min_c=Integer.MAX_VALUE;
        for(int i = r, j = c; i<=8 && j<=8;i++, j++){
            if(grid[i][j]==colour && (i != r && j != c)){
                min_r=Math.min(min_r, i);
                min_c=Math.min(min_c, j);
                break;
            }
        }
        if(min_r != Integer.MAX_VALUE && min_c != Integer.MAX_VALUE){
            for(int i=r, j=c;i<=min_r && j<=min_c;i++, j++){
                if(grid[i][j] != colour && grid[i][j] != 0)grid[i][j]=colour;
            }
        }
        //down left
        int coordinate_r=0, cc=Integer.MAX_VALUE;
        for(int i=r,j=c; i<=8 && j>=1;i++,j--){
            if(grid[i][j]==colour && (i != r && j != c)){
                coordinate_r=Math.max(coordinate_r, i);
                cc=Math.min(cc, j);
                break;
            }
        }
        if(coordinate_r != 0 && cc != Integer.MAX_VALUE){
            for(int i=r,j=c; i<=coordinate_r && j>=cc; i++,j--){
                if(grid[i][j] != colour && grid[i][j] != 0)grid[i][j]=colour;
            }
        }
        //up right
        int rr=Integer.MAX_VALUE, COORD=0;
        for(int i=r,j=c; i>=1 && j<=8;i--,j++){
            if(grid[i][j]==colour && (i != r && j != c)){
                rr=Math.min(rr, i);
                COORD=Math.max(COORD, j);
                break;
            }
        }
        if(COORD != 0 && rr != Integer.MAX_VALUE) {
            for (int i = r, j = c; i >= rr && j <= COORD; i--, j++) {
                if(grid[i][j] != colour && grid[i][j] != 0)grid[i][j] = colour;
            }
        }
    }
    static void print(){
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void setup(char a){
        if(a=='a'){
            grid[4][4]=2;
            grid[5][5]=2;
            grid[5][4]=1;
            grid[4][5]=1;

        }else if(a=='b'){
            for(int i = 1; i <= 8; i++){
                grid[i][i] = 1;
                grid[i][9 - i] = 2;
            }
        }else{
            for(int i = 1; i<=8;i++){
                grid[i][3]=1;
                grid[i][4]=1;
                grid[i][5]=2;
                grid[i][6]=2;
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
