package Soal1;

public class Lemari {
    String warna;
    int jumlahPintu;
    boolean terkunci;
    String bahan;

    public Lemari(String warna, int jumlahPintu, boolean terkunci, String bahan) {
        this.warna = warna;
        this.jumlahPintu = jumlahPintu;
        this.terkunci = terkunci;
        this.bahan = bahan;
    }

    public void buka() {
        if (terkunci) {
            System.out.println("Lemari dengan bahan " + bahan + " yang memiliki " + jumlahPintu + " pintu sudah terbuka");
        } else {
            System.out.println("Lemari dengan bahan " + bahan + " yang memiliki " + jumlahPintu + " pintu sudah terkunci");
        }
    }

    public void kunci() {
        terkunci = false;
        System.out.println("Lemari dikunci.");
    }

    public void bukaKunci() {
        terkunci = true;
        System.out.println("Kunci lemari dibuka.");
    }
}