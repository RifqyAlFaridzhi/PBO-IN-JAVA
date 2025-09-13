package test;
import paket1.superclass1;
import paketInterface.MyInterface;

public class subclass1 extends superclass1 implements MyInterface{
    
    @Override
    public void showInfo() {
        System.out.println("info di subclass 1");
    }

    @Override
    public String getStringInfoState() {
        return "ini adalah subclass1 dari superclass 1";
    }
}
