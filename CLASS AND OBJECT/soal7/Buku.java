package soal7;

public class Buku {
    protected String judul;
    protected String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public Buku() {
        this.judul = "Tanpa Judul";
        this.penulis = "Anonim";
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }

    public String getJudul() { 
        return judul; 
    }

    public void setJudul(String judul) { 
        this.judul = judul; 
    }

    public String getPenulis() { 
        return penulis; 
    }

    public void setPenulis(String penulis) { 
        this.penulis = penulis; 
    }
}
