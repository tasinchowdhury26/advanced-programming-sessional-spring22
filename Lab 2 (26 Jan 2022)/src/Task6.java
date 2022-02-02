import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int rev = 0;
		
		System.out.println("Enter integer: ");
		num = sc.nextInt();		
		System.out.println("Before reverse: "+num);
		
		while(num != 0) {
			int eachDigit = num % 10;
			rev = rev * 10 + eachDigit;
			
			num = num / 10;
		}
		
		System.out.println("After reverse: "+rev);

	}

}
