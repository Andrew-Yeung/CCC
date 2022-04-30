/*
Author: Andrew Yeung
Date:   
Link:
*/

import java.util.*;
import java.io.*;

public class Spiral {

    public static void main(String[] args) throws IOException {
        //
        int start = readInt(), end = readInt();
        if(start==end){ System.out.println(start);return;}
        int [] [] grid = new int[50][50];
        for(int i = 0;i<50;i++)Arrays.fill(grid[i], -1);
        grid[8][8] = start;
        int x = 8, y = 8;
        int dir = 0;
        int count = 0;
        int amount = 0;
        while(true){
            if(count % 2 == 0)amount++;
            //
            boolean flag = false;
            if(dir == 0){//down
                for(int i=0;i<amount;i++){
                    x++; start++;
                    grid[x][y]=start;
                    if(start==end){
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }else if(dir == 1){
                //right
                for(int i=0;i<amount;i++){
                    y++; start++;
                    grid[x][y]=start;
                    if(start==end){
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }else if(dir == 2){
                //up
                for(int i=0;i<amount;i++){
                    x--; start++;
                    grid[x][y]=start;
                    if(start==end){
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }else{
                //left
                for(int i=0;i<amount;i++){
                    y--; start++;
                    grid[x][y]=start;
                    if(start==end){
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }
            dir++;
            count++;
            if(dir == 4)dir = 0;
           // System.out.println(dir + " " + amount);
        }
        for (int i = 0; i < 50; i++) {
            boolean flag = false;
            for (int j = 0; j < 50; j++) {
                if(grid[i][j]!=-1){
                    System.out.print(grid[i][j]+ " ");flag = true;
                }
            }
            if(flag)System.out.println();
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
