package soal8danSoal9.subHewan;

import soal7.Hewan;

public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    // Overloading constructor
    public Kucing(String ras) {
        super("Kitty", 2);
        this.ras = ras;
    }

    // Overriding method
    @Override
    public void bersuara() {
        System.out.println(nama + " mengeong.");
    }

    // Overloading method
    public void bersuara(String ekspresi) {
        bersuara();
        System.out.println("Ekspresi: " + ekspresi);
    }

    public void TampilInfo() {
        System.out.println("Nama kucing " + getNama());
        System.out.println("Berumur " + getUmur());
        System.out.println("Berjenis " + getRas());
    }

    public String getRas() { 
        return ras; 
    }

    public void setRas(String ras) { 
        this.ras = ras; 
    }
}
