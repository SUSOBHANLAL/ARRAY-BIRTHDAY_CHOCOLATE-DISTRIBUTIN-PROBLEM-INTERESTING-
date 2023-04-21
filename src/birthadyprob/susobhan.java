package birthadyprob;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		
		
		List<Integer> s = new ArrayList<Integer>();
		for(int i =0;i<n;i++) {
			s.add(sc.nextInt());
			
		}
		
		int d =sc.nextInt();
		int m = sc.nextInt();
		
	
		int result = birthday(s, d, m);
		System.out.print( birthday(s,d,m));
	}
	
	public static int birthday(List<Integer> s, int d, int m) {
	    int count = 0;
	    for (int i = 0; i <= s.size() - m; i++) {
	        int sum = 0;
	        for (int j = i; j < i + m; j++) {
	            sum += s.get(j);
	        }
	        if (sum == d) {
	            count++;
	        }
	    }
	    return count;
	}

}
