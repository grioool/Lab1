package by.jwd.fundamentals.task4;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MathematicsFunctionsPrimeNumber {

    private static final Logger logger = LoggerFactory.getLogger(MathematicsFunctionsExpression.class);
    private static Scanner in;
    private static int[] array;

    public static String input() {
        return in.nextLine();
    }

    public static int inputValue(){
        logger.info("Input value.");
        in = new Scanner(System.in);
        String valueString = input();
        int value = Integer.parseInt(valueString);
        return value;
    }

    public static void fillArray(){
        int n = inputValue();
        array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = inputValue();
        }
    }


    private static boolean isPrimeNumber(int number) {
        int current = 0;
        for(int i = 2; i <= number / 2; i++) {
            current = number % i;
            if(current == 0) {
                return false;
            }
        }
        return true;
    }


    private static void findPrimeNumberIndexInArray() {
        for(int i = 0; i < array.length; i++){
            if(isPrimeNumber(array[i])){
                logger.info(i + "");
            }
        }
    }


    public static void main(String[] args) {
        fillArray();
        findPrimeNumberIndexInArray();
    }

}
