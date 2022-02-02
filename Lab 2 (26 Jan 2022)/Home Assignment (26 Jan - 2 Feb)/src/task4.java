import java.util.*;
//CSE06908060
public class task4 {
	
	public static void main(String[] args) {
		int fibo, first = 0, second = 1;
		int count = 0, number = 20;
		int[] series = new int[30];
		float avgSum = 0;
		float avg;
		
		System.out.println("The first 20 Fibonacci numbers are: ");
		while(count<=number) {
			if(count<=1) {
				fibo = count;
			}
			else {
				fibo = first + second;
				first = second;
				second = fibo;
				series[count] = fibo;
			}
			System.out.print(series[count]+" ");
			count++;
		}
		
		for(int i = 0;i<series.length;i++) {
			avgSum += series[i];
		}
		avg = avgSum/number;
		System.out.println("\nThe average is: "+avg);

	}

}
