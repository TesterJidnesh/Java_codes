package com.ConditionalsStatment;

import java.util.Scanner;

public class Ifcondition {

	public static void main(String[] args) {
    int a,b;
    System.out.println("Enter any two number");
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>=b)
    {
    	System.out.println("A is greater number");
    }
	}

}
