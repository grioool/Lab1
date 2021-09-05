package by.jwd.fundamentals.task5;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class MatematicsFunctionsArrays {

    private static final Logger logger = LoggerFactory.getLogger(MathematicsFunctionsExpression.class);
    private static Scanner in;
    private static int[][] matrix;

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
        matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                matrix[i][j] = inputValue();
            }
        }
    }


    private static void findMinValueOfNumbersForIncreasingArray() {
        int minValueOfNumbers = 0;
        int current = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(current > matrix[i][j]){
                    minValueOfNumbers++;
                }

                if(matrix[i][j] > current){
                    current = matrix[i][j];
                }
            }
        }
        System.out.println(minValueOfNumbers);
        logger.info(minValueOfNumbers + "");
    }


    public static void main(String[] args) {
        fillArray();
        findMinValueOfNumbersForIncreasingArray();
    }

}
