import java.util.*;
//CSE 069 08060
public class task1 {

	public static int nthSum(int low,int up) {
		int sum =0;
		do {
			sum += low;
			low++;
		}while(low <= up);
		return sum;
	}
	public static float getAvg(float n1,float n2) {
		float sum = 0,avg;
		float[] arr = {n1,n2};
		int i =0;
		while(i != arr.length) {
			sum += arr[i];
			i++;
		}
		avg = sum/2;
		return avg;
	}
	public static void main(String[] args) {
		int lowerbound = 1, upperbound = 100;
		int sum = nthSum(lowerbound,upperbound);
		float avg = getAvg(lowerbound,upperbound);
		
		System.out.println("The Sum of "+lowerbound+" to "+upperbound+" is "+sum);
		System.out.println("The average is: "+avg);
		
	}

}
