import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int numberToGuess = rand.nextInt(5);

        System.out.println("Mini skaitli no 0 lidz 5: ");
        int guess = scan.nextInt();

        if (guess == numberToGuess) {
            System.out.println("Tu uzvarēji");
        } else if(guess < numberToGuess) {
            System.out.println("Par maz");
        } else {
            System.out.println("Par lielu");
            System.out.println("Tu zaudēji, cipars bija " + numberToGuess);
        }

    }
}