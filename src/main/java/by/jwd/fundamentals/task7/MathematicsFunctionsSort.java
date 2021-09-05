package by.jwd.fundamentals.task7;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MathematicsFunctionsSort {
    private static final Logger logger = LoggerFactory.getLogger(MathematicsFunctionsExpression.class);
    private static Scanner in;
    private static double[] array;

    public static String input() {
        return in.nextLine();
    }

    public static double inputValueDouble() {
        logger.info("Input value.");
        in = new Scanner(System.in);
        String valueString = input();
        double value = Double.parseDouble(valueString);
        return value;
    }

    public static int inputValueInt() {
        logger.info("Input value.");
        in = new Scanner(System.in);
        String valueString = input();
        int value = Integer.parseInt(valueString);
        return value;
    }

    public static void fillArray() {
        logger.info("Input array size.");
        int n = inputValueInt();
        array = new double[n];
        for(int i = 0; i < array.length; i++){
                array[i] = inputValueDouble();
        }
    }

    public static void sortArray(){
        double current;
        boolean isSorted = false;
        for(int i = 0; !isSorted && i < array.length; i++){
            isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                    isSorted = false;
                    j--;
                }
            }
        }
    }

    public static void printArray(){
        for(int i = 0; i < array.length; i++){
            logger.info(array[i] + "");
        }
    }

    public static void main(String[] args) {
        fillArray();
        sortArray();
        printArray();
    }
}
