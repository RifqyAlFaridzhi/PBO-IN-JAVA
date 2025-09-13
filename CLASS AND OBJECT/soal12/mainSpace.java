package soal12;

public class mainSpace {

    public static void main(String[] args) {
        spaceCraft spaceCraft = new spaceCraft(0, 0);
        
        System.out.println("Posisi awal");
        spaceCraft.posisi();

        spaceCraft.up();
        spaceCraft.down();
        spaceCraft.right();

        System.out.println("Posisi sekarang");
        spaceCraft.posisi();
    }
}
