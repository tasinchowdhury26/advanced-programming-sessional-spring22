import java.util.*;
//CSE06908060
public class task5 {
	public static int getMin(int a,int b,int c) {
		int min = (a<b && a<c) ? a : (b<a && b<c) ? b : c;
		return min;
	}
	public static int getMax(int a,int b,int c) {
		int max = (a>b && a>c) ? a : (b>a && b>c) ? b : c;
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("Enter three integers: ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		int sum = x+y+z;
		int product = x*y*z;
		int min = getMin(x,y,z);
		int max = getMax(x,y,z);
		
		System.out.println("Sum: "+sum);
		System.out.println("Product "+product);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}
}
