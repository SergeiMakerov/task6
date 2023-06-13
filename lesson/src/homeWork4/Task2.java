package homeWork4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        enqueue(queue);
        System.out.printf("Добавлен элемент в конец очереди: ");
        System.out.println(queue);
        int d = dequeue(queue);
        System.out.printf("Первый элемент из очереди %d удалён: ", d);
        System.out.println(queue);
        int f = first(queue);
        System.out.printf("Первый элемент из очереди: %d", f);
    }

    private static void enqueue(Queue<Integer> queue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int nextInt = scanner.nextInt();
        queue.add(nextInt);
        scanner.close();
    }

    private static int dequeue(Queue<Integer> queue) {
        int remove = queue.remove();
        return remove;
    }

    private static int first(Queue<Integer> queue) {
        int peek = queue.peek();
        return peek;
    }
}
