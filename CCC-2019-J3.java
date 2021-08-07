import java.util.*;
public class test126 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        Integer count = 0;
        for(int i = 0; i < n; i++) {
            String a = s.next();
            //use string builder
            StringBuilder yes = new StringBuilder(a);
            while(yes.length() != 0) {
                for(int j = 0; j < yes.length(); j++) {
                    if(yes.charAt(j) == yes.charAt(0)) {
                        count++;
                    }else{
                        break;
                    }
                }

                System.out.print(count + " " + yes.charAt(0) + " ");
                yes.delete(0, count);
                count = 0;
            }
            System.out.println("");
        }
    }

}
