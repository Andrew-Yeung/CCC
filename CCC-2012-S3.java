/*
Author: Andrew Yeung
Date:   
Link:
*/

import java.util.*;
import java.io.*;

public class AbsolutelyAcidic {

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int [] freq = new int[1001];
        for (int i = 0; i < n; i++) {
            int x = readInt();
            freq[x]++;
        }
        int num = 0;
        int highest_freq = 0;
        for (int i = 1; i < freq.length; i++) {
            if(freq[i] >= highest_freq){
                //highest freq despite same freq
                highest_freq = freq[i];
                num = i;
            }
        }
        int lower = 0;
        int check = 0;
        for (int i = 1; i < freq.length; i++) {
            if(freq[i] >= check && i != num){
                check = freq[i];
                lower = i;
            }
        }
        int smallest = Integer.MAX_VALUE;
        int old = 0;
        for (int i = 1; i < freq.length; i++) {
            if(freq[i] == check){
                if(Math.abs(i - num) > old){
                    old = Math.abs(i - num);
                    smallest = i;
                }
            }
        }
        System.out.println(Math.abs(num - smallest));
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
