package soal8danSoal9.subManusia;

import soal7.Manusia;

public class Pekerja extends Manusia {
    private String pekerjaan;

    public Pekerja(String nama, int umur, String pekerjaan) {
        super(nama, umur);
        this.pekerjaan = pekerjaan;
    }

    // Overloading constructor
    public Pekerja(String pekerjaan) {
        super("Andi", 30);
        this.pekerjaan = pekerjaan;
    }

    // Overriding method
    @Override
    public void perkenalan() {
        System.out.println("Saya bekerja sebagai " + pekerjaan + ", nama saya " + nama + "umur " + umur + ".");
    }

    // Overloading method
    public void perkenalan(boolean sedangKerja) {
        perkenalan();
        System.out.println(sedangKerja ? "Saya sedang bekerja." : "Saya sedang libur.");
    }

    public String getPekerjaan() { 
        return pekerjaan; 
    }

    public void setPekerjaan(String pekerjaan) { 
        this.pekerjaan = pekerjaan; 
    }
}
