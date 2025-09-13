package soal8danSoal9.subMedia;

import soal7.Media;

public class Foto extends Media {
    private String resolusi;

    public Foto(String judul, String penerbit, String resolusi) {
        super(judul, penerbit);
        this.resolusi = resolusi;
    }

    // Overloading constructor
    public Foto(String resolusi) {
        super("Foto Default", "Fotografer Default");
        this.resolusi = resolusi;
    }

    // Overriding method
    @Override
    public void tampilkanInfo() {
        System.out.println("Foto: " + judul + ", Fotografer: " + penerbit + ", Resolusi: " + resolusi);
    }

    // Overloading method
    public void tampilkanInfo(String lokasi) {
        System.out.println("Foto diambil di: " + lokasi + ", Resolusi: " + resolusi);
    }

    public String getResolusi() { 
        return resolusi; 
    }

    public void setResolusi(String resolusi) { 
        this.resolusi = resolusi; 
    }
}
