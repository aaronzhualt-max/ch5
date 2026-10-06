import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
	System.out.print("Type a number: ");
	int seconds = in.nextInt();
	int guessCount = 0;
	int maxAttempts = 2;	
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	while (guessCount <= maxAttempts) {
		if (guessCount == 2) {
			System.out.println("The number I was thinking of is: " + number);
			int difference = Math.abs(seconds - number);
			System.out.println("You were off by: " + difference);
			System.exit(0);
		}
		else if (seconds < number) {
			System.out.print("Guess higher: ");
			seconds = in.nextInt();
		}
		else if (seconds > number) {
			System.out.print("Guess lower: ");
			seconds = in.nextInt();
		}
		else if (seconds == number) {
			System.out.print("You guessed correctly");
			System.exit(0);
		} 
		guessCount++;
		
	}
	}
}
