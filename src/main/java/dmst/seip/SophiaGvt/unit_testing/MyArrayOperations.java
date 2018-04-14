package dmst.seip.SophiaGvt.unit_testing;

/**
 * 
 * @author SophiaGvt
 *
 */

public class MyArrayOperations {

	/**
	 * This method calculates the frequency of each grade
	 * and returns an array of integers
	 * 
	 * @param filepath
	 * @param utils
	 * @return freq
	 */
	public int[] gradesFrequencies(String filepath, MyFileUtilities utils) {
		
		// An array containing the grades
		int[] grades = utils.readFile(filepath);
		
		// Initializes the array with frequencies
		int[] freq = new int[11];
		for (int i = 0; i < 11; i++) {
			freq[i] = 0;
		}
		
		// Calculate the frequencies
		for (int i = 0; i < grades.length; i++ ) {
			freq[grades[i]] = freq[grades[i]] + 1;
		}
		
		return freq;
		
	}
}
