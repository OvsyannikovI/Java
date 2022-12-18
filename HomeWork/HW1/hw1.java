// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


package Java.HomeWork.HW1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner input = new Scanner(System.in);
        Integer sum = input.nextInt();
        int result = 0;
        for (int i = 0; i <= sum; i++) {
            result += i;
        }
        System.out.printf("Sum = %s", result);
    }
}
