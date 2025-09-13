package soal4;

public class Orang {
    static String nama;
    static int umur;

    public static void infoOrang() {
        nama = "ari";
        umur = 20;
        System.out.println("nama saya: " + nama);
        System.out.println("umur saya: " + umur);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int c, int d) {
        return c - d;
    }
}
