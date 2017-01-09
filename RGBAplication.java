import pojo.RGB;
import service.RGBService;
import util.MathUtils;
import java.util.List;

public class RGBAplication {
    private static int inputNumber = 51;
    private static int elementsToShow = 9;

    public static void main(String[] args) {
        List<Integer> foldNumbers = MathUtils.getNumbersFoldTo(inputNumber, RGB.MAX_VALUE);

        RGBService rgbService = new RGBService();
        List<RGB> rgbList = rgbService.generateColors(foldNumbers);
        printList(rgbList, elementsToShow);
    }

    private static void printList(List<RGB> rgbList, int countElementsToPrint) {
        int countDisplayed = 0;
        for (RGB rgb : rgbList) {
            if (countDisplayed == countElementsToPrint) {
                break;
            }
            System.out.println(rgb);
            countDisplayed++;
        }
    }
}
