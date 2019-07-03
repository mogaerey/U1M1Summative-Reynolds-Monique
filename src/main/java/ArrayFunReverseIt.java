import java.util.Arrays;
public class ArrayFunReverseIt {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int temp;
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length / 2; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
