import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int die3 = 1 + randomNumbers.nextInt(6);
        int die4 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2 + die3 + die4;

        System.out.println("Dice1: " + die1);
        System.out.println("Dice2: " + die2);
        System.out.println("Dice3: " + die3);
        System.out.println("Dice4: " + die4);
        System.out.println("Sum: " + sum);

        if (sum == 7 || sum == 11 || sum == 15 || sum == 21){
            System.out.printf("You Win!");
        }
        else if(sum == 10 || sum == 12 || sum == 13 || sum == 19 || sum == 20 || sum == 22 || sum == 23 || sum == 24){
            System.out.printf("You lose");
        }
        else{
            int goal = sum;

            System.out.println("Your goal number is: " + goal);

            while (true) {

                System.out.println("\nNext Roll:");

                die1 = randomNumbers.nextInt(6) + 1;
                die2 = randomNumbers.nextInt(6) + 1;
                die3 = randomNumbers.nextInt(6) + 1;
                die4 = randomNumbers.nextInt(6) + 1;

                sum = die1 + die2 + die3 + die4;

                System.out.println("Dice 1: " + die1);
                System.out.println("Dice 2: " + die2);
                System.out.println("Dice 3: " + die3);
                System.out.println("Dice 4: " + die4);
                System.out.println("Total: " + sum);

                if (sum == goal) {

                    System.out.println("You win!");
                    break;

                }
                else if (sum == 10 || sum == 12 || sum == 13 || sum == 19 || sum == 20 ||
                        sum == 22 || sum == 23 || sum == 24) {

                    System.out.println("You lose!");
                    break;
                }
            }
        }
    }
}