import java.util.Scanner;
public class MonthConverterSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter a number from 1 - 12 and I will give you the month!: ");
        Scanner scanner = new Scanner(System.in);
        int numMonth = scanner.nextInt();

        switch (numMonth) {
            case 1:
                System.out.println("Your month is January!");
                break;
            case 2:
                System.out.println("Your month is February! ");
                break;
            case 3:
                System.out.println("Your month is March!");
                break;
            case 4:
                System.out.println("Your month is April!");
                break;
            case 5:
                System.out.println("Your month is May!");
                break;
            case 6:
                System.out.println("Your month is June!");
                break;
            case 7:
                System.out.println("Your month is July!");
                break;
            case 8:
                System.out.println("Your month is August!");
                break;
            case 9:
                System.out.println("Your month is September!");
                break;
            case 10:
                System.out.println("Your month is October!");
                break;
            case 11:
                System.out.println("Your month is November!");
                break;
            case 12:
                System.out.println("Your month is December!");
                break;
            default:
                System.out.println("You have entered an invalid number. You must enter " +
                        "a number between 1 and 12. Goodbye.");


        }
    }
}
