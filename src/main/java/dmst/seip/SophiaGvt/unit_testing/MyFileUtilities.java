package dmst.seip.SophiaGvt.unit_testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author SophiaGvt
 *
 */
public class MyFileUtilities {

	/**
	 * This method reads a file path and returns 
	 * an array containing the grades.
	 * 
	 * @param filePath
	 * @return gradesArr
	 */
	public int[] readFile(String filePath) {
		
		ArrayList<Integer> grades = new ArrayList<Integer>();

		File file = new File(filePath);
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));			  
			String line;
			
			// Reads the file
			while ((line = br.readLine()) != null) {
				grades.add(Integer.parseInt(line)); 
			}
			br.close();
		} catch (FileNotFoundException ex1){
			throw new IllegalArgumentException("Error while reading the file");
		} catch (IOException ex2) {
			throw new IllegalArgumentException("Something went wrong");
		}

		// Convert the Arraylist to an Array
		int[] gradesArr = new int[grades.size()]; 
		for (int i = 0; i < grades.size(); i++) {
			gradesArr[i] = grades.get(i);
		}
		return gradesArr;
	}
}
