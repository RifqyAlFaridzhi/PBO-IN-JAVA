package myprogram;

public class Mahasiswa extends Manusia {
    private String nim;

    public String getNama() {
        return super.getNama();
    }

    public void setNama(String nama) {
        super.setNama(nama);
    }

    public String getAlamat() {
        return super.getAlamat();
    }

    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama()
            + " \tNim: " + getNim()
            + " \tAlamat: " + getAlamat();
    }
}
