package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of the Padlock isSecondConditionMet
 * method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenSecondConditionIsMet {

	/**
	 * Test to be sure that the first condition is met with 42 and then the second
	 * condition is met with 12
	 */
	@Test
	public void testIsSecondConditionMetWith12() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.spinRight(42);
		simpleLock.spinLeft(12);
		boolean results = simpleLock.isSecondConditionMet();
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the first condition is met with 42 and then the second
	 * condition is met with 20
	 */
	@Test
	public void testIsSecondConditionMetWith20() {
		Padlock simpleLock = new Padlock(8, 25, 15);
		simpleLock.spinRight(42);
		simpleLock.spinLeft(17);
		boolean results = simpleLock.isSecondConditionMet();
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the first condition is met with 41 and then the second
	 * condition is met with 1
	 */
	@Test
	public void testIsSecondConditionMetWith1() {
		Padlock simpleLock = new Padlock(9, 10, 15);
		simpleLock.spinRight(41);
		simpleLock.spinLeft(1);
		boolean results = simpleLock.isSecondConditionMet();
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the first condition is met with 41 and then the second
	 * condition is not met with 2
	 */
	@Test
	public void testIsSecondConditionMetWith2() {
		Padlock simpleLock = new Padlock(9, 10, 15);
		simpleLock.spinRight(41);
		simpleLock.spinLeft(2);
		boolean results = simpleLock.isSecondConditionMet();
		assertEquals(false, results);
	}

}
