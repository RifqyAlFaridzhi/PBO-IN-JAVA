package soal6;
import java.util.Scanner;

public class Main {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int n = input.nextInt();
        int hasil = obj.fibonacci(n);

        System.out.println("Bilangan Fibonacci ke-" + n + " adalah: " + hasil);
        input.close();
    }
}

