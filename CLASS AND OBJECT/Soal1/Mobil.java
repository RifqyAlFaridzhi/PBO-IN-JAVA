package Soal1;
// +----------------------+
// |        Mobil         |
// +----------------------+
// | - merk: String       |
// | - model: String      |
// | - warna: String      |
// | - tahun: int         |
// | - mesinHidup: boolean|
// | - kecepatan: int     |
// +----------------------+
// | + hidupkanMesin()    |
// | + matikanMesin()     |
// | + percepat(int)      |
// | + perlambat(int)     |
// | + infoMobil()        |
// +----------------------+

public class Mobil {
    String merk;
    String model;
    String warna;
    int tahun;
    boolean mesinHidup;
    int kecepatan;

    public Mobil(String merk, String model, String warna, int tahun) {
        this.merk = merk;
        this.model = model;
        this.warna = warna;
        this.tahun = tahun;
        this.mesinHidup = false;
        this.kecepatan = 0;
    }

    public void hidupkanMesin() {
        mesinHidup = true;
        System.out.println("Mesin mobil " + merk + " dihidupkan.");
    }

    public void matikanMesin() {
        mesinHidup = false;
        kecepatan = 0;
        System.out.println("Mesin mobil " + merk + " dimatikan.");
    }

    public void percepat(int tambahanKecepatan) {
        if (mesinHidup) {
            kecepatan += tambahanKecepatan;
            System.out.println("Mobil " + merk + " dipercepat menjadi " + kecepatan + " km/h.");
        } else {
            System.out.println("Hidupkan mesin terlebih dahulu!");
        }
    }

    public void perlambat(int penguranganKecepatan) {
        if (mesinHidup) {
            kecepatan -= penguranganKecepatan;
            if (kecepatan < 0) kecepatan = 0;
            System.out.println("Mobil " + merk + " diperlambat menjadi " + kecepatan + " km/h.");
        } else {
            System.out.println("Hidupkan mesin terlebih dahulu!");
        }
    }

    public void infoMobil() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Mesin Hidup: " + mesinHidup);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println();
    }
}

