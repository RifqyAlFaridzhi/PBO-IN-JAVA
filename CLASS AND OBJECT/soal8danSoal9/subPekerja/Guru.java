package soal8danSoal9.subPekerja;

import soal7.Pekerja;

public class Guru extends Pekerja {
    private String sekolah;

    public Guru(String nama, double gaji, String sekolah) {
        super(nama, gaji);
        this.sekolah = sekolah;
    }

    // Overloading constructor
    public Guru(String sekolah) {
        super("Bu Rina", 6000000);
        this.sekolah = sekolah;
    }

    // Overriding method
    @Override
    public void bekerja() {
        System.out.println(nama + " sedang mengajar di " + sekolah);
    }

    // Overloading method
    public void bekerja(String mapel) {
        bekerja();
        System.out.println("Mata pelajaran: " + mapel);
    }

    public void TampilInfo() {
        System.out.println("Guru" + nama);
        System.out.println("Bergaji " + gaji + " juta");
    }

    public String getSekolah() { 
        return sekolah; 
    }

    public void setSekolah(String sekolah) { 
        this.sekolah = sekolah; 
    }
}
