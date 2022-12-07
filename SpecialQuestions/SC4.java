//Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
5. Note: neither binary string will contain leading 0s unless the string itself is 0
Ex: Given the following binary strings...
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return "1"

// java program to add
// two binary strings

public class SC4 {

	// This function adds two
	// binary strings and return
	// result as a third string
	static String addBinary(String a, String b)
	{	
		//If the inputs are 0
		if(a.charAt(0) == '0' && b.charAt(0) == '0'){
			return "0";
		}
		// Initialize result
		StringBuilder result = new StringBuilder("");
		
		// Initialize digit sum
		int s = 0;		

		// Traverse both strings starting
		// from last characters
		int i = a.length() - 1, j = b.length() - 1;
		while (i >= 0 || j >= 0 || s == 1)
		{
			
			// Comput sum of last
			// digits and carry
			s += ((i >= 0)? a.charAt(i) - '0': 0);
			s += ((j >= 0)? b.charAt(j) - '0': 0);

			// If current digit sum is
			// 1 or 3, add 1 to result
			result.append((char)(s % 2 + '0'));

			// Compute carry
			s /= 2;

			// Move to next digits
			i--; j--;
		}
		
		// Remove leading zeros, if any
		int start = result.length()-1;
		
		while(start >=0 && result.charAt(start) == '0') {
			start--;
		}
		
		if(start != result.length()-1) {
			result.delete(start+1,result.length());
		}
		
		return result.reverse().toString();
	}

	//Driver code
	public static void main(String args[])
	{
		String a = "1101", b="100";
		
		System.out.print(addBinary(a, b));
	}
}

// This code is contributed by Sam007.
