package ShapeDemo;

public class Circle {
	public String color;
	public double radius;
	
	public Circle() {
		
	}
	
	public Circle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	
	public double calculateArea() {
		double area;
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	

}
