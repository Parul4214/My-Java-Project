package practiceQuestion;

import java.util.Random;
import java.util.Scanner;import javax.swing.text.PlainDocument;

public class Ques14RockPaperScissor {
	public static void main(String[] args) {

		String[] rps = { "rock", "paper", "scissor" };
		Random random = new Random();
		
		String playAgain;

		// random elements from array
		do {
			String player1Move = rps[random.nextInt(rps.length)];
		String player2Move;

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please enter your move : rock / paper / scissor ");
		player2Move = sc.nextLine();
		
		}while(!((player2Move.equalsIgnoreCase("rock"))||(player2Move.equalsIgnoreCase("paper"))||(player2Move.equalsIgnoreCase("scissor"))));
			
		System.out.println("You Played : " + player2Move);

		System.out.println("Player 1 played : " + player1Move);

		if (player1Move.equalsIgnoreCase(player2Move)) {
			System.out.println("Game was a tie");
		} else {
			switch (player2Move) {
			case "rock":
				if (player1Move.equalsIgnoreCase("scissor")) {
					System.out.println("You win!");
					
				} else {
					System.out.println("You lose!");
					
				}
				break;

			case "paper":
				if (player1Move.equalsIgnoreCase("rock")) {
					System.out.println("You win!");
					
				} else  {
					System.out.println("You lose!");
				}
				break;
			case "scissor":
				if (player1Move.equalsIgnoreCase("paper")) {
					System.out.println("You win!");
					
				} else  {
					System.out.println("You lose!");
				}
				break;

			default:
				System.out.println("Inside default");
				break;
			}
		}
		
		System.out.println("Do you want to play again: yes/no ?");
		 playAgain=sc.next();

	}while(playAgain.equalsIgnoreCase("yes"));
	}

}
