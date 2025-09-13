package soal8danSoal9.subMedia;

import soal7.Media;

public class Film extends Media {
    private int durasi;

    public Film(String judul, String penerbit, int durasi) {
        super(judul, penerbit);
        this.durasi = durasi;
    }

    // Overloading constructor
    public Film(int durasi) {
        super("Film Default", "Sutradara Default");
        this.durasi = durasi;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Film: " + judul + ", Sutradara: " + penerbit + ", Durasi: " + durasi + " menit");
    }

    // Overloading method
    public void tampilkanInfo(boolean lengkap) {
        if (lengkap) {
            tampilkanInfo();
        } else {
            System.out.println("Film: " + judul);
        }
    }

    public int getDurasi() { 
        return durasi; 
    }

    public void setDurasi(int durasi) { 
        this.durasi = durasi; 
    }
}
