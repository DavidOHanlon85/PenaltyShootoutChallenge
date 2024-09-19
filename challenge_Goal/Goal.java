/**
 * 
 */
package challenge_Goal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class Goal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int goals = startTheGame();
		String performanceMessage = performanceMessageBasedOnGoalsScored(goals);
		System.out.println(performanceMessage);
		

	}

	/** 
	 * This method starts the game and prompt the user to input the amount of penalties they would like to take. It prints the total score to console and returns the number of goals scored
	 * @return - number of goals scored
	 */
	public static int startTheGame() {
		Random myRand = new Random();
		Scanner myScan = new Scanner(System.in);
		
		int userSelection;
		int goals = 0;
		int numberOfPenalties;
		int[] positions = new int[] {1,2,3,4,5,6,7,8,9};
		
		
		System.out.println("How many penalties would you like to take?");
		numberOfPenalties = myScan.nextInt();
		
		int[] saves = new int [numberOfPenalties];
		
		for (int i = 0 ; i < saves.length ; i++) {
			saves[i] = myRand.nextInt(1, 10);
			
			System.out.println("Game on...");
			System.out.println("Penalty Number: (" + (i + 1) + " of " + saves.length + ")");
			
			System.out.println("   ");
			
			printNetAndPenaltySpot();
			
			// User Prompt
			
			System.out.println("Select your shot");
			
			userSelection = positions[myScan.nextInt() - 1];
			
			System.out.print("Placing the ball ... ");
			delay(2000);
			System.out.print("Walking back ... ");
			delay(2000);
			System.out.print("Run up ... ");
			delay(2000);
			System.out.print("Shoot!\n");
			delay(2000);
			
			if (userSelection == saves[i]) {
				delay(1000);
				System.out.println("Save");
				System.out.println();
			} else {
				delay(1000);
				System.out.println("Goal. Keeper went to " + saves[i]);
				goals++;
				System.out.println();
			}
			System.out.println();
			delay(2000);
					
			
		} 
		System.out.println("Goals scored: " + goals + "/" + saves.length );
		return goals;
	}
	
/** 
 * This method prints the net and penalty spot
 */
	public static void printNetAndPenaltySpot() {
		System.out.println("        _______________________");
		System.out.println("        |  1       2        3  |");
		System.out.println("        |  4       5        6  |");
		System.out.println("        |  7       8        9  |");
		System.out.println("_____________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println("                   X");
	}

	/**
	 * This method returns a comment based on the amount of goals scored by the user
	 * @param goals - number of goals scored
	 * @return - returns performanceMessage
	 */
	public static String performanceMessageBasedOnGoalsScored(int goals) {
		String performanceMessage;
		
			switch (goals) {
			case 0:
				performanceMessage = "You have disgraced your country and family!";
				break;
			case 1:
				performanceMessage = "You have disgraced your country and family!";
				break;
			case 2:
				performanceMessage = "Back to training for you!";
				break;
			case 3:
				performanceMessage = "Try using your good foot!!";
				break;
			case 4:
				performanceMessage = "Not bad - but not perfect!";
				break;
			case 5:
				performanceMessage = "Fluke and the keeper is not very good anyway!";
				break;
			default:
				performanceMessage = "I don't know what to say about that one";
				break;
			}
		return performanceMessage;
	}
	
	/**
     * Uses Thread sleep to add a configurable delay
     * 
     * @param millisecs
     */
    private static void delay(int millisecs) {
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
