package soal10;

import soal8danSoal9.subBuku.bukuFiksi;
import soal8danSoal9.subBuku.bukuNonFiksi;

public class Mainbuku {
    public static void main(String[] args) {
        bukuFiksi novel = new bukuFiksi("Laskar Pelangi", "Andrea Hirata", "Drama");
        novel.tampilkanInfo(true);

        System.out.println();

        bukuNonFiksi ensiklopedia = new bukuNonFiksi("Ensiklopedia IPA", "Dr. Sains", "Ilmu Pengetahuan");
        ensiklopedia.tampilkanInfo("Kemdikbud");

        System.out.println();

        bukuFiksi ceritaAnak = new bukuFiksi("Petualangan");
        ceritaAnak.tampilkanInfo(false);

        System.out.println();

        bukuNonFiksi bukuBelajar = new bukuNonFiksi("Pendidikan");
        bukuBelajar.tampilkanInfo("Universitas XYZ");
    }
}
