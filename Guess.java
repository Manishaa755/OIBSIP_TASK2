import java.util.*;

public class Guess {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 8;
        int score = 0;
        int round = 1;
        System.out.println("*****WELCOME TO THE NUMBER GUESSING GAME *****");
        System.out.println("\n\nRules to play this game \n1.Each player will get 8 max attempts \n2.Each player has to guess the number \n3.If the number guessed is correct, your score will be INCREMENTED by 1 point");
        
        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("\nLet's Begin The game");
            int attemptsLeft = maxAttempts;
            
            while (attemptsLeft > 0) {
                System.out.println("\nGuess a number between 1 and 100:");
                int num = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                
                if (num == randomNumber) {
                    score += attemptsLeft;
                    System.out.println("\nYou guessed the correct number.");
                    break;
                } else if (num < randomNumber) {
                    System.out.println("\nThe correct number is higher!");
                } else {
                    System.out.println("\nThe correct number is lower!");
                }
                
                attemptsLeft--;
                
                if (attemptsLeft == 0) {
                    System.out.println("\nOops! The correct number was: " + randomNumber);
                }
            }
            
            System.out.println("\nDo you want to continue? YES/NO");
            String playAgain = sc.nextLine();
            if (playAgain.equalsIgnoreCase("YES")) {
                round++;
            } else {
                break;
            }
        }
        
        System.out.println("\nYour score: " + score);
        System.out.println("\nThank you for playing");
        sc.close();
    }
}
