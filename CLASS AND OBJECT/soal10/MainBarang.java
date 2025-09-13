package soal10;

import soal8danSoal9.subBarang.Makanan;
import soal8danSoal9.subBarang.Minuman;

public class MainBarang {
    public static void main(String[] args) {
        Minuman jus = new Minuman("Jus Mangga", 12000, true);
        jus.tampilkanInfo("Mangga");

        System.out.println();

        Makanan roti = new Makanan("Roti Coklat", 15000, "12-05-2025");
        roti.tampilkanInfo("Suhu Ruang");

        System.out.println();

        Minuman teh = new Minuman(false);
        teh.tampilkanInfo("Tawar");

        System.out.println();

        Makanan mieInstan = new Makanan("30-12-2025");
        mieInstan.tampilkanInfo("Rak Dapur");
    }
}

