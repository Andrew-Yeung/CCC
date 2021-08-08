import java.util.*;
import java.io.*;
public class version2test{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        //find most frequent num, then remove all of those from array
        //find the second most frequent num
        int[] hi = new int[n];
        ArrayList<Integer> val = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int a = readInt();
            hi[i] = a;
        }
        //find num of times a number appears, and add to the list
        int counter = 0;
        int current = 0;
        for(int i = 0; i < hi.length; i++){
            current = hi[i];
            for(int j = 0; j < hi.length; j++){
                if(hi[j] == current){
                    counter++;
                }
            }
            val.add(counter);
            //checks frequency
            counter = 0; //reset
        }
        //to find the most frequent u take the max of the frequency array, and pair that index with the normal
        int max = Integer.MIN_VALUE;
        int index = 0;
        int first_num = 0; //the first num we use for the question.
        //don't screw up indexes or they wont align with other array
        for(int i = 0; i < val.size(); i++){
            if(val.get(i) > max){
                max = val.get(i);
                index = i;
            }
        }

        first_num = hi[index]; //stores the first frequent num //also gets the highest.

        //we now have to remove all of the first numbers to find the second most frequent
        //if we remove, we will mess up indexes, so we can just clone array but dont add the first_nums.
        ArrayList<Integer> hi2 = new ArrayList<Integer>();
        for(int i = 0; i < hi.length; i++){
            //if its the first_num, don't add
            if(hi[i] != first_num){
                hi2.add(hi[i]);
            }
        }
        //repeat first step to find second most frequent.
        ArrayList<Integer> val2 = new ArrayList<Integer>();
        int counter2 = 0;
        int current2 = 0;
        for(int i = 0; i < hi2.size(); i++){
            current2 = hi2.get(i);
            for(int j = 0; j < hi2.size(); j++){
                if(hi2.get(j) == current2){
                    counter2++;
                }
            }
            val2.add(counter2);
            counter2 = 0;
        }

        int max2 = Integer.MIN_VALUE;
        int second_num = 0; //the first num we use for the question.
        //don't screw up indexes or they wont align with other array
        ArrayList<Integer> compare = new ArrayList<Integer>(); //since there can be more than 1 highest frequency
        for(int i = 0; i < val2.size(); i++){
            if(val2.get(i) > max2){
                max2 = val2.get(i);
            }
        }
        //find the num of max in val2
        //array that stores all the values of the most frequent
        for(int i = 0; i < val2.size(); i++){
            if(val2.get(i) == max2){
                compare.add(hi2.get(i)); //add the corresponding number
            }
        }
        //loop through
        //find the lowest or highest, thus giving highest absolute value
        int[] finaluwu = new int[compare.size()];
        int finalnum = 0;
        int highestval = -1;
        for(int i = 0; i < compare.size(); i++){
            finaluwu[i] = Math.abs(first_num-compare.get(i));
        }
        int maxmax = -1;
        for(int i = 0; i < finaluwu.length; i++){
            if(finaluwu[i] > maxmax){
                maxmax = finaluwu[i];
            }
        }
        System.out.println(maxmax);

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
