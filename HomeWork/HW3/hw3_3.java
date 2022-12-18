// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

package Java.HomeWork.HW3;

import java.util.ArrayList;
import java.util.Random;

public class hw3_3 {
    public static void main(String args[]) {
        Random rnd = new Random();
        ArrayList<Integer>  intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);
        System.out.println("min value - " + getMin(intArray));
        System.out.println("max value - " + getMax(intArray));
        System.out.println("average value - " + getAverage(intArray));

    }
    public static Integer getMax (ArrayList<Integer> array) {
        Integer maxNum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > maxNum) {
                maxNum = array.get(i);
            }
        }      
        return maxNum;  
    }
    public static Integer getMin (ArrayList<Integer> array) {
        Integer minNum = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < minNum) {
                minNum = array.get(i);
            }
        }      
        return minNum;  
    }
    public static Integer getAverage (ArrayList<Integer> array) {
        Integer aveNum = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > aveNum) {
                aveNum += array.get(i);
            }
        }    
        aveNum /= array.size();   
        return aveNum;  
    }
}
