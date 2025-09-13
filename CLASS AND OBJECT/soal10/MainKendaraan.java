package soal10;

import soal8danSoal9.subKendaraan.Mobil;
import soal8danSoal9.subKendaraan.Motor;

public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Suzuki", 2021, 4);
        mobil1.TampilInfo();
        mobil1.nyalakanMesin(true);

        System.out.println();

        Motor motor1 = new Motor("Yamaha", 2018, true);
        motor1.TampilInfo();
        motor1.nyalakanMesin("Sport");

        System.out.println();

        Mobil mobil2 = new Mobil(2);
        mobil2.TampilInfo();
        mobil2.nyalakanMesin(false);

        System.out.println();

        Motor motor2 = new Motor(false);
        motor2.TampilInfo();
        motor2.nyalakanMesin("Eco");
    }
}