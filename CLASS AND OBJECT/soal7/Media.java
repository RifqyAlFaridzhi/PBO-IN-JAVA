package soal7;

public class Media {
    protected String judul;
    protected String penerbit;

    public Media(String judul, String penerbit) {
        this.judul = judul;
        this.penerbit = penerbit;
    }

    public Media() {
        this.judul = "Judul Default";
        this.penerbit = "Penerbit Default";
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Penerbit: " + penerbit);
    }

    public String getJudul() { 
        return judul; 
    }

    public void setJudul(String judul) { 
        this.judul = judul; 
    }

    public String getPenerbit() { 
        return penerbit; 
    }

    public void setPenerbit(String penerbit) { 
        this.penerbit = penerbit; 
    }
}

