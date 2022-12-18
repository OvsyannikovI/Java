// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Java.HomeWork.HW4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class hw4_2 {
    public static void main(String[] args) {
      String[] base = {"one", "two", "three", "four"} ;
      Queue<String> queueArray = new LinkedList<>(Arrays.asList(base));
      System.out.println("enqueue() - помещает элемент в конец очереди: ");
      enqueue(queueArray, "five");
      System.out.println(queueArray);
      System.out.println("dequeue() - возвращает первый элемент из очереди и удаляет : ");
      dequeue(queueArray);
      System.out.println(queueArray);
      System.out.println("first() - возвращает первый элемент из очереди, не удаляя");
      first(queueArray);
      System.out.println(queueArray);
    }

    public static Queue<String> enqueue(Queue<String> queueArray, String str) {
      queueArray.add(str);
      return queueArray;
    }
    public static void dequeue(Queue<String> queueArray) {
      System.out.println(queueArray.poll());
    }
    public static void first(Queue<String> queueArray) {
      System.out.println(queueArray.peek());
    }
}
