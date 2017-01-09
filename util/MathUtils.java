package util;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    private MathUtils() {
        throw new IllegalArgumentException("Constructor not allowed to invoke");
    }

    public static List<Integer> getNumbersFoldTo(int number, int maxValue) {
        if (maxValue <= 0) {
            throw new IllegalArgumentException("Invalid maxValue");
        }
        List<Integer> foldNumbers = new ArrayList<>();
        for (int i = 0; i < maxValue; i++) {
            if (i % number == 0) {
                foldNumbers.add(i);
            }
        }
        return foldNumbers;
    }

}
