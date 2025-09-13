package Soal1;

public class Televisi {
    String merk;
    int ukuran;
    int volume;
    int channel;
    boolean menyala;

    // Constructor
    public Televisi(String merk, int ukuran) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.volume = 10; // default volume
        this.channel = 1; // default channel
        this.menyala = false;
    }

    // Method behavior
    public void nyalakan() {
        if (!menyala) {
            menyala = true;
            System.out.println("Televisi " + merk + " dinyalakan.");
        } else {
            System.out.println("Televisi sudah menyala.");
        }
    }

    public void matikan() {
        if (menyala) {
            menyala = false;
            System.out.println("Televisi " + merk + " dimatikan.");
        } else {
            System.out.println("Televisi sudah dalam keadaan mati.");
        }
    }

    public void gantiChannel(int channelBaru) {
        if (menyala) {
            channel = channelBaru;
            System.out.println("Channel diganti ke: " + channel);
        } else {
            System.out.println("Nyalakan televisi terlebih dahulu.");
        }
    }

    public void tambahVolume() {
        if (menyala) {
            volume++;
            System.out.println("Volume meningkat menjadi: " + volume);
        } else {
            System.out.println("Nyalakan televisi terlebih dahulu.");
        }
    }

    public void kurangiVolume() {
        if (menyala) {
            if (volume > 0) {
                volume--;
            }
            System.out.println("Volume menurun menjadi: " + volume);
        } else {
            System.out.println("Nyalakan televisi terlebih dahulu.");
        }
    }

    public void infoTelevisi() {
        System.out.println("Informasi Televisi:");
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuran + " inci");
        System.out.println("Volume: " + volume);
        System.out.println("Channel: " + channel);
        System.out.println("Menyala: " + menyala);
        System.out.println();
    }
}