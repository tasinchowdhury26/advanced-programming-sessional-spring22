package Rectangle;

public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(5,12);
		System.out.println("Area of rec1: "+rec1.getArea());
		System.out.println("Perimeter of rec1: "+rec1.getPerimeter());
		
		rec1.setLength(4);
		rec1.setWidth(8);
		System.out.println("Updated Area of rec2 "+rec1.getArea());
		System.out.println("Updated Perimeter of rec2 "+rec1.getPerimeter());
		System.out.println("Updated Area of rec2 "+rec1.toString());
		
		
		

	}

}
