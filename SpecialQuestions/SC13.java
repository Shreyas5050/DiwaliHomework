//Given an encoded string, s, return its decoded representation. The string s will be encoded as follows N[letters], meaning that the letters should be repeated N times in the decoded representation.
Note: You may assume s always encoded correctly (i.e. correct formatting of brackets, only positive values outside the brackets, and always lowercase alphabetical characters inside the brackets).
Ex: Given the following string s…
s = "3[a]2[b]1[c]", return "aaabbc" ("a" is repeated 3 times, "b" is repeated 2 times, and "c" is repeated 1 time).

// Java program to decode a string recursively
// encoded as count followed substring

import java.util.Stack;

class SC13
{
	// Returns decoded string for 'str'
	static String decode(String str)
	{
		Stack<Integer> integerstack = new Stack<>();
		Stack<Character> stringstack = new Stack<>();
		String temp = "", result = "";
	
		// Traversing the string
		for (int i = 0; i < str.length(); i++)
		{
			int count = 0;
	
			// If number, convert it into number
			// and push it into integerstack.
			if (Character.isDigit(str.charAt(i)))
			{
				while (Character.isDigit(str.charAt(i)))
				{
					count = count * 10 + str.charAt(i) - '0';
					i++;
				}
	
				i--;
				integerstack.push(count);
			}
	
			// If closing bracket ']', pop element until
			// '[' opening bracket is not found in the
			// character stack.
			else if (str.charAt(i) == ']')
			{
				temp = "";
				count = 0;
	
				if (!integerstack.isEmpty())
				{
					count = integerstack.peek();
					integerstack.pop();
				}
	
				while (!stringstack.isEmpty() && stringstack.peek()!='[' )
				{
					temp = stringstack.peek() + temp;
					stringstack.pop();
				}
	
				if (!stringstack.empty() && stringstack.peek() == '[')
					stringstack.pop();
	
				// Repeating the popped string 'temo' count
				// number of times.
				for (int j = 0; j < count; j++)
					result = result + temp;
	
				// Push it in the character stack.
				for (int j = 0; j < result.length(); j++)
					stringstack.push(result.charAt(j));
	
				result = "";
			}
	
			// If '[' opening bracket, push it into character stack.
			else if (str.charAt(i) == '[')
			{
				if (Character.isDigit(str.charAt(i-1)))
					stringstack.push(str.charAt(i));
	
				else
				{
					stringstack.push(str.charAt(i));
					integerstack.push(1);
				}
			}
	
			else
				stringstack.push(str.charAt(i));
		}
	
		// Pop all the element, make a string and return.
		while (!stringstack.isEmpty())
		{
			result = stringstack.peek() + result;
			stringstack.pop();
		}
	
		return result;
	}

	// Driver method
	public static void main(String args[])
	{
		String str = "3[b2[ca]]";
		System.out.println(decode(str));
	}
}
