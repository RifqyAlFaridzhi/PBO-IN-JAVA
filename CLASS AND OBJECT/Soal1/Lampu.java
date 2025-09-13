package Soal1;

public class Lampu {
    String warna;
    int daya;
    boolean menyala;
    
    public Lampu(String warna, int daya, boolean menyala) {
        this.warna = warna;
        this.daya = daya;
        this.menyala = menyala;
    }

    public void nyalakan() {
        menyala = true;
        System.out.println("Lampu berwarna " + warna + " dinyalakan.");
    }

    public void matikan() {
        menyala = false;
        System.out.println("Lampu berwarna " + warna +" dimatikan.");
    }

    public void tampilkanStatus() {
        if (menyala) {
            System.out.println("Lampu berwarna " + warna + " dengan daya " + daya + "W sedang menyala");
        }
        else {
            System.out.println("Lampu berwarna " + warna + " dengan daya " + daya + "W mati/tidak dinyalakan");
        }
    }
}
