package soal8danSoal9.subManusia;

import soal7.Manusia;

public class Pelajar extends Manusia {
    private String sekolah;

    public Pelajar(String nama, int umur, String sekolah) {
        super(nama, umur);
        this.sekolah = sekolah;
    }

    // Overloading constructor
    public Pelajar(String sekolah) {
        super("Dina", 16);
        this.sekolah = sekolah;
    }

    // Overriding method
    @Override
    public void perkenalan() {
        System.out.println("Saya pelajar bernama " + nama +  "umur " + umur + " dari " + sekolah + ".");
    }

    // Overloading method
    public void perkenalan(String jurusan) {
        perkenalan();
        System.out.println("Saya mengambil jurusan " + jurusan + ".");
    }

    public String getSekolah() { 
        return sekolah; 
    }

    public void setSekolah(String sekolah) { 
        this.sekolah = sekolah; 
    }
}
