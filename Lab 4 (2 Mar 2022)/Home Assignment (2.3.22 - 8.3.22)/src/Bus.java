import java.util.*;

public class Bus {
	public String destination;
	public double ticketPrice;
	public double mile;
	
	public Bus() {
		this.destination = null;
		this.ticketPrice = -1.0;
		this.mile = -1.0;
	}
	
	public Bus(String destination,double ticketPrice,double mile) {
		this.destination = destination;
		this.ticketPrice = ticketPrice;
		this.mile = mile;
	}
	
	public double getDiscount() {
		if(mile >= 150 && mile <=170) {
			return (ticketPrice*30)/100;
		} else {
			return ticketPrice;
		}
	}
}
