package Mini_Project;
import java.util.*;

// Class representing the Guesser who guesses a number.
class Guesser {
    int guessNum;

    // Method for the Guesser to input their guessed number.
    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly Guess the Num:");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Class representing Player1 who will guess the number.
class Player1 {
    int guessNum;
    static String name1;

    // Method for Player1 to input their name and guessed number.
    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now, Players will Guess the num (1-9)");
        System.out.println("Enter Your name:");
        name1 = sc.nextLine();
        System.out.print(name1 + ", kindly Guess the Number:");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Class representing Player2 who will guess the number.
class Player2 {
    int guessNum;
    static String name2;

    // Method for Player2 to input their name and guessed number.
    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        name2 = sc.nextLine();
        System.out.print(name2 + " kindly Guess the Number:");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Class representing Player3 who will guess the number.
class Player3 {
    int guessNum;
    static String name3;

    // Method for Player3 to input their name and guessed number.
    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        name3 = sc.nextLine();
        System.out.print(name3 + ", kindly Guess the Number:");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Umpire class that manages the game logic and determines the winner.
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    // Method to collect the guessed number from the Guesser.
    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    // Method to collect the guessed number from Player1.
    void collectNumFromPlayer1() {
        Player1 p1 = new Player1();
        numFromPlayer1 = p1.guessNum();
    }

    // Method to collect the guessed number from Player2.
    void collectNumFromPlayer2() {
        Player2 p2 = new Player2();
        numFromPlayer2 = p2.guessNum();
    }

    // Method to collect the guessed number from Player3.
    void collectNumFromPlayer3() {
        Player3 p3 = new Player3();
        numFromPlayer3 = p3.guessNum();
    }

    // Method to compute and determine the winner based on the guessed numbers.
    void compute() {
        // If Player1's guess matches the Guesser's guess
        if (numFromGuesser == numFromPlayer1) {
            // If all players' guesses match the Guesser's guess
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Congratulations, All of You " + Player1.name1 + ", " + Player2.name2 + ", " + Player3.name3 + " Won the game");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Congratulations, " + Player1.name1 + ", " + Player2.name2 + " You Won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Congratulations, " + Player1.name1 + ", " + Player3.name3 + " You Won the game");
            } else {
                System.out.println("Congratulations, " + Player1.name1 + " You Won the game");
            }
        }
        // If Player2's guess matches the Guesser's guess
        else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Congratulations, " + Player2.name2 + ", " + Player3.name3 + " You Won the game");
            } else {
                System.out.println("Congratulations, " + Player2.name2 + " You Won the game");
            }
        }
        // If Player3's guess matches the Guesser's guess
        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Congratulations, " + Player3.name3 + " You Won the game");
        } else {
            // If none of the players guessed the correct number
            System.out.println("All of You Lost the Game, Please Try Again!");
        }
    }
}

// Main class to run the Guesser Game.
public class Guesser_Game {
    public static void main(String[] args) {
        // Creating an instance of Umpire and starting the game.
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer1();
        u.collectNumFromPlayer2();
        u.collectNumFromPlayer3();
        u.compute();
    }
}
