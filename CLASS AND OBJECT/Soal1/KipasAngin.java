package Soal1;

public class KipasAngin {
    String merk;
    int kecepatan;
    boolean status;
    String warna;

    public KipasAngin(String merk, int kecepatan, String warna) {
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.status = false;
        this.warna = warna;
    }

    public void nyalakan() {
        status = true;
        System.out.println("Kipas angin " + merk + " dinyalakan.");
    }

    public void matikan() {
        status = false;
        System.out.println("Kipas angin " + merk + " dimatikan.");
    }

    public void aturKecepatan(int level) {
        if (status && level >= 1 && level <= 3) {
            kecepatan = level;
            System.out.println("Kecepatan kipas " + merk + " diatur ke level " + kecepatan);
        }
        else {
            System.out.println("Kipas masih dalam keadaan mati. Tidak bisa mengatur kecepatan.");
        }
    }
}

