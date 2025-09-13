package soal10;

import soal8danSoal9.subElektronik.Kulkas;
import soal8danSoal9.subElektronik.Televisi;

public class MainElektronik {
    public static void main(String[] args) {
        Televisi tv1 = new Televisi("Sony", 200, 43);
        tv1.tampilkanInfo("LED");

        System.out.println();

        Kulkas kulkas1 = new Kulkas("Sharp", 350, 500);
        kulkas1.tampilkanInfo(true);

        System.out.println();

        Televisi tv2 = new Televisi(32);
        tv2.tampilkanInfo("Smart TV");

        System.out.println();

        Kulkas kulkas2 = new Kulkas(300);
        kulkas2.tampilkanInfo(false);
    }
}
