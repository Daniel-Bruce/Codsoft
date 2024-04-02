import java.util.Random;
import java.util.Scanner;

public class RandomG {
    public static void main(String[] args) {


        int score = 100;
        int choice;

        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        final int max_attempts = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Number game----");
        System.out.println("You will have 7 attempts");

        for (int attempt = 1; attempt <= max_attempts; attempt++) {
            System.out.println("Enter a number:");
            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == randomNum) {
                System.out.println("You win!!!");

                break;

            } else if (choice < randomNum) {
                System.out.println("Choice less than random number: ");
            } else {
                System.out.println("Choice greater than random number");
            }

            if (attempt == max_attempts){
                System.out.println("You have run out of attempts!!!");
                System.out.println("The random number was: "+randomNum);
                System.out.println("Your final score is: "+score);

            }else{
                System.out.println("Do you wish to continue? (y/n)");
                String option = scanner.nextLine();
                if (option.equalsIgnoreCase("y")){
                    System.out.println("You have choosen to continue");
                    score -= 20;
                    System.out.println("Your current score is: "+score);

                } else if (option.equalsIgnoreCase("n")) {
                    System.out.println("Exiting the game!!! thanks for playing");

                    break;
                }



            }

        }
        scanner.close();
        System.out.println("Your final score is: "+score);

    }
}