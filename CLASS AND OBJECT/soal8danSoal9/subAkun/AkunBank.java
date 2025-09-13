package soal8danSoal9.subAkun;

import soal7.Akun;

public class AkunBank extends Akun {
    private double saldo;

    public AkunBank(String username, String email, double saldo) {
        super(username, email);
        this.saldo = saldo;
    }

    // Overloading constructor
    public AkunBank(double saldo) {
        super("bankUser", "bank@email.com");
        this.saldo = saldo;
    }

    // Overriding method
    @Override
    public void login() {
        System.out.println("Akun bank " + username + " login. Saldo: Rp " + saldo);
    }

    // Overloading method
    public void login(String pin) {
        login();
        System.out.println("Login menggunakan PIN: " + pin);
    }

    public double getSaldo() { 
        return saldo; 
    }

    public void setSaldo(double saldo) { 
        this.saldo = saldo; 
    }
}