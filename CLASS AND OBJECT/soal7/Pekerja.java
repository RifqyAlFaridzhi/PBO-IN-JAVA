package soal7;

public class Pekerja {
    protected String nama;
    protected double gaji;

    public Pekerja(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public Pekerja() {
        this.nama = "Nama Default";
        this.gaji = 0;
    }

    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public double getGaji() { 
        return gaji;
    }
    
    public void setGaji(double gaji) { 
        this.gaji = gaji; 
    }
}