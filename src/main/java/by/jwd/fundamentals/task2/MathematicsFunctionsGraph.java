package by.jwd.fundamentals.task2;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MathematicsFunctionsGraph {

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

    public static void checkIsInArea(){
        double x = inputValue();
        double y = inputValue();
        if(((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) || ((x >= -6 && x <= 6) && (y >= -3 && y <= 0))){
            logger.info("true");
        } else {
            logger.info("false");
        }
    }

    public static void main(String[] args) {
        checkIsInArea();
    }
}
