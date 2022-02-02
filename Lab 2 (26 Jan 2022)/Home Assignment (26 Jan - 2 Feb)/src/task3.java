import java.util.*;
//CSE06908060
public class task3 {

	public static void main(String[] args) {
		int lowerbound = 1,upperbound = 10;
		int product = 1;
		
		for(int i = lowerbound;i<=upperbound;i++) {
			product *= i;
		}
		System.out.println("Product of "+lowerbound+" to "+upperbound+" is "+ product);
	}

}
