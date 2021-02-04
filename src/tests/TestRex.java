package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.TRex;

public class TestRex {
	TRex yoshi = new TRex(10.8, "lime green", true, "lost its tongue");
	TRex barney = new TRex(18, "purple", false);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Testing our Rex's");
		assertNull(barney.getInjuryDescription());
		assertNotNull(yoshi.getInjuryDescription());
		assertFalse(barney.isInjured());
		assertTrue(yoshi.isInjured());
	}
	
	@Test
	public void testInjuryWeightLoss() {
		System.out.println("Testing testInjuryWeightLoss()");
		double injury = 1.3;
		double newYoshiWeight = 9.5;
		
		assertTrue(newYoshiWeight == yoshi.injuryWeightLoss(injury));
	}
	
	@Test
	public void testNeedDiet() {
		System.out.println("Testing testNeedDiet");
		
		String message = "No";
		
		assertEquals(message, yoshi.needDiet());
		assertEquals("Yes, put up 'Do Not Feed' sign with blood stains.", barney.needDiet());
	}

}
