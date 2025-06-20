package Exception_Handling2;

import java.util.Scanner;

class Alpha8{
	void alpha8() throws ArithmeticException {
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
class Beta12{
	void beta12() throws ArithmeticException{
	Alpha8 a=new Alpha8();
	a.alpha8();
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Beta12 b=new Beta12();
		b.beta12();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception finnaly Handled in Main");
		}
	}

}
