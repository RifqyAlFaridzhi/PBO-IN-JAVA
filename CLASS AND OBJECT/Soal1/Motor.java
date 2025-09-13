package Soal1;

// +------------------------+
// |         Motor          |
// +------------------------+
// | - merk: String         |
// | - tipe: String         |
// | - warna: String        |
// | - tahun: int           |
// | - mesinHidup: boolean  |
// | - kecepatan: int       |
// +------------------------+
// | + hidupkanMesin()      |
// | + matikanMesin()       |
// | + gas(int)             |
// | + rem(int)             |
// | + infoMotor()          |
// +------------------------+

public class Motor {
    String merk;
    String tipe;
    String warna;
    int tahun;
    boolean mesinHidup;
    int kecepatan;

    public Motor(String merk, String tipe, String warna, int tahun) {
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.tahun = tahun;
        this.mesinHidup = false;
        this.kecepatan = 0;
    }

    public void hidupkanMesin() {
        mesinHidup = true;
        System.out.println("Mesin motor " + merk + " dihidupkan.");
    }

    public void matikanMesin() {
        mesinHidup = false;
        kecepatan = 0;
        System.out.println("Mesin motor " + merk + " dimatikan.");
    }

    public void gas(int tambahanKecepatan) {
        if (mesinHidup) {
            kecepatan += tambahanKecepatan;
            System.out.println("Motor " + merk + " digas menjadi " + kecepatan + " km/h.");
        } else {
            System.out.println("Hidupkan mesin terlebih dahulu!");
        }
    }

    public void rem(int penguranganKecepatan) {
        if (mesinHidup) {
            kecepatan -= penguranganKecepatan;
            if (kecepatan < 0) kecepatan = 0;
            System.out.println("Motor " + merk + " direm menjadi " + kecepatan + " km/h.");
        } else {
            System.out.println("Hidupkan mesin terlebih dahulu!");
        }
    }

    public void infoMotor() {
        System.out.println("Informasi Motor:");
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Mesin Hidup: " + mesinHidup);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println();
    }
}