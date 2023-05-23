package HomeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double answer;
        String a;
        char sign;
        System.out.print("Введите первое число:");
        double number1 = Double.parseDouble(reader.readLine());
        System.out.println(number1);
        System.out.print("Введите оперцию(+,-,*,/):");
        a = reader.readLine();
        sign = a.charAt(0);
        System.out.print("Введите второе число:");
        double number2 = Double.parseDouble(reader.readLine());
        if (sign == '+'){
            answer = number1 + number2;
            System.out.println("Равно: " + answer);
        }
        else if (sign == '-'){
            answer = number1 - number2;
            System.out.println("Ответ: " + answer);
        }
        else if (sign == '*'){
            answer = number1 * number2;
            System.out.println("Ответ: " +answer);
        }
        else if (sign == '/'){
            answer = number1 / number2;
            System.out.println("Ответ: " + answer);
        }
        else{
            System.out.println("Неверная операция!");
        }
    }
}

