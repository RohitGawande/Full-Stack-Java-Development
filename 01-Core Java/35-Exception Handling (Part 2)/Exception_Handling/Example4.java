package Exception_Handling;

import java.util.Scanner;

public class Example4 {
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
		System.out.println("Enter the size of an Array :");
		int size=sc.nextInt();
		int [] a=new int[size];
		
		System.out.println("Enter the element to be inserted :");
		int elem=sc.nextInt();
		
		System.out.println("Enter the position at which the element to be inserted :");
		int pos=sc.nextInt();
		a[pos]=elem;
		System.out.println("Element: "+elem+" Insterted at "+pos+" Successfully.");
		}
		
		catch (ArithmeticException ae) {
			System.out.println("Please provide non zero denominator ");
		}
		catch (NegativeArraySizeException be) {
			System.out.println("Provide positive number.");
		}
		catch (ArrayIndexOutOfBoundsException ce) {
			System.out.println("Be in your limits,Don't Cross it ");
		}
		catch (Exception e) {
			System.out.println("Wrong Input!");
		}
		System.out.println("Connection is terminated");

	}
}
