package ShapeDemo;

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle("green",12);
		double area = c1.calculateArea();
		
		System.out.println("Color = "+c1.color+" Area = "+area);
		
		c1.color = "blue";
		c1.radius = 8;
		
		System.out.println("Updated - "+"Color = "+c1.color+" Area = "+c1.calculateArea());
		
	}

}
