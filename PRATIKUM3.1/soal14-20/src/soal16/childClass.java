package soal16;

public class childClass extends abstractclassKedua{
    
    @Override
    public void methodAbs2() {
        System.out.println("ini dari abstrack class dua");
    }

    @Override
    public void methodAbs1() {
        System.out.println("ini dari abstrack class 1");
    }

    public void Tampil() {
        methodAbs1();
        methodAbs2();
    }
}
