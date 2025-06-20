package Exception_Handling2;

import java.util.Scanner;

class Alpha1{
	void alpha1() throws ArithmeticException {
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
class Beta{
	void beta() throws ArithmeticException{
	Alpha1 a=new Alpha1();
	a.alpha1();
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Beta b=new Beta();
		b.beta();
		}catch(ArithmeticException e) {
			System.out.println("Exception finnaly Handled in Main");
		}
	}

}
