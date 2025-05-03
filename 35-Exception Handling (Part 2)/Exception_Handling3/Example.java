package Exception_Handling3;
import java.util.*;
class InvalidInputException extends Exception {

	public InvalidInputException(String msg) {
		super(msg);
	}
	
}
class Atm{
	int userid=1212;
	int password=111;
	int pw;
	int uid;
	public void greetings() {
		System.out.println("Welcome to Indian Bank: ");
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your ID:");
		uid=sc.nextInt();
		System.out.println("Enter your Password:");
		pw=sc.nextInt();
	}
	public void verify() throws InvalidInputException {
		if ((userid == uid)&& (password == pw)) {
			System.out.println("Take your Cash");
		}else {
			InvalidInputException iie=new InvalidInputException("Are you Sure");
			System.out.println(iie.getMessage());
			throw iie;
		}
	}
}
class Bank{
	public void initiate() {
		Atm a=new Atm();
		
		try {
			a.greetings();
			a.input();
			a.verify();
		} catch (InvalidInputException e) {
			
			try {
				System.out.println("Wrong Password, Enter Your Password Again");
				a.input();
				a.verify();
			} catch (InvalidInputException e1) {
				try {
					System.out.println("Wrong Password, Enter Your Password Again");
					a.input();
					a.verify();
				} catch (InvalidInputException e2) {
					System.out.println("Wrong Input Multiple times, Your Card is blocked ");
					System.exit(0);
				}
				
			}
		}
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.initiate();
	}

}
