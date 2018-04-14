package dmst.seip.SophiaGvt.unit_testing;

import org.junit.Test;
import org.junit.Assert;

/**
 * 
 * @author SophiaGvt
 *
 */
public class MyMathTest {

	MyMath mm = new MyMath();

	@Test // Testing a big number as a denominator
	public void testDevideByNonZero() {
		Assert.assertEquals(0.21729560302171194, mm.divide(12340, 56789), 0);
	}
	
	@Test // Testing a boundary positive number as a denominator
	public void testDevideByPositiveNearZero() {
		Assert.assertEquals(777.0, mm.divide(777, 1), 0);
	}
	
	@Test // Testing a boundary negative number as a denominator
	public void testDevideByNegativeNearZero() {
		Assert.assertEquals(-444.0, mm.divide(444, -1), 0);
	}
	
	// Testing zero as a denominator
	@Test (expected = IllegalArgumentException.class)
	public void testDevideByZero() {
		mm.divide(7, 0);
	}
}
