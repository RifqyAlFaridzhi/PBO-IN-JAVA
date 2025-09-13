package soal8danSoal9.subTanaman;

import soal7.Tanaman;

public class Bunga extends Tanaman {
    private String warna;

    public Bunga(String nama, String jenis, String warna) {
        super(nama, jenis);
        this.warna = warna;
    }

    // Overloading constructor
    public Bunga(String warna) {
        super("Mawar", "Hias");
        this.warna = warna;
    }

    // Overriding method
    @Override
    public void tumbuh() {
        System.out.println(nama + " tumbuh dengan indah dan berwarna " + warna);
    }

    // Overloading method
    public void tumbuh(String musim) {
        tumbuh();
        System.out.println("Bunga ini mekar saat musim: " + musim);
    }

    public void TampilInfo() {
        System.out.println("Bunga " + nama);
        System.out.println("Berjenis " + jenis);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) { 
        this.warna = warna; 
    }
}
