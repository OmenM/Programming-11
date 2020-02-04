import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose rock, paper or scissors. 'r' for rock 's' for scissors or 'p' for paper");
        Scanner scan = new Scanner(System.in);

        //Creates a variable that I can set a value to.
        String computerchoice = "";
        String userchoice = "";
        String userinput;

       //Creates a random input from the computer to be used as an input against user
       int random = (int)(Math.random()*2);
       if (random == 0){
            computerchoice = "rock" ;
       }
       else if(random == 1){
           computerchoice = "paper";
       }
       else if(random == 2){
           computerchoice = "scissors";
       }

       userinput = scan.next();

        //Test for invalid input from user
       if(!(userinput.equals("r")) && !(userinput.equals("p")) && !(userinput.equals("s"))){
            System.out.println("Invalid!");
        }
       else if(userinput.equals("r")){
           userchoice = "rock";
       }
       else if(userinput.equals("p")){
           userchoice = "paper";
        }
        else if(userinput.equals("s")){
            userchoice = "scissors";
        }

        //If statements that evaluates if the player won, lost, or tied.

        if(userchoice.equals(computerchoice)){
            System.out.println("TIE!");
        }
        else if(userchoice.equals("rock") && computerchoice.equals("scissors")){
            System.out.println("You Win!");
        }
        else if(userchoice.equals("paper") && computerchoice.equals("rock")){
            System.out.println("You Win!");
        }
        else if(userchoice.equals("scissors") && computerchoice.equals("paper")){
            System.out.println("You Win!");
        }
        else if(userchoice.equals("rock") && computerchoice.equals("paper")){
            System.out.println("You Lose!");
        }
        else if(userchoice.equals("paper") && computerchoice.equals("scissors")){
            System.out.println("You Lose!");
        }
        else if(userchoice.equals("scissors") && computerchoice.equals("rock")){
            System.out.println("You Lose!");
        }

        System.out.println("Computer Choice : " + computerchoice + "\t\tYour Choice : " + userchoice);


    }
}