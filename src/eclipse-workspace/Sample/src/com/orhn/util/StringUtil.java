/*-----------------------------------------------------
  	FILE		: StringUtil.java
  	AUTHOR		: Orhan OZTURK
  	LAST UPDATE : 16.02.2023
  	
  	Aim:
  	
  	
  	Copyleft(c) 1992 by Orhan ÖZTÜRK All Rights Free
   
 -----------------------------------------------------*/

package com.orhn.util;

public class StringUtil {
	public static String padLeading(String s, int len, char ch)
	{
		int length = s.length();
		
		return len <= length ? s : repeat(len - length, ch) + s;
	}
	
 	public static String padLeading(String s, int len)
 	{
 		return padLeading(s, len, ' ');
 	}
 	
 	public static String padTrailing(String s, int len, char ch)
 	{
 		int length = s.length();
		
		return len <= length ? s : s + repeat(len - length, ch);
 	}
 	
 	public static String padTrailing(String s, int len)
 	{
 		return padTrailing(s, len, ' ');
 	}
 	 	
 	public static String repeat(int count, char ch)
 	{
 		return String.format("%" + count + "c", ' ').replace(' ', ch);
 	}
 	
 	public static String getLastLongestPalindrome(String s)
	{
		String result = "";
		
		int end = s.length();
		
		while (end != 0) {
			int begin = 0;
			
			while (begin != end) {
				String str = s.substring(begin++, end);
				
				if(str.length() > 1 && isPalindrome(str) && result.length() < str.length())
					result = str;
			}
			
			--end;
		}
		
		return result;
		
	}
	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));
			
			if(!Character.isLetter(cLeft)) {
				++left;
				continue;
			}
			
			char cRight = Character.toLowerCase(s.charAt(right));
			
			if(!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			if(cLeft != cRight)
				return false;
			
			++left;
			--right;
		}
		
		return true;
	}
}