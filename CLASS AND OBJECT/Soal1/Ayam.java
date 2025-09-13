package Soal1;

public class Ayam {
    String jenis;
    double berat;
    
    public Ayam(String jenis,  double berat) {
        this.jenis = jenis;
        this.berat = berat;
    }

    public void berkokok() {
        System.out.println("Ayam " + jenis + " berkokok");
    }

    public void berjalan() {
        System.out.println("Ayam " + jenis + " sedang berjalan di sekitar lingkungan");
    }

    public void makan(double porsi) {
        System.out.printf("Berat sebelumnya ayam %.2f\n", berat);
        berat += (porsi / 1000) * 0.1;
        System.out.printf("%s Setelah makan sebanyak %.0f gram. Berat sekarang: %.2f kg.\n", jenis, porsi, berat);
    }
}
