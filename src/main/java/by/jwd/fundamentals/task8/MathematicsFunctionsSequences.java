package by.jwd.fundamentals.task8;

import by.jwd.fundamentals.task1.MathematicsFunctionsExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MathematicsFunctionsSequences {
    private static final Logger logger = LoggerFactory.getLogger(MathematicsFunctionsExpression.class);
    private static List<Integer> arrayA = new ArrayList<Integer>() {
        {add(-8); add(-2); add(0); add(4); add(10); add(22);}
    };
    private static List<Integer> arrayB = new ArrayList<Integer>() {
        {add(-10); add(5); add(8); add(43);}
    };

    private static List<Integer> getIndexes(List<Integer> arrayA, List<Integer> arrayB) {
        List<Integer> arrayIndexes = new ArrayList<>();
        for (int i = 0; i < arrayB.size(); i++) {
            int j = Collections.binarySearch(arrayA, arrayB.get(i));
            if (j < 0) {
                arrayIndexes.add(-(j + 1) + i);
            }
            else {
                arrayIndexes.add(j + i);
            }
        }
        return arrayIndexes;
    }

    public static void getResultArray(){
        List<Integer> indexes = getIndexes(arrayA, arrayB);
        for (int i = 0; i < indexes.size(); i++) {
            arrayA.add(indexes.get(i), arrayB.get(i));
        }
        logger.info(arrayA + "");
    }

    public static void main(String[] args) {
        getResultArray();
    }

}
