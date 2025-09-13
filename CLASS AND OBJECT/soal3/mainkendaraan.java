package soal3;

public class mainkendaraan {

    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Kendaraan.motor motor = kendaraan.new motor("yamaha", true);
        Kendaraan.sepeda sepeda = kendaraan.new sepeda(6);
        Kendaraan.mobil mobil = kendaraan.new mobil("Nissan", 200);

        motor.infoKopling();
        sepeda.infoGigi();
        mobil.infoKecepatan();
    }
}
