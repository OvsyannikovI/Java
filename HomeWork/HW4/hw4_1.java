// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Java.HomeWork.HW4;

import java.util.LinkedList;
import java.util.Random;

public class hw4_1 {
    public static void main(String args[]) {
        Random rnd = new Random();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            ll.add(rnd.nextInt(100));            
        }
        System.out.println(ll);
        System.out.println(reverseLL(ll));
    }

    public static LinkedList<Integer> reverseLL(LinkedList<Integer> array) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            reverseList.add(array.get(array.size() - i - 1));            
        }
        return reverseList;
    }
}
