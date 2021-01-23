package edu.wctc;

import java.util.Scanner;

public class Main {

    static int addPoints (int points)
    {
         int totalPoints = 0;
         totalPoints += points;
         return totalPoints;

    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] questions = new String[5];

        questions[0] = "Mild or spicy?";
        questions[1] = "Tea or coffee";
        questions[2] = "Breakfast or brunch?";
        questions[3] = "Summer or Winter?";
        questions[4] = "Paper or plastic?";

         int response;

         boolean playAgain;
         String playAgainResponse;

        int[] pointValues = new int[5];

        do {

            int totalPoints = 0;

            for (int i = 0; i < questions.length; i++) {

                System.out.println(questions[i]);
                System.out.println("Enter in 0 for the left choice.");
                System.out.println("Enter in 1 for the right choice.");
                System.out.print("Your Choice?: ");
                response = Integer.parseInt(keyboard.nextLine());

                System.out.println("");


                pointValues[i] = response;

                totalPoints += addPoints(pointValues[i]);

            }

            System.out.println("Your score is " + totalPoints + " points");

            if (totalPoints < 3) {

                System.out.println("You prefer life to be calm and organized");

            }

            else if (totalPoints == 3) {

                System.out.println("You prefer a good balance in life.");

            }

            else if (totalPoints > 3) {

                System.out.println("You prefer life to be spontaneous and active");

            }

            System.out.print("Would you like to play again? (y/n) ");
            playAgainResponse = keyboard.nextLine().toLowerCase();

            if(playAgainResponse.equals("y"))
            {

                playAgain = true;

            }

            else if(playAgainResponse.equals("n"))
            {

                playAgain = false;

            }

        }while (playAgain = true);


    }
}
