package com.vijay.module2.tdd;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RecentlyUsedListTest {

	@Test
	public void testRecentlyUsedListIsEmptyOnInitialization() {
//		assertNull(new RecentlyUsedList().getDailedNumbers());
		assertNotNull(new RecentlyUsedList().getDialedNumbers());
		assertEquals(0, new RecentlyUsedList().getDialedNumbers().size());
	}

	@Test
	public void testAddingDailedNumberToRecentlyUsedList() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addDialedNumber("*121#");
		assertEquals(1, recentlyUsedList.getDialedNumbers().size());
	}

	@Test
	public void testAddingInvalidDailedNumberToRecentlyUsedList() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		try {
			recentlyUsedList.addDialedNumber("");
			fail("should throw illegal argument expcetion");
		} catch (Exception e) {
			assertThat(e.getMessage(), containsString("Invalid phone number"));
		}
	}
	
	@Test
	public void testRecentlyUsedListDoesntHaveAnyDuplicated() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addDialedNumber("*121#");
		recentlyUsedList.addDialedNumber("1234567890");
		recentlyUsedList.addDialedNumber("9122334455");
		recentlyUsedList.addDialedNumber("1234567890");
		recentlyUsedList.addDialedNumber("1234567890");
		recentlyUsedList.addDialedNumber("1234567891");
		recentlyUsedList.addDialedNumber("1234567890");
		assertEquals(1L, recentlyUsedList.getDialedNumbers()
			    .stream()
			    .filter(ph -> ph.equals("1234567890"))
			    .count());
		System.out.println(recentlyUsedList);
	}
	
	@Test
	public void testLastDailedNumbercomesFirst() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addDialedNumber("*121#");
		recentlyUsedList.addDialedNumber("1234567890");
		recentlyUsedList.addDialedNumber("9122334455");
		recentlyUsedList.addDialedNumber("1234567890");
		recentlyUsedList.addDialedNumber("1234567890");
		recentlyUsedList.addDialedNumber("1234567891");
		recentlyUsedList.addDialedNumber("1234567890");
		assertEquals("1234567890", recentlyUsedList.getLastDialedNumber());
		System.out.println(recentlyUsedList);
	}




}
