package service;

import pojo.RGB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RGBService {
    public List<RGB> generateColors(List<Integer> pigmentValues) {
        List<RGB> generatedList = new ArrayList<>();

        List<Integer> ascList = new ArrayList<>(pigmentValues);
        List<Integer> descList = new ArrayList<>(pigmentValues);

        // Sort list of values in ascending order
        Collections.sort(ascList);

        // Sort list of values in descending order
        Collections.sort(descList, Collections.reverseOrder());

        for (Integer redPigment : ascList) {
            for (Integer bluePigment : descList) {
                List<Integer> shuffledList = new ArrayList<>(pigmentValues);
                // Shuffle values
                Collections.shuffle(shuffledList);
                for (Integer greenPigment : shuffledList) {
                    RGB color = new RGB(redPigment, greenPigment, bluePigment);
                    generatedList.add(color);
                }
            }
        }

        return generatedList;
    }
}
