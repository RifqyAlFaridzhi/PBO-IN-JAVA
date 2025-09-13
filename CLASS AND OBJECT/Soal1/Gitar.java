package Soal1;

public class Gitar {
    String jenis;
    int jumlahSenar;
    String warna;
    
    public Gitar(String jenis, int jumlahSenar, String warna) {
        this.jenis = jenis;
        this.jumlahSenar = jumlahSenar;
        this.warna = warna;
    }

    public void stemSenar() {
        System.out.println("Gitar " + jenis + " dengan warna " + warna + " sedang disetem.");
    }

    public void petik() {
        System.out.println("Memetik gitar " + jenis + " dengan " + jumlahSenar + " senar.");
    }

    public void gantiSenar() {
        System.out.println("Mengganti semua " + jumlahSenar + " senar pada gitar " + jenis + ".");
    }
}
