package busResv;

import java.sql.*;
public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;//get and set
	
	Bus(int no, boolean ac, int cap) {
		super();
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac=val;
	}
	
	public int getCapacity() { //accessor method
	return capacity;
	}
	public void setCapacity(int cap) {//mutator
		capacity=cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo+" AC: "+ac+" Total Capacity: "+capacity);
	}
}

