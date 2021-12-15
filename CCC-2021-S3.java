/*
Author: Andrew Yeung
Date:   December 4th, 2021
Link:   https://dmoj.ca/problem/ccc21s3
*/

import java.util.*;
import java.io.*;
public class LunchConcert {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, p[], w[], d[];
    public static void main(String[] args) throws IOException{
        //point so that when we move all points to that position, total distance is minimal
        //median of numbers is the most optimal position
        n=readInt(); p = new int[n]; w = new int[n]; d = new int[n];
        for(int i=0;i<n;i++){
            p[i]=readInt(); w[i]=readInt();d[i]=readInt();
        }
        int left = 0, right = (int)1e9+1;
        while(left < right){
            int mid = (left+right)/2;
            if(f(mid) < f(mid+1))right = mid;
            else left = mid+1;
        }
        System.out.println(f(left));
    }
    static long f(int x){
        long cost = 0;
        for(int i=0;i<n;i++){
            if(x < p[i]-d[i])cost+=(long)(p[i]-d[i]-x)*w[i];
            if(x > p[i]+d[i])cost+=(long)(x-p[i]-d[i])*w[i];
        }
        return cost;
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
