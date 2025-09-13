package Soal1;

public class Tas {
    String merk;
    String warna;
    int kapasitas; 
    boolean terbuka;
    int jumlahIsi; 

    // Constructor
    public Tas(String merk, String warna, int kapasitas) {
        this.merk = merk;
        this.warna = warna;
        this.kapasitas = kapasitas;
        this.terbuka = false;
        this.jumlahIsi = 0;
    }

    // Method behavior
    public void bukaTas() {
        if (!terbuka) {
            terbuka = true;
            System.out.println("Tas " + merk + " dibuka.");
        } else {
            System.out.println("Tas sudah dalam keadaan terbuka.");
        }
    }

    public void tutupTas() {
        if (terbuka) {
            terbuka = false;
            System.out.println("Tas " + merk + " ditutup.");
        } else {
            System.out.println("Tas sudah dalam keadaan tertutup.");
        }
    }

    public void tambahIsi(int barang) {
        if (terbuka) {
            jumlahIsi += barang;
            System.out.println(barang + " barang ditambahkan ke tas. Total isi: " + jumlahIsi);
        } else {
            System.out.println("Buka tas terlebih dahulu sebelum menambah barang!");
        }
    }

    public void kurangiIsi(int barang) {
        if (terbuka) {
            if (barang <= jumlahIsi) {
                jumlahIsi -= barang;
                System.out.println(barang + " barang diambil dari tas. Total isi: " + jumlahIsi);
            } else {
                System.out.println("Tidak cukup barang untuk diambil.");
            }
        } else {
            System.out.println("Buka tas terlebih dahulu sebelum mengambil barang!");
        }
    }

    public void infoTas() {
        System.out.println("Informasi Tas:");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Kapasitas: " + kapasitas + " liter");
        System.out.println("Terbuka: " + terbuka);
        System.out.println("Jumlah Isi: " + jumlahIsi + " barang");
        System.out.println();
    }
}