package by.jwd.fundamentals.task3;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MathematicsFunctionsTrigonometry {

    private static final Logger logger = LoggerFactory.getLogger(MathematicsFunctionsExpression.class);
    private static Scanner in;

    public static String input() {
        return in.nextLine();
    }

    public static double inputValue(){
        logger.info("Input value.");
        in = new Scanner(System.in);
        String valueString = input();
        double value = Double.parseDouble(valueString);
        return value;
    }

    public static void calculateFunctionExpression(){
        double a = inputValue();
        double b = inputValue();
        double h = inputValue();
        double x = 0;
        int i = 0;
        double result = 0;

        while (x <= b){
            x = a + i * h;
            result = Math.tan(x);
            logger.info(x + " " + result + "\n");
            i++;
        }
    }

    public static void main(String[] args) {
        calculateFunctionExpression();
    }
}
