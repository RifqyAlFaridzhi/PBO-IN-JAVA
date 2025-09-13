package soal7;

public class Barang {
    protected String nama;
    protected double harga;

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public Barang() {
        this.nama = "Barang Default";
        this.harga = 0;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Harga: Rp" + harga);
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public double getHarga() { 
        return harga; 
    }

    public void setHarga(double harga) { 
        this.harga = harga; 
    }
}
