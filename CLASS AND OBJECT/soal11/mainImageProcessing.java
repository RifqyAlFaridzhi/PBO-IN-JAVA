package soal11;

public class mainImageProcessing {
    public static void main(String[] args) {
        int[][][] dummyRGB = {
            { {255, 0, 0}, {0, 255, 0}, {0, 0, 255} },
            { {125, 125, 0}, {0, 125, 125}, {125, 0, 125} },
            { {255, 255, 255}, {128, 128, 128}, {0, 0, 0} }
        };

        ImageProcessing image = new ImageProcessing(dummyRGB);
        System.out.println("RGB Image: ");
        System.out.println(image);

        int[][] gray = image.imgToGray();
        System.out.println("Grayscale Image Data:");
        for (int i = 0; i < gray.length; i++) {
            for (int j = 0; j < gray[0].length; j++) {
                System.out.print(gray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

