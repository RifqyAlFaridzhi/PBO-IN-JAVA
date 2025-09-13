package Soal1;

public class Kucing {
    String nama;
    int umur;
    String warna;
    
    public Kucing(String nama, int umur, String warna) {
        this.nama = nama;
        this.umur = umur;
        this.warna = warna;
    }

    public void mengeong() {
        System.out.println(nama + " si " + warna + " sedang mengeong");
    }

    public void infoUmur() {
        if (umur >= 3 && umur <= 5) {
            System.out.println("Umur sih " + nama + " ialah " + umur + " tahun, di kategori dewasa");
        }
        else if (umur >= 6 && umur <= 8) {
            System.out.println("Umur sih " + nama + " ialah " + umur + " tahun, di kategori tua");
        }
        else {
            System.out.println("Umur sih " + nama + " ialah " + umur + " tahun, di kategori kecil");
        }
    }

    public void tidur() {
        System.out.println(nama + " si " + warna + " sedang tidur");
    }
}
