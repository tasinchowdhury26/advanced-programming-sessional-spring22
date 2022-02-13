import java.util.*;

public class Result {
	public String subject;
	public Double creditHour;
	public Double marks;
	
	public Result(){
		this.subject = null;
		this.creditHour = -1.0;
		this.marks = -1.0;
	}
	
	public Result(String subject,Double creditHour, Double marks) {
		this.subject = subject;
		this.creditHour = creditHour;
		this.marks = marks;
	}
	
	public String getResult() {
		if((this.creditHour == 1.5 || this.creditHour == 0.75) && marks < 40) {
			return "fail";
		}
		else {
			return "pass";
		}
	}
	
	public static void main(String[] args) {

	}

}
