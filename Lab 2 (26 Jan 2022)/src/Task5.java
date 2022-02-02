import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int num1,num2,temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		
		System.out.println("Before Swap: "+"num1 = "+num1+" num2 = "+num2);
		
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swap: "+"num1 = "+num1+" num2 = "+num2);
	}

}
