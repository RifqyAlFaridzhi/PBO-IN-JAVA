package soal8danSoal9.subHewan;

import soal7.Hewan;

public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    // Overloading constructor
    public Burung(String warnaBulu) {
        super("Beo", 1);
        this.warnaBulu = warnaBulu;
    }

    // Overriding method
    @Override
    public void bersuara() {
        System.out.println(nama + " berkicau.");
    }

    // Overloading method
    public void bersuara(boolean bisaBicara) {
        bersuara();
        if (bisaBicara) {
            System.out.println(nama + " bisa menirukan suara manusia!");
        }
    }

    public void TampilInfo() {
        System.out.println("Nama burung " + getNama());
        System.out.println("Berumur " + getUmur());
        System.out.println("Berjenis " + getWarnaBulu());
    }

    public String getWarnaBulu() { 
        return warnaBulu; 
    }

    public void setWarnaBulu(String warnaBulu) { 
        this.warnaBulu = warnaBulu; 
    }
}
