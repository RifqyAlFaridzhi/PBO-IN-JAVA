package test;

import myprogram.Mahasiswa;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("NIM001");
        m1.setNama("Ahmad Fauzi");
        m1.setAlamat("Jakarta");
        daftarMahasiswa.add(m1);

        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("NIM002");
        m2.setNama("Budi Santoso");
        m2.setAlamat("Bandung");
        daftarMahasiswa.add(m2);

        Mahasiswa m3 = new Mahasiswa();
        m3.setNim("NIM003");
        m3.setNama("Citra Lestari");
        m3.setAlamat("Surabaya");
        daftarMahasiswa.add(m3);

        Mahasiswa m4 = new Mahasiswa();
        m4.setNim("NIM004");
        m4.setNama("Dewi Sartika");
        m4.setAlamat("Semarang");
        daftarMahasiswa.add(m4);

        Mahasiswa m5 = new Mahasiswa();
        m5.setNim("NIM005");
        m5.setNama("Eko Prasetyo");
        m5.setAlamat("Yogyakarta");
        daftarMahasiswa.add(m5);

        Mahasiswa m6 = new Mahasiswa();
        m6.setNim("NIM006");
        m6.setNama("Fajar Hidayat");
        m6.setAlamat("Malang");
        daftarMahasiswa.add(m6);

        Mahasiswa m7 = new Mahasiswa();
        m7.setNim("NIM007");
        m7.setNama("Gita Prameswari");
        m7.setAlamat("Denpasar");
        daftarMahasiswa.add(m7);

        Mahasiswa m8 = new Mahasiswa();
        m8.setNim("NIM008");
        m8.setNama("Hadi Susilo");
        m8.setAlamat("Makassar");
        daftarMahasiswa.add(m8);

        Mahasiswa m9 = new Mahasiswa();
        m9.setNim("NIM009");
        m9.setNama("Indah Permata");
        m9.setAlamat("Medan");
        daftarMahasiswa.add(m9);

        Mahasiswa m10 = new Mahasiswa();
        m10.setNim("NIM010");
        m10.setNama("Joko Widodo");
        m10.setAlamat("Solo");
        daftarMahasiswa.add(m10);

        Mahasiswa m11 = new Mahasiswa();
        m11.setNim("NIM011");
        m11.setNama("Kiki Amalia");
        m11.setAlamat("Palembang");
        daftarMahasiswa.add(m11);

        Mahasiswa m12 = new Mahasiswa();
        m12.setNim("NIM012");
        m12.setNama("Lukman Hakim");
        m12.setAlamat("Padang");
        daftarMahasiswa.add(m12);

        Mahasiswa m13 = new Mahasiswa();
        m13.setNim("NIM013");
        m13.setNama("Maya Sari");
        m13.setAlamat("Pekanbaru");
        daftarMahasiswa.add(m13);

        Mahasiswa m14 = new Mahasiswa();
        m14.setNim("NIM014");
        m14.setNama("Nina Rahmawati");
        m14.setAlamat("Balikpapan");
        daftarMahasiswa.add(m14);

        Mahasiswa m15 = new Mahasiswa();
        m15.setNim("NIM015");
        m15.setNama("Oka Putra");
        m15.setAlamat("Banjarmasin");
        daftarMahasiswa.add(m15);

        Mahasiswa m16 = new Mahasiswa();
        m16.setNim("NIM016");
        m16.setNama("Putri Maharani");
        m16.setAlamat("Pontianak");
        daftarMahasiswa.add(m16);

        Mahasiswa m17 = new Mahasiswa();
        m17.setNim("NIM017");
        m17.setNama("Qori Rahman");
        m17.setAlamat("Manado");
        daftarMahasiswa.add(m17);

        Mahasiswa m18 = new Mahasiswa();
        m18.setNim("NIM018");
        m18.setNama("Rian Firmansyah");
        m18.setAlamat("Batam");
        daftarMahasiswa.add(m18);

        Mahasiswa m19 = new Mahasiswa();
        m19.setNim("NIM019");
        m19.setNama("Siti Aminah");
        m19.setAlamat("Mataram");
        daftarMahasiswa.add(m19);

        Mahasiswa m20 = new Mahasiswa();
        m20.setNim("NIM020");
        m20.setNama("Tommy Suharto");
        m20.setAlamat("Kupang");
        daftarMahasiswa.add(m20);

        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs.toString());
        }
    }
}