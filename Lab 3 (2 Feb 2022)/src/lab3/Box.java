package lab3;
import java.util.*;

public class Box {
		double length, width, height;
		
		Box(double l,double w,double h){
			this.length = l;
			this.width = w;
			this.height = h;
		}

		public double getVolume() {
			return length*width*height;
		}
		
		public void printVolume() {
			System.out.println("Volume is: "+getVolume());
		}
		
//		public static void main(String[] args) {
//			double l,w,h;
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Enter length, width and height: ");
//			l = scan.nextDouble();
//			w = scan.nextDouble();
//			h = scan.nextDouble();
//			
//			Box box = new Box(l,w,h);
//			
//			box.getVolume();
//			box.printVolume();
//		}
		
}
