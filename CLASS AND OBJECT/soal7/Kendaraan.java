package soal7;

public class Kendaraan {
    protected String merk;
    protected int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public Kendaraan() {
        this.merk = "Kendaraan Umum";
        this.tahun = 2000;
    }

    public void nyalakanMesin() {
        System.out.println(merk + " tahun " + tahun + " menyalakan mesin.");
    }

    public String getMerk() { 
        return merk; 
    }

    public void setMerk(String merk) { 
        this.merk = merk; 
    }

    public int getTahun() { 
        return tahun; 
    }

    public void setTahun(int tahun) { 
        this.tahun = tahun; 
    }
}