package soal10;

import soal8danSoal9.subHewan.Burung;
import soal8danSoal9.subHewan.Kucing;

public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Milo", 3, "Persia");
        kucing1.TampilInfo();
        kucing1.bersuara("Lapar");

        System.out.println();

        Burung burung1 = new Burung("Kenari", 2, "Kuning");
        burung1.TampilInfo();
        burung1.bersuara(true);

        System.out.println();

        Kucing kucing2 = new Kucing("Anggora");
        kucing2.TampilInfo();
        kucing2.bersuara("Senang");

        System.out.println();

        Burung burung2 = new Burung("ruka", 4,"Hijau");
        burung2.TampilInfo();
        burung2.bersuara(false);
    }
}
