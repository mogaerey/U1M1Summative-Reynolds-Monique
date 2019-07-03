import java.util.Scanner;



public class ArrayFunUserArray {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            {

                System.out.println(array[i]);
            }
        }
    }
}