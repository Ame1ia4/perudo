import java.util.Scanner;
public class Main {

        public static void main (String []args){
            Scanner input = new Scanner(System.in);

            System.out.println("James input the amount of dice you have left: ");
            int JamesDice = input.nextInt();

            System.out.println("Sarah input the amount of dice you have left: ");
            int SarahDice = input.nextInt();

            System.out.println("Cian input the amount of dice you have left: ");
            int CianDice = input.nextInt();

            System.out.println("Enter your guess for the maximum number: ");
            int guess = input.nextInt();

            if (guess < Statistics.JamesStats(JamesDice)){
                System.out.println("You lose!");
            } else if (guess < Statistics.SarahStats(SarahDice)) {
                System.out.println("You lose!");
            } else if (guess < Statistics.CianStats(CianDice)) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }

            System.out.println("James rolled: " + Statistics.JamesStats(JamesDice));
            System.out.println("Sarah rolled: "  + Statistics.SarahStats(SarahDice));
            System.out.println("Cian rolled: " + Statistics.CianStats(CianDice));
        }
    }
