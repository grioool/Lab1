package by.jwd.fundamentals.task6;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MathematicsFunctionsMatrix {

    private static final Logger logger = LoggerFactory.getLogger(MathematicsFunctionsExpression.class);
    private static Scanner in;
    private static int[] array;
    private static int[][] matrix;

    public static String input() {
        return in.nextLine();
    }

    public static int inputValue() {
        logger.info("Input value.");
        in = new Scanner(System.in);
        String valueString = input();
        int value = Integer.parseInt(valueString);
        return value;
    }

    public static void fillArray() {
        int n = inputValue();
        array = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                array[i] = inputValue();
            }
        }
    }

    public static void getMatrixFromArray() {
        matrix = new int[array.length][array.length];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                matrix[i][j] = array[(i + j) % matrix.length];
            }
        }
    }

    public static void printMatrix() {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]);
                logger.info(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fillArray();
        getMatrixFromArray();
        printMatrix();
    }
}
