package by.jwd.fundamentals.task1;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathematicsFunctionsExpression {

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

    public static void calculateExpression() {
        double x = inputValue();
        double y = inputValue();
        double expression = ((1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - 2 * x/(1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x);
        logger.info("Calculated expression " + expression);
    }

    public static void main(String[] args) {
        calculateExpression();
    }
}
