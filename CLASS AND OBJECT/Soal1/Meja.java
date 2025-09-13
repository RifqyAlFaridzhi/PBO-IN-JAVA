package Soal1;

// +--------------------------+
// |          Meja           |
// +--------------------------+
// | - bahan: String          |
// | - warna: String          |
// | - panjang: int           |
// | - lebar: int             |
// | - tinggi: int            |
// | - adaBarangDiAtas: boolean |
// +--------------------------+
// | + letakkanBarang()       |
// | + ambilBarang()          |
// | + infoMeja()             |
// +--------------------------+

public class Meja {
    String bahan;
    String warna;
    int panjang;
    int lebar;
    int tinggi;
    boolean adaBarangDiAtas;

    public Meja(String bahan, String warna, int panjang, int lebar, int tinggi) {
        this.bahan = bahan;
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.adaBarangDiAtas = false;
    }

    public void letakkanBarang() {
        if (!adaBarangDiAtas) {
            adaBarangDiAtas = true;
            System.out.println("Barang diletakkan di atas meja.");
        } else {
            System.out.println("Sudah ada barang di atas meja.");
        }
    }

    public void ambilBarang() {
        if (adaBarangDiAtas) {
            adaBarangDiAtas = false;
            System.out.println("Barang diambil dari atas meja.");
        } else {
            System.out.println("Tidak ada barang di atas meja.");
        }
    }

    public void infoMeja() {
        System.out.println("Informasi Meja:");
        System.out.println("Bahan: " + bahan);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + panjang + "x" + lebar + "x" + tinggi + " cm");
        System.out.println("Ada barang di atas meja: " + adaBarangDiAtas);
        System.out.println();
    }
}