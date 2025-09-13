package soal5;

import java.util.ArrayList;

public class mainKotak {
    public static void main(String[] args) {
        // Membuat ArrayList generik dari Kotak
        ArrayList<Kotak> daftarKotak = new ArrayList<>();

        // Menambahkan beberapa object Kotak ke dalam ArrayList
        daftarKotak.add(new Kotak("Merah", 5.0, 3.0));
        daftarKotak.add(new Kotak("Biru", 6.0, 2.5));
        daftarKotak.add(new Kotak("Hijau", 4.5, 4.0));
        daftarKotak.add(new Kotak("Kuning", 7.0, 3.5));
        daftarKotak.add(new Kotak("Ungu", 8.0, 2.0));

        daftarKotak.get(1).setPanjang(10.0);  // Mengubah panjang kotak ke-2
        daftarKotak.get(3).setLebar(5.0);     // Mengubah lebar kotak ke-4
        daftarKotak.get(4).setWarna("Coklat");// Mengubah warna kotak ke-5

        // Menampilkan semua objek Kotak dalam ArrayList
        for (int i = 0; i < daftarKotak.size(); i++) {
            System.out.println("Kotak ke-" + (i + 1));
            System.out.println("Keliling: " + daftarKotak.get(i).getKeliling());
            System.out.println("Luas: " + daftarKotak.get(i).getLuas());
            System.out.println(daftarKotak.get(i).toString());
            System.out.println("------------------------");
        }
    }
}

