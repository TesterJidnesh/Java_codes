package com.ConditionalsStatment;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		System.out.println("Enter any six number");
		int a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();

		if(a>b && a>c && a>d && a>e && a>f)
		{
			System.out.println("A is greater number = " +a);
			System.out.println("A is greater number = " +a);
		}
		else if(b>a && b>c && b>d && b>e && b>f)
		{
			System.out.println("B is greater number = " +b);
		}
		else if(c>a && c>b && c>d && c>e && c>f)
		{
			System.out.println("C is greater number = " +c);
		}
		else if(d>a && d>b && d>c && d>e && d>f)
		{
			System.out.println("D is greater number = " +d);
		}
		else if(e>a && e>b && e>c && e>d && e>f)
		{
			System.out.println("E is greater number = " +e);
		}
		else
		{
			System.out.println("F is greater number = " +f);
		}
	}
}
