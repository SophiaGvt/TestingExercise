package dmst.seip.SophiaGvt.unit_testing;

public class MyMath {
	
	public double divide(int num, int denom) {
		
		double result = 0.0;

		if (denom == 0) {
			throw new IllegalArgumentException("'denominator' cannot be  zero");
		} else {
			result = (double)num/denom;
		}

		return result;
	} 
	
	public int reverseNumber(int number) {
		
		int result = -number;
		return result;
	}
}
