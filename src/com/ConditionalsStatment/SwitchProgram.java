package com.ConditionalsStatment;

import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {
		System.out.println("Enter a value of A and B");
		int a,b,ch,add,sub,div,mul;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Division");
		System.out.println("4 : Multiplication");
		ch=sc.nextInt();
		add=(a+b);
		sub=(a-b);
		div=(a/b);
		mul=(a*b);
		switch(ch)
		{
		case 1 :
			System.out.println("addition of two number = " +add);
			break;
		case 2 :
			System.out.println("Subtraction of two number = " +sub);
			break;
		case 3 :
			System.out.println("Division of two number = " +div);
			break;
		case 4 :
			System.out.println("Multiplication of two number = " +mul);
			break;
		default:
			System.out.println("Invalid choise entered");
		}
	}
}
