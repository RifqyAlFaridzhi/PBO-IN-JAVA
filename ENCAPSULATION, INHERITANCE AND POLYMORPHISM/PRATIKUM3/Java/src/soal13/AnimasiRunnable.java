package soal13;

public class AnimasiRunnable implements Runnable {
    @Override
    public void run() {
        String teks = "oO Runable berjalan Oo";
        try {
            for (int i = 1; i <= 110; i++) {
                System.out.print("\r" + " ".repeat(i) + teks);
                Thread.sleep(50);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Runnable dihentikan.");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new AnimasiRunnable());
        thread.start();
    }
}