package exception;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		try{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter first number");
		 int a= scan.nextInt();
		 System.out.println("enter scond number");
		 int b= scan.nextInt();
		 
				 int c= a/b;
				 System.out.println(c);
	 System.out.println("  ");
		}
		
	 
		

	
		
		catch(Exception e) 
		{
		System.out.println("hello");
		}
	 
	
			
			
		
		
	}

}
