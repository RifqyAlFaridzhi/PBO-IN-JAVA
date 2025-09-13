package test;
import paket5.superclass5;
import paketInterface.MyInterface;

public class subclass5 extends superclass5 implements MyInterface{
    
    @Override
    public void showInfo() {
        System.out.println("info di subclass 5");
    }

    @Override
    public String getStringInfoState() {
        return "ini adalah subclass5 dari superclass 5";
    }
}
