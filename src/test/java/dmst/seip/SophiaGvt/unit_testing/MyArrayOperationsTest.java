package dmst.seip.SophiaGvt.unit_testing;

import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;

/**
 * 
 * @author SophiaGvt
 *
 */

public class MyArrayOperationsTest {

	MyArrayOperations mao = new MyArrayOperations();
	

	@Test
	public void test_freq_mocking() {
		
		// Mock the MyFileUtilities dependency
		MyFileUtilities mfu = mock(MyFileUtilities.class);
		
		String file1 = ".\\src\\test\\resources\\file1.txt";
		String file2 = ".\\src\\test\\resources\\file2.txt";
		String file3 = ".\\src\\test\\resources\\file3.txt";
		
		int[] arrayfile1 = {3, 4, 5, 7, 0};
		int[] arrayfile2 = {0};
		int[] arrayfile3 = {6, 5, 9, 2, 4, 4};
		
		// Prepare the array that the readFile() method was supposed to do.
		when(mfu.readFile(file1)).thenReturn(arrayfile1);
		when(mfu.readFile(file2)).thenReturn(arrayfile2);
		when(mfu.readFile(file3)).thenReturn(arrayfile3);
		
		int[] freq1 = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0};
		int[] freq2 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] freq3 = {0, 0, 1, 0, 2, 1, 1, 0, 0, 1 ,0};
		
		Assert.assertArrayEquals(freq1, mao.gradesFrequencies(file1, mfu));
		Assert.assertArrayEquals(freq2, mao.gradesFrequencies(file2, mfu));
		Assert.assertArrayEquals(freq3, mao.gradesFrequencies(file3, mfu));
		
	}
}
