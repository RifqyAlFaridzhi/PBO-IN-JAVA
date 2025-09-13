package soal7;

public class Elektronik {
    protected String merk;
    protected int daya;

    public Elektronik(String merk, int daya) {
        this.merk = merk;
        this.daya = daya;
    }

    public Elektronik() {
        this.merk = "Elektronik Umum";
        this.daya = 0;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Daya: " + daya + " watt");
    }

    public String getMerk() { 
        return merk; 
    }
    
    public void setMerk(String merk) { 
        this.merk = merk; 
    }

    public int getDaya() { 
        return daya; 
    }

    public void setDaya(int daya) { 
        this.daya = daya; 
    }
}
