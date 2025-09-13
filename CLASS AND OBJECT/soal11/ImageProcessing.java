package soal11;
import java.util.Arrays;

public class ImageProcessing {
    private int[][][] rgbImage;

    public ImageProcessing(int[][][] rgbImage) {
        this.rgbImage = rgbImage;
    }
    
    public int[][] imgToGray() {
        int height = rgbImage.length;
        int width = rgbImage[0].length;
        int[][] grayImage = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int r = rgbImage[i][j][0];
                int g = rgbImage[i][j][1];
                int b = rgbImage[i][j][2];
                int gray = (int)(0.3 * r + 0.59 * g + 0.11 * b);
                grayImage[i][j] = gray;
            }
        }

        return grayImage;
    }

    public int[][][] getRgbImage() {
        return rgbImage;
    }

    public void setRgbImage(int[][][] rgbImage) {
        this.rgbImage = rgbImage;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(rgbImage);
    }
}
