import java.util.Scanner;
public class Main {

        public static void main (String []args){
            Scanner input = new Scanner(System.in);

            System.out.println("Player 1 input the amount of dice you have left");
            int P1Dice = input.nextInt();

            System.out.println("Player 2 input the amount of dice you have left");
            int P2Dice = input.nextInt();

            System.out.println("Player 3 input the amount of dice you have left");
            int P3Dice = input.nextInt();

            System.out.println("Enter your guess for the maximum number: ");
            int guess = input.nextInt();

            if (guess < Statistics.P1Stats(P1Dice)){
                System.out.println("You lose!");
            } else if (guess < Statistics.P2Stats(P2Dice)){
                System.out.println("You lose!");
            } else if (guess < Statistics.P3Stats(P3Dice)) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }

            System.out.println("Player 1 rolled: " + Statistics.P1Stats(P1Dice));
            System.out.println("Player 2 rolled: "  + Statistics.P1Stats(P1Dice));
            System.out.println("Player 3 rolled: " + Statistics.P1Stats(P1Dice));
        }
    }
