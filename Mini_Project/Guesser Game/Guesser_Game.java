package Mini_Project;
import java.util.*;
class Guesser{
	int guessNum;
	int guessNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser kindly Guess the Num:");
		guessNum=sc.nextInt();
		return guessNum;
	}
}
class Player1{
	int guessNum;
	static String name1;
	int guessNum() {
		Scanner sc =new  Scanner(System.in);
		System.out.println("Now ,Players will Guess the num(1-9)");
		System.out.println("Enter Your name:");
		name1=sc.nextLine();
		System.out.print(name1+" ,kindly Guess the Number:");
		guessNum=sc.nextInt();
		return guessNum;
}
	
}
	class Player2{
		int guessNum;
		static String name2;
		int guessNum() {
			Scanner sc =new  Scanner(System.in);
			System.out.println("Enter Your name:");
			name2=sc.nextLine();
			System.out.print(name2+" kindly Guess the Number:");
			guessNum=sc.nextInt();
			return guessNum;
	}
	}
		class Player3{
			int guessNum;
		
			static String name3;
			int guessNum() {
				Scanner sc =new  Scanner(System.in);
				System.out.println("Enter Your name:");
				name3=sc.nextLine();
				System.out.print(name3+",kindly Guess the Number:");
				guessNum=sc.nextInt();
				return guessNum;
		}
		}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayer1() {
		Player1 p1=new Player1();
		numFromPlayer1=p1.guessNum();
	}
	void collectNumFromPlayer2() {
		Player2 p2=new Player2();
		numFromPlayer2=p2.guessNum();
	}
	void collectNumFromPlayer3() {
		Player3 p3=new Player3();
		numFromPlayer3=p3.guessNum();
	}
	void compute() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3) {
				System.out.println("Congratulation,All of You"+Player1.name1+","+Player2.name2+","+Player3.name3+" Won the game");
			}else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Congratulation,"+Player1.name1+","+Player2.name2+" You Won the game");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Congratulation,"+Player1.name1+","+Player3.name3+" You Won the game");
			}
			else {
				System.out.println("Congratulation,"+Player1.name1+" You Won the game");
			}
		}else if(numFromGuesser==numFromPlayer2){
				if(numFromGuesser==numFromPlayer3) {
					System.out.println("Congratulation,"+Player2.name2+","+Player3.name3+" You Won the game");
				}else {
					System.out.println("Congratulation,"+Player2.name2+" You Won the game");

				}
				
		}else if(numFromGuesser==numFromPlayer3){
			System.out.println("Congratulation,"+Player3.name3+" You Won the game");
		}else {
			System.out.println("All of You Lost the Game,Please Try Again!");
		}
	}
}
  
	

public class Guesser_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer1();
		u.collectNumFromPlayer2();
		u.collectNumFromPlayer3();
		u.compute();
	}

}
