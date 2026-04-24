package com.ConditionalsStatment;

import java.util.Scanner;

public class NestedIfCodition {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		int a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
					{
						if(a>f)
						{
							System.out.println("A is greater number = " +a);
						}
					}
				}
			}
		}
		if(b>a)
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						if(b>f)
						{
							System.out.println("B is greater number = " +b);
						}
					}
				}
			}
		}
		if(c>a)
		{
			if(c>b)
			{
				if(c>d)
				{
					if(c>e)
					{
						if(c>f)
						{
							System.out.println("C is greater number = " +c);
						}
					}
				}
			}
		}
		if(d>a)
		{
			if(d>b)
			{
				if(d>c)
				{
					if(d>e)
					{
						if(d>f)
						{
							System.out.println("D is greater number = " +d);
						}
					}
				}
			}
		}
		if(e>a)
		{
			if(e>b)
			{
				if(e>c)
				{
					if(e>d)
					{
						if(e>f)
						{
							System.out.println("E is greater number = " +e);
						}
						else
						{
							System.out.println("F is greater number = " +f);

						}
					}
				}
			}
		}

	}
}
