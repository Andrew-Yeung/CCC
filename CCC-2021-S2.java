/*
Author: Andrew Yeung
Date:   December 8th, 2021
Link:   https://dmoj.ca/problem/ccc21s2
*/

import java.util.*;
import java.io.*;
public class modernart{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int r = readInt(),c=readInt();
        int[] R = new int[r]; int[]C=new int[c];
        int k=readInt(), count=0;
        while(k-->0){
            char a=readCharacter(); int x=readInt()-1;
            if(a=='R'){
                R[x]++;
            }else{
                C[x]++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                count+=(R[i]+C[j])%2;
            }
        }
        System.out.println(count);
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
