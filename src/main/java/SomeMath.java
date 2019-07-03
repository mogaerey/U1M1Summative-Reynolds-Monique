
public class SomeMath {
    public static void main(String[] args){
        int num1 = total5(1, 2, 3, 4, 5);
        int num2 = average5(1, 3, 5, 7, 9);
        double num3 = largest5(42.0, 35.1, 2.3, 40.2, 15.6);

    }
    public static int total5(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        System.out.println(sum);
        return sum;

    }
    public static int average5(int a, int b, int c, int d, int e) {
        int average = (a + b + c + d + e) / 5;
        System.out.println(average);
        return average;

    }
    public static double largest5(double a, double b, double c, double d, double e) {

        double largest5 = a;

        if (b > largest5)
            largest5 = b;

        if (c > largest5)
            largest5 = c;

        if (d > largest5)
            largest5 = d;

        if (e > largest5)
            largest5 = e;
        System.out.println(largest5);

        return largest5;

    }
}