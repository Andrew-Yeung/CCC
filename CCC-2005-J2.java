import java.util.*;
public class rsanumbers {
	static boolean divcheck(int a) {
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				count++;
			}
		}
		if(count == 4) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Integer start = s.nextInt();
		Integer end = s.nextInt();
		int counter = 0;
		int print = 0;
		int count = 0;
		for(int i = start; i <= end; i++) {
			if(divcheck(i)) {
				count++;
			}
		}
		System.out.println("The number of RSA numbers between " + start + " and " + end + " is " + count);
		
	}

}
