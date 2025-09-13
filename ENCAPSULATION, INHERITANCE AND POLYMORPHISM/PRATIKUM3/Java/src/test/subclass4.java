package test;
import paket4.superclass4;
import paketInterface.MyInterface;

public class subclass4 extends superclass4 implements MyInterface {
    
    @Override
    public void showInfo() {
        System.out.println("info di subclass 4");
    }

    @Override
    public String getStringInfoState() {
        return "ini adalah subclass4 dari superclass 4";
    }
}
