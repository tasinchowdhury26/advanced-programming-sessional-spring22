import java.util.*;

public class ViewResult {
	
	
	public static void main(String[] args) {
		Result result = new Result("Java",1.5,50.0);
		
		System.out.print("Course Name: ");
		System.out.println(result.subject);
		
		System.out.print("Course Credit Hours: ");
		System.out.println(result.creditHour);
		
		System.out.print("Marks Obtained: ");
		System.out.println(result.marks);
		
		System.out.print("Final Result: ");
		System.out.println(result.getResult());

	}

}
