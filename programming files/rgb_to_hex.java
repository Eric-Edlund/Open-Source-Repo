// Bug produced by sizsak
public class rgb_to_hex {
    public static void main(String[] args) {
        // Variables representing red, green, and blue values
        int r = 255;
        int g = 127;
        int b = 0;
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color, Red: " + r + "Green: " + g + "Blue: " + b + " = " + hexColor);
    }

    // Converting RGB color to Hex
    public static String rgbToHex(int g, int r, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


