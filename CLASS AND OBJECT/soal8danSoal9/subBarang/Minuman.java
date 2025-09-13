package soal8danSoal9.subBarang;

import soal7.Barang;

public class Minuman extends Barang {
    private boolean dingin;

    public Minuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }

    // Overloading constructor
    public Minuman(boolean dingin) {
        super("Air Mineral", 3000);
        this.dingin = dingin;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Minuman: " + nama + ", Harga: Rp" + harga + ", Dingin: " + (dingin ? "Ya" : "Tidak"));
    }

    // Overloading method
    public void tampilkanInfo(String rasa) {
        tampilkanInfo();
        System.out.println("Rasa: " + rasa);
    }

    public boolean isDingin() { 
        return dingin; 
    }

    public void setDingin(boolean dingin) { 
        this.dingin = dingin; 
    }
}
