package Soal1;

public class Sepatu {
    String merk;
    String tipe;
    String warna;
    int ukuran;
    boolean dipakai;

    // Constructor
    public Sepatu(String merk, String tipe, String warna, int ukuran) {
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.ukuran = ukuran;
        this.dipakai = false;
    }

    // Method behavior
    public void pakai() {
        if (!dipakai) {
            dipakai = true;
            System.out.println("Sepatu " + merk + " dipakai.");
        } else {
            System.out.println("Sepatu " + merk + " sudah dipakai.");
        }
    }

    public void lepas() {
        if (dipakai) {
            dipakai = false;
            System.out.println("Sepatu " + merk + " dilepas.");
        } else {
            System.out.println("Sepatu " + merk + " sudah dilepas.");
        }
    }

    public void infoSepatu() {
        System.out.println("Informasi Sepatu:");
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Dipakai: " + dipakai);
        System.out.println();
    }
}