import java.util.Random;
import java.util.Scanner;

public class Gokje2 {
	private static boolean win;
	private static int tries;
	private static int range;
	private static int lastnumb;

	public static void main(String[] args)
	{
		Gokje2.playGame();	
	}
	
	public static void playGame() {
		Random randInt = new Random();
		Gokje2.range = randInt.nextInt(50);
		Scanner input = new Scanner (System.in);
		int playerguess;		
		while (win == false) {
			if (tries == 7) {
				System.out.print("You're out of turns, the number you had to guess was: " + range +"\n");
				Gokje2.Replay();
			}
			else {
				System.out.print("You have " + (calculateTurns()) + " turns left!\n");
				System.out.println("Guess a number between 0 and 50 ");
				playerguess = input.nextInt();
				tries ++;
				if ( playerguess == range) {
					System.out.print("You guessed the right number and won the game in " + tries + " tries\n");
					break;
				}
				else if (playerguess > range) {
					System.out.print("Your guess is too high! - " + playerguess + "\n");
				}
				else if (playerguess < range) {
					System.out.print("Your guess is too low! - " + playerguess + "\n");
				}
				}
		}
		Gokje2.Replay();
		}
	
	public static void Replay(){
		System.out.print("Do you want to try again?\nIf so, input f. If you want to quit the game, input e");
		Scanner input2 = new Scanner(System.in);
		String tryAgain = input2.next();
		if (tryAgain.equals("f"))
		{
			System.out.print("\n");
			tries = 0;
			Gokje2.playGame();
		}
		else if (tryAgain.equals("e"))
		{
			System.exit(0);
		}
		else
		{
			Gokje2.Replay();
		}	
	}
	
	public static String calculateTurns() {
		int turns = 7;
		int turn = turns - tries;
		String retrunvalue = Integer.toString(turn);
		return retrunvalue;
	}
	
}
//Tim van der Perk