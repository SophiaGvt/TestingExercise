package dmst.seip.SophiaGvt.unit_testing;

public class MyArrayOperations {

	public int[] gradesFrequencies(String filepath, MyFileUtilities utils) {
		
		int[] grades = utils.readFile(filepath);
		
		int[] freq = new int[11];
		for (int i = 0; i < 11; i++) {
			freq[i] = 0;
		}
		
		for (int i = 0; i < grades.length; i++ ) {
			freq[grades[i]] = freq[grades[i]] + 1;
		}
		
		return freq;
		
	}
}
