import java.util.*;
public class MultipleChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//https://dmoj.ca/problem/ccc11s2
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> key = new ArrayList<String>();
		Integer n = s.nextInt();
		
		// data
		
		for(int i = 0; i < n; i++) {
			String a = s.next();
			data.add(a);
		}
		
		//answers
		for(int i = 0; i < n; i++) {
			String a = s.next();
			key.add(a);
		}
		
		//comparison
		int counter = 0;
		for(int i = 0; i < data.size(); i++) {
			if(data.get(i).equals(key.get(i))) {
				counter += 1;
			}
		}
		System.out.println(counter);
	}
}
