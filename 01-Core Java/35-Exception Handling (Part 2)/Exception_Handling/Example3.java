package Exception_Handling;

import java.util.Scanner;

public class Example3 {
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
		System.out.println();
		System.out.println("Enter the element to be inserted :");
		int elem=sc.nextInt();
		System.out.println("Enter the position at which the element to be inserted :");
		int pos=sc.nextInt();
		a[pos]=elem;
		System.out.println("Element: "+elem+" Insterted at "+pos+" Successfully.");
		}catch (Exception e) {
			System.out.println("Wrong Input ,Pleade give the right one . ");
		}
		System.out.println("Connection is terminated");

	}
}
