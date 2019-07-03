import java.util.Scanner;
public class ValidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10!");
        int choice = scanner.nextInt();

        while (true) {
            if (!(choice > 0 && choice < 11)) {
                System.out.println("You must enter a number between 1 and 10, please try again.");
                choice = scanner.nextInt();

            } else {
                System.out.println("You have entered: " + choice);
                break;


            }
        }
    }
}
