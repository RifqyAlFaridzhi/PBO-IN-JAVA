package soal7;

public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Hewan() {
        this.nama = "Hewan Umum";
        this.umur = 0;
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara.");
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