package lab3;

import java.util.Scanner;

public class BoxDemo {

	public static void main(String[] args) {
		double l,w,h;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length, width and height: ");
		l = scan.nextDouble();
		w = scan.nextDouble();
		h = scan.nextDouble();
		
		Box box = new Box(l,w,h);
		
		box.getVolume();
		box.printVolume();

	}

}
