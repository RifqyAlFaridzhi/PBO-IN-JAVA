package soal10;

import soal8danSoal9.subAkun.AkunBank;
import soal8danSoal9.subAkun.AkunMediaSosial;

public class MainAkun {
    public static void main(String[] args) {
        AkunBank bank1 = new AkunBank("andi123", "andi@bank.com", 1000000);
        bank1.login("1234");

        System.out.println();

        AkunMediaSosial sosmed1 = new AkunMediaSosial("lisa_chan", "lisa@social.com", 5000);
        sosmed1.login(true);

        System.out.println();

        AkunBank bank2 = new AkunBank(500000);
        bank2.login("9876");

        System.out.println();

        AkunMediaSosial sosmed2 = new AkunMediaSosial(1200);
        sosmed2.login(false);
    }
}
