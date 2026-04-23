package com.LogicalStatment;

public class StringReverseProgram {

	public static void main(String[] args) {
     String s1="Omkar";
     int len=s1.length();
     String rev="";
     for(int i=len-1;i>=0;i=i-1)
     {
    	 rev=rev+s1.charAt(i);
     }
     System.out.println(rev);
	}

}
