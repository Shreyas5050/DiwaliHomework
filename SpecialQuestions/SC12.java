//Given a string, s, return the total number of substring within s that contain the same character.
Note: You may assume that s only contains lowercase alphabetical characters.
Ex: Given the following string s…
s = "aabca", return 6 ("a" appears 3 times, "aa" appears 1 time, "b" appears 1 time, and "c" appears 1 time).


// Java program to count number of substrings
// of a string
import java.io.*;

public class SC12 {
	
	static int countNonEmptySubstr(String str)
	{
		int n = str.length();
		return n * (n + 1) / 2;
	}
	
	// Driver code
	public static void main(String args[])
	{
		String s = "abcde";
		System.out.println(
				countNonEmptySubstr(s));
	}
}

// This code is contributed
// by Manish Shaw (manishshaw1)
