package busResv;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter Name of Passenger: ");
		passengerName=scanner.next();
		System.out.println("Enter Bus No: ");
		busNo=scanner.nextInt();
		System.out.println("Enter Date(dd-mm-yyyy):" );
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
		date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public boolean isAvailable() throws SQLException{
		
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao=new BookingDAO();
		int capacity=busdao.getCapacity(busNo);
		
		
		int booked = bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;
}
}