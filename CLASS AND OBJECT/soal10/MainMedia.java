package soal10;

import soal8danSoal9.subMedia.Film;
import soal8danSoal9.subMedia.Foto;

public class MainMedia {
    public static void main(String[] args) {
        Foto foto1 = new Foto("Senja", "Dewi", "4000x3000");
        Foto foto2 = new Foto("1920x1080");

        foto1.tampilkanInfo();
        foto2.tampilkanInfo("Pantai Selatan");

        System.out.println();

        Film film1 = new Film("Inception", "Christopher Nolan", 148);
        Film film2 = new Film(120);

        film1.tampilkanInfo();
        film2.tampilkanInfo(false);
    }
}
