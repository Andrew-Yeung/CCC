/*
Author: Andrew Yeung
Date:   
Link:   https://dmoj.ca/problem/wc15c1s2
*/

import java.util.*;
import java.io.*;

public class WildcatWildcards {
    static int[] arr;
    static boolean solve(int N){
        int vowel = arr[8], cons = arr[9], any = arr[10];
        int needV = 0, needC = 0;
        for (int i = 0; i < 8; i++) {
            if(i == 1 || i == 5){
                if(arr[i] < N){
                    needV += N - arr[i];
                }
            }else{
                if(arr[i] < N){
                    needC += N - arr[i];
                }
            }
        }
        int first = Math.max(0, needV - vowel);
        int second = Math.max(0, needC - cons);
        if(first + second <= any){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        //greedy + binary search
        arr = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = readInt();
        }
        int lo = 0, hi = Integer.MAX_VALUE-1;
        while(lo < hi){
            int mid = (lo + hi + 1)/2;
            if(solve(mid)){
                lo = mid;
            }else hi = mid - 1;
        }
        System.out.println(lo);
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
