package soal3;

public class Kendaraan {

    class motor {
        String jenis;
        boolean kopling;
        
        public motor(String jenis, boolean kopling) {
            this.jenis = jenis;
            this.kopling = kopling;
        }

        public void infoKopling() {
            String tipe = kopling ? "kopling" : "non-kopling";
            System.out.println("Motor dengan jenis " + jenis + " bertipe " + tipe);
        }
    }

    class sepeda {
        int jumlahGigi;

        public sepeda(int jumlahGigi) {
            this.jumlahGigi = jumlahGigi;
        }
        
        public void infoGigi() {
            System.out.println("Sepeda dengan " + jumlahGigi + " gigi");
        }
    }

    class mobil {
        String merk;
        int kecepatan;
        
        public mobil(String merk, int kecepatan) {
            this.merk = merk;
            this.kecepatan = kecepatan;
        }

        public void infoKecepatan() {
            System.out.println("Mobil dengan merk " + merk + " memiliki kecepeatan " + kecepatan);
        }
    }
}