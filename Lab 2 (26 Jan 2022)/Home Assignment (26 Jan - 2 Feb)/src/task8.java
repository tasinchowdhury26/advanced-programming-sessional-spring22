import java.util.*;
//CSE06908060
public class task8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number,sum = 0,i;
		
		System.out.println("Enter a positive integer: ");
		number = scan.nextInt();
		
		while(number > 0) {
			i  = number % 10;
			number /= 10;
			sum +=i;
		}
		System.out.println("The sum of all digits is "+sum);
	}

}
