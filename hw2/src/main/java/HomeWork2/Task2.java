package HomeWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
/*
* Реализуйте алгоритм сортировки пузырьком числового массива,
*  результат после каждой итерации запишите в лог-файл.*/


class Task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fileHandler = new FileHandler("logFileTask2.xml");
        logger.addHandler(fileHandler);
        XMLFormatter xml = new XMLFormatter();
        fileHandler.setFormatter(xml);
        logger.info("Task2.main.massiv");
        int [] massiv = {11, 3, 14, 28, 7, -5};

        boolean isSorted = false;
        int buffer;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < massiv.length-1; i++) {
                if(massiv[i] > massiv[i+1]){
                    isSorted = false;

                    buffer = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));
    }
}
