package soal8danSoal9.subPekerja;

import soal7.Pekerja;

public class Programmer extends Pekerja {
    private String bahasaPemrograman;

    public Programmer(String nama, double gaji, String bahasaPemrograman) {
        super(nama, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    // Overloading constructor
    public Programmer(String bahasaPemrograman) {
        super("Pak Budi", 9000000);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    // Overriding method
    @Override
    public void bekerja() {
        System.out.println(nama + " sedang coding menggunakan " + bahasaPemrograman);
    }

    // Overloading method
    public void bekerja(int jam) {
        bekerja();
        System.out.println("Durasi kerja: " + jam + " jam");
    }

    public void TampilInfo() {
        System.out.println("Guru" + nama);
        System.out.println("Bergaji " + gaji + " juta");
    }

    public String getBahasaPemrograman() { 
        return bahasaPemrograman; 
    }

    public void setBahasaPemrograman(String bahasaPemrograman) { 
        this.bahasaPemrograman = bahasaPemrograman; 
    }
}
