package soal8danSoal9.subElektronik;

import soal7.Elektronik;

public class Televisi extends Elektronik {
    private int ukuranLayar;

    public Televisi(String merk, int daya, int ukuranLayar) {
        super(merk, daya);
        this.ukuranLayar = ukuranLayar;
    }

    // Overloading constructor
    public Televisi(int ukuranLayar) {
        super("Samsung", 150);
        this.ukuranLayar = ukuranLayar;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Televisi: " + merk + ", Daya: " + daya + " watt, Layar: " + ukuranLayar + " inci");
    }

    // Overloading method
    public void tampilkanInfo(String tipe) {
        tampilkanInfo();
        System.out.println("Tipe TV: " + tipe);
    }

    public int getUkuranLayar() { 
        return ukuranLayar; 
    }
    
    public void setUkuranLayar(int ukuranLayar) { 
        this.ukuranLayar = ukuranLayar; 
    }
}
