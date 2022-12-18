import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class program {
    // public static void main(String[] args) throws Exception {
        // int nowTime = LocalTime.now().getHour();
        // // System.out.println(nowTime);
        // System.out.println("Input name");
        // Scanner input = new Scanner(System.in);
        // String name = input.nextLine();
        // // System.out.printf("Hello %s", name);
        // if (nowTime >=5 && nowTime < 12) {
        //     System.out.printf("Good morning %s", name);
        // }
        // if (nowTime >=12 && nowTime < 17) {
        //     System.out.printf("Good day %s", name);
        // }
        // if (nowTime >=18 && nowTime < 23) {
        //     System.out.printf("Good evening %s", name);
        // }
        // if (nowTime < 5) {
        //     System.out.printf("Good nighth %s", name);
        // }

        // int[] array = new int[15];
        // for (int i = 0; i < array.length; i ++) {
        //     array[i] = new Random().nextInt(0, 2);
        //     System.out.print(array[i]);
        // }

        // int count = 0;
        // int maxCount = 0;
        // for (int index = 0; index < array.length; index++) {
        //     if (array[index] == 1) {
        //         count++;
        //     }
        //     else {
        //         if (maxCount < count) {
        //             maxCount =  count;
        //         }
        //         count = 0;
        //     }
        // }

        // System.out.printf("\nMaxCount = %s, count = %s",maxCount, count);

        // int[] array = new int[]{3,7,2,4,9,1,0};
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for (int i = 0; i < array.length - 1; i++) {
        //     if (array[i] == num) {
        //         int temp = array[i];
        //         array[i] = array[i+1];
        //         array[i + 1] = temp;
        //     } 
        // }
        // for (int i : array) {
        //     System.out.print(i + " ");
        // }
        
    public static void main(String args[]) {
        Random rnd = new Random();
        ArrayList<Integer>  intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(100));
        }
        printArray(intArray);
    }

    public static void printArray (ArrayList<Integer> array) {
        StringBuilder printStr = new StringBuilder();
        for (Integer number: array) {
            System.out.print(number + ", ");
        }
        String output = printStr.substring(0, printStr.length() - 2);
        System.out.println((output));
    }

}