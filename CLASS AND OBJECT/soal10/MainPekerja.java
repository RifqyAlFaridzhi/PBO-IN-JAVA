package soal10;

import soal8danSoal9.subPekerja.Guru;
import soal8danSoal9.subPekerja.Programmer;


public class MainPekerja {
    public static void main(String[] args) {
        Guru guru1 = new Guru("Pak Joko", 5000000, "SMA 2 Jakarta");
        guru1.TampilInfo();
        guru1.bekerja("Matematika");

        System.out.println();

        Programmer prog1 = new Programmer("Dewi", 10000000, "Java");
        prog1.TampilInfo();
        prog1.bekerja(8);

        System.out.println();

        Guru guru2 = new Guru("SMPN 3 Bandung");
        guru2.TampilInfo();
        guru2.bekerja("Bahasa Inggris");

        System.out.println();

        Programmer prog2 = new Programmer("Python");
        prog2.TampilInfo();
        prog2.bekerja(6);
    }
}
