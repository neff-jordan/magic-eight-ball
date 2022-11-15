package magic8ball;

import java.util.Random;
import java.util.Scanner;

public class magic8ball {

	public static void main(String[] args) {

		System.out.println("Ask the gods a question");
		Scanner scan = new Scanner(System.in);
		scan.next();
		
		Random question = new Random();
		int x = question.nextInt(6);
		
		if(x == 0) {
			System.out.println("The gods say yes!");
		} else if(x == 1) {
			System.out.println("Message cloudy. Try again.");
		} else if(x == 2) {
			System.out.println("Beyond the sight of a god. Seek the Oracle.");
		} else if(x == 3) {
			System.out.println("The gods think this is unwise.");
		} else if(x == 4) {
			System.out.println("Hmmmmmmmmm, embark on a perilous journey to the other side of the coast to discover the truth.");
		} else if(x == 5) {
			System.out.println("Your destiny lurks ever closer...");
		}				
		
	}
}