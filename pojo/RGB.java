package pojo;

public class RGB {
    public static final int MAX_VALUE = 256;
    private static final String INVALID_PIGMENT_VALUE_MESSAGE_TEMPLATE = "%s Pigment has invalid value. It should be in range [0;255]";

    private int red;
    private int green;
    private int blue;

    public RGB(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (!isValidPigmentValue(red)) {
            throw new IllegalArgumentException(String.format(INVALID_PIGMENT_VALUE_MESSAGE_TEMPLATE, "Red"));
        }
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if (!isValidPigmentValue(green)) {
            throw new IllegalArgumentException(String.format(INVALID_PIGMENT_VALUE_MESSAGE_TEMPLATE, "Green"));
        }
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if (!isValidPigmentValue(blue)) {
            throw new IllegalArgumentException(String.format(INVALID_PIGMENT_VALUE_MESSAGE_TEMPLATE, "Blue"));
        }
        this.blue = blue;
    }

    private boolean isValidPigmentValue(int input) {
        return input >= 0 && input < MAX_VALUE;
    }

    @Override
    public String toString() {
        return "RGB(red=" + red + " green=" + green + " blue=" + blue + ")";
    }
}
