package com.javaBinaryOperators;

public class Example2
{

	public static void main(String[] args)
	{

		/**
		 * Arithmetic Assignment Operators: 
		 */
		
		
		int a = 30, b = 10;
		
		System.out.println("+= : "+(a += b));
						// a = a+b => a = 30+10 = 40
		System.out.println("-= : "+(a -= b));
						// a = a-b => a = 40-10 = 30
		System.out.println("*= : "+(a *= b));
						// a = a*b => a = 30*10 = 300
		System.out.println("/= : "+(a /= b));
						// a = a/b => a = 300/10 = 30
		System.out.println("%= : "+(a %= b));
						// a = a%b => a = 30%10 = 0


	}

}
