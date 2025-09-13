package Soal1;

public class Laptop {
    String merk;
    String prosesor;
    int ram;
    boolean status;

    public Laptop(String merk, String prosesor, int ram, boolean status) {
        this.merk = merk;
        this.prosesor = prosesor;
        this.ram = ram;
        this.status = status;
    }

    public void hidupkan() {
        status = true;
        System.out.println("Laptop " + merk + " dinyalakan.");
    }

    public void matikan() {
        status = false;
        System.out.println("Laptop " + merk + " dimatikan.");
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Speknya: ");
        System.out.println("Merk: " + merk);
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Status: " + (status ? "Hidup" : "Mati"));
    }
}

