package soal10;


import soal8danSoal9.subManusia.Pekerja;
import soal8danSoal9.subManusia.Pelajar;

public class MainManusia {
    public static void main(String[] args) {
        Pelajar pelajar1 = new Pelajar("Rina", 17, "SMA 1 Jakarta");
        pelajar1.perkenalan("IPA");

        System.out.println();

        Pekerja pekerja1 = new Pekerja("Budi", 35, "Programmer");
        pekerja1.perkenalan(true);

        System.out.println();

        Pelajar pelajar2 = new Pelajar("SMP 2 Bandung");
        pelajar2.perkenalan("IPS");

        System.out.println();

        Pekerja pekerja2 = new Pekerja("Guru");
        pekerja2.perkenalan(false);
    }
}