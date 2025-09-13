package Soal1;

// +----------------------+
// |        AC            |
// +----------------------+
// | - merk: String       |
// | - suhu: String       |
// | - status: String     |
// +----------------------+
// | + nyalakan()         |
// | + matikan()          |
// | + kecepatanSuhu      |
// +----------------------+

public class Ac {
    String merk;
    int suhu;
    boolean status;

    public Ac(String merk, int suhu) {
        this.merk = merk;
        this.suhu = suhu;
        this.status = false;
    }

    public void nyalakan() {
        status = true;
        System.out.println("Ac " + merk + " di nyalakan");
    }

    public void matikan() {
        status = false;
        System.out.println("Ac " + merk + " di matikan");
    }

    public void kecepatanSuhu() {
        if (status) {
            status = true;
            System.out.println("Ac " + merk + " di percepat, suhu sekarang adalah: " + suhu + "°C");
        }
        else {
            System.out.println("Ac belum di nyalakan");
        }
    }
}
