package soal7;

public class Manusia {
    protected String nama;
    protected int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Manusia() {
        this.nama = "Orang Umum";
        this.umur = 0;
    }

    public void perkenalan() {
        System.out.println("Halo, saya " + nama + " dan saya berumur " + umur + " tahun.");
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public int getUmur() { 
        return umur; 
    }

    public void setUmur(int umur) { 
        this.umur = umur; 
    }
}

