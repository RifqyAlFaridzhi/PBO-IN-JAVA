package soal10;

import soal8danSoal9.subTanaman.Bunga;
import soal8danSoal9.subTanaman.Pohon;

public class MainTanaman {
    public static void main(String[] args) {
        Bunga bunga1 = new Bunga("Anggrek", "Hias", "Ungu");
        bunga1.TampilInfo();
        bunga1.tumbuh("Semi");

        System.out.println();

        Pohon pohon1 = new Pohon("Kelapa", "Tropis", 15);
        pohon1.TampilInfo();
        pohon1.tumbuh(10);

        System.out.println();

        Bunga bunga2 = new Bunga("Merah");
        bunga2.TampilInfo();
        bunga2.tumbuh("Gugur");

        System.out.println();

        Pohon pohon2 = new Pohon(8.5);
        pohon2.TampilInfo();
        pohon2.tumbuh(5);
    }
}

