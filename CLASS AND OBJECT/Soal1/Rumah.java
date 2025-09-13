package Soal1;

public class Rumah {
    String alamat;
    String warna;
    int jumlahKamar;
    int jumlahLantai;
    boolean pintuTerbuka;

    public Rumah(String alamat, String warna, int jumlahKamar, int jumlahLantai) {
        this.alamat = alamat;
        this.warna = warna;
        this.jumlahKamar = jumlahKamar;
        this.jumlahLantai = jumlahLantai;
        this.pintuTerbuka = false;
    }

    public void bukaPintu() {
        if (!pintuTerbuka) {
            pintuTerbuka = true;
            System.out.println("Pintu rumah di " + alamat + " dibuka.");
        } else {
            System.out.println("Pintu sudah terbuka.");
        }
    }

    public void tutupPintu() {
        if (pintuTerbuka) {
            pintuTerbuka = false;
            System.out.println("Pintu rumah di " + alamat + " ditutup.");
        } else {
            System.out.println("Pintu sudah tertutup.");
        }
    }

    public void infoRumah() {
        System.out.println("Informasi Rumah:");
        System.out.println("Alamat: " + alamat);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Kamar: " + jumlahKamar);
        System.out.println("Jumlah Lantai: " + jumlahLantai);
        System.out.println("Pintu Terbuka: " + pintuTerbuka);
        System.out.println();
    }
}