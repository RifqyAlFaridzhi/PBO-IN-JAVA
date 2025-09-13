package Soal1;

public class Buku {
    String judul;
    String penulis;
    int halaman;
    
    public Buku(String judul, String penulis, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
    }
    
    public void membukaBuku() {
        System.out.println("Membuka buku " + judul + " karangan " + penulis);
    }

    public void bacaHalaman(int nomorHalaman) {
        if (nomorHalaman <= halaman && nomorHalaman > 0) {
            System.out.println("Membaca halaman ke " + nomorHalaman + " di buku " + judul + " yang memiliki halaman " + halaman);
        }
        else {
            System.out.println("Halaman tidak tersedia di buku: " + judul);
        }
    }
}
