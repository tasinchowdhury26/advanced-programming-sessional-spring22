import java.util.Scanner;
//CSE06908060
public class task7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number1,number2;
		
		System.out.println("Enter two integers: ");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		System.out.println("Before swapping: number1 = "+number1+" number2 = "+number2);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After swapping: number1 = "+number1+" number2 = "+number2);

	}

}

