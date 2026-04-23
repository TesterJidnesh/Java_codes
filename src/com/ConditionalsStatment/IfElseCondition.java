package com.ConditionalsStatment;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		System.out.println("Enter any two number");
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is greater number");
		}
		else
		{
			System.out.println("B is greater number");
		}
	}
}
