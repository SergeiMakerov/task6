package HomeWork1;

import java.util.Scanner;

public class TriangularNumber {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int triangular = 0;
        for(int i = 1;i<=number;i++) {
            triangular = triangular + i;
        }
        System.out.println("Треугольное число из числа "+number+" будет "+triangular);
    }

}
