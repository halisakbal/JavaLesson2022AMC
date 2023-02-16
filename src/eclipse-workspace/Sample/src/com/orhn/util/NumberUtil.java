/*-----------------------------------------------------
  	FILE		: NumberUtil.java
  	AUTHOR		: Orhan OZTURK
  	LAST UPDATE : 16.02.2023
  	
  	Aim:
  	
  	
  	Copyleft(c) 1992 by Orhan ÖZTÜRK All Rights Free
   
 -----------------------------------------------------*/

package com.orhn.util;

public class NumberUtil{
	public static boolean isArmstrong(int a) 
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}
	
	public static int getDigitsPowSum(int a) 
	{
		int n = countDigits(a);
		int total = 0;
		while (a != 0) {
			total += Math.pow(a % 10, n);
			a /= 10;
		}
		
		return total;
	}
	
	public static int countDigits(int a) 
	{
		return a == 0 ? 1 : (int)Math.log10(Math.abs(a)) + 1;
	}
	
	public static int getPrime(int n)
	{
		int count = 0;
		int val = 2;
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;
		}
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;		
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;		
	}
	
	public static int factorial(int n) 
	{
		int result = 1;
		
		for(int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	}
	
	public static int reversed(int val) 
	{
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;
	}
	
	public static int sumDigits(int val) 
	{
		int sum = 0;
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
		
		return sum;
	}
	
	public static boolean isEven(int a) 
	{
		return a % 2 == 0;
	}
	
	public static boolean isOdd(int a) 
	{
		return !isEven(a);
	}
}