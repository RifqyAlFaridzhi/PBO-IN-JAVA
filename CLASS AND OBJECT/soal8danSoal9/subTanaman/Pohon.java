package soal8danSoal9.subTanaman;

import soal7.Tanaman;

public class Pohon extends Tanaman {
    private double tinggi; // dalam meter

    public Pohon(String nama, String jenis, double tinggi) {
        super(nama, jenis);
        this.tinggi = tinggi;
    }

    // Overloading constructor
    public Pohon(double tinggi) {
        super("Mangga", "Buah");
        this.tinggi = tinggi;
    }

    // Overriding method
    @Override
    public void tumbuh() {
        System.out.println(nama + " tumbuh menjulang hingga " + tinggi + " meter.");
    }

    // Overloading method
    public void tumbuh(int umur) {
        tumbuh();
        System.out.println("Umur pohon: " + umur + " tahun");
    }

    public void TampilInfo() {
        System.out.println("Bunga " + nama);
        System.out.println("Berjenis " + jenis);
    }

    public double getTinggi() { 
        return tinggi; 
    }

    public void setTinggi(double tinggi) { 
        this.tinggi = tinggi; 
    }
}
