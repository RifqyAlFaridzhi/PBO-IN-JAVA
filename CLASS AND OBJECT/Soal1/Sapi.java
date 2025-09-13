package Soal1;

public class Sapi {
    String nama;
    String jenis;
    int umur;
    double berat;
    boolean sedangMakan;

    // Constructor
    public Sapi(String nama, String jenis, int umur, double berat) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.berat = berat;
        this.sedangMakan = false;
    }

    // Method behavior
    public void makan() {
        if (!sedangMakan) {
            sedangMakan = true;
            System.out.println(nama + " mulai makan rumput.");
        } else {
            System.out.println(nama + " sudah sedang makan.");
        }
    }

    public void berhentiMakan() {
        if (sedangMakan) {
            sedangMakan = false;
            System.out.println(nama + " berhenti makan.");
        } else {
            System.out.println(nama + " tidak sedang makan.");
        }
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: 'Moo...'");
    }

    public void infoSapi() {
        System.out.println("Informasi Sapi:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Sedang Makan: " + sedangMakan);
        System.out.println();
    }
}