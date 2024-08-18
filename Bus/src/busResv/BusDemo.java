package busResv;

import java.sql.*;
import java.util.Scanner;
public class BusDemo {

	public static void main(String[] args){
		
		
		BusDAO busdao=new BusDAO();
		
		try {
		busdao.displayBusInfo();
		
			int userOpt=1;
			Scanner scanner=new Scanner(System.in);
			
			
			while(userOpt==1) {
				System.out.println("Enter 1 to Book and 2 to Exit!");
				userOpt=scanner.nextInt();
				if(userOpt==1) {
					Booking booking = new Booking();
					if(booking.isAvailable()) {
						BookingDAO bookingdao=new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Your Booking is Confirmed!!");
					}
					else 
						
						System.out.println("Soory is Full. Try another bus or Date!");	
				}
			}
			scanner.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
