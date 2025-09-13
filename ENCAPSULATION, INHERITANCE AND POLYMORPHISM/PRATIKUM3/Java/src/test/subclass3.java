package test;
import paket3.superclass3;
import paketInterface.MyInterface;

public class subclass3 extends superclass3 implements MyInterface{
    
    @Override
    public void showInfo() {
        System.out.println("info di subclass 3");
    }

    @Override
    public String getStringInfoState() {
        return "ini adalah subclass3 dari superclass 3";
    }
}