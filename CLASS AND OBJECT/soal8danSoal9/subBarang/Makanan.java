package soal8danSoal9.subBarang;

import soal7.Barang;

public class Makanan extends Barang {
    private String tanggalKadaluarsa;

    public Makanan(String nama, double harga, String tanggalKadaluarsa) {
        super(nama, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Overloading constructor
    public Makanan(String tanggalKadaluarsa) {
        super("Makanan Umum", 5000);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Makanan: " + nama + ", Harga: Rp" + harga + ", Exp: " + tanggalKadaluarsa);
    }

    // Overloading method
    public void tampilkanInfo(String penyimpanan) {
        tampilkanInfo();
        System.out.println("Simpan di: " + penyimpanan);
    }

    public String getTanggalKadaluarsa() { 
        return tanggalKadaluarsa; 
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) { 
        this.tanggalKadaluarsa = tanggalKadaluarsa; 
    }
}
