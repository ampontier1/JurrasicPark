package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Triceratops;

public class TestTric {
	Triceratops charlene = new Triceratops(9.5, "green", true, "Lost head frill");
	Triceratops babyBop = new Triceratops(13.5, "light green", false);
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Testing our Tric's");
		assertNull(babyBop.getInjuryDescription());
		assertNotNull(charlene.getInjuryDescription());
		assertTrue(charlene.isInjured());
		assertFalse(babyBop.isInjured());
	}
	
	@Test
	public void testInjuryWeightLoss() {
		System.out.println("Testing testInjuryWeightLoss()");
		double injury = 1.3;
		double newCharleneWeight = 8.2;
		
		assertTrue(newCharleneWeight == charlene.injuryWeightLoss(injury));
	}
	
	@Test
	public void testNeedDiet() {
		System.out.println("Testing testNeedDiet");
		
		String message = "No";
		
		assertEquals(message, charlene.needDiet());
		assertEquals("Yes, dino is chonky.", babyBop.needDiet());
	}

}
