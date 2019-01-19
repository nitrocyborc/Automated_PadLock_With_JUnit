package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of the Padlock isThirdConditionMet
 * method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenPadlockOpens {

	/**
	 * Test to be sure that the lock opens when all conditions are met with spin right 42 spin left 12 and spin right 5
	 */
	@Test
	public void testIsOpenWithRight42Left12Right5() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		simpleLock.isThirdConditionMet(5);
		boolean results = simpleLock.isOpen();
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the lock opens when all conditions are met with spin right 42 spin left 12 and spin right 10
	 */
	@Test
	public void testIsOpenWithRight42Left12Right10() {
		Padlock simpleLock = new Padlock(8, 20, 10);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		simpleLock.isThirdConditionMet(10);
		boolean results = simpleLock.isOpen();
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the lock opens when all conditions are met with spin right 42 spin left 12 and spin right 30
	 */
	@Test
	public void testIsOpenWithRight42Left12Right30() {
		Padlock simpleLock = new Padlock(8, 20, 40);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		simpleLock.isThirdConditionMet(30);
		boolean results = simpleLock.isOpen();
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the lock does not open when first condition isn't met with spin right 43 spin left 12 and spin right 30
	 */
	@Test
	public void testIsOpenWithRight43Left12Right30() {
		Padlock simpleLock = new Padlock(8, 20, 40);
		simpleLock.isFirstConditionMet(43);
		simpleLock.isSecondConditionMet(12);
		simpleLock.isThirdConditionMet(30);
		boolean results = simpleLock.isOpen();
		assertEquals(false, results);
	}
	
	/**
	 * Test to be sure that the lock does not open when second condition isn't met with spin right 42,  spin left 13 and spin right 30
	 */
	@Test
	public void testIsOpenWithRight42Left13Right30() {
		Padlock simpleLock = new Padlock(8, 20, 40);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(13);
		simpleLock.isThirdConditionMet(30);
		boolean results = simpleLock.isOpen();
		assertEquals(false, results);
	}
	
	/**
	 * Test to be sure that the lock does not open when third condition isn't met with spin right 42,  spin left 13 and spin right 31
	 */
	@Test
	public void testIsOpenWithRight42Left12Right31() {
		Padlock simpleLock = new Padlock(8, 20, 40);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		simpleLock.isThirdConditionMet(31);
		boolean results = simpleLock.isOpen();
		assertEquals(false, results);
	}

}
