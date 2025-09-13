package Soal1;

public class Handphone {
    String merk;
    int kapasitasBaterai;
    boolean status;

    public Handphone(String merk, int kapasitasBaterai) {
        this.merk = merk;
        this.kapasitasBaterai = kapasitasBaterai;
        this.status = false;
    }

    public void menyalakan() {
        status = true;
        System.out.println("Handphone " + merk + " dinyalakan");
    }

    public void ngematikan() {
        status = false;
        System.out.println("Hanphone " + merk + " dimatikan");
    }

    public void bukaAplikasi(String namaApp) {
        if (status) {
            System.out.println("Membuka " + namaApp + " dihandphone " + merk);
        }
        else {
            System.out.println("Handphone sedang dalam keadaan mati. jadi tidak bisa membuka aplikasi");
        }
    }

    public void cekBaterai() {
        System.out.println("Sisa baterainya " + kapasitasBaterai + "%");
    }
}
