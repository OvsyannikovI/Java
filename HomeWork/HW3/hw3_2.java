// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Java.HomeWork.HW3;

import java.util.ArrayList;
import java.util.Random;


public class hw3_2 {
    
    public static void main(String args[]) {
        Random rnd = new Random();
        ArrayList<Integer>  intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);
        delNumEven(intArray);
        System.out.println(intArray);
    }
    public static void delNumEven (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            }
        }

    }
}
