package soal7;

public class Tanaman {
    protected String nama;
    protected String jenis;

    public Tanaman(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public Tanaman() {
        this.nama = "Tanaman Umum";
        this.jenis = "Tidak Diketahui";
    }

    public void tumbuh() {
        System.out.println(nama + " sedang tumbuh sebagai tanaman " + jenis);
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getJenis() { 
        return jenis; 
    }

    public void setJenis(String jenis) {
         this.jenis = jenis; 
    }
}
