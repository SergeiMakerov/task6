import Task5.PhoneBook;
import jdk.internal.jimage.ImageStream;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.fill();
        System.out.println(phoneBook);
        phoneBook.sort();
        System.out.println(phoneBook);    }
}
