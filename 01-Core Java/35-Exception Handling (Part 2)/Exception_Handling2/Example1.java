package Exception_Handling2;

import java.util.Scanner;

class Alpha{
	void alpha() {
		System.out.println("Connection is Established");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Num:");
		int num2=sc.nextInt();
		int result=num1/num2;
		System.out.println("The result is:"+result);
		
		System.out.println("Connection is terminated");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=new Alpha();
		a.alpha();
	}

}
