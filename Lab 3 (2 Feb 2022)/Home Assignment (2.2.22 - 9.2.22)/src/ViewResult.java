import java.util.*;
public class ViewResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Result res = new Result();
		
		String courseName;
		Double credits,marks;
		
		System.out.println("Enter subject name: ");
//		courseName = sc.next();
		res.subject = sc.next();
		
		System.out.println("Enter credit hours: ");
//		credits = sc.nextDouble();
		res.creditHour = sc.nextDouble();
		
		System.out.println("Enter obtained marks: ");
//		marks = sc.nextDouble();
		res.marks = sc.nextDouble();
		
//		Result r = new Result(courseName,credits,marks);
		
		System.out.print("Subject: ");
		System.out.println(res.subject);
		
		System.out.print("Credit Hours: ");
		System.out.println(res.creditHour);
		
		System.out.print("Marks obtained: ");
		System.out.println(res.marks);
		
		System.out.print("Result: ");
		System.out.println(res.getResult());

	}

}
