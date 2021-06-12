import java.util.*;
import java.io.*;
public class Sentences {
    public static void main(String[] args) throws IOException{
        //https://dmoj.ca/problem/ccc97s1
        //generate all possible combinations
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> subjects = new ArrayList<String>();
        ArrayList<String> verbs = new ArrayList<String>();
        ArrayList<String> nouns = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            int sub = Integer.parseInt(br.readLine());
            int verb = Integer.parseInt(br.readLine());
            int noun = Integer.parseInt(br.readLine());
            for(int one = 0; one < sub; one++){
                subjects.add(br.readLine());
            }
            for(int two = 0; two < verb; two++){
                verbs.add(br.readLine());
            }
            for(int three = 0; three < noun; three++){
                nouns.add(br.readLine());
            }
            for(int x = 0; x < sub; x++){
                for(int y = 0; y < verb; y++){
                    for(int z = 0; z < noun; z++){
                        System.out.print(subjects.get(x));
                        System.out.print(" ");
                        System.out.print(verbs.get(y));
                        System.out.print(" ");
                        System.out.print(nouns.get(z));
                        System.out.print(".");
                        System.out.println();
                    }
                }
            }
            subjects.clear();
            nouns.clear();
            verbs.clear();
        }
    }
}
