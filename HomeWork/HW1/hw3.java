// Реализовать простой калькулятор

package Java.HomeWork.HW1;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner input = new Scanner(System.in);
        Integer num1 = input.nextInt();
        System.out.println("Input second number");
        Integer num2 = input.nextInt();
        System.out.println("Input action (1 - '/';\n 2 - '*';\n 3 - '-';\n 4 - '+')");
        Integer action = input.nextInt();
        Integer res = 0;
        if (action == 1) {
            res = num1 / num2;
        }
        if (action == 2) {
            res = num1 * num2;
        }
        if (action == 3) {
            res = num1 - num2;
        }
        if (action == 4) {
            res = num1 + num2;
        }
        else {
            System.out.println("Error action");
        }        
        System.out.printf("Result:  %s", res);
    }
}
