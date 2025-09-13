package soal17;

public class OverloadingM {

    // 1. cetak
    public void cetak(String teks) {
        System.out.println("Teks: " + teks);
    }
    public void cetak(int angka) {
        System.out.println("Angka: " + angka);
    }

    // 2. tambah
    public int tambah(int a, int b) {
        return a + b;
    }
    public double tambah(double a, double b) {
        return a + b;
    }

    // 3. sapa
    public void sapa() {
        System.out.println("Halo!");
    }
    public void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // 4. luasPersegi
    public int luasPersegi(int sisi) {
        return sisi * sisi;
    }
    public double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    // 5. hitung
    public void hitung(int x, int y) {
        System.out.println("Jumlah: " + (x + y));
    }
    public void hitung(String x, String y) {
        System.out.println("Gabungan: " + x + y);
    }

    // 6. konversi
    public int konversi(double d) {
        return (int) d;
    }
    public double konversi(int i) {
        return (double) i;
    }

    // 7. tampilkan
    public void tampilkan(String a, int b) {
        System.out.println(a + " - " + b);
    }
    public void tampilkan(int a, String b) {
        System.out.println(a + " - " + b);
    }

    // 8. info
    public void info() {
        System.out.println("Informasi Umum");
    }
    public void info(String detail) {
        System.out.println("Info: " + detail);
    }

    // 9. volumeKubus
    public int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }
    public double volumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    // 10. gabungkan
    public String gabungkan(String a, String b) {
        return a + b;
    }
    public String gabungkan(String a, String b, String c) {
        return a + b + c;
    }
}
