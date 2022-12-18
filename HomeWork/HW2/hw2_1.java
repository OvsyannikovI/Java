// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Java.HomeWork.HW2;

public class hw2_1 {
    
    public static void main(String args[]) {
        int[] array = {5,16,28,33,15,1,50,6,4};
        bubble_sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\n");
        }
    }

    public static void bubble_sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}