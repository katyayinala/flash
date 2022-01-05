package com.java.javabasics;

import java.util.Scanner;

public class MyFirstJavaProgram 
{
	public static void main(String[] args)
	{
	
		 /*Scanner sc = new Scanner(System.in);    
		 System.out.println("enter any number");    
		 int n = sc.nextInt();   
		 int fact=1;   
		 for(int i=1;i<=n;i++)   
		 {      
			fact = fact*i;     
	     }  */
		// System.out.println("Factorial of " +fact + " = " +fact);    
		//System.out.println(  n+ " = " +fact);  
		
		
		
		
		
		 int f1=0,f2=1;  
		 Scanner sc = new Scanner(System.in);   
	  System.out.println("enter any number");   
		 int range = sc.nextInt();   
		 int next=0;   
		 System.out.println("Fibanocci Series: " + f1 + "  " +f2 );  
	 for (int i=3; i <= range;++i) 
		 {
	         next = f1 + f2;         
	         f1 = f2;         
	         f2 = next;        
	         System.out.print("  " +next);
		
		 }
}
}

