package Exception_Handling;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Connection is Established");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Num:");
		int num2=sc.nextInt();
		int result=num1/num2;
		System.out.println("The result is:"+result);
		}catch (Exception e) {
			System.out.println("You're Trying to divide by zero ");
		}
		System.out.println("Connection is terminated");

	}
}
