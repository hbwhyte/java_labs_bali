package part_03;


import java.util.Scanner;
import java.util.Random;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();

        //create int variable "computerHand" that generates a random number 0-2

        Random rand = new Random();
        int computerHand = rand.nextInt(3);

        //call the getHand method for the playerHand
        getHand(playerHand);

        //call the getHand method for the computerHand
        getHand(computerHand);

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand


        //print out the player hand and computer hand
        System.out.println("You chose " + getHand(playerHand) + " and the computer chose " + getHand(computerHand) + ".");

        //print out the winner
        System.out.println(determineWinner(computerHand, playerHand));

    }

    // getHand method
    public static String getHand(int hand){

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper
        String handString = "";

        switch (hand) {
            case 0: handString = "scissors";
                break;
            case 1: handString = "rock";
                break;
            case 2: handString = "paper";
                break;
            default: handString = "something halfway between a lizard and spock";
        }

        //this is a temporary return statement to squash error - you'll need to update
        return handString;
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computerHand, int playerHand) {

        String status = "Try again?";

        // determine if the game is a tie
        if (computerHand == playerHand) {
            status = "You tied!";
            return status;
        }

        switch(playerHand) {
            case 0: status = (computerHand == 1) ? "You lost :(" : "You won!";
                break;
            case 1: status = (computerHand == 2) ? "You lost :(" : "You won!";
                break;
            case 2: status = (computerHand == 0) ? "You lost :(" : "You won!";
                break;
            default:
                System.out.println("You've got to actually pick rock, paper, or scissors for this to work...");
        }

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner


        return status;

    }
}





