import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            System.out.println("Choose rock, paper or scissors. 'r' for rock 's' for scissors or 'p' for paper. To exit, choose 'x'\n************************************************") ;
            Scanner scan = new Scanner(System.in);

            //Creates a variable that I can set a value to.
            String computerchoice = "";
            String userchoice = "";
            String userinput;
            int userwin = 0;
            int computerwin = 0;
            userinput = "";

            // Loops the game code so the player can replay with the computer however much they want.
        while(!userinput.equals("x")) {

            //Creates a random input from the computer to be used as an input against user
            int random = (int) (Math.random() * 3);
            if (random == 0) {
                computerchoice = "rock";
            } else if (random == 1) {
                computerchoice = "paper";
            } else if (random == 2) {
                computerchoice = "scissors";
            }

            userinput = scan.next();


                //Test for invalid input from user
                if (!(userinput.equals("r")) && !(userinput.equals("p")) && !(userinput.equals("s")) && !(userinput.equals("x")) ) {
                    System.out.println("Invalid!");
                } else if (userinput.equals("r")) {
                    userchoice = "rock";
                } else if (userinput.equals("p")) {
                    userchoice = "paper";
                } else if (userinput.equals("s")) {
                    userchoice = "scissors";
                }

                //If statements that evaluates if the player won, lost, or tied.
                //Also increases each player's points if they win or lose.
                if (userchoice.equals(computerchoice)) {
                    System.out.println("TIE!");
                } else if (userchoice.equals("rock") && computerchoice.equals("scissors")) {
                    System.out.println("You Win!");
                    userwin ++ ;
                } else if (userchoice.equals("paper") && computerchoice.equals("rock")) {
                    System.out.println("You Win!");
                    userwin ++;
                } else if (userchoice.equals("scissors") && computerchoice.equals("paper")) {
                    System.out.println("You Win!");
                    userwin ++;
                } else if (userchoice.equals("rock") && computerchoice.equals("paper")) {
                    System.out.println("You Lose!");
                    computerwin ++;
                } else if (userchoice.equals("paper") && computerchoice.equals("scissors")) {
                    System.out.println("You Lose!");
                    computerwin ++;
                } else if (userchoice.equals("scissors") && computerchoice.equals("rock")) {
                    System.out.println("You Lose!");
                    computerwin ++;
                }

                //Adds an "Exit option" to end the game and the program
                  else if (userchoice.equals("x")) {
                    System.out.println("Thanks for playing!");
                      break;
                }

                  //States Wins and Losses at the end of each round.
                System.out.println("Wins : " + userwin +
                        "Loss : " + computerwin +
                        "\nComputer Choice : " +
                        computerchoice + "\t\tYour Choice : " +
                        userchoice +
                        "\n************************************************");

            }
        }
    }
