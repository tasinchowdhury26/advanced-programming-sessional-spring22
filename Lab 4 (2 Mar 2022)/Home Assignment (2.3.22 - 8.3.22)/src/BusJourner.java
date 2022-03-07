import java.util.*;

public class BusJourner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bus bus = new Bus();
		
		System.out.println("Enter Destination: ");
		bus.destination = scan.next();
		System.out.println("Enter distance (in miles): ");
		bus.mile = scan.nextDouble();
		System.out.println("Enter Price: ");
		bus.ticketPrice = scan.nextDouble();
		
		System.out.print("Destination Place: "+bus.destination+"\n");
		System.out.print("Distance in miles: "+bus.mile+"\n");
		System.out.print("Original Ticket Price: "+bus.ticketPrice+"\n");
		
		if(bus.getDiscount() == bus.ticketPrice) {
			System.out.println("No discount is available");
		} else {			
			System.out.println("Discounted Price: "+bus.getDiscount());
		}
	}

}
