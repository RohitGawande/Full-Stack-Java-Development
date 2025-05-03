package Exception_Handling2;

import java.util.Scanner;

class Alpha4{
	void alpha1()   {
		System.out.println("Connection is Established");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Num:");
		int num2=sc.nextInt();
		int result=num1/num2;
		System.out.println("The result is:"+result);
		}
		catch (Exception e) {
			// TODO: handle exception
		
		System.out.println("Exception is Handled in alhpa only ");
		}
		System.out.println("Connection is terminated");

	}
}
	

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("Main method");
		Alpha4 a=new Alpha4();
		a.alpha1();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Handled in Main");
		}
		
	}

}
