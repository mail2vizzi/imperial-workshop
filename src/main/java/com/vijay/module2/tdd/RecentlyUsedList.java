package com.vijay.module2.tdd;

import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class RecentlyUsedList {
	
	private final Stack<String> dialedNumbers;
	
	public RecentlyUsedList() {
		dialedNumbers = new Stack<String>();
	}

	public static void main(String[] args) {
	}
	
	
	 /**
     * Returns a copy of the dialed numbers list in reverse order 
     * (most recently dialed number first).
     *
     * @return a reversed copy of the list of dialed numbers
     */
	public List<String> getDialedNumbers(){
		List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(dialedNumbers);
		Collections.reverse(copyOnWriteArrayList);        
		return copyOnWriteArrayList;
	}
	
	
	 /**
     * Adds a phone number to the dialed numbers stack.
     * <p>
     * If the phone number already exists in the list, it is removed first 
     * so that the newly added number becomes the most recent entry.
     *
     * @param phoneNumber the phone number to add; must not be {@code null} or empty
     * @throws IllegalArgumentException if the phone number is {@code null} or empty
     */
	public void addDialedNumber(String phoneNumber) {
		if(phoneNumber == null || "".equals(phoneNumber))
			throw new IllegalArgumentException("Invalid phone number");
		dialedNumbers.remove(phoneNumber);
		dialedNumbers.push(phoneNumber);
	}
	
	 /**
     * Retrieves the most recently dialed phone number without removing it 
     * from the stack.
     *
     * @return the last dialed phone number, or {@code null} if none exists
     */
	public String getLastDialedNumber() {
		return dialedNumbers.peek();
	}

}
