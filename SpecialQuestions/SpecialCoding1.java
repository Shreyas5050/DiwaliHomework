import java.util.*;
class SpecialCoding1
{
	 public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)==s.charAt(len-1-i)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }


public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
boolean flag=isPalindrome(s);
if(flag)
	System.out.println("Palindrome ");
else 
	System.out.println("Not Palindrome");
	
}
}