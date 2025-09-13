package soal8danSoal9.subKendaraan;

import soal7.Kendaraan;

public class Motor extends Kendaraan {
    private boolean kopling;

    public Motor(String merk, int tahun, boolean kopling) {
        super(merk, tahun);
        this.kopling = kopling;
    }

    // Overloading constructor
    public Motor(boolean kopling) {
        super("Honda", 2019);
        this.kopling = kopling;
    }

    // Overriding method
    @Override
    public void nyalakanMesin() {
        System.out.println(merk + " (motor) tahun " + tahun + " dinyalakan.");
    }

    // Overloading method
    public void nyalakanMesin(String mode) {
        nyalakanMesin();
        System.out.println("Mode: " + mode);
    }

    public void TampilInfo() {
        System.out.println("Motor " + merk);
        System.out.println("Keluaran " + tahun);
        System.out.println("Tipe " + kopling);
    }

    public boolean isKopling() { 
        return kopling; 
    }

    public void setKopling(boolean kopling) { 
        this.kopling = kopling; 
    }
}