package soal17;

public class Main {
    public static void main(String[] args) {
        OverloadingM demo = new OverloadingM();

        demo.cetak("Ini string");
        demo.cetak(123);

        System.out.println("Tambah int: " + demo.tambah(3, 4));
        System.out.println("Tambah double: " + demo.tambah(2.5, 4.5));

        demo.sapa();
        demo.sapa("Ayu");

        System.out.println("Luas persegi int: " + demo.luasPersegi(4));
        System.out.println("Luas persegi double: " + demo.luasPersegi(5.5));

        demo.hitung(10, 20);
        demo.hitung("Hello", "World");

        System.out.println("Konversi double ke int: " + demo.konversi(7.9));
        System.out.println("Konversi int ke double: " + demo.konversi(8));

        demo.tampilkan("Data", 100);
        demo.tampilkan(200, "Nilai");

        demo.info();
        demo.info("Detail tambahan");

        System.out.println("Volume kubus int: " + demo.volumeKubus(3));
        System.out.println("Volume kubus double: " + demo.volumeKubus(2.5));

        System.out.println("Gabung 2 string: " + demo.gabungkan("Hello", "Java"));
        System.out.println("Gabung 3 string: " + demo.gabungkan("A", "B", "C"));
    }
}
