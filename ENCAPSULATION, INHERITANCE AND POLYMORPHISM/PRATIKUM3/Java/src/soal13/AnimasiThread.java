package soal13;

public class AnimasiThread extends Thread {
    @Override
    public void run() {
        String teks = "oO Thread berjalan Oo";
        try {
            for (int i = 1; i <= 110; i++) {
                System.out.print("\r" + " ".repeat(i) + teks);
                Thread.sleep(30);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Thread dihentikan.");
        }
    }

    public static void main(String[] args) {
        AnimasiThread animasi = new AnimasiThread();
        animasi.start();
    }
}