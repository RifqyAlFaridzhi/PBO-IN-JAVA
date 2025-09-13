package soal8danSoal9.subBuku;

import soal7.Buku;

public class bukuFiksi extends Buku {
    private String genre;

    public bukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    // Overloading constructor
    public bukuFiksi(String genre) {
        super("Cerita Fantasi", "Penulis Fantasi");
        this.genre = genre;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Fiksi: " + judul + ", Penulis: " + penulis + ", Genre: " + genre);
    }

    // Overloading method
    public void tampilkanInfo(boolean ringkasan) {
        tampilkanInfo();
        if (ringkasan) {
            System.out.println("Ringkasan: Sebuah kisah menarik dengan alur yang penuh imajinasi.");
        }
    }

    public String getGenre() { 
        return genre; 
    }

    public void setGenre(String genre) { 
        this.genre = genre; 
    }
}
