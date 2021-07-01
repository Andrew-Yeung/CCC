import java.util.Scanner;

public class SnowCalls {
    public static void main(String[] args) {
        //https://dmoj.ca/problem/ccc05s1
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        for(int i = 0; i < n; i++){
            StringBuilder hi = new StringBuilder();
            String a = s.next();
            String x = a.replace("-", "");
            for(int j = 0; j < x.length(); j++){
                Boolean check = Character.isDigit(x.charAt(j));
                if(check) {
                    hi.append(x.charAt(j));
                }else{
                    if(x.charAt(j) == 'A' || x.charAt(j) == 'B' || x.charAt(j) == 'C'){
                        hi.append(2);
                    }
                    else if(x.charAt(j) == 'D' || x.charAt(j) == 'E' || x.charAt(j) == 'F'){
                        hi.append(3);
                    }
                    else if(x.charAt(j) == 'G' || x.charAt(j) == 'H' || x.charAt(j) == 'I'){
                        hi.append(4);
                    }
                    else if(x.charAt(j) == 'J' || x.charAt(j) == 'K' || x.charAt(j) == 'L'){
                        hi.append(5);
                    }
                    else if(x.charAt(j) == 'M' || x.charAt(j) == 'N' || x.charAt(j) == 'O'){
                        hi.append(6);
                    }
                    else if(x.charAt(j) == 'P' || x.charAt(j) == 'Q' || x.charAt(j) == 'R' || x.charAt(j) == 'S'){
                        hi.append(7);
                    }
                    else if(x.charAt(j) == 'T' || x.charAt(j) == 'U' || x.charAt(j) == 'V'){
                        hi.append(8);
                    }
                    else if(x.charAt(j) == 'W' || x.charAt(j) == 'X' || x.charAt(j) == 'Y' || x.charAt(j) == 'Z'){
                        hi.append(9);
                    }
                }
            }
            if(hi.length() != 0){
                hi.insert(3, "-");
                hi.insert(7, "-");
                if(hi.length() >= 12){
                    hi.replace(12, hi.length(), "");
                }
                System.out.println(hi);
            }

        }
    }
}
