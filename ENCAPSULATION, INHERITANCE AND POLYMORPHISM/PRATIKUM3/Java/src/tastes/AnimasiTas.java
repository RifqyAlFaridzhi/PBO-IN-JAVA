package tastes;

public class AnimasiTas extends Thread {
    @Override
    public void run() {
        String AnimText = "saya suka minum susu sapi";
        try {
            for (int i = 1; i <= 115; i++) {
                System.out.print("\r" + " ".repeat(i) + AnimText);
                Thread.sleep(30);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("animasi berhenti");
        }
    }

    public static void main(String[] args) {
        AnimasiTas anime = new AnimasiTas();
        anime.start();
    }
}
