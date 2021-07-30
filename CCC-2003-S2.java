import java.util.Locale;
import java.util.Scanner;

public class tseting {
    public static void main(String[] args) {
        //ccc work uwu
        //https://dmoj.ca/problem/ccc03s2
        Scanner s = new Scanner(System.in);
        //perfect rhyme: the four lines in the verse all rhyme
        //even rhyme: the first two lines rhyme and the last two lines rhyme
        //cross rhyme: the first and third lines rhyme, as do the second and fourth
        //shell rhyme: the first and fourth lines rhyme, as do the second and third
        //free rhyme: any form that is not perfect, even, cross, or shell.

        //solution: find suffix of letters from last vowel (not y)
        //easy way to find suffix: loop backwards until you find the constant


        int n = Integer.parseInt(s.nextLine());
        for(int i = 0; i < n; i++){
            String[] num1 = s.nextLine().split(" ");
            String[] num2 = s.nextLine().split(" ");
            String[] num3 = s.nextLine().split(" ");
            String[] num4 = s.nextLine().split(" ");

            String one = num1[num1.length-1].toLowerCase();
            String two = num2[num2.length-1].toLowerCase();
            String three = num3[num3.length-1].toLowerCase();
            String four = num4[num4.length-1].toLowerCase();

            one = getSuffix(one);
            two = getSuffix(two);
            three = getSuffix(three);
            four = getSuffix(four);

            if(one.equals(two) && two.equals(three) && three.equals(four)) {
                System.out.println("perfect");
            } else if(one.equals(two)  && three.equals(four)) {
                System.out.println("even");
            } else if(one.equals(three)  && two.equals(four)) {
                System.out.println("cross");
            } else if(one.equals(four) && two.equals(three)) {
                System.out.println("shell");
            } else {
                System.out.println("free");
            }
        }

    }
    public static String getSuffix(String s) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(s.charAt(i) == vowels[j].charAt(0)) {
                    index = i;
                }
            }
        }
        return s.substring(index);
    }
}
