import java.util.*;
//CSE06908060
public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lowerbound = 1, nth;
		int sum = 0;
		
		System.out.println("Enter nth number: ");
		nth = scan.nextInt();
		
		for(int i = lowerbound; i<= nth;i++) {
			sum += Math.pow(i, 2); 
		}
		
		System.out.println("Sum of squares from "+lowerbound+" to "+nth+" is "+ sum);
		
	}

}
