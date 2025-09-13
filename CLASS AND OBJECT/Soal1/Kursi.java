package Soal1;

public class Kursi {
    String bahan;
    String warna;
    int jumlahKaki;

    public Kursi(String bahan, String warna, int jumlahKaki) {
        this.bahan = bahan;
        this.warna = warna;
        this.jumlahKaki = jumlahKaki;
    }

    public void duduk() {
        System.out.println("Kita duduk di kursi " + jumlahKaki + " kaki berbahan " + bahan + " berwarna " + warna + ".");
    }

    public void geser(boolean geser) {
        if (geser) {
            geser = true;
            System.out.println("Kursi digeser ke samping kanan.");
        }
        else {
            System.out.println("Kursi digeser ke samping kiri.");
        }
        
    }
}

