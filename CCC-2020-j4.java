import java.util.*;

public class CyclicShifts {
    public static void main(String[] args) {
        //https://dmoj.ca/problem/ccc20j4
        Scanner s = new Scanner(System.in);
        //find all cyclic shifts and comapre
        String a = s.next();
        String b = s.next();
        //find shifts of b
        ArrayList<String> letters = new ArrayList<String>();
        for(int i = 0; i < b.length(); i++){
            String p = Character.toString(b.charAt(i));
            letters.add(p);
        }

        ArrayList<String> shifts = new ArrayList<String>();
        //generating the shifts
        for(int i = 0; i < letters.size(); i++){
            String second = "";
            for(int j = 0; j < letters.size()-1; j++){
                second += letters.get(j);
            }
            StringBuilder printer = new StringBuilder();
            printer.append(letters.get(letters.size()-1));
            printer.append(second);
            shifts.add(printer.toString());
            String adder = printer.toString();
            letters.clear();
            for(int p = 0; p < adder.length(); p++){
                String w = Character.toString(adder.charAt(p));
                letters.add(w);
            }
            second = "";
            printer.delete(0, printer.length()); //clears it

            //(letters.get(letters.size()-1));  //gets the last index

        }
        boolean no = false;
        for(int i = 0; i < shifts.size(); i++){
            if(a.contains(shifts.get(i))){
                no = true;
            }
        }
        if(no == true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

       //ok we generate all the cyclic shifts
        //now we have to check if the first word contains any of the substrings.
    //please dont steal my work 
    }
}
