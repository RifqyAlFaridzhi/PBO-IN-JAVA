package soal8danSoal9.subElektronik;

import soal7.Elektronik;

public class Kulkas extends Elektronik {
    private int kapasitas;

    public Kulkas(String merk, int daya, int kapasitas) {
        super(merk, daya);
        this.kapasitas = kapasitas;
    }

    // Overloading constructor
    public Kulkas(int kapasitas) {
        super("LG", 300);
        this.kapasitas = kapasitas;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Kulkas: " + merk + ", Daya: " + daya + " watt, Kapasitas: " + kapasitas + " liter");
    }

    // Overloading method
    public void tampilkanInfo(boolean duaPintu) {
        tampilkanInfo();
        System.out.println("Tipe Pintu: " + (duaPintu ? "Dua Pintu" : "Satu Pintu"));
    }

    public int getKapasitas() { 
        return kapasitas; 
    }

    public void setKapasitas(int kapasitas) { 
        this.kapasitas = kapasitas; 
    }
}
