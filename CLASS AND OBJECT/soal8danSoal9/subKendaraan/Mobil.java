package soal8danSoal9.subKendaraan;

import soal7.Kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    // Overloading constructor
    public Mobil(int jumlahPintu) {
        super("Toyota", 2020);
        this.jumlahPintu = jumlahPintu;
    }

    // Overriding method
    @Override
    public void nyalakanMesin() {
        System.out.println(merk + " (mobil) tahun " + tahun + " menyala dengan suara halus.");
    }

    // Overloading method
    public void nyalakanMesin(boolean ACOn) {
        nyalakanMesin();
        System.out.println("AC dinyalakan: " + (ACOn ? "Ya" : "Tidak"));
    }

    public void TampilInfo() {
        System.out.println("Mobil " + merk);
        System.out.println("Keluaran " + tahun);
        System.out.println("yang memiliki " + jumlahPintu + " pintu");
    }

    public int getJumlahPintu() { 
        return jumlahPintu; 
    }

    public void setJumlahPintu(int jumlahPintu) { 
        this.jumlahPintu = jumlahPintu; 
    }
}