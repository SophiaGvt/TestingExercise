package dmst.seip.SophiaGvt.unit_testing;

import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

/**
 * 
 * @author SophiaGvt
 *
 */
public class MyFileUtilitiesTest {

	MyFileUtilities mfu = new MyFileUtilities();
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_readFile_normal() {
		int[] grades = {3, 4, 5, 7, 0};
		Assert.assertArrayEquals(grades, mfu.readFile(".\\src\\test\\resources\\file1.txt"));
	}
	
	@Test
	public void test_readFile_small() {
		int[] grades = {0};
		Assert.assertArrayEquals(grades, mfu.readFile(".\\src\\test\\resources\\file2.txt"));
	}
	
	@Test
	public void test_readFile_throwsNothing() {
	
	}
	
	@Test
	public void test_readFile_IllegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		throw new IllegalArgumentException();
	}
}
