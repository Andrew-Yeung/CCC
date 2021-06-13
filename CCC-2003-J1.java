import java.util.Scanner;

public class Trident {
    public static void main(String[] args) {
        //https://dmoj.ca/problem/ccc03j1
        Scanner s = new Scanner(System.in);
        Integer t = s.nextInt();
        Integer ss = s.nextInt();
        Integer h = s.nextInt();
        String space = "";
        for(int i = 0; i < ss; i++){
            space += " ";
        }
        for(int i = 0 ; i < t; i++){
            System.out.println("*" + space + "*" + space + "*");
        }
        double bottom = (ss*2)+3;
        String b = "";
        for(int i = 0; i < bottom; i++){
            b += "*";
        }
        System.out.println(b);

        double middle = Math.ceil(bottom/2);
        String yes = "";
        for(int i = 0; i < middle-1; i++){
            yes += " ";
        }
        for(int i = 0; i < h; i++){
            System.out.println(yes + "*");
        }

    }
}
//why this j1 :moyai:
