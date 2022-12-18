// Вывести все простые числа от 1 до 1000

package Java.HomeWork.HW1;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int num = 1000;
        int count = 0;
        for (int i = 2; i < num; i++) {
            boolean prov = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prov = false;
                    break;
                }
            }
            if (prov) {
                System.out.print(i + ", ");
            }
        }
    }
}
