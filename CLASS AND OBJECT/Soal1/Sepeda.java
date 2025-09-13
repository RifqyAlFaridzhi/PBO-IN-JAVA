package Soal1;

public class Sepeda {
    String merk;
    String jenis;
    String warna;
    int jumlahGigi;
    boolean sedangDikendarai;
    int kecepatan;

    // Constructor
    public Sepeda(String merk, String jenis, String warna, int jumlahGigi) {
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
        this.jumlahGigi = jumlahGigi;
        this.sedangDikendarai = false;
        this.kecepatan = 0;
    }

    // Method behavior
    public void mulaiMengayuh() {
        if (!sedangDikendarai) {
            sedangDikendarai = true;
            System.out.println("Sepeda " + merk + " mulai dikendarai.");
        } else {
            System.out.println("Sepeda sudah sedang dikendarai.");
        }
    }

    public void berhentiMengayuh() {
        if (sedangDikendarai) {
            sedangDikendarai = false;
            kecepatan = 0;
            System.out.println("Sepeda " + merk + " berhenti dikendarai.");
        } else {
            System.out.println("Sepeda sudah dalam keadaan berhenti.");
        }
    }

    public void tambahKecepatan(int tambahan) {
        if (sedangDikendarai) {
            kecepatan += tambahan;
            System.out.println("Kecepatan sepeda bertambah menjadi " + kecepatan + " km/h.");
        } else {
            System.out.println("Mulai mengayuh terlebih dahulu!");
        }
    }

    public void kurangiKecepatan(int pengurangan) {
        if (sedangDikendarai) {
            kecepatan -= pengurangan;
            if (kecepatan < 0) kecepatan = 0;
            System.out.println("Kecepatan sepeda berkurang menjadi " + kecepatan + " km/h.");
        } else {
            System.out.println("Sepeda tidak sedang dikendarai.");
        }
    }

    public void infoSepeda() {
        System.out.println("Informasi Sepeda:");
        System.out.println("Merk: " + merk);
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Gigi: " + jumlahGigi);
        System.out.println("Sedang Dikendarai: " + sedangDikendarai);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println();
    }
}