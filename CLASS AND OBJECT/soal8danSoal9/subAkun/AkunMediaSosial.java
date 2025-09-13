package soal8danSoal9.subAkun;

import soal7.Akun;

public class AkunMediaSosial extends Akun {
    private int jumlahFollowers;

    public AkunMediaSosial(String username, String email, int jumlahFollowers) {
        super(username, email);
        this.jumlahFollowers = jumlahFollowers;
    }

    // Overloading constructor
    public AkunMediaSosial(int jumlahFollowers) {
        super("sosmedUser", "sosmed@email.com");
        this.jumlahFollowers = jumlahFollowers;
    }

    // Overriding method
    @Override
    public void login() {
        System.out.println("Akun media sosial " + username + " login. Followers: " + jumlahFollowers);
    }

    // Overloading method
    public void login(boolean verifikasi) {
        login();
        System.out.println("Verifikasi dua langkah: " + (verifikasi ? "Aktif" : "Nonaktif"));
    }

    public int getJumlahFollowers() { 
        return jumlahFollowers; 
    }

    public void setJumlahFollowers(int jumlahFollowers) { 
        this.jumlahFollowers = jumlahFollowers; 
    }
}