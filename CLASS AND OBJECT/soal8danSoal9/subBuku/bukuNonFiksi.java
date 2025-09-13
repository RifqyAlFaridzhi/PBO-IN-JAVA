package soal8danSoal9.subBuku;

import soal7.Buku;

public class bukuNonFiksi extends Buku {
    private String bidang;

    public bukuNonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    // Overloading constructor
    public bukuNonFiksi(String bidang) {
        super("Belajar Java", "Ahli Coding");
        this.bidang = bidang;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Non-Fiksi: " + judul + ", Penulis: " + penulis + ", Bidang: " + bidang);
    }

    // Overloading method
    public void tampilkanInfo(String institusi) {
        tampilkanInfo();
        System.out.println("Diterbitkan oleh: " + institusi);
    }

    public String getBidang() { 
        return bidang;
    }

    public void setBidang(String bidang) { 
        this.bidang = bidang;
    }
}
