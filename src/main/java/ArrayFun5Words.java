import java.util.Scanner;

import java.util.Scanner;
public class ArrayFun5Words {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 words: ");
        String array[] = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            {

                System.out.println(array[i]);
            }
        }
    }
}

