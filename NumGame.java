import java.util.Scanner;
import java.util.Random;
public class NumGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rm=new Random();
		int maxAttempt=5;
		int score=0;
		String rounds="yes";
		System.out.println("welcome!!");
		System.out.println("your device have generated a number between 1 and 100!!\n let's Start!");
		while(rounds.equalsIgnoreCase("yes")) {
			int generatedNum=rm.nextInt(100)+1;
			int attempt = 0 ;
			boolean correctGuess = false;
			while(attempt<maxAttempt) {
        	System.out.println("Enter your guess:");
			int guess=sc.nextInt();
			if(guess == generatedNum) {
				System.out.println("correct");
				score++;
				correctGuess=true;
				break;
			}
			else if( guess>generatedNum ) {
        		System.out.println("TOO HIGH!!");
        	}
        	else{
        		System.out.println("TOO LOW!!");
        	}
        }
        System.out.println("do you want to play again(yes/no):");
        rounds=sc.next();
	}
		System.out.println("Score: " + score);
		sc.close();
  }
}
