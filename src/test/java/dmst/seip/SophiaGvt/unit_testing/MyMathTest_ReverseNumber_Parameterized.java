package dmst.seip.SophiaGvt.unit_testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Assert;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author SophiaGvt
 *
 */
@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {

	@Parameter (value = 0)
	public int number;
	@Parameter (value = 1)
	public int result;
	
	MyMath mm = new MyMath();
	
	/**
	 * This method returns a collection with the values that 
	 * will be used by the parameters.
	 * 
	 * @return an Object Collection
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{1, -1}, {-2, 2}, {0, 0}, {Integer.MAX_VALUE, -Integer.MAX_VALUE}};
		 
		return Arrays.asList(data);
	}
	
	@Test
	public void test_reverseNumber_Parameterized() {
		Assert.assertEquals(result, mm.reverseNumber(number));
	}
}
