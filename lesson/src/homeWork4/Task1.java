package homeWork4;

import java.util.Collections;
import java.util.LinkedList;

/*
 * дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("o");
        list.add("l");
        list.add("l");
        list.add("e");
        list.add("h");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}
