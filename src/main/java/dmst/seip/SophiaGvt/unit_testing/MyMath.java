package dmst.seip.SophiaGvt.unit_testing;

/**
 * 
 * @author SophiaGvt
 *
 */
public class MyMath {
	
	/**
	 * The method conducts a division.
	 * 
	 * @param num
	 * @param denom
	 * @return the result of the division
	 * @exception IllegalArgumentException
	 */
	public double divide(int num, int denom) {
		
		double result = 0.0;

		if (denom == 0) {
			throw new IllegalArgumentException("'denominator' cannot be  zero");
		} else {
			result = (double)num/denom;
		}

		return result;
	} 
	
	/**
	 * Takes an integer as input and returns the opposite number
	 * @param number
	 * @return result
	 */
	public int reverseNumber(int number) {
		
		int result = -number;
		return result;
	}
}
