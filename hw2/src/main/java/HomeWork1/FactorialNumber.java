package HomeWork1;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int factorial = 1;
        for (int i = 2;i<=number;i++){
            factorial = factorial * i;
        }
        System.out.println("Факториал числа "+number+" равен "+factorial);
    }
}
