package soal12;

public class spaceCraft {
    private int xPos;
    private int yPos;
    
    
    public spaceCraft(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void up() {
        yPos = yPos - 1;
    }

    public void down() {
        yPos = yPos + 1;
    }

    public void left() {
        xPos = xPos - 1;
    }
    
    public void right() {
        xPos = xPos + 1;
    }

    public void posisi() {
        System.out.println("Posisi sekarang: (" + xPos + ", " + yPos + ")");
    }
}
